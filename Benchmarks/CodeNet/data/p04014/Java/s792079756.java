import java.util.Scanner;

/**
 * 解説通り実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			long s = scanner.nextLong();
			if (n == s) {
				System.out.println(n + 1);
			} else {
				for (int b = 2; b <= (int) Math.sqrt(n); b++) {
					if (s == f(b, n)) {
						System.out.println(b);
						return;
					}
				}
				for (int p = 1; p <= (int) Math.sqrt(n); p++) {
					long b = (n - s) / p + 1;
					if ((b > p) && (s == f(b, n))) {
						System.out.println(b);
						return;
					}
				}
				System.out.println(-1);
			}
		}
	}

	/**
	 * @param b
	 * @param n
	 * @return f(b,n)
	 */
	private static long f(long b, long n) {
		if (n < b) {
			return n;
		} else {
			return f(b, n / b) + n % b;
		}
	}
}
