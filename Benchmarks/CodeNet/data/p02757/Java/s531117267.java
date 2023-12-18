import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int p = Integer.parseInt(sa[1]);
		char[] s = br.readLine().toCharArray();
		br.close();

		long ans = 0;
		if (10 % p == 0) {
			for (int i = n - 1; i >= 0; i--) {
				long x = s[i] - '0';
				if (x % p == 0) {
					ans += i + 1;
				}
			}

		} else {
			int now = 0;
			int base = 1;
			int[] cnt = new int[p];
			cnt[0] = 1;
			for (int i = n - 1; i >= 0; i--) {
				int x = s[i] - '0';
				x *= base;
				x %= p;
				now += x;
				now %= p;
				ans += cnt[now];
				cnt[now]++;
				base *= 10;
				base %= p;
			}
		}
		System.out.println(ans);
	}
}
