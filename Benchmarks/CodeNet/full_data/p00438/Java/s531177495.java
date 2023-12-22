import java.util.Scanner;

class Main {
	static int[][] dp;
	static boolean[][] isStop;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int w = in.nextInt();
			int h = in.nextInt();

			if (w == 0 && h == 0) {
				in.close();
				return;
			}
			int n = in.nextInt();
			dp = new int[h + 1][w + 1];
			isStop = new boolean[h + 1][w + 1];

			for (int i = 0; i < h + 1; i++) {
				for (int j = 0; j < w + 1; j++) {
					isStop[i][j] = false;
				}
			}

			for (int i = 0; i < n; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				isStop[b][a] = true;
			}
			System.out.println(solve(h, w));

		}

	}

	static int solve(int y, int x) {

		if (dp[y][x] != 0)
			return dp[y][x];
		if (x == 0 || y == 0)
			return 0;
		if (x == 1 && y == 1)
			return 1;
		if (isStop[y][x]) {
			return 0;
		}
		int ret = 0;
		dp[y][x] = (solve(y - 1, x) + solve(y, x - 1));
		ret = dp[y][x];
		return ret;
	}

}