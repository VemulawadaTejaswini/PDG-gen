import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				ans += a[i];
			}
		}

		long p = 0;
		long m = 0;
		for (int i = 0; i < k; i++) {
			if (a[i] > 0) {
				p += a[i];
			} else {
				m += a[i];
			}
		}

		long pMin = p;
		long mMax = m;
		for (int i = k; i < n; i++) {
			if (a[i - k] > 0) {
				p -= a[i - k];
			} else {
				m -= a[i - k];
			}
			if (a[i] > 0) {
				p += a[i];
			} else {
				m += a[i];
			}
			pMin = Math.min(pMin, p);
			mMax = Math.max(mMax, m);
		}
		ans = Math.max(ans - pMin, ans + mMax);
		System.out.println(ans);
	}
}
