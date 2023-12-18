import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = in.nextLong();
		}
		long[] left = new long[N + 1];
		long[] right = new long[N + 1];
		for (int i = 0; i < N; i++) {
			left[i + 1] = gcd(left[i], A[i]);
		}
		for (int i = N - 1; i >= 0; --i) {
			right[i] = gcd(right[i + 1], A[i]);
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			long l = left[i];
			long r = right[i + 1];
			ans = Math.max(ans, gcd(r, l));
		}
		System.out.println(ans);
		in.close();
	}

	static long gcd(long m, long n) {
		if (m < n) {
			long d = n;
			n = m;
			m = d;
		}
		if (n <= 0) {
			return m;
		}
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}
}