import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			int[][] bal = new int[n + 1][2];
			bal[0][0] = 0;
			bal[0][1] = 0;
			for (int i = 1; i < bal.length; i++) {
				bal[i][0] = sc.nextInt();// ポジション
				bal[i][1] = sc.nextInt();// 時間
			}

			// int[] = {position, time, baloons, distance}

			int drop = 0;
			int[][] dp = new int[n + 1][4];// dp[i番目の風船をゲットした時][積んでいる風船の個数]
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], 40000);
			}
			dp[0][0] = 0;

			for (int i = 0; i < dp.length - 1; i++) {
				for (int j = 0; j < dp[i].length; j++) {
					if (dp[i][j] == 40000) {
						continue;
					}
					int dist = Math.abs(bal[i + 1][0] - bal[i][0]);
					boolean catchable = false;
					if (j < 3 && dist * (j + 1) <= bal[i + 1][1] - bal[i][1]) {
						// 取りに行ける時
						dp[i + 1][j + 1] = Math.min(dp[i][j] + dist,
								dp[i + 1][j + 1]);
						catchable = true;
					}
					if (bal[i + 1][0] + bal[i][0] * (j + 1) <= bal[i + 1][1]
							- bal[i][1]) {
						// 家に帰る時
						dp[i + 1][1] = Math.min(dp[i][j] + bal[i + 1][0]
								+ bal[i][0], dp[i + 1][1]);
						catchable = true;
					}
					if (!catchable) {
						// 取れない時
						drop = Math.max(drop, i + 1);
					}
				}
			}

			int score = Integer.MAX_VALUE;
			for (int i = 0; i < dp[n].length; i++) {
				score = Math.min(score, dp[n][i] + bal[n][0]);
			}
			if (score >= 40000) {
				System.out.println("NG " + drop);
			} else {
				System.out.println("OK " + score);
			}
		}
	}
}