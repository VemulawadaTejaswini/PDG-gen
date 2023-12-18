import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		int i;
		long[] A = new long[N];
		long[] B = new long[N];
		long max = 0;
		long gcd = 0;
		for (i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			if (max < A[i]);
		}
		int j;
		int n;
		long temp;
		for (j = 0; j < N; j++) {
			for (n = j+1; n < N; n++) {
				temp = gcd(A[j], A[n]);
				if (gcd < temp)
					gcd = temp;
			}
		}
		System.out.println(gcd);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}