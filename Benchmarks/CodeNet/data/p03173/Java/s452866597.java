
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
			int[] in = new int[N];
			
			for(int i = 0; i < N; i++) {
				in[i] = br.nextInt();
			}
			
			long[][] dp = new long[N][N];
			long[][] size = new long[N][N];
			
			for(int i = 0; i < dp.length; i++) {
				for(int j = 0; j < N; j++) {
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			
			for(int i = 0; i < N; i++) {
				size[i][i] = in[i];
				dp[i][i] = 0;
			}
			for(int l = 1; l < N; l++) {
				for(int s = 0; s < N; s++) {
						if(s + l >= N) {
							continue;
						}
						long min = Long.MAX_VALUE;
						
						int bk = 0;
						
						for(int k = s; k < s+l; k++) {
							long val = dp[s][k] + dp[k+1][s+l] + size[s][k] + size[k+1][s+l];
							if(val < min) {
								min = val;
								bk = k;
							}
						}
						
						dp[s][s+l] = min;
						size[s][s+l] = size[s][bk] + size[bk+1][s+l];
							

					}
			}
			
			
			pw.println(dp[0][N-1]);
			
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
 

