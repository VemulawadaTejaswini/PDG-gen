import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final long INF = Long.MAX_VALUE;

	public static int[][] itemArray;

	public static long[][] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		int maxWait = scan.nextInt();

		itemArray = new int[itemCount + 1][2];

		for (int i = 1; i < itemCount + 1; i++) {

			// 重さ
			itemArray[i][0] = scan.nextInt();

			// 価値
			itemArray[i][1] = scan.nextInt();
		}

		dp = new long[itemCount + 1][maxWait + 1];

		for (long[] dpArray : dp) {

			Arrays.fill(dpArray, INF);
		}

		long answer = calculateDPValue(itemCount, maxWait);

		System.out.println(answer);
	}

	private static long calculateDPValue(int itemNumber, int waitNumber) {

		if (dp[itemNumber][waitNumber] != INF) {

			return dp[itemNumber][waitNumber];
		}

		if (itemNumber == 0) {

			dp[itemNumber][waitNumber] = 0;
			return 0;
		}

		long value;

		if (itemArray[itemNumber][0] <= waitNumber) {

			value = Math.max(
					calculateDPValue(itemNumber - 1, waitNumber),
					calculateDPValue(itemNumber - 1, waitNumber - itemArray[itemNumber][0]) + itemArray[itemNumber][1]);
		} else {

			value = calculateDPValue(itemNumber - 1, waitNumber);
		}

		dp[itemNumber][waitNumber] = value;
		return value;
	}
}
