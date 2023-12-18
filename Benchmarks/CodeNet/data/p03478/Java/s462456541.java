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
			if (a <= sum && sum <= b) {
				total += i;
			}
		}
		System.out.println(total);
	}

	static int calc(int i) {
		int sum = 0;;
		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}

		return sum;
	}
}


