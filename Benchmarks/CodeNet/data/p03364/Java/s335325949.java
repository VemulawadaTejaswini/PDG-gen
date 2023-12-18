import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int n = scanInt();
		byte vals[][] = new byte[n][n];
		byte valsT[][] = new byte[n][n];
		for (int i = 0; i < n; i++) {
			String l = scanString();
			for (int j = 0; j < n; j++) {
				vals[i][j] = valsT[j][i] = (byte) l.charAt(j);
			}
		}
		int ans = 0;
		shift: for (int shift = 0; shift < n; shift++) {
			for (int i = 0; i < n; i++) {
				int ii = (i + n - shift) % n;
				byte[] vi = vals[i];
				byte[] viT = valsT[ii];
				for (int j = 0, jj = shift; j < n; j++, jj++) {
					if (jj == n) {
						jj = 0;
					}
					if (vi[j] != viT[jj]) {
						continue shift;
					}
				}
			}
			ans += n;
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