import java.io.*;
import java.util.*;

public class Main {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int N = file.nextInt();
		int[][] dp = new int[3][N+1];
		int[] a = new int[N+1], b = new int[N+1], c = new int[N+1];
		for(int i = 1; i <= N; i++) {
			a[i] = file.nextInt();
			b[i] = file.nextInt();
			c[i] = file.nextInt();
		}
		dp[0][1] = a[1];
		dp[1][1] = b[1];
		dp[2][1] = c[1];
		for(int i = 2; i <= N; i++) {
			dp[0][i] = Math.max(dp[1][i-1], dp[2][i-1]) + a[i];
			dp[1][i] = Math.max(dp[0][i-1], dp[2][i-1]) + b[i];
			dp[2][i] = Math.max(dp[1][i-1], dp[0][i-1]) + c[i];
		}
		System.out.println(Math.max(dp[0][N], Math.max(dp[1][N], dp[2][N])));
	}
	class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}
