import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int MOD = 1000000007;
	BigInteger MOD2 = BigInteger.valueOf(MOD);

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);
		BigInteger[] A2 = new BigInteger[N];
		for (int i = 0; i < N; i++) {
			A2[i] = BigInteger.valueOf(A[i]);
		}

		sc.close();

		BigInteger l = lcm(A2);

		long result = 0;
		for (int i = 0; i < N; i++) {
			result += l.divide(A2[i]).mod(MOD2).longValue();
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

	private static BigInteger lcm(BigInteger a, BigInteger b) {
		return (a.divide(a.gcd(b)).multiply(b));
	}

	private static BigInteger lcm(BigInteger[] a) {
		BigInteger x = a[0];
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
