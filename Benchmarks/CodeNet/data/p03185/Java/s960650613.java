

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static long mincosts(int i, long c, long[] ar, long[] dp) {

		if (i == ar.length - 1)
			return 0;

		if (dp[i] != -1L)
			return dp[i];

		long mincost = Long.MAX_VALUE;

		for (int index = i + 1; index < ar.length; index++)
			mincost = Math.min(mincost,
					((Math.abs(ar[i] - ar[index]) * Math.abs(ar[i] - ar[index])) + c + mincosts(index, c, ar, dp)));

		return dp[i] = mincost;
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long ar[] = new long[n];
		long dp[] = new long[n];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextLong();
			dp[i] = -1L;
		}

		pr.println(mincosts(0, c, ar, dp));
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
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
	}

}