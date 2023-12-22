import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int S = fs.nextInt();
		long[] dp = new long[S + 1];

		dp[0] = 1;
		for (int i = 3; i <= S; i++) {
			for (int coins = 3; coins <= i; coins++) {
				dp[i] = (dp[i] + dp[i - coins]) % (long) (1e9 + 7);
			}
		}
		System.out.println(dp[S]);
	}
}
