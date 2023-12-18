
import java.util.*;
import java.io.*;

public class Main
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt();
		int[][] arr = new int[n][3];
		for(int i = 0; i < n; i++) arr[i] = in.readarr(3);
		
		int[][] dp = new int[n][3];
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		for(int i = 1; i < n; i++)
		{
			dp[i][0] = arr[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = arr[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] = arr[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
		}
				
		System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
		
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
