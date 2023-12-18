

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, n, m;
		int x1[], y1[], ans[];
		int max = -200, min = 200;

		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		x1 = new int[n];
		y1 = new int[m];
		int count = -10000;

		for (int i = 0; i < n; ++i) {
			x1[i] = sc.nextInt();
			max = Math.max(max, x1[i]);
		}
		for (int i = 0; i < m; ++i) {
			y1[i] = sc.nextInt();
			min = Math.min(min, y1[i]);
		}

		if (y - x < 1) {
			System.out.println("War");
		} else {
			for (int i = 0; i < y - x; ++i) {
				if (max < i + x + 1 && min >= i + x + 1) {
					count = i + x + 1;
				}

			}
			if (count < -1000) {
				System.out.println("War");
			} else {
				System.out.println("No War");
			}

		}

		sc.close();

	}

}
