// Knapsack

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {
	public static long knapsack(long[] w, long[] p, int k, int n) {
		long[][] dp = new long[n+1][k+1];

		for(int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}

		for(int i = 0; i <= k; i++) {
			dp[0][i] = 0;
		}

		long max = 0;
		for(int i = 1; i <= n; i++) {
			for(long j = 1; j <= k; j++) {
				if(w[i-1] > j)
					dp[i][(int)j] = max(dp[i-1][(int)j], dp[i][(int)(j-1l)]);
				else
					dp[i][(int)j] = max(dp[i-1][(int)j], p[i-1]+dp[i-1][(int)(j-w[i-1])]);
				// System.out.print(dp[i][j] + " ");
				if(dp[i][(int)j] > max)
					max = dp[i][(int)j];
			}
			// System.out.println();
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);

		long[] w = new long[n];
		long[] p = new long[n];

		for(int i = 0; i < n; i++) {
			String[] s1 = br.readLine().split(" ");
			w[i] = Long.parseLong(s1[0]);
			p[i] = Long.parseLong(s1[1]);
		}

		// System.out.println(Arrays.toString(w));
		// System.out.println(Arrays.toString(p));
		System.out.println(knapsack(w, p, k, n));
	}

	public static long max(long...arr) {
		long max = Long.MIN_VALUE;
		for(long i: arr) {
			if(i > max)
				max = i;
		}
		return max;
	}
}
