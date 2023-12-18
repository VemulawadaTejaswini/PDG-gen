import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int[] primes = primes(N);

		int[] factorize = new int[primes.length];

		for (int i = 1; i <= N; i++) {
			int[] f = factorization(i, primes);
			for (int j = 0; j < factorize.length; j++) {
				factorize[j] += f[j];
			}
		}
		int count75 = 0;

		int cnt2 = 0;
		int cnt4 = 0;
		int cnt14 = 0;
		int cnt24 = 0;
		int cnt74 = 0;

		for (int i = 0; i < factorize.length; i++) {
			if (factorize[i] >= 74) {
				cnt74++;
			}
			if (factorize[i] >= 24) {
				cnt24++;
			}
			if (factorize[i] >= 14) {
				cnt14++;
			}
			if (factorize[i] >= 4) {
				cnt4++;
			}
			if (factorize[i] >= 2) {
				cnt2++;
			}
		}

		// 4-4-2
		count75 += ((cnt4 * (cnt4 - 1)) / 2) * (cnt2 - 2);

		// 24-2
		count75 += cnt24 * (cnt2 - 1);

		// 14-4
		count75 += cnt14 * (cnt4 - 1);

		// 74
		count75 += cnt74;
		
		System.out.println(count75);
	}

	private int[] factorization(int n, int[] primes) {
		int[] factors = new int[primes.length];
		for (int i = 0; i < primes.length; i++) {
			if (n < primes[i]) {
				break;
			}
			while (n % primes[i] == 0) {
				n /= primes[i];
				factors[i] += 1;
			}
		}
		return factors;
	}

	private int[] primes(int X) {
		if (X <= 1) {
			return new int[0];
		}

		boolean[] isPrime = new boolean[X];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		int numOfPrimes = X - 1;

		for (int i = 1, bound = (int) Math.sqrt(X) + 1; i < bound; i++) {
			int n = i + 1;
			for (int m = 2; n * m <= X; m++) {
				if (isPrime[n * m - 1]) {
					isPrime[n * m - 1] = false;
					numOfPrimes -= 1;
				}
			}
		}
		int[] primes = new int[numOfPrimes];
		for (int i = 0, j = 0; i < isPrime.length; i++) {
			if (isPrime[i]) {
				primes[j++] = i + 1;
			}
		}
		return primes;
	}

}
