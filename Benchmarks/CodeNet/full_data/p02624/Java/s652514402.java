import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += i * countDivisor(i);
		}
		System.out.println(ans);
	}

	private static int countDivisor(long n) {
		int count = 1;
		for (int i = 2; i <= n; i++) {
			if (!isPrime(i))
				continue;
			int c = 0;
			while ((n % i) == 0) {
				n = n / i;
				c += 1;
			}
			count *= c + 1;
		}
		// System.out.println(count);
		return count;
	}

	// 素数判定
	public static boolean isPrime(long l) {
		return BigInteger.valueOf(l).isProbablePrime(1);
	}

}