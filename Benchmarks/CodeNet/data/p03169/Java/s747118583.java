import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static int dishCount;

	static int oneSushiDishCount;
	static int twoSushiDishCount;
	static int threeSushiDishCount;

	// 確率を保持
	static double[][][] dp;

	static Set<DishSituation> firstSet = new HashSet<>();

	static Set<DishSituation> secondSet = new HashSet<>();

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

		firstSet.add(new DishSituation(oneSushiDishCount, twoSushiDishCount, threeSushiDishCount));

		while (firstSet.size() != 0) {

			for (DishSituation target : firstSet) {

				dpMethod(target.oneSushiDish, target.twoSushiDish, target.threeSushiDish);
			}

			firstSet.clear();
			firstSet.addAll(secondSet);
			secondSet.clear();
		}

		println(result);

	}

	public static void dpMethod(int one, int two, int three) {

		double dpValue = dp[one][two][three];
		int total = one + two + three;
		double parameter = total / dpValue;

		if (total != 0) {

			if (0 < three) {

				dp[one][two + 1][three - 1] += (double) three / parameter;

				secondSet.add(new DishSituation(one, two + 1, three - 1));
			}

			if (0 < two) {

				dp[one + 1][two - 1][three] += (double) two / parameter;

				secondSet.add(new DishSituation(one + 1, two - 1, three));
			}

			if (0 < one) {

				dp[one - 1][two][three] += (double) one / parameter;

				secondSet.add(new DishSituation(one - 1, two, three));
			}

			result += (double) dishCount / parameter;
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}

	public static class DishSituation {

		public int oneSushiDish = 0;
		public int twoSushiDish = 0;
		public int threeSushiDish = 0;

		public DishSituation(int oneSushiDish, int twoSushiDish, int threeSushiDish) {

			this.oneSushiDish = oneSushiDish;
			this.twoSushiDish = twoSushiDish;
			this.threeSushiDish = threeSushiDish;
		}

		@Override
		public boolean equals(Object obj) {

			DishSituation target = (DishSituation) obj;

			return this.oneSushiDish == target.oneSushiDish
					&& this.twoSushiDish == target.twoSushiDish
					&& this.threeSushiDish == target.threeSushiDish;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + oneSushiDish;
			result = prime * result + twoSushiDish;
			result = prime * result + threeSushiDish;
			return result;
		}
	}
}
