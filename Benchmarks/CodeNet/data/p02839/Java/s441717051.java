import java.io.*;
import java.util.*;
public class Main {
	public static class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
	}

	public static void main(String[] args) {
		FS in = new FS();
	
		int h = in.nextInt();
		int w = in.nextInt();
		int[][] c = new int[h][w];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				c[i][j] = in.nextInt();
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				c[i][j] -= in.nextInt();

		int[][] dp = new int[h][w];
		for (int i = 0; i < h; i++)
			Arrays.fill(dp[i], 160 * 160 + 1);
		dp[h - 1][w - 1] = c[h - 1][w - 1];
		for (int i = h - 1; i >= 0; i--) {
			for (int j = w - 1; j >= 0; j--) {
				if (i != 0 && j != 0) {
					int put = c[i - 1][j - 1] + dp[i][j];
					int dist = (int) Math.abs(put);
					if (dist < (int) Math.abs(dp[i - 1][j - 1]))
						dp[i - 1][j - 1] = put;
				}
				else if (i != 0) {
					int put = c[i - 1][j] + dp[i][j];
					int dist = (int) Math.abs(put);
					if (dist < (int) Math.abs(dp[i - 1][j]))
						dp[i - 1][j] = put;
				}
				else if (j != 0) {
					int put = c[i][j - 1] + dp[i][j];
					int dist = (int) Math.abs(put);
					if (dist < (int) Math.abs(dp[i][j - 1]))
						d[i][j - 1] = put;
				}
			}
		}
		
		int ans = (int) Math.min(dp[0][0]);
		System.out.println(ans);
	}
}
