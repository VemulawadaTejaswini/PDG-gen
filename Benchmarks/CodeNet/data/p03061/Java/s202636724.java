import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int A[] = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = s.nextInt();
			}

			final int r[] = new int[N + 1];

			for (int i = N - 1; i > 0; i--) {
				r[i] = gcd(A[i], r[i + 1]);
			}

			int ret = 0;
			int left = 0;
			for (int i = 0; i < N; i++) {
				ret = Math.max(gcd(left, r[i + 1]), ret);
				left = gcd(left, A[i]);
			}
			System.out.println(ret);
		}
	}

	static int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return a == 0 ? b : a;
		}

		if (a >= b) {
			return gcd(b, a % b);
		} else {
			return gcd(a, b % a);
		}
	}
}
