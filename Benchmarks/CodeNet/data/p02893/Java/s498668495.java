import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import static java.math.BigInteger.ONE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 998244353;
	static final BigInteger BMOD = BigInteger.valueOf(MOD);

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

	static void solve() throws Exception {
		int n = scanInt();
		BigInteger bigMod = ONE.shiftLeft(n).add(ONE), lim = new BigInteger(scanString(), 2).add(ONE);
		int ans = 0;
		List<Integer> divs = new ArrayList<>(), divCnts = new ArrayList<>();
		for (int i = 1; i <= 2 * n; i++) {
			if (2 * n % i != 0) {
				continue;
			}
			int cnt = lim.divide(bigMod.divide(bigMod.gcd(ONE.shiftLeft(i).subtract(ONE)))).mod(BMOD).intValue();
			for (int j = 0; j < divs.size(); j++) {
				if (i % divs.get(j) == 0) {
					cnt = sub(cnt, divCnts.get(j));
				}
			}
			divs.add(i);
			divCnts.add(cnt);
			ans = add(ans, mul(i, cnt));
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