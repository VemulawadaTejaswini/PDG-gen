import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int nmax = 200000;
		int[] fact = new int[nmax + 1];
		fact[0] = 1;
		for (int i = 1; i <= nmax; i++) {
			fact[i] = (int) ((long) fact[i - 1] * i % PRIME);
		}

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int imax = k < n - 1 ? k : n - 1;

		int sum = 0;

		for (int i = 0; i <= imax; i++) {
			long comb = (long) fact[n] * fact[n - 1] % PRIME;
			comb = comb * inverse(fact[i]) % PRIME;
			comb = comb * inverse(fact[i]) % PRIME;
			comb = comb * inverse(fact[n - i]) % PRIME;
			comb = comb * inverse(fact[n - 1 - i]) % PRIME;

			sum = (sum + (int) comb) % PRIME;
		}

		while (sum < 0)
			sum += PRIME;

		System.out.println(sum);
	}

	static int fact(int n) {
		if (n == 1)
			return 1;
		return (int) ((long) n * fact(n - 1) % PRIME);
	}

	static int comb(int n, int k) {
		long numer = 1, denom = 1;
		int l = n - k < k ? n - k : k;

		for (int i = 0; i < l; i++) {
			numer = (numer * (n - i) % PRIME) * (n - i - 1) % PRIME;
			denom = (denom * (i + 1) % PRIME) * (i + 1) % PRIME;
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
