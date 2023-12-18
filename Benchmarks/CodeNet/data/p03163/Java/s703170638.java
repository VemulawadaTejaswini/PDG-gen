package AtCoderDP_Problems;

import java.util.Scanner;

public class D_Knapsack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] w = new int[n];
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			w[i] = scn.nextInt();
			p[i] = scn.nextInt();
		}

		System.out.println(solve(n, k, p, w));
	}

	public static long solve(int n, int k, int[] p, int[] w) {

		long[][] dp = new long[n + 1][k + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= k; j++) {

				if (i == 0 || j == 0) {
					dp[i][j] = 0;
					continue;
				}
				long a = dp[i - 1][j];
				long b = (j - w[i-1]) >= 0 ? p[i-1] + dp[i - 1][j - w[i-1]] : Integer.MIN_VALUE;
				dp[i][j] = Math.max(a, b);
			}

		}

		return dp[n][k];
	}

}
