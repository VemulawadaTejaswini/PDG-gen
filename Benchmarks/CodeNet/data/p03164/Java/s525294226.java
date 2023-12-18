
import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt();
		int w = in.nextInt();
		
		int[] we = new int[n];
		int[] val = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			we[i] = in.nextInt();
			val[i] = in.nextInt();
			sum += val[i];
		}
		long ans = 0;
		int max = sum + 10;
		long[][] dp = new long[n + 1][sum + 1];
		for(int i = 0; i <= n; i++)
		{
			Arrays.fill(dp[i], Integer.MAX_VALUE);
			dp[i][0] = 0;
		}
		
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sum; j++)
			{
				dp[i][j] = Math.min(dp[i - 1][Math.max(0, j - val[i - 1])] + we[i - 1], dp[i - 1][j]);
				if(dp[i][j] <= w) ans = Math.max(ans, j);
			}
		}
		System.out.println(ans);
		
	}

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

		int[] readarr(int abc) {
			int[] temp = new int[abc];
			for (int i = 0; i < abc; i++)
				temp[i] = nextInt();
			return temp;
		}
	}
}
