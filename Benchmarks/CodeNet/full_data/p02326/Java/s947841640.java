import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] dp = new int[H][W];
		int max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				int c = sc.nextInt();
				dp[i][j] = (c == 0) ? 1 : 0;
				max = Math.max(max, dp[i][j]);
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i == 0 || j == 0 || dp[i][j] == 0) continue;
				dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max * max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}