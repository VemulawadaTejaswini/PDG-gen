package jp.lemon;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			if (num >= n1) {
				n3 = n2;
				n2 = n1;
				n1 = num;
			} else if (num >= n2) {
				n3 = n2;
				n2 = num;
			} else if (num >= n3) {
				n3 = num;
			}
		}
		System.out.println(n1 + "\n" + n2 + "\n" + n3);
	}
}