import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<int[]> trans, stats;

	static int mkstate() {
		int r = trans.size();
		int ctrans[] = new int[26];
		fill(ctrans, -1);
		trans.add(ctrans);
		stats.add(new int[27]);
		return r;
	}

	static void solve() throws Exception {
		int n = scanInt();
		String s[] = new String[n];
		trans = new ArrayList<>();
		stats = new ArrayList<>();
		mkstate();
		for (int i = 0; i < n; i++) {
			s[i] = scanString();
			int cur = 0;
			for (int j = s[i].length() - 1; j >= 0; j--) {
				int c = s[i].charAt(j) - 'a';
				int ctrans[] = trans.get(cur);
				if (ctrans[c] < 0) {
					ctrans[c] = mkstate();
				}
				cur = ctrans[c];
			}
			++stats.get(cur)[26];
		}
		go(0);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int cur = 0;
			for (int j = s[i].length() - 1; j > 0; j--) {
				int c = s[i].charAt(j) - 'a';
				int ctrans[] = trans.get(cur);
				cur = ctrans[c];
			}
			ans += stats.get(cur)[s[i].charAt(0) - 'a'] - 1;
		}
		out.print(ans);
	}

	static void go(int cur) {
		int ctrans[] = trans.get(cur), cstats[] = stats.get(cur);
		for (int i = 0; i < 26; i++) {
			if (ctrans[i] >= 0) {
				go(ctrans[i]);
				int nstats[] = stats.get(ctrans[i]);
				for (int j = 0; j < 27; j++) {
					cstats[j] += nstats[j == i ? 26 : j];
				}
			}
		}
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