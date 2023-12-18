import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int DIVIDE_NUMBER = 1000000007;

	static int childrenCount;
	static int candyCount;
	static int[] childCapacityArray;
	static int[][] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		childrenCount = scan.nextInt();
		candyCount = scan.nextInt();
		scan.nextLine();

		childCapacityArray = Arrays.stream(scan.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		dp = new int[childrenCount + 1][candyCount + 1];

		for (int n = 0; n < childrenCount + 1; n++) {

			for (int k = 0; k < candyCount + 1; k++) {

				dpMethod(n, k);
			}
		}

		println(dp[childrenCount][candyCount]);

	}

	public static void dpMethod(int n, int k) {

		if (k == 0) {

			dp[n][k] = 1;

		} else if (n == 0) {

			dp[n][k] = 0;

		} else {

			int outOfScope = k < childCapacityArray[n - 1] + 1
					? 0
					: dp[n - 1][k - childCapacityArray[n - 1] - 1];

			dp[n][k] = modulo(dp[n - 1][k] + dp[n][k - 1] - outOfScope);
		}

	}

	public static int modulo(int target) {

		return target % DIVIDE_NUMBER;
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
