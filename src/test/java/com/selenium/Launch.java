package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	@Test
	public void page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium related drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=Kvul9IS96xM");
		System.out.println("test success by maven");
	}
}
