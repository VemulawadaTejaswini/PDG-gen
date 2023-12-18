import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long m = scanner.nextLong();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt() / 2);
			Arrays.sort(a);
			if (check(a)) {
				System.out.println(0);
			}
			long lcm = 1, gcd = a[0];
			for (int ai : a) {
				lcm = lcm(lcm, ai);
				if (lcm > m) {
					System.out.println(0);
					return;
				}
			}
			long count = m / lcm;
			System.out.println((count + 1) / 2);
		}
	}

	private static boolean check(int[] a) {
		boolean result = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 1) {
				for (int j = i + 1; j < a.length; j++) {
					if ((a[i] != a[j]) && (a[j] % a[i]) == 0) {
						return true;
					}
				}
			}
		}
		return result;
	}

	// 最小公倍数lcm
	private static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	// 最大公約数
	private static long gcd(long a, long b) {
		if (a < b)
			return gcd(b, a);
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
