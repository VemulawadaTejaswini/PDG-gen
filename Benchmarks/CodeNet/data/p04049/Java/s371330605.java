import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	void solve() {
		int n = ni(), k = ni();
		ArrayList<Integer> to[] = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			to[i] = new ArrayList<>();
		for (int i = 0; i + 1 < n; ++i) {
			int a = ni() - 1, b = ni() - 1;
			to[a].add(b);
			to[b].add(a);
		}
		piar t = max(n, 0, to);
		piar u = max(n, t.l, to);
		piar v = max(n, u.l, to);
		{
			int tmp = u.l;
			u.l = v.l;
			v.l = tmp;
		}
		int D = u.d[v.l], d = D - k;
		if (d <= 0) {
			out.println(0);
		} else {
			int res = Integer.MAX_VALUE;
			for (int i = 0; i <= d; ++i) {
				boolean a[] = new boolean[n];
				for (int j = 0; j < n; ++j) {
					a[j] |= u.d[j] > D - i;
					a[j] |= v.d[j] > D - (d - i);
				}
				int tmp = 0;
				for (int j = 0; j < n; ++j)
					if (a[j]) ++tmp;
				if (tmp < res) res = tmp;
			}
			out.println(res);
		}
	}

	piar max(int n, int x, ArrayList<Integer> to[]) {
		int d[] = new int[n];
		Arrays.fill(d, -1);
		d[x] = 0;
		int l = -1, m = 0, q[] = new int[n], qi = 0, qs = 1;
		q[0] = x;
		while (qi < qs) {
			int s = q[qi++];
			for (Integer g : to[s]) {
				if (d[g] == -1) {
					d[g] = d[s] + 1;
					q[qs++] = g;
					if (m < d[g]) {
						m = d[g];
						l = g;
					}
				}
			}
		}
		return new piar(l, d);
	}

	class piar {
		int l, d[];

		public piar(int a, int b[]) {
			l = a;
			d = b;
		}
	}

	long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String[] args) throws Exception {
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		new Main().solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G - S + "ms");
	}

	private static boolean eof() {
		if (lenbuf == -1) return true;
		int lptr = ptrbuf;
		while (lptr < lenbuf)
			if (!isSpaceChar(inbuf[lptr++])) return false;

		try {
			is.mark(1000);
			while (true) {
				int b = is.read();
				if (b == -1) {
					is.reset();
					return true;
				} else if (!isSpaceChar(b)) {
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}

	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte() {
		if (lenbuf == -1) throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0) return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private static double nd() {
		return Double.parseDouble(ns());
	}

	private static char nc() {
		return (char) skip();
	}

	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private static int ni() {
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

	private static long nl() {
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
		if (INPUT.length() != 0) System.out.println(Arrays.deepToString(o));
	}

	private static void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}