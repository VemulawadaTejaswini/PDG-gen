import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static int inf = (int) 1e15;
	static HashSet<Integer>[] ad;
	static int n, q;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		String s = sc.nextLine();
		int[][] dp = new int[n + 1][n + 1];
		dp[1][1] = 1;
		for (int l = 2; l <= n; l++) {
			for (int i = 1; i <= l; i++) {
				dp[l - 1][i] += dp[l - 1][i - 1];
				if (dp[l - 1][i] >= mod)
					dp[l - 1][i] -= mod;
			}
			for (int num = 1; num <= l; num++)
				if (s.charAt(l - 2) == '>') {
					dp[l][num] += dp[l - 1][l-1] - dp[l - 1][num-1]+mod;
					if (dp[l][num] >= mod)
						dp[l][num] -= mod;
				} else {
					dp[l][num] += dp[l - 1][num-1] ;
					if (dp[l][num] >= mod)
						dp[l][num] -= mod;
				}
		}
		int ans = 0;
		for(int i=1;i<=n;i++) {
			ans+=dp[n][i];
		 if(ans>=mod)
			 ans-=mod;
		}
		System.out.println(ans);
		out.flush();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}