import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		int maxWait = scan.nextInt();

		int[][] itemArray = new int[itemCount + 1][2];

		for (int i = 1; i < itemCount + 1; i++) {

			// 重さ
			itemArray[i][0] = scan.nextInt();

			// 価値
			itemArray[i][1] = scan.nextInt();
		}

		long[][] dp = new long[itemCount + 1][maxWait + 1];

		for (int i = 1; i < itemCount + 1; i++) {

			for (int w = 0; w < maxWait + 1; w++) {

				if (itemArray[i][0] <= w) {

					dp[i][w] = Math.max(
							dp[i - 1][w - itemArray[i][0]] + itemArray[i][1],
							dp[i - 1][w]);

				} else {

					dp[i][w] = dp[i - 1][w];
				}
			}
		}

		System.out.println(dp[itemCount][maxWait]);
	}
}
