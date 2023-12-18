import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		if (!str[0].equals("0")) {
			System.out.println("0");
			return;
		}

		int s[] = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			int d = Integer.parseInt(str[i]);
			s[d]++;
			max = Math.max(max, d);
		}

		if (s[0] != 1) {
			System.out.println("0");
			return;
		}
		long ans = 1;
		for (int i = 1; i < n; i++) {
			ans *= modpow(s[i - 1], s[i], 998244353);
			ans %= 998244353;
		}

		System.out.println(ans % 998244353);
	}

	// a^n mod を計算する
	static long modpow(long a, long n, long mod) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1)
				res = res * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
}