

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		if (n <= 0 || n > 100) {
			System.out.println("数値の有効範囲は0 <= n <= 100です");
			n = sc.nextInt();
			a = new int[n];

		}

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 0 || a[i] >= 1000) {
				System.out.println("数値の有効範囲は0 <= a[i] < 1000です");
				break;
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}

}

