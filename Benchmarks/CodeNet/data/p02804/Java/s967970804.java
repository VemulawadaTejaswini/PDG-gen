import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.parallelSort(a);
		int result = 0;
		int temp;
		for (int i = 0; n - 1 - i >= k - 1; i++) {
			temp = (int) ((long) (a[n - 1 - i] - a[i]) * comb(n - 1 - i, k - 1) % MOD);
			result = (result + temp) % MOD;
		}

		System.out.println(result);

	}

	static final int MOD = 1000000007;
	static final int FACT_MAX = 100000;
	static int[] FACT = new int[FACT_MAX + 1];
	static {
		FACT[0] = 1;
		for (int i = 1; i <= FACT_MAX; i++) {
			FACT[i] = (int) ((long) FACT[i - 1] * i % MOD);
		}

	}

	static int comb(int n, int k) {
		return (int) ((long) FACT[n] * inverse((int) ((long) FACT[k] * FACT[n - k] % MOD)) % MOD);
	}

	static int inverse(int denom) {
		return power(denom, MOD - 2);
	}

	static int power(int b, int p) {//b^p
		long res = 1;
		for (long a = b % MOD; p > 0; a = a * a % MOD, p >>= 1)
			if ((p & 1) > 0)
				res = res * a % MOD;
		return (int) res;
	}
}
