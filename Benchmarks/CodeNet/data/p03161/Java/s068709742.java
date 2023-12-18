import java.io.*;
import java.util.*;

public class Main {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int N = file.nextInt(), K = file.nextInt();
		long[] h = new long[N + 1];
		long[] dp = new long[N + 1];
		for(int i = 1; i <= N; i++) h[i] = file.nextLong();
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[1] = 0;
		dp[2] = Math.abs(h[1]-h[2]);
		for(int i = 3; i <= N; i++) {
			for(int j = 1; j <= K; j++) {
				if(i-j > 0) dp[i] = Math.min(dp[i-j] + Math.abs(h[i]-h[i-j]), dp[i]);
			}
		}
		System.out.println(dp[N]);
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
