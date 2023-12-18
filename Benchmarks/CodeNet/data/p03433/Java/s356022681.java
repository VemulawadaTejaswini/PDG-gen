

import java.util.Scanner;

public class Abc88a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n入力");
		int n = sc.nextInt();
		System.out.println("a入力");
		int a = sc.nextInt();

		int b = n % 500;

		if (a >= b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
