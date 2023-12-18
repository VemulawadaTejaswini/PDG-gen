package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		if ("ABC".equals(S)) {
			System.out.println("ARC");
		} else {
			System.out.println("ABC");
		}
	}
}