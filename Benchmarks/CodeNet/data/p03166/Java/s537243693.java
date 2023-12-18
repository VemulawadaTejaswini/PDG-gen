
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
		
		static ArrayList<Integer> ts;
		static ArrayList<Integer>[] edges;
		static boolean[] vis;
		static int N,M;
		
		public void solve(FastScanner br, PrintWriter pw) throws IOException {
			
			N = br.nextInt();
			M = br.nextInt();
			edges = new ArrayList[N];
			ts = new ArrayList<Integer>();
			vis = new boolean[N];
			
			for(int i = 0; i < N; i++) {
				edges[i] = new ArrayList<Integer>();
			}
			
			for(int i = 0; i < M; i++) {
				int x = br.nextInt();
				int y = br.nextInt();
				x--;
				y--;
				
				edges[x].add(y);
			}
			
			for(int i = 0; i < N; i++) {
				if(!vis[i]) {
					dfs(i);
				}
			}
			
			Collections.reverse(ts);
			
			int[] dp = new int[N];
			
			for(int curr : ts) {
				for(int e : edges[curr]) {
					dp[e] = Math.max(dp[e], dp[curr]+1);
				}
			}
			int ans = 0;
			for(int i = 0; i < dp.length; i++) {
				ans = Math.max(ans, dp[i]);
			}
			
			pw.println(ans);
			
			pw.close();
		}
		
		public static void dfs(int v) {
			vis[v] = true;
			for(int u : edges[v]) {
				if(vis[u]) {
					continue;
				}
				dfs(u);
			}
			
			ts.add(v);
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
 

