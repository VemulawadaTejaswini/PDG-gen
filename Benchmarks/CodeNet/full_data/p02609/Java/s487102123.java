import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] x = sc.next().toCharArray();
		sc.close();

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] == '1') {
				cnt++;
			}
		}
		int p0 = cnt + 1;
		int p1 = cnt - 1;
		int[] dp = new int[n];
		for (int i = 1; i < n; i++) {
			int next = i % Integer.bitCount(i);
			dp[i] = dp[next] + 1;
		}

		long v0 = 0;
		for (int i = 0; i < n; i++) {
			v0 *= 2;
			v0 %= p0;
			if (x[i] == '1') {
				v0++;
			}
		}
		v0 %= p0;

		long v1 = 0;
		if (p1 > 0) {
			for (int i = 0; i < n; i++) {
				v1 *= 2;
				v1 %= p1;
				if (x[i] == '1') {
					v1++;
				}
			}
			v1 %= p1;
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			if (x[i] == '0') {
				long a = power(2, n - 1 - i, p0);
				long val = v0 + a;
				int next = (int) (val % p0);
				pw.println(dp[next] + 1);
			} else {
				if (v1 == 0) {
					pw.println(0);
				} else {
					long a = power(2, n - 1 - i, p1);
					long val = v1 - a + p1;
					int next = (int) (val % p1);
					pw.println(dp[next] + 1);
				}
			}
		}
		pw.flush();
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
