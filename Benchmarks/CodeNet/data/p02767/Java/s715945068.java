import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			List<Long> xn = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				xn.add(sc.nextLong());
			}

			long result = Long.MAX_VALUE;
			for (int i = 1; i <= 1000; i++) {
				long wk = 0;
				for (Long x : xn) {
					wk = wk + (x - i) * (x - i);
				}
				if (result > wk) {
					result = wk;
				} else {
					break;
				}
			}

			// 出力(整数)
			System.out.println(result);
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
