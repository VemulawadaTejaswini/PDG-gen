import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		int i;
		long[] A = new long[N];
		long[] ls = new long[N + 1];
		long[] rs = new long[N + 1];

		long max = 0;
		long gcd = 0;
		for (i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		int j;
		for (i = 0; i < N; i++) {
			j = (N - 1) - i;
			ls[i + 1] = gcd(ls[i], A[i]);
			rs[j] = gcd(rs[j + 1], A[j]);
		}
		for (i = 0; i < N; i++) {
			gcd = gcd(ls[i], rs[i + 1]);
			if (max < gcd) {
				max = gcd;
			}
		}
		System.out.println(max);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

}