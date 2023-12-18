import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();

		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		long l = 0;
		long r = 100000 * 2 + 1;
		while (r - l > 1) {
			long mid = (l + r) / 2;
			long count = 0;

			for (int i = a.length - 1; i >= 0; i--) {
				int index = lowerBound(a, mid - a[i]);
				count += (a.length - index);
				if (count > m) break;
			}

			if (count >= m) {
				l = mid;
			} else {
				r = mid;
			}
		}

		long[] s = new long[n + 1];
		s[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			s[i] = s[i + 1] + a[i];
		}

		long answer = 0;
		long c = 0;
		for (int i = a.length - 1; i >= 0; i--) {

			int index = lowerBound(a, l - a[i]);
			answer += s[index];
			answer += (n - index) * a[i];
			c += (n - index);
		}

		if (m < c) {
			answer -= (c - m) * l;
		}

		System.out.println(answer);
	}

	private static int lowerBound(long[] a, long x) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a[m] >= x) {
				r = m;
			} else {
				l = m;
			}
		}
		return r;
	}
}
