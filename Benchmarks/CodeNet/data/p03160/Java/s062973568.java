import java.io.*;
import java.util.*;

public class frog1 {

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
			
			int[] dp = new int[N];
			
			dp[0] = 0;
			
			for(int i = 1; i < N; i++) {
				if(i == 1) {
					dp[i] = dp[i-1] + dist(i, i-1, in);
				}
				else {
					dp[i] = Math.min(dp[i-1] + dist(i,i-1,in), dp[i-2] + dist(i,i-2,in));
				}
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
 

