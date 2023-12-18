import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int l = 0;
		int r = 100000 * 2 + 1;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			long count = 0;

			for (int i = a.length - 1; i >= 0; i--) {
				int index = lowerBound(a, mid - a[i]);
				count += (a.length - index);
				//System.out.println(mid + " " + i + " " + index + " " + count);
				if (count > m) break;
			}

			if (count >= m) {
				l = mid;
			} else {
				r = mid;
			}
		}
		//System.out.println("l: " + l);

		long[] s = new long[n + 1];
		for (int i = 0; i < n; i++) {
			s[i + 1] = s[i] + a[i];
		}

		long answer = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			int index = upperBound(a, l - a[i]);
			//System.out.println(i + " " + index);
			//System.out.println(s[n] + " " + s[index]);

			answer += s[n] - s[index];
			answer += (n - index) * a[i];

			m -= (n - index);
		}

		//System.out.println(m);

		answer += m * l;
		System.out.println(answer);
	}

	private static int upperBound(int[] a, int x) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a[m] > x) {
				r = m;
			} else {
				l = m;
			}
		}
		return r;
	}

	private static int lowerBound(int[] a, int x) {
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
