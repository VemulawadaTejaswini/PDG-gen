import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = 1000000007;
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws Exception {
		int x1 = nextInt();
		int y1 = nextInt();
		int x2 = nextInt();
		int y2 = nextInt();
		int[] p4 = solution(x1, y1, x2, y2);
		int[] p3 = solution(p4[0], p4[1], x1, y1);
//		Helper.tr(freq);
		out.println(p3[0] + " " + p3[1] + " " + p4[0] + " " + p4[1]);
	}

	private int[] solution(int x1, int y1, int x2, int y2) {
		x2 -= x1;
		y2 -= y1;

		int x4 = -y2;
		int y4 = x2;

		return new int[] { x4 + x1, y4 + y1};
	}

	private long f(long cnt) {
		if (cnt <= 0)
			return 0;
		return cnt * cnt * cnt;
	}

	private int[][] nextInts(int r, int c) throws IOException {
		int[] a[];
		a = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				a[i][j] = nextInt();
		return a;
	}

	private int[] nextTuple(int n) throws IOException {
		int[] a;
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	private int[] nextInts(int n) throws IOException {
		return nextTuple(n);
	}

	static int nextInt() throws IOException {
		return parseInt(next());
	}

	static long nextLong() throws IOException {
		return parseLong(next());
	}

	static double nextDouble() throws IOException {
		return parseDouble(next());
	}

	static String next() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	public static void main(String[] args) {
		new Thread(null, null, "Main", 0x4000000) {
			public void run() {
				try {
					in = new BufferedReader(new InputStreamReader(System.in));
					out = new PrintWriter(new OutputStreamWriter(System.out));
					new Main().solve();
					in.close();
					out.close();
				} catch (Throwable e) {
					e.printStackTrace();
					exit(1);
				}
			}
		}.start();
	}
}
