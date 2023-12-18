import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		int max = 2000;
		int sum = 0;
		boolean[][] dp = new boolean[n + 1][2 * max + 1];
		dp[0][max] = true;
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			sum += val;
			
			for (int j = 0; j < dp[i].length; j++) {
				if (dp[i][j]) {
					if (j - val >= 0) {
						dp[i + 1][j - val] = true;
					}
					if (j + val < dp[i].length) {
						dp[i + 1][j + val] = true;
					}
				}
			}
		}
		
		for (int j = 0; j <= max; j++) {
			if (dp[n][j + max]) {
				out.println((sum + j) / 2);
				return;
			}
		}
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
