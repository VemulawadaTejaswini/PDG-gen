import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = new char[n];
		sc.close();
		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}
		int[] east = new int[n];
		east[0] = c[0] == 'E' ? 1 : 0;
		for (int i = 1; i < n; i++) {
			if (c[i] == 'E') {
				east[i] = east[i - 1] + 1;
			} else {
				east[i] = east[i - 1];
			}
		}

		int min = east[n - 1] - east[0];
		for (int i = 1; i < n; i++) {
			int tmp = (east[n - 1] - east[i]) + (i + 1 - east[i]);
			if (tmp < min) {
				min = tmp;
			}
		}
		System.out.println(min);
	}

	public static long modFactorial(long n, long mod) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
	}

	public static int arrayMax(int[] array) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans)
				ans = array[i];
		}
		return ans;
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}

class Combination {
	static final int MOD = 1000000007;
	long[] fac;
	long[] finv;
	long[] inv;

	public Combination(int size) {
		fac = new long[size];
		finv = new long[size];
		inv = new long[size];
		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < size; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public long getComb(int n, int k) {
		if (n < k || n < 0 || k < 0) {
			return 0;
		}
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
}