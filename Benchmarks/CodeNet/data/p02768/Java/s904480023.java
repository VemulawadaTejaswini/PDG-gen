import java.util.Scanner;

public class abc157d {
	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long answer = pow(2, n, M) - 1;
		answer = ((answer - f(n, a)) % M ) % M;
		answer = ((answer - f(n, b)) % M ) % M;
		System.out.println(answer);
	}

	private static long f(long n, int a) {
		long[] x = new long[a];
		long[] y = new long[a];
		x[0] = n;
		y[0] = a;

		for (int i = 1; i < a; i++) {
			x[i] = (x[i - 1] * (n - i)) % M;
			y[i] = (y[i - 1] * (a - i)) % M;
		}

		return (x[a - 1] * pow(y[a - 1], M - 2, M)) % M;
	}

	private static long pow(long x, long n, long M) {
		long a = 1;
		while (n > 0) {
			if ((n & 1) == 1) a = (a * x) % M;
			x = (x * x) % M;
			n >>= 1;
		}
		return a;
	}
}
