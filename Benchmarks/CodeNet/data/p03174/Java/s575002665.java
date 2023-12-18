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
		
		static int N, oo = 987654321;
		static long[][] adj, dp;
		
		public void solve(FastScanner br, PrintWriter pw) throws IOException {
			N = br.nextInt();
			adj = new long[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					adj[i][j] = br.nextInt();
				}
			}
			
			dp = new long[N+1][1 << N];
			
			dp[0][0] = 1;
			
			long mod = (long) 1e9+7;
			
			
				for(int j = 0; j < (1 << N); j++) {
					
					int i = 0;
					
					for(int cnt = 0; cnt < N; cnt++) {
						if(((1 << cnt) & j) != 0) {
							i++;
						}
					}
					
					for(int c = 0; c < N; c++) {
						if(((1 << c) & j) != 0) {
							if(adj[i-1][c] == 1) {
								dp[i][j] = (dp[i][j] + dp[i-1][j & (~(1 << c))])%mod;
								
							}
						}
					}
				
			}
			
			pw.println(dp[N][(1 << N) - 1]);
			
			
			
			
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
 

