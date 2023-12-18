import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		long l = -1000000000000000001L;
		long r = 1000000000000000001L;
		while (l + 1 < r) {
			long m = (l + r) / 2;
			if (ok(a, m, k)) {
				l = m;
			} else {
				r = m;
			}
		}
		System.out.println(l);
	}

	// x 未満の数が k 以下
	private static boolean ok(long[] a, long x, long k) {
		long count = 0;
		for (int i = 0; i < a.length; i++) {
			int l = -1, r = a.length;
			if (a[i] < 0) {
				while (l + 1 < r) {
					int m = (l + r) / 2;
					if (a[m] * a[i] < x) {
						r = m;
					} else {
						l = m;
					}
				}
				count += (a.length - r);
			} else {
				while (l + 1 < r) {
					int m = (l + r) / 2;
					if (a[m] * a[i] < x) {
						l = m;
					} else {
						r = m;
					}
				}
				count += r;
			}
			if (a[i] * a[i] < x) count--;
		}
		count /= 2;
		return count < k;
	}
}
