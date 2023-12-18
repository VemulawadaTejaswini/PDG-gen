import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double n = sc.nextLong();
			double m = sc.nextLong();
			List<Double> an = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				an.add(sc.nextDouble());
			}
			double total = 0;
			for (double l : an) {
				total = total + l;
			}
			double border = total / (4 * m);
			long count = 0;
			for (double l : an) {
				if (!(l < border)) {
					count++;
				}
			}
			// 出力(文字列)
			System.out.println(count >= m ? "Yes" : "No");
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