// Knapsack 2 ==> (Attempt 69.69)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {
	public static long INF = Long.MAX_VALUE;
	public static void knapsack2(long[] w, long[] p, long k, int n) {
		long sum = sum(p);
		long[][] dp = new long[n+1][(int)sum+1];

		for(int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], INF);
			// System.out.println(Arrays.toString(dp[i]));
		}

		for(int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}

		for(int i = 1; i <= sum; i++) {
			dp[0][i] = INF;
		}

		long max = Long.MIN_VALUE;
		for(int i = 1; i <= n; i++) {
			for(long j = 1; j <= sum; j++) {
				if(p[i-1] == j) {
					dp[i][(int)j] = min(w[i-1], dp[i-1][(int)j]);
				}
				else if(p[i-1] > j) {
					dp[i][(int)j] = dp[i-1][(int)j];
				}
				else {
					long temp = dp[i-1][(int)Math.abs(j-p[i-1])];
					if(temp != INF) {
						dp[i][(int)j] = min(dp[i-1][(int)j], w[i-1]+temp);
					}
					else {
						dp[i][(int)j] = min(dp[i-1][(int)j], INF);
					}
				}
				if(dp[i][(int)j] <= k) {
					if(j > max) {
						max = j;
					}
				}
				// if(dp[i][(int)j] == INF) {
				// 	System.out.print("*  ");
				// }
				// else {
				// 	System.out.print(dp[i][(int)j] + "  ");
				// }
			}
			// System.out.println();
		}
		System.out.println(max);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		long k = Long.parseLong(s[1]);

		long[] w = new long[n];
		long[] p = new long[n];

		for(int i = 0; i < n; i++) {
			String[] s1 = br.readLine().split(" ");
			w[i] = Long.parseLong(s1[0]);
			p[i] = Long.parseLong(s1[1]);
		}

		knapsack2(w, p, k, n);
	}

	public static long min(long...arr) {
		long min = Long.MAX_VALUE;
		for(long i: arr)
			if(i < min)
				min = i;

		return min;
	}

	public static long sum(long...arr) {
		long sum = 0;
		for(long i: arr)
			sum += i;

		return sum;
	}
}
