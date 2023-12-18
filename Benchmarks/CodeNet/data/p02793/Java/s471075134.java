import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int MOD = 1000000007;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		long l = lcm(A);

		long result = 0;
		for (int i = 0; i < N; i++) {
			result += (l / A[i]) % MOD;
			result %= MOD;
		}

		out.println(result);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	// 最大公約数
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	// 最小公倍数
	private static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b; // a*bがオーバーフローしないように
	}

	private static long lcm(int[] a) {
		long x = a[0];
		for (int i = 0; i < a.length; i++) {
			x = lcm(x, a[i]);
		}
		return x;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
