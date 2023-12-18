import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}

		long[] b = new long[n + 1];
		long[] c = new long[n + 1];
		System.arraycopy(a, 0, b, 1, n);
		System.arraycopy(a, 0, c, 1, n);
		b[1] += b[0];
		for (int i = 2; i <= n; i++) {
			b[i] += b[i - 1];
			c[i] += c[i - 2];
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			int x = Integer.parseInt(br.readLine());
			int ok = n - 1;
			int ng = 0;

			while (Math.abs(ok - ng) > 1) {
				int mid = (ok + ng) / 2;
				if (judge(a, x, mid)) {
					ok = mid;
				} else {
					ng = mid;
				}
			}

			long ans = b[n] - b[ok];
			int cnt = n - ok;
			if (cnt <= n / 2) {
				ans += c[n - cnt * 2];
			}
			pw.println(ans);
		}
		br.close();
		pw.flush();
	}

	static boolean judge(long[] a, int x, int mid) {
		int cnt = a.length - mid;
		int left = mid - cnt + 1;
		if (left < 0 || x - a[left] > a[mid] - x) {
			return false;
		}
		return true;
	}
}
