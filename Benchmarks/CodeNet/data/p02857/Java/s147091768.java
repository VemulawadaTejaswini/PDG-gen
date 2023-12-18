import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int[] col = new int[n + 1];
		for (int i = 0; i < n; i++) {
			out.print("?");
			for (int j = 0; j < n; j++) {
				out.print(" " + ((i + j) % (2 * n) + 1));
			}
			out.println();
			out.flush();
			col[i] = col(ir.next());
		}
		col[n] = col[0] ^ 1;
		int[] res = new int[2 * n];
		Arrays.fill(res, -1);
		int idx = -1;
		for (int i = 0; i < n; i++) {
			if (col[i] != col[i + 1]) {
				idx = i;
				res[i] = col[i];
				res[(i + n) % (2 * n)] = col[i] ^ 1;
				break;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			out.print("?");
			for (int j = 1; j <= n - 1; j++) {
				out.print(" " + ((idx + j) % (2 * n) + 1));
			}
			out.print(" " + ((idx + n + i + 1) % (2 * n) + 1));
			out.println();
			out.flush();
			res[(idx + n + i + 1) % (2 * n)] = col(ir.next());
		}
		for (int i = 0; i < n - 1; i++) {
			out.print("?");
			for (int j = 1; j <= n - 1; j++) {
				out.print(" " + ((idx + n + j) % (2 * n) + 1));
			}
			out.print(" " + ((idx + i + 1) % (2 * n) + 1));
			out.println();
			out.flush();
			res[(idx + i + 1) % (2 * n)] = col(ir.next());
		}
		out.print("! ");
		for (int i = 0; i < 2 * n; i++) {
			out.print(res[i] == 0 ? "R" : "B");
		}
		out.println();
	}

	static int col(String s) {
		if (s.equals("Red"))
			return 0;
		else
			return 1;
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
		out.flush();
	}
}
