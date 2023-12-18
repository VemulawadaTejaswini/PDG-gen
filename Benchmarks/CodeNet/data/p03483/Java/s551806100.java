import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		char[] s = ir.next().toCharArray();
		int n = s.length;
		ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> u = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 26; i++) {
			v.add(new ArrayList<Integer>());
			u.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n; i++) {
			v.get(s[i] - 'a').add(i);
		}
		int x = 0;
		for (int i = 0; i < 26; i++) {
			if (v.get(i).size() % 2 == 1)
				x++;
		}
		if (x >= 2) {
			out.println(-1);
			return;
		}
		BinaryIndexedTree bit = new BinaryIndexedTree(n);
		int[] p = new int[26];
		for (int i = 0; i < 26; i++)
			p[i] = v.get(i).size() - 1;
		long res = 0;
		char[] l = new char[n / 2];
		char[] r = new char[n / 2];
		int curl = 0;
		int curr = n / 2 - 1;
		for (int i = 0; i < n; i++) {
			if (v.get(s[i] - 'a').get(p[s[i] - 'a']) > i) {
				bit.update(i, 1);
				p[s[i] - 'a']--;
				l[curl++] = s[i];
			} else if (v.get(s[i] - 'a').get(p[s[i] - 'a']) == i) {
				bit.update(i, 1);
				res += n / 2 - bit.sum(i);
			} else {
				res += (n + 1) / 2 - bit.sum(i);
				r[curr--] = s[i];
			}
		}
		int t = 0;
		for (int i = 0; i < n / 2; i++) {
			u.get(l[i] - 'a').add(i);
		}
		int[] ct = new int[26];
		int[] cr = new int[n / 2];
		for (int i = 0; i < n / 2; i++)
			cr[i] = u.get(r[i] - 'a').get(ct[r[i] - 'a']++);
		res += countBubbleSort(cr);
		out.println(res);
	}

	static long countBubbleSort(int[] a) {
		int n = a.length;
		BinaryIndexedTree bit = new BinaryIndexedTree(n);
		long ret = 0;
		for (int i = 0; i < n; i++) {
			ret += bit.sum(a[i] + 1, n);
			bit.update(a[i], 1);
		}
		return ret;
	}

	static class BinaryIndexedTree {
		// 0-indexed
		private long[] bit;
		private int SIZE;

		public BinaryIndexedTree(int n) {
			bit = new long[n + 1];
			SIZE = n;
		}

		// sum of segment[0,i)
		public long sum(int i) {
			long res = 0;
			while (i > 0) {
				res += bit[i];
				i -= i & -i;
			}
			return res;
		}

		// sum of segment[start,end)
		public long sum(int start, int end) {
			return sum(end) - sum(start);
		}

		public long get(int i) {
			return sum(i + 1) - sum(i);
		}

		public void update(int i, long x) {
			i++;
			while (i <= SIZE) {
				bit[i] += x;
				i += i & -i;
			}
		}

		public int size() {
			return SIZE;
		}
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		out.println(Arrays.deepToString(o));
	}
}
