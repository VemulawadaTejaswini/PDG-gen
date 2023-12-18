import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			factorization(a[i]);
		}
		scanner.close();

		long lcm = 1;
		for (int i = 0; i < PRIME_LIST.size(); i++) {
			i *= power(PRIME_LIST.get(i), factorList[i]);
			i %= MOD;
		}

		int result = 0;
		long b;
		for (int i = 0; i < n; i++) {
			b = lcm * inverse(a[i]) % MOD;
			result += b;
			result %= MOD;
		}
		System.out.println(result);
	}

	static final int MOD = 1000000007;

	static int power(int b, int p) {//b^p
		long res = 1;
		for (long a = b % MOD; p > 0; a = a * a % MOD, p >>= 1)
			if ((p & 1) > 0)
				res = res * a % MOD;
		return (int) res;
	}

	static int inverse(int denom) {
		return power(denom, MOD - 2);
	}

	static final int A_MAX = 1000000;
	static List<Integer> PRIME_LIST = new ArrayList<Integer>();
	static {
		PRIME_LIST.add(2);
		int sieveSup = (A_MAX + 1) / 2;
		boolean[] sieve = new boolean[sieveSup];
		for (int i = 1; 2 * i * (i + 1) < sieveSup; i++) {
			for (int j = i; 2 * i * j + i + j < sieveSup; j++) {
				sieve[2 * i * j + i + j] = true;
			}
		}
		for (int i = 1; i < sieveSup; i++) {
			if (!sieve[i]) {
				PRIME_LIST.add(2 * i + 1);
			}
		}
	}

	static int[] factorList = new int[PRIME_LIST.size()];

	static void factorization(int x) {
		for (int i = 0, exponent; i < factorList.length; i++) {
			if (x == 1)
				break;
			exponent = 0;
			while (x % PRIME_LIST.get(i) == 0) {
				exponent++;
				x /= PRIME_LIST.get(i);
			}
			if (exponent > factorList[i])
				factorList[i] = exponent;
		}
	}
}
