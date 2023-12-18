import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();
		final int a = scanner.nextInt();
		final int b = scanner.nextInt();
		int result = ((tower2(n) - 1 - comb(n, a)) % PRIME - comb(n, b)) % PRIME;

		while (result < 0) {
			result += PRIME;
		}
		System.out.println(result);

	}

	static int tower2(int n) {
		if (n == 1)
			return 2;
		return (int) ((long) tower2(n / 2) * tower2(n - n / 2) % PRIME);
	}

	static int fact(int n) {
		if (n == 1)
			return 1;
		return (int) ((long) n * fact(n - 1) % PRIME);
	}

	static int comb(int n, int k) {
		long numer = 1, denom = 1;
		for (int i = 0; i < k; i++) {
			numer = numer * (n - i) % PRIME;
			denom = denom * (i + 1) % PRIME;
		}

		//		long comb = (long) fact(n) * inverse(fact(k)) % PRIME;
		//		comb = comb * inverse(fact(n - k)) % PRIME;
		return (int) (numer * inverse((int) denom) % PRIME);

	}

	static int inverse(int denom) {
		if (denom == 0)
			return 0;

		int a = PRIME;
		int b = denom;
		int x = 0;
		int y = 1;
		int temp;

		while (a % b != 0) {
			x -= a / b * y;
			temp = x;
			x = y;
			y = temp;
			temp = a % b;
			a = b;
			b = temp;
		}

		//		while (y < 0)
		//			y += PRIME;

		return y;
	}

	static final int PRIME = 1000000007;

}
