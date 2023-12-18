import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			double n = sc.nextDouble();
			double k = sc.nextDouble();
			List<Double> an = new ArrayList<>();
			for (double i = 0; i < n; i++) {
				an.add(sc.nextDouble());
			}
			double maxSum = 0;
			for (int i = 0; i <= n - k; i++) {
				double sum = 0;
				for (int j = i; j < i + k; j++) {
					sum = sum + ((1 + an.get(j)) / 2);
				}
				if (sum > maxSum) {
					maxSum = sum;
				}
			}

			System.out.println(maxSum);
		}
	}

	/**
	 * 最小公倍数
	 */
	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return c / b;
	}

	/**
	 * 最大公約数
	 */
	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}
