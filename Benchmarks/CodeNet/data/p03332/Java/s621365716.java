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

	static void solve() throws Exception {
		int n = scanInt();
		long a = scanLong();
		long b = scanLong();
		long k = scanLong();
		int facts[] = new int[n + 1];
		facts[0] = 1;
		for (int i = 1; i <= n; i++) {
			facts[i] = mul(facts[i - 1], i);
		}
		int factsI[] = new int[n + 1];
		factsI[n] = inv(facts[n]);
		for (int i = n; i > 0; i--) {
			factsI[i - 1] = mul(factsI[i], i);
		}
		int ans = 0;
		for (int i = 0; i <= n; i++) {
			long r = k - a * i;
			if (r < 0 || r > n * b || r % b != 0) {
				continue;
			}
			int j = (int) (r / b);
			ans = add(ans, mul(mul(facts[n], mul(factsI[i], factsI[n - i])), mul(facts[n], mul(factsI[j], factsI[n - j]))));
		}
		out.print(ans);
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