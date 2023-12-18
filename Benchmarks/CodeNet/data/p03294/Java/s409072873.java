import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long m = A[0] = sc.nextLong();

		for (int i = 1; i < N; i++) {
			A[i] = sc.nextLong();

			m = A[i] * m / gcd(A[i], m);
		}

		m -= 1;

		long fMax = 0;

		for (int i = 0; i < N; i++) {
			fMax += m % A[i];
		}

		System.out.println(fMax);

		return;
	}

	private static long gcd(long x, long y) {
		long tmp;

		while ((tmp = x % y) != 0) {
			x = y;
			y = tmp;
		}

		return y;
	}
}
