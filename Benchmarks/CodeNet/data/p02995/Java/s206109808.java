import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final long a = s.nextLong();
			final long b = s.nextLong();
			final long c = s.nextLong();
			final long d = s.nextLong();

			int count = 0;

			count += (b / c - (a - 1) / c);
			count += (b / d - (a - 1) / d);
			count -= (b / lcm(c, d) - (a - 1) / lcm(c, d));

			System.out.println(b - a + 1 - count);
		}

	}

	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return (c / b);
	}

}
