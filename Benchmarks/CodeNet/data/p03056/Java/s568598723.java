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
		int h = scanInt(), w = scanInt();
//		int h = 185, w = 185;
		int a[][] = new int[h + 1][w + 1];
		for (int i = 0; i < h; i++) {
			String l = scanString();
			for (int j = 0; j < w; j++) {
				a[i + 1][j + 1] = (l.charAt(j) == '#' ? 1 : 0) + a[i + 1][j] + a[i][j + 1] - a[i][j];
//				a[i + 1][j + 1] = ((i + j) & 1) + a[i + 1][j] + a[i][j + 1] - a[i][j];
			}
		}
		int maxComp = (32 - Integer.numberOfLeadingZeros(h - 1)) + (32 - Integer.numberOfLeadingZeros(w - 1));
		byte dyn[][][][] = new byte[maxComp + 1][h + 1][][]; // [c][y2][y1][x1] -> x2
		for (int y2 = 1; y2 <= h; y2++) {
			for (int c = 0; c <= maxComp; c++) {
				dyn[c][y2] = new byte[y2][w + 1];
			}
			for (int y1 = y2 - 1; y1 >= 0; y1--) {
				for (int x1 = w; x1 >= 0; x1--) {
					int xm;
					for (xm = x1; xm < w; xm++) {
						int cnt = a[y2][xm + 1] - a[y1][xm + 1] - a[y2][x1] + a[y1][x1];
						if (cnt != 0 && cnt != (y2 - y1) * (xm + 1 - x1)) {
							break;
						}
					}
					for (int c = 0; c <= maxComp; c++) {
						if (c > 0 && y1 + 1 < y2) {
							int l = y1 + 1, r = y2 - 1;
							while (l <= r) {
								int y = (l + r) >> 1;
								int v1 = dyn[c - 1][y][y1][x1] & 0xff, v2 = dyn[c - 1][y2][y][x1] & 0xff;
								xm = max(xm, min(v1, v2));
								if (v1 < v2) {
									r = y - 1;
								} else {
									l = y + 1;
								}
							}
						}
						dyn[c][y2][y1][x1] = (byte) xm;
						xm = dyn[c][y2][y1][xm] & 0xff;
					}
				}
			}
		}
		for (int i = 0;; i++) {
			if ((dyn[i][h][0][0] & 0xff) == w) {
				out.print(i);
				return;
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