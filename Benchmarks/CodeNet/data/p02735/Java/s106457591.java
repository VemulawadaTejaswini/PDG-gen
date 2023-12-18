import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int n = scanInt(), m = scanInt();
		char map[][] = new char[n][];
		for (int i = 0; i < n; i++) {
			map[i] = scanString().toCharArray();
		}
		int dyn[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int cans = Integer.MAX_VALUE;
				if (i == 0 && j == 0) {
					cans = map[0][0] == '#' ? 1 : 0;
				}
				if (i > 0) {
					cans = min(cans, dyn[i - 1][j] + (map[i][j] == '#' && map[i - 1][j] != '#' ? 1 : 0));
				}
				if (j > 0) {
					cans = min(cans, dyn[i][j - 1] + (map[i][j] == '#' && map[i][j - 1] != '#' ? 1 : 0));
				}
				dyn[i][j] = cans;
			}
		}
		out.print(dyn[n - 1][m - 1]);
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