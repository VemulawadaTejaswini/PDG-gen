import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int dishCount;

	static int oneSushiDishCount;
	static int twoSushiDishCount;
	static int threeSushiDishCount;

	// 確率を保持
	static double[][][] dp;

	static Queue<Integer[]> queue = new LinkedList<Integer[]>();

	static double result;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		dishCount = scan.nextInt();

		for (int i = 0; i < dishCount; i++) {

			int sushiType = scan.nextInt();

			if (sushiType == 1) {

				oneSushiDishCount++;

			} else if (sushiType == 2) {

				twoSushiDishCount++;

			} else if (sushiType == 3) {

				threeSushiDishCount++;
			}
		}

		dp = new double[dishCount + 1][dishCount + 1][dishCount + 1];

		dp[oneSushiDishCount][twoSushiDishCount][threeSushiDishCount] = 1;

		queue.add(new Integer[] { oneSushiDishCount, twoSushiDishCount, threeSushiDishCount });

		boolean isExistElement = true;

		while (isExistElement) {

			Integer[] element = queue.poll();

			if (element != null) {

				dpMethod(element[0], element[1], element[2]);

			} else {

				isExistElement = false;
			}
		}

		println(result);

	}

	public static void dpMethod(int one, int two, int three) {

		if (one + two + three != 0) {

			if (0 < three) {

				dp[one][two + 1][three - 1] += (double) three / (one + two + three) * dp[one][two][three];

				addIfNotDuplicated(new Integer[] { one, two + 1, three - 1 });
			}

			if (0 < two) {

				dp[one + 1][two - 1][three] += (double) two / (one + two + three) * dp[one][two][three];

				addIfNotDuplicated(new Integer[] { one + 1, two - 1, three });
			}

			if (0 < one) {

				dp[one - 1][two][three] += (double) one / (one + two + three) * dp[one][two][three];

				addIfNotDuplicated(new Integer[] { one - 1, two, three });
			}

			result += (double) dishCount / (one + two + three) * dp[one][two][three];
		}
	}

	public static void addIfNotDuplicated(Integer[] target) {

		// for (Integer[] integerArray : queue) {

		// 	if (Arrays.equals(integerArray, target)) {
		// 		return;
		// 	}
		// }
		queue.add(target);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
