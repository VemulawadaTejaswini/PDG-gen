import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] w, v;
	static int N, W;
	static long[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		N = Integer.parseInt(line[0]);
		W = Integer.parseInt(line[1]);

		w = new int[N];
		v = new int[N];
		for (int i = 0; i < N; i++) {
			line = sc.nextLine().split(" ");
			w[i] = Integer.parseInt(line[0]);
			v[i] = Integer.parseInt(line[1]);
		}

		dp = new long[N + 1][W + 1];
		for (long[] row : dp)
			Arrays.fill(row, -1);
		System.out.println(dfs(0, W));
	}

	static long dfs(int i, int j) {
		long res;

		if (dp[i][j] > -1) return dp[i][j];
		if (i == N) res = 0;
		else if (j < w[i]) res = dfs(i + 1, j);
		else res = Math.max(dfs(i + 1, j), dfs(i + 1, j - w[i]) + v[i]);

		return dp[i][j] = res;
	}
}