import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			long nn = 2 ^ (n - 1);

		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int K = sc.nextInt();

			long[] A = new long[K];

			for (int i = 0; i < K; i++) {
				A[i] = sc.nextLong();
			}

			long lo = 2;
			long hi = 2;

			for (int i = K - 1; i >= 0; i--) {
				long newLo = lo / A[i] * A[i];
				if (newLo < lo)
					newLo += A[i];
				final long newHi = hi / A[i] * A[i] + A[i] - 1;
				if (newLo > newHi) {
					System.out.println(-1);
					return;
				}
				lo = newLo;
				hi = newHi;
			}
			System.out.println(lo + " " + hi);
		}
	}

	static void no2d() {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();

			long[] a = new long[k];

			for (int i = 0; i < k; i++) {
				a[i] = sc.nextLong();
			}

			long min = 2;
			long max = 2;

			for (int i = k - 1; i >= 0; i--) {
				if (a[i] > max) {
					System.out.println("-1");
					return;
				}

				if (a[i] < min) {
					long t = min / a[i];
					if (min % a[i] == 0) {
					} else {
						min = a[i] * (t + 1);
					}
				} else {
					min = a[i];
				}

				long t = max / a[i];
				max = Math.max(max, (a[i] * (t + 1)) - 1);
				System.out.println(min + " " + max);
			}

			System.out.println(min + " " + max);
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}

			int count = 0;
			long sum;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					sum = 0;
					for (int t = i; t <= j; t++) {
						sum = sum + a[t];
					}
					if (sum == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
