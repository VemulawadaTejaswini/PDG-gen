import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static int dishCount;

	static int oneSushiDishCount;
	static int twoSushiDishCount;
	static int threeSushiDishCount;

	// 確率を保持
	static double[][][] dp;

	static Set<List<Integer>> firstSet = new HashSet<>();

	static Set<List<Integer>> secondSet = new HashSet<>();

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

		firstSet.add(Arrays.asList(new Integer[] {oneSushiDishCount, twoSushiDishCount, threeSushiDishCount}));

		while (firstSet.size() != 0) {

			for (List<Integer> target : firstSet) {

				dpMethod(target.get(0), target.get(1), target.get(2));
			}

			firstSet.clear();
			firstSet.addAll(secondSet);
			secondSet.clear();
		}

		println(result);

	}

	public static void dpMethod(int one, int two, int three) {

		if (one + two + three != 0) {

			if (0 < three) {

				dp[one][two + 1][three - 1] += (double) three / (one + two + three) * dp[one][two][three];

				secondSet.add(Arrays.asList(new Integer[] { one, two + 1, three - 1 }));
			}

			if (0 < two) {

				dp[one + 1][two - 1][three] += (double) two / (one + two + three) * dp[one][two][three];

				secondSet.add(Arrays.asList(new Integer[] { one + 1, two - 1, three }));
			}

			if (0 < one) {

				dp[one - 1][two][three] += (double) one / (one + two + three) * dp[one][two][three];

				secondSet.add(Arrays.asList(new Integer[] { one - 1, two, three }));
			}

			result += (double) dishCount / (one + two + three) * dp[one][two][three];
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
