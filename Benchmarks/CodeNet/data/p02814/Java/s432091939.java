import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt() / 2);
			int lcm = 1;
			for (int ai : a) {
				lcm = lcm(lcm, ai);
			}
			int count = m / lcm;
			System.out.println((count + 1) / 2);
		}
	}

	// 最小公倍数lcm
	private static int lcm(int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return (int) (c / b);
	}
}
