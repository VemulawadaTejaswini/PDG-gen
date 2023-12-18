import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 998244353;

	static int add(int a, int b) {
		int res = a + b;
		return res >= MOD ? res - MOD : res;
	}

	static int sub(int a, int b) {
		int res = a - b;
		return res < 0 ? res + MOD : res;
	}

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % MOD);
		return res < 0 ? res + MOD : res;
	}

	static int pow(int a, int e) {
		if (e == 0) {
			return 1;
		}
		int r = a;
		for (int i = 30 - Integer.numberOfLeadingZeros(e); i >= 0; i--) {
			r = mul(r, r);
			if ((e & (1 << i)) != 0) {
				r = mul(r, a);
			}
		}
		return r;
	}

	static int inv(int a) {
		return pow(a, MOD - 2);
	}

	static final int primes[] = new int[168];
	static {
		primes[0] = 2;
		primes[1] = 3;
		long bitset[] = new long[6];
		for (int i = 2, p = 1, dp = 4; i < primes.length; i++) {
			do {
				p += dp;
				dp = 6 - dp;
			} while ((bitset[(p / 3) >> 6] & (1L << (p / 3))) != 0);
			primes[i] = p;
			if (p <= 46340) {
				for (int q = p * p, dq = dp * p, l = 6 * p, j;
					(j = q / 3) >> 6 < bitset.length; q += dq, dq = l - dq) {
					bitset[j >> 6] |= 1L << j;
				}
			}
		}
	}

	static int sums[];

	static void solve() throws Exception {
		int n = scanInt();
		sums = new int[1000001];
		int ansNum = 0, ansDen = 1;
		for (int i = 0; i < n; i++) {
			int cur = scanInt();
			go(cur, 1, 0, cur);
			ansNum = sub(ansNum, cur);
		}
		for (int i = 1; i < sums.length; i++) {
			if (sums[i] == 0) {
				continue;
			}
			int cansNum = mul(mul(sums[i], sums[i]), go2(i, 0)), cansDen = i;
			ansNum = add(mul(ansNum, cansDen), mul(ansDen, cansNum));
			ansDen = mul(ansDen, cansDen);
		}
		out.print(mul(ansNum, inv(add(ansDen, ansDen))));
	}

	static int go2(int cur, int start) {
		if (cur == 1) {
			return 1;
		}
		for (int i = start; i < primes.length; i++) {
			int p = primes[i];
			if (p * p > cur) {
				break;
			}
			if (cur % p == 0) {
				do {
					cur /= p;
				} while (cur % p == 0);
				return mul(go2(cur, i + 1), sub(1, p));
			}
		}
		return sub(1, cur);
	}

	static void go(int cur, int mul, int start, int add) {
		if (cur == 1) {
			sums[mul] = add(sums[mul], add);
			return;
		}
		for (int i = start; i < primes.length; i++) {
			int p = primes[i];
			if (p * p > cur) {
				break;
			}
			if (cur % p == 0) {
				int pow = 0;
				do {
					++pow;
					cur /= p;
				} while (cur % p == 0);
				for (int j = 0; j <= pow; j++) {
					go(cur, mul, i + 1, add);
					mul *= p;
				}
				return;
			}
		}
		sums[mul] = add(sums[mul], add);
		sums[mul * cur] = add(sums[mul * cur], add);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}