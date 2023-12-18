

import java.util.*;
import java.io.*;


public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		
		int[][] dp = new int[n][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		
		for(int i = 1; i < n; i++)
		{
			dp[i][0] = a[i] + Math.max(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = b[i] + Math.max(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] = c[i] + Math.max(dp[i - 1][0], dp[i - 1][1]);
		}
		
		System.out.println(Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}
