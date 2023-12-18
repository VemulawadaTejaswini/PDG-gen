import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();

		int N = fr.nextInt();
		int W = fr.nextInt(); // upto 10^5
		int[] w = new int[N];
		long[] v = new long[N]; 
		
		for(int i = 0; i < N; i++) {
			w[i] = fr.nextInt();
			v[i] = fr.nextLong();
		}
		
		long[][] dp = new long[N+1][W+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= W; j++) {
				if (w[i-1] > j) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]] + v[i-1]);
			}
		}
		
		System.out.println(dp[N][W]);
	}

}
