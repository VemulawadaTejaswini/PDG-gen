import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = sc.next();
			long a = sc.nextLong();
			long b = sc.nextLong();
			String u = sc.next();
			if (s.equals(u)) {
				a = a - 1;
			}
			if (t.equals(u)) {
				b = b - 1;
			}
			System.out.println(a + " " + b);
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