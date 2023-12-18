import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dayCount = scan.nextInt();

		// 日数、活動種別、満足度及び累積満足度
		int dp[][][] = new int[dayCount][3][2];

		for (int i = 0; i < dayCount; i++) {

			for (int j = 0; j < 3; j++) {

				dp[i][j][0] = scan.nextInt();
			}
		}

		for (int j = 0; j < 3; j++) {

			dp[0][j][1] = dp[0][j][0];
		}

		// 配る方式
		for (int i = 0; i < dayCount - 1; i++) {

			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {

					if (k != j) {

						dp[i + 1][k][1] = Math.max(
								dp[i + 1][k][1],
								dp[i][j][1] + dp[i + 1][k][0]);
					}
				}
			}
		}

		int answer = 0;

		for (int j = 0; j < 3; j++) {

			answer = Math.max(
					answer,
					dp[dayCount - 1][j][1]);
		}

		System.out.println(answer);
	}
}
