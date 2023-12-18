import java.util.Scanner;

public class Main {

	static int coinCount;
	static double[] coinProbabilityArray;
	static double[][] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		coinCount = scan.nextInt();
		coinProbabilityArray = new double[coinCount];

		for (int i = 0; i < coinCount; i++) {

			coinProbabilityArray[i] = scan.nextDouble();
		}

		dp = new double[coinCount + 1][coinCount + 1];

		for (int i = 0; i < coinCount + 1; i++) {

			for (int j = 0; j < coinCount + 1; j++) {

				dp[i][j] = dpMethod(i, j);
			}
		}

		double answer = 0;

		for (int i = coinCount; coinCount / 2 < i; i--) {

			answer += dp[i][coinCount - i];
		}

		println(answer);

	}

	public static double dpMethod(int i, int j) {

		if (coinCount - 1 < i + j - 1) {
			return 0;
		}

		if (i == 0 && j == 0) {

			return 1;
		}

		if (i == 0) {

			return dp[i][j - 1] * back(coinProbabilityArray[i + j - 1]);

		} else if (j == 0) {

			return dp[i - 1][j] * coinProbabilityArray[i + j - 1];

		} else {

			return dp[i - 1][j] * coinProbabilityArray[i + j - 1]
					+ dp[i][j - 1] * back(coinProbabilityArray[i + j - 1]);
		}
	}

	public static double back(double coinProbability) {
		return 1 - coinProbability;
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
