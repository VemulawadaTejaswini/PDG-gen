package aBC162_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				for (int k = 1; k <= K; k++) {
					sum += gcd(i, gcd(j, k));

				}
			}
		}
		System.out.println(sum);
	}

	public static int gcd(int i, int j) {
		int tmp;
		if (i > j) {
			while ((tmp = i % j) != 0) {
				i = j;
				j = tmp;
			}
			return j;
		} else {
			while ((tmp = j % i) != 0) {
				j = i;
				i = tmp;
			}
			return i;
		}
	}
}
