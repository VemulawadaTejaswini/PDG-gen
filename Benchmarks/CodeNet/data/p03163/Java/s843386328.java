package Specialist;

import java.util.*;
import java.io.*;

public class Main{
	static long[][] dp;
	static int[] w, v;
	static int n, s;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		s = sc.nextInt();
		dp = new long[n+1][s + 1];
		v = new int[n];
		w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {
		for (int rw = 0; rw < s + 1; rw++) {
			long leave = dp[i + 1][rw];
			long take = (rw - w[i]) < 0 ? -(int) 1e9 : (v[i] + dp[i + 1][rw - w[i]]);
			dp[i][rw] = Math.max(leave, take);
		}
	}
		pw.print(dp[0][s]);
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}
}
