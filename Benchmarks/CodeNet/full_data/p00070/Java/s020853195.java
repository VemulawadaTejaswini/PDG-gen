import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	int bitC(int a) {

		if (a == 0)

			return 0;

		return bitC(a >> 1) + (a & 1);

	}



	void run() {

		int[][] dp = new int[300][1 << 10];

		int[][] map = new int[300][11];

		dp[0][0] = 1;

		for (int j = 0; j < 1 << 10; j++) {

			for (int k = 1, p = 0; k < 1 << 10; k = k << 1, p++) {

				if ((j & k) != 0)

					continue;

				int bc = bitC(j | k);

				for (int i = 0; i + bc * p < 300; i++) {

					dp[i + bc * p][j | k] += dp[i][j];

				}

			}

		}

		for (int j = 0; j < 300; j++) {

			for (int i = 0; i < 1 << 10; i++) {

				map[j][bitC(i)] += dp[j][i];

			}

		}

		for (; sc.hasNextInt();) {

			int n = sc.nextInt();

			int s = sc.nextInt();

			if (n > 10 || s >= 300) {

				System.out.println("0");

				continue;

			}

			System.out.println(map[s][n]);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}