import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int p = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] cnt = new int[2];
		for (int i = 0; i < n; i++) {
			cnt[a[i] % 2]++;
		}

		long val0 = 1L << cnt[0];
		long val1 = 0;
		for (int i = p; i <= cnt[1]; i+=2) {
			val1 += nCr(cnt[1], i);
		}
		System.out.println(val0 * val1);
	}

	static long nCr(int n, int r) {
		long val = 1;
		for (int i = 1; i <= r; i++) {
			val = val * (n - i + 1) / i;
		}
		return val;
	}
}
