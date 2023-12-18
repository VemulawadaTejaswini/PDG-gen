import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int h = scanInt(), w = scanInt(), n = scanInt();
		int ys = scanInt() - 1, xs = scanInt() - 1;
		String s1 = scanString(), s2 = scanString();
		int y1 = 0, y2 = h, x1 = 0, x2 = w;
		for (int i = n - 1; i >= 0; i--) {
			switch (s2.charAt(i)) {
			case 'R':
				x1 = max(x1 - 1, 0);
				break;
			case 'L':
				x2 = min(x2 + 1, w);
				break;
			case 'D':
				y1 = max(y1 - 1, 0);
				break;
			case 'U':
				y2 = min(y2 + 1, h);
				break;
			}
			switch (s1.charAt(i)) {
			case 'R':
				--x2;
				break;
			case 'L':
				++x1;
				break;
			case 'D':
				--y2;
				break;
			case 'U':
				++y1;
				break;
			}
			if (x1 >= x2 || y1 >= y2) {
				out.print("NO");
				return;
			}
		}
		out.print(x1 <= xs && xs < x2 && y1 <= ys && ys < y2 ? "YES" : "NO");
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