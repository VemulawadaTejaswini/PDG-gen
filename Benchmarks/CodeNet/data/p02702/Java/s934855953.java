import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 文字列の入力
			String s = sc.next();
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j < s.length() + 1; j++) {
					BigDecimal l = new BigDecimal(s.substring(i, j));
					if (l.remainder(new BigDecimal("2019")) == BigDecimal.ZERO) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
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