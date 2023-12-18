import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long m = scanner.nextLong();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt() / 2);
			long lcm = 1;
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

	// 最小公倍数lcm
	private static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return (int) (c / b);
	}
}
