import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		br.close();

		int[] cnt = new int[61];
		for (int i = 0; i < n; i++) {
			int j = 0;
			long x = a[i];
			while (x > 0) {
				cnt[j] += x % 2;
				x /= 2;
				j++;
			}
		}

		long ans = 0;
		for (int i = 0; i < cnt.length; i++) {
			long val = (long) cnt[i] * (n - cnt[i]);
			val %= 1000000007;
			long val2 = (1L << i);
			val2 %= 1000000007;
			val *= val2;
			val %= 1000000007;
			ans += val;
			ans %= 1000000007;
		}
		System.out.println(ans);
	}
}
