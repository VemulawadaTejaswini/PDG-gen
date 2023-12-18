import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			cnt[Integer.parseInt(sa[i])]++;
		}
		br.close();

		if (!"0".equals(sa[0]) || cnt[0] != 1) {
			System.out.println(0);
			return;
		}

		long ans = 1;
		int idx = n;
		for (int i = 1; i < n; i++) {
			if (cnt[i] > 0) {
				ans *= power(cnt[i - 1], cnt[i]);
				ans %= 998244353;
			} else {
				idx = i;
				break;
			}
		}
		for (int i = idx + 1; i < n; i++) {
			if (cnt[i] > 0) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(ans);
	}

	static long power(long x, long n) {
		if (n == 0) {
			return 1;
		}
		int mod = 998244353;
		long val = power(x, n / 2);
		val = val * val % mod;
		if (n % 2 == 1) {
			val = val * x % mod;
		}
		return val;
	}
}
