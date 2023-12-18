import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static long MOD = 1000000007;

	// static long dp(int x, int y) {
	// 	long[] table = new long[x + 1];
	// 	Arrays.fill(table, 1);
	// 	for (int i = 0; i < y; i++) {
	// 		for (int j = 1; j <= x; j++) {
	// 			table[j] += table[j-1];
	// 			table[j] %= MOD;
	// 		}
	// 	}
	// 	return table[x];
	// }

	static long rev(long val) {
		return pow(val, MOD - 2);
	}

	static long pow(long x, long n) {
		long ans = 1;
		while(n != 0){
			if((n & 1) == 1) ans = ans*x % MOD;
			x = x*x % MOD;
			n = n >> 1;
		}
		return ans;
	}

	static long bang(int n) {
		long ans = 1;
		for (long i = 2; i <= n; i++) {
			ans *= i;
			ans %= MOD;
		}
		return ans;
	}

	static long combi(int x, int y) {
		// System.out.println("combi");
		long ans = bang(x + y);
		// System.out.println("*" + ans);
		ans *= rev(bang(x));
		ans %= MOD;
		ans *= rev(bang(y));
		ans %= MOD;
		
		return ans;
	}

	static long solve(int X, int Y) {
		if (X > 2*Y) return 0;
		if (Y > 2*X) return 0;

		int x = 0;
		int y = 0;
		if (Y > X) {
			int n = Y-X;
			y += n;
			X -= n;
			Y -= 2 * n;
		}
		if (X > Y) {
			int n = X - Y;
			x += n;
			X -= 2 * n;
			Y -= n;
		}
		if (X % 3 != 0) return 0;
		int n = X / 3;
		x += n;
		y += n;

		// System.out.println(x + ", " + y);
		return combi(x, y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println(solve(X, Y));
	}
}
