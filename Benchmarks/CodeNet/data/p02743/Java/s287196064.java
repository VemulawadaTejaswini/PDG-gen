package com.sample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String ans = (Math.sqrt(a)+Math.sqrt(b)) < Math.sqrt(c) ? "Yes" : "No";
			System.out.println(ans);
		}
	}
}
