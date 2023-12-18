package Specialist;

import java.util.*;
import java.io.*;

public class Main{
	static long[][] dp;
	static int[] w, v;
	static int n, s;

	public static long result(int nn, int rw) {
		if (rw < 0) {
			return -(int) 1e9;
		}if(n==nn)
			return 0;
		if (dp[nn][rw] != -1) {
			return dp[nn][rw];
		}
		long take = v[nn] + result(nn + 1, rw - w[nn]);
		long leave = result(nn + 1, rw);
		return dp[nn][rw] = Math.max(take, leave);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		s = sc.nextInt();
		dp = new long[n][s + 1];
		v = new int[n];
		w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		for (long[] x : dp) {
			Arrays.fill(x, -1);
		}
		pw.print(result(0, s));
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