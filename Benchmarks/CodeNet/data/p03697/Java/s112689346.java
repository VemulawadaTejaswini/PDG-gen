package com.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] s = a.split(" ");
		System.out.println(calc(Integer.valueOf(s[0]), Integer.valueOf(s[1])));
		sc.close();
	}

	public static String calc(int a, int b) {
		int sum = a + b;
		if (sum >= 10) return "error";
		return String.valueOf(sum);
	}
}
