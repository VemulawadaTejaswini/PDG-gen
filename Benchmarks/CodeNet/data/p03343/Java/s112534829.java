import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int q = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] b = new int[n];
		System.arraycopy(a, 0, b, 0, n);
		Arrays.parallelSort(b);

		int ok = 0;
		int ng = b.length;

		while (Math.abs(ng - ok) > 1) {
			int mid = (ng + ok) / 2;
			int min = b[mid];
			int cnt = 0;
			int sum = 0;
			boolean flg = false;
			for (int i = 0; i < n; i++) {
				if (a[i] == min) {
					flg = true;
					cnt++;
				} else if (a[i] > min) {
					cnt++;
				} else {
					int rem = Math.max(cnt - k + 1, 0);
					if (rem == 0) {
						flg = false;
					}
					sum += rem;
					cnt = 0;
				}
			}
			sum += Math.max(cnt - k + 1, 0);
			if (flg && sum >= q) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		int min = b[ok];

		int ans = b[n - 1] - b[0];
		for (int i = 0; i + q - 1 < n; i++) {
			if (b[i] > min) {
				break;
			}
			int val = b[i + q - 1] - b[i];
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
