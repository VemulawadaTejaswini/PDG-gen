import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long M = 1000000007;

	void solve() {
		int N = ni();

		int[] a = na(3);
		int n = toInt(a);
		Map<Integer, String> s = new HashMap<Integer, String>();
		s.put(n, "");
//		tr(s);
		for (int i = 0; i < N; i++) {
			Map<Integer, String> s2 = new HashMap<Integer, String>();
			char[] str = ns().toCharArray();
			int id[] = new int[] { str[0] - 'A', str[1] - 'A' };
			for (Entry<Integer, String> en : s.entrySet()) {
				int n0 = en.getKey();
				a = new int[] { n0 / 9, n0 % 9 / 3, n0 % 3 };
				if (a[id[0]] >= 1) {
					int[] a2 = a.clone();
					a2[id[0]]--;
					a2[id[1]]++;
					s2.put(toInt(a2), en.getValue() + (char) ('A' + id[1]));
				}
				if (a[id[1]] >= 1) {
					a[id[1]]--;
					a[id[0]]++;
					s2.put(toInt(a), en.getValue() + (char) ('A' + id[0]));
				}
			}
			s = s2;
//			tr(s);
		}
		if (s.isEmpty())
			out.println("No");
		else {
			out.println("Yes");
			String str = s.values().iterator().next();
			for (char c : str.toCharArray())
				out.println(c);
		}
	}

	private int[] toArray(int n0) {
		return new int[] { n0 / 9, n0 % 9 / 3, n0 % 3 };
	}

	private int toInt(int[] a) {
		return Math.min(2, a[0]) * 9 + Math.min(2, a[1]) * 3 + Math.min(2, a[2]);
	}

	long power(long a, long b) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 != 0) {
				x = (x * y) % M;
			}
			y = (y * y) % M;
			b /= 2;
		}
		return x % M;
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
}
