

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[n];
		long[] v = new long[n];

		for (int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Long.parseLong(sc.next());
		}

		long[][] dp = new long[n][W + 1];
		for (int i = 0; i < n; i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i < W + 1; i++) {
			if (v[0] > i)
				dp[0][i] = 0;
			else
				dp[0][i] = v[0];
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < W + 1; j++) {
				long a = 0;
				if (j >= w[i]) {
					a = dp[i - 1][j - w[i]] + v[i];
				}
				dp[i][j] = Math.max(dp[i - 1][j], a);
			}
		}

		System.out.println(dp[n - 1][W]);
	}

}
