import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int[] v = new int[n];
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			v[i] = Integer.parseInt(st.nextToken());
			w[i] = Integer.parseInt(st.nextToken());
		}
		reader.close();
		System.out.println(getMaxValue(n, W, v, w));
	}

	private int getMaxValue(int n, int W, int[] values, int[] weigths) {
		int[][] dp = new int[n+1][W+1];
		for (int i = 1; i <= n; i++) {
			int w = weigths[i-1];
			int v = values[i-1];
			for (int j = 0; j <= W; j++) {
				if (w <= j) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w] + v);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[n][W];
	}
}
