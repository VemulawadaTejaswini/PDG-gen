package codeJam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve3027();
	}

	public static void solve3027() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i = 0;

		while (true) {
			if (N < Math.pow(2, i) - 1) {
				break;
			}
			i++;
		}

		System.out.println(i - 1);
		sc.close();
	}
}

