
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main {
	public class pair implements Comparable<pair> {
		int wt;
		int val;
		double rat;

		pair(int a, int v) {
			wt = a;
			val = v;
			rat = v / wt;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return (int) (this.rat - o.rat);
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		long cap = scn.nextLong();
		long wt[] = new long[n];
		int val[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			long w = scn.nextLong();
			int v = scn.nextInt();
			wt[i] = w;
			val[i] = v;
			sum += v;
		}
		long dp[][] = new long[n + 1][sum + 1];
		for (long v[] : dp)
			Arrays.fill(v, Integer.MAX_VALUE / 2);
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= sum; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - val[i - 1] >= 0) {
					dp[i][j] = Math.min(dp[i][j], wt[i - 1] + dp[i - 1][j - val[i - 1]]);
				}
			}
		}
		long ans = 0;
		for (int i = 0; i <= sum; i++) {
			if ( dp[n][i] <= cap) {
				ans = i;
			}
		}

		System.out.println(ans);

	}

}