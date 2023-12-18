import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

	private static final String NO = "No";
	private static final String YES = "Yes";
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long MOD = 1000000007;
	private static final int MAXN = 1000000;

	void solve() {
		int T = 1;
		for (int i = 0; i < T; i++)
			solve(i);
	}

	void solve(int T) {
		int n = ni();
		long C = nl();
		long h[] = nl(n);
		GeqSlopeOptimizer optimizer = new GeqSlopeOptimizer();
		optimizer.add(-h[0] * h[0], 2 * h[0], 0);
		long dp[] = new long[n];

		for (int i = 1; i < n; i++) {
			int j = optimizer.getBestChoice(-h[i]);
			dp[i] = (h[i] - h[j]) * (h[i] - h[j]) + dp[j] + C;
			optimizer.add(-h[i] * h[i] - dp[i], 2 * h[i], i);
//			tr(j, dp[i]);
		}

		out.println(dp[n - 1]);
	}

	// a^b
	long power(long a, long b) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 != 0) {
				x = (x * y) % MOD;
			}
			y = (y * y) % MOD;
			b /= 2;
		}
		return x % MOD;
	}

	private long gcd(long a, long b) {
		while (a != 0) {
			long tmp = b % a;
			b = a;
			a = tmp;
		}
		return b;
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private List<Integer> na2(int n) {
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			a.add(ni());
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private long[][] nl(int n, int m) {
		long[][] a = new long[n][];
		for (int i = 0; i < n; i++)
			a[i] = nl(m);
		return a;
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	static class GeqSlopeOptimizer {
		Deque<GeqSlopeOptimizer.Point> deque;

		public GeqSlopeOptimizer() {
			this(0);
		}

		public GeqSlopeOptimizer(int exp) {
			deque = new ArrayDeque<>(exp);
		}

		private double slope(GeqSlopeOptimizer.Point a, GeqSlopeOptimizer.Point b) {
			if (b.x == a.x) {
				if (b.y == a.y) {
					return 0;
				} else if (b.y > a.y) {
					return 1e50;
				} else {
					return 1e-50;
				}
			}
			return (double) (b.y - a.y) / (b.x - a.x);
		}

		public GeqSlopeOptimizer.Point add(long y, long x, int id) {
			GeqSlopeOptimizer.Point t1 = new GeqSlopeOptimizer.Point(x, y, id);
			while (deque.size() >= 2) {
				GeqSlopeOptimizer.Point t2 = deque.removeLast();
				GeqSlopeOptimizer.Point t3 = deque.peekLast();
				if (slope(t3, t2) > slope(t2, t1)) {
					deque.addLast(t2);
					break;
				}
			}
			deque.addLast(t1);
			return t1;
		}

		public int getBestChoice(long s) {
			while (deque.size() >= 2) {
				GeqSlopeOptimizer.Point h1 = deque.removeFirst();
				GeqSlopeOptimizer.Point h2 = deque.peekFirst();
				if (slope(h2, h1) < s) {
					deque.addFirst(h1);
					break;
				}
			}
			return deque.peekFirst().id;
		}

		private static class Point {
			final long x;
			final long y;
			final int id;

			private Point(long x, long y, int id) {
				this.x = x;
				this.y = y;
				this.id = id;
			}

		}

	}

}