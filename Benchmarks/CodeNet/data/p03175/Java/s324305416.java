
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
		static int N, MOD = (int) 1e9+7; 
		static long[][] dp;
		static LinkedList<Integer>[] edges;
		
		public void solve(FastScanner br, PrintWriter pw) throws IOException {
			N = br.nextInt();
			dp = new long[N][2];
			edges = new LinkedList[N];
			
			for(int i = 0; i < edges.length; i++) {
				edges[i] = new LinkedList<Integer>();
			}
			
			
			for(int i = 0; i < N-1; i++) {
				int x = br.nextInt();
				int y = br.nextInt();
				
				x--;
				y--;
				
				edges[x].add(y);
				edges[y].add(x);
				
			}
			
			for(int i = 0; i < N; i++) {
				
					dp[i][0] = 1;
					dp[i][1] = 1;
				
			}
			
			
			
			dfs(0,-1);
					
			pw.println((dp[0][0] + dp[0][1])%MOD);
			pw.close();
		}
		
		public static void dfs(int v, int pV) {
			long sum1 = dp[v][0]; //color black
			long sum2 = dp[v][1]; //color white
			
			for(int e : edges[v]) {
				if(e == pV) {
					continue;
				}
				dfs(e, v);
				
				sum1 = (sum1 * (dp[e][1]))%MOD;
				sum2 = (sum2 * (dp[e][0] + dp[e][1]))%MOD;
				
			}
			
			dp[v][0] = sum1;
			dp[v][1] = sum2;
			
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
 

