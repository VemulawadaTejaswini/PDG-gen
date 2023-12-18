import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long M = 1000000007;

	void solve() {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // bigger, ascending
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Comparator.reverseOrder()); // smaller, descending
		int n = ni();

		long s = 0;
		long s1 = 0;
		long s2 = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			int op = ni();
			if (op == 1) {
				int j = ni();
				s += nl();
				pq2.add(j);
				s2 += j;

//				tr(pq1, pq2, s);
				while (!pq1.isEmpty() && !pq2.isEmpty() && pq1.peek() < pq2.peek()) {
					int tmp1 = pq1.remove();
					int tmp2 = pq2.remove();
					pq1.add(tmp2);
					pq2.add(tmp1);
					s2 += -tmp2 + tmp1;
					s1 += -tmp1 + tmp2;
				}

				if (pq2.size() > pq1.size() + 1) {
					j = pq2.remove();
					pq1.add(j);
					s2 -= j;
					s1 += j;
				}
//				tr(pq1, pq2);

			} else {
//				tr(pq1, pq2, s);

				sb.append(pq2.peek()).append(' ')
						.append(s1 - ((long) pq1.size()) * pq2.peek() + ((long) pq2.size()) * pq2.peek() - s2 + s)
						.append(System.lineSeparator());
//				tr(sb);
			}
		}
		out.print(sb);

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