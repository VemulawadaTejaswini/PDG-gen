
/*
USER: caoash3
LANG: JAVA
TASK: 
*/

import java.io.*;
import java.util.*;

public class Main {

	static final boolean stdin = true;
	static final String filename = "";
	static FastScanner br;
	static PrintWriter pw;

	public static void main(String[] args) throws IOException {

		if (stdin) {
			br = new FastScanner();
			pw = new PrintWriter(new OutputStreamWriter(System.out));
		}

		else {
			br = new FastScanner(filename + ".in");
			pw = new PrintWriter(new FileWriter(filename + ".out"));
		}

		X solver = new X();
		solver.solve(br, pw);
	}

	static class X {
		public void solve(FastScanner br, PrintWriter pw) throws IOException {
			
			int N = br.nextInt();
			int W = br.nextInt();
			
			int[] w = new int[N];
			int[] v = new int[N];
			
			for(int i = 0; i < N; i++) {
				w[i] = br.nextInt();
				v[i] = br.nextInt();
			}
			
			long[][] dp = new long[N+1][1001];
			
			for(int i = 0; i <= N; i++) {
				for(int j = 0; j <= 1000; j++) {
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			
			dp[0][0] = 0;
			
			for(int i = 1; i <= N; i++) {
				for(int j = 0; j <= 1000; j++) {
					if(j-v[i-1] >= 0) {
						dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-v[i-1]]+w[i-1]);
					}
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
			
			long ans = 0;
			
			for(int i = 0; i <= 1000; i++) {
				if(dp[N][i] <= W) {
					ans = Math.max(ans, i);
				}
			}
			
			pw.println(ans);
			pw.close();
		}

	}

	//fastscanner class
	public static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

}
 

