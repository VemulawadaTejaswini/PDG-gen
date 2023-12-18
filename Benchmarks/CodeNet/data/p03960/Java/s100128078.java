import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	int[][] cost;
	char[][] map;
	int[][] dp;

	void solver() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		map = new char[H][W];
		cost = new int[H][H];
		dp = new int[H][H];
		for (int i = 0; i < H; i++) {
			map[i] = sc.next().toCharArray();
		}
		int ans = 0;
		for (int i = 0; i < W - 1; i++) {
			for (int j = 0; j < H; j++) {
				for (int k = 0; k < H; k++) {
					dp[j][k] = -1;
					cost[j][k] = -1;
				}
			}
			ans += dfs(i, H - 1, H - 1);
		}
		System.out.println(ans);
	}

	int dfs(int x, int lh, int rh) {
		if (lh < 0 || rh < 0)
			return 0;
		if (dp[lh][rh] >= 0)
			return dp[lh][rh];
		return dp[lh][rh] = Math.min(dfs(x, lh - 1, rh) + calc(x, lh, rh), dfs(x, lh, rh - 1) + calc(x, lh, rh));
	}

	int calc(int x, int lh, int rh) {
		if (lh < 0 || rh < 0)
			return 0;
		if (cost[lh][rh] >= 0)
			return cost[lh][rh];
		return cost[lh][rh] = calc(x, lh - 1, rh - 1) + (map[lh][x] == map[rh][x + 1] ? 1 : 0);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
