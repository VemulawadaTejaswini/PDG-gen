

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt();
		int w = in.nextInt();
		
		int[][] items = new int[n][2];
		for(int i = 0; i < n; i++)
		{
			items[i][0] = in.nextInt();
			items[i][1] = in.nextInt();
		}
		
		long[][] dp = new long[n + 1][w + 1];
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= w; j++)
			{
				long x = dp[i - 1][j];
				long y = 0;
				if(items[i - 1][0] <= j)
				{
					y = dp[i - 1][j - items[i - 1][0]] + items[i - 1][1];
				}
				dp[i][j] = Math.max(x, y);
				
			}
		}
		System.out.println(dp[n][w]);
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
			int[] temp = new int[abc];
			for (int i = 0; i < abc; i++)
				temp[i] = nextInt();
			return temp;
		}
	}
}
