import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int m = 1000000007;
		long ans = 0;
		long[] memo = new long[k + 1];
		for (int i = k; i > 0; i--) {
			int x = k / i;
			long val = power(x, n, m);
			for (int j = 2; j <= k; j++) {
				int b = i * j;
				if (b <= k) {
					val -= memo[b];
					val += m;
					val %= m;
				} else {
					break;
				}
			}
			memo[i] = val;
			ans += val * i % m;
			ans %= m;
		}
		System.out.println(ans);
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}
}
