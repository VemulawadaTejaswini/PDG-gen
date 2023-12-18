import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long k = Long.parseLong(sa[1]);
		sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);
		long ng = -1000000000000000000L;
		long ok = 1000000000000000001L;

		while (Math.abs(ok - ng) > 1) {
			long mid = (ok + ng) / 2;
			long cnt = 0;
			for (int i = 0; i < a.length; i++) {
				int c = calc(a, i, mid);
				cnt += c;
			}
			cnt /= 2;
			if (cnt < k) {
				ng = mid;
			} else {
				ok = mid;
			}
		}
		System.out.println(ok);
	}

	static int calc(long[] a, int i, long mid) {
		if (mid >= 0 && a[i] >= 0 ||
				mid < 0 && a[i] > 0) {
			int ok = -1;
			int ng = a.length;

			while (Math.abs(ng - ok) > 1) {
				int m = (ng + ok) / 2;
				if (a[m] * a[i] <= mid) {
					ok = m;
				} else {
					ng = m;
				}
			}
			if (ng > i) {
				return ng - 1;
			} else {
				return ng;
			}

		} else {
			int ok = a.length;
			int ng = -1;

			while (Math.abs(ng - ok) > 1) {
				int m = (ng + ok) / 2;
				if (a[m] * a[i] <= mid) {
					ok = m;
				} else {
					ng = m;
				}
			}
			if (ok <= i) {
				return a.length - ok - 1;
			} else {
				return a.length - ok;
			}
		}
	}
}
