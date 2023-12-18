//Atcoder083 B - Some Sums

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int total = 0;
		for (int i = 1; i <= n; i++) {
			int sum = calc(i);
			if (sum >= a && sum <= b) {
				total += i;
			}
		}
		System.out.println(total);
	}

	static int calc(int a) {
		int sum = 0;
		while (a > 0) {
			a += a % 10;
			a /= 10;
		}

		return sum;
	}
}
