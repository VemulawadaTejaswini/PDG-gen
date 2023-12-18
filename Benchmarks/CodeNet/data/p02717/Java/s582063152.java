import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			List<Long> an = new ArrayList<>();
			an.add(c);
			an.add(a);
			an.add(b);
			StringBuilder sb = new StringBuilder();
			for (long l : an) {
				sb.append(l);
				sb.append(" ");
			}
			sb.setLength(sb.length()-1);
			System.out.println(sb);
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
