import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int INF = Integer.MAX_VALUE / 10;
	static int N = Integer.parseInt(sc.next());
	static int W = Integer.parseInt(sc.next());
	static final int V = 1000 * N;
	static int[] w = new int[N];
	static int[] v = new int[N];
	static int[][] dp = new int[N+1][V+1]; // 価値に対する最小の重さ
	static {
		Arrays.stream(dp).parallel().forEach(i -> Arrays.fill(i, INF));
//		Arrays.fill(dp[0], INF);
		dp[0][0] = 0;
	}
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < V+1; j++) {
				if (j - v[i] >= 0) {
					dp[i+1][j] = Math.min(dp[i][j], dp[i][j-v[i]] + w[i]);
				} else {
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		int ans = -1;
		for (int i = 0; i < V+1; i++) {
			if (dp[N][i] <= W) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
