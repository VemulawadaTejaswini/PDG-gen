
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
			int K = br.nextInt();
			int[] in = new int[N];
			
			for(int i = 0; i < N; i++) {
				in[i] = br.nextInt();
			}
			
			int[] dp = new int[N];
			
			dp[0] = 0;
			
			for(int i = 1; i < N; i++) {
				int min = Integer.MAX_VALUE;
				for(int j = 1; j <= K; j++) {
					if(i-j >= 0) {
						min = Math.min(min, dp[i-j] + dist(i, i-j, in));
					}
				}
				
				dp[i] = min;
			}
			
			pw.println(dp[N-1]);
			
			pw.close();
		}
		
		public static int dist(int i, int j, int[] in) {
			return Math.abs(in[i] - in[j]);
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
 

