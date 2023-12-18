
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
			
			double[] in = new double[N];
			
			for(int i = 0; i < N; i++) {
				in[i] = br.nextDouble();
			}
			
			double[][] dp = new double[N+1][N+1]; //i = coin, j = num heads, dp[i][j] = probability
			
			dp[0][0] = 1;
			
			for(int i = 1; i <= N; i++) {
				dp[i][0] = dp[i-1][0] * (1-in[i-1]);
			}
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					dp[i][j] = (double)(((double)(dp[i-1][j-1] * in[i-1])) + ((double)(dp[i-1][j] * ((double)(1-in[i-1])))));
				}
				
			}
			
			double ans = 0;
			
			for(int i = ((N/2)+1); i <= N; i++) {
				ans += dp[N][i];
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
 

