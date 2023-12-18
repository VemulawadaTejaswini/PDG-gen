import java.util.Scanner;

public class Main {
	static long c, d;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		c = sc.nextLong();
		d = sc.nextLong();
		sc.close();

		System.out.println(f(b) - f(a - 1));
	}

	static long f(long a) {
		long x = a / c;
		long y = a / d;
		long z = a / (c * d / gcd(c, d));
		return a - x - y + z;
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
