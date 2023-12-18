import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int a[] = new int[n];
		int s[] = new int[100010];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);

			s[a[i]]++;
			if (s[a[i]] > 2 || (n % 2 == 0 && a[i] % 2 == 0) || (n % 2 != 0 && a[i] % 2 != 0)) {
				System.out.println("0");
				return;
			}
		}

		if (s[0] != 0 && s[0] > 1) {
			System.out.println("0");
			return;
		}

		System.out.println(modpow(2, n / 2, 1000000007) % 1000000007);

	}

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
