import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 1000000007;

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
		int n = scanInt() - 1;
//		System.err.println("N = " + n);
		int facts[] = new int[n + 1];
		facts[0] = 1;
		for (int i = 1; i <= n; i++) {
			facts[i] = mul(facts[i - 1], i);
		}
		int ansNum = mul(facts[n], n), ansDen = 1;
		for (int i = 1; i < n; i++) {
			int looseness = 2 * i - n - 1;
			if (looseness < 0) {
				continue;
			}
			int curNum = mul(facts[n - i + looseness], facts[i]),
				curDen = facts[looseness];
//			if (i < 10) {
//				System.err.println("i = " + i + ", ans = " + mul(curNum, inv(curDen)));
//			}
			ansNum = sub(mul(ansNum, curDen), mul(ansDen, curNum));
			ansDen = mul(ansDen, curDen);
		}
//		System.err.println("i = " + n + ", ans = " + facts[n]);
		out.print(mul(ansNum, inv(ansDen)));
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