import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		long a, b;
		while (scanner.hasNext()) {
			a = scanner.nextLong();
			b = scanner.nextLong();
			long gcd = gcd(a, b);
			System.out.println(gcd + " " + lcm(a, b, gcd));

		}
	}

	public static long gcd(long a, long b) {
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		if (max % min == 0)
			return min;
		return gcd(min, max % min);
	}

	public static long lcm(long a, long b, long gcd) {
		return a * b / gcd;
	}
}