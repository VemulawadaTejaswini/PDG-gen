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
		int v[] = new int[3];
		int cnt[] = new int[3];
		for (int i = 0; i < n; i++) {
			int a = scanInt();
			for (int j = 0;; j++) {
				if (j == 3) {
					out.print("No");
					return;
				}
				if (a == v[j]) {
					++cnt[j];
					break;
				}
				if (cnt[j] == 0) {
					v[j] = a;
					cnt[j] = 1;
					break;
				}
			}
		}
		if (v[0] == 0 && cnt[1] == 0) {
			out.print("Yes");
			return;
		}
		if (n % 3 != 0) {
			out.print("No");
			return;
		}
		if (cnt[2] == 0 && ((v[0] == 0 && cnt[0] == n / 3) || (v[1] == 0 && cnt[1] == n / 3))) {
			out.print("Yes");
			return;
		}
		if (cnt[0] == n / 3 && cnt[1] == n / 3 && (v[0] ^ v[1]) == v[2]) {
			out.print("Yes");
			return;
		}
		out.print("No");
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