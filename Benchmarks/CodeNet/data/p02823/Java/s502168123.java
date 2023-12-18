

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long c = b - a;

		long answer = 0;

		if (c % 2 == 0) {
			answer = c / 2;
		} else {
			if (n - b > a) {
				answer = n - b - 1;
			} else {
				answer = n - a - 1;
			}
		}

		System.out.println(answer);
	}

}
