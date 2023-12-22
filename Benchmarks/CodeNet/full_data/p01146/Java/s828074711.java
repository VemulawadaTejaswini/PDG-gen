import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n, m, l, k, a, h;
	int[][] dp;
	int[][] map;
	boolean[] freeze;
	
	public void run() {
		while (true) {
			n = in.nextInt();
			m = in.nextInt();
			l = in.nextInt();
			k = in.nextInt();
			a = in.nextInt();
			h = in.nextInt();
			if ((n|m|l|k|a|h) == 0) break;
			
			freeze = new boolean[n];
			for (int i = 0; i < l; i++) {
				freeze[in.nextInt()] = true;
			}
			
			map = new int[n][n];
			for (int i = 0; i < map.length; i++) {
				Arrays.fill(map[i], -1);
			}
			
			for (int i = 0; i < k; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				int cost = in.nextInt();
				map[x][y] = map[y][x] = cost;
			}
			
			dp = new int[m+1][n];
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], Integer.MAX_VALUE);
			}
			
			dp[m][a] = 0;
			for (int time = 0; time < m; time++)
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (map[i][j] != -1) {
							for (int k = 0; k < dp.length; k++) {
								if (dp[k][i] != Integer.MAX_VALUE && k - map[i][j] >= 0) {
									int next = k - map[i][j];
									dp[next][j] = Math.min(dp[next][j], dp[k][i] + map[i][j]);
									if (freeze[j]) {
										for (int l = 1; l <= m - next; l++) {
											dp[next+l][j] = Math.min(dp[next+l][j], dp[next][j] + l);
										}
									}
								}
							}
						}
					}
				}
			
			//debug();
			
			int res = Integer.MAX_VALUE;
			for (int i = 0; i < dp.length; i++) {
				res = Math.min(res, dp[i][h]);
			}
			
			System.out.println((res == Integer.MAX_VALUE) ? "Help!" : res);
		}
	}

	void debug() {
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(((dp[i][j] == Integer.MAX_VALUE) ? "F" : dp[i][j]) + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}