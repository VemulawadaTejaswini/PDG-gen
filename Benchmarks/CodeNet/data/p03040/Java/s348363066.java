
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastIO io = new FastIO();
		int Q = io.nextInt();
		long x = 0, minSum = 0, maxSum = 0;
		TreeMap<Integer, Integer> min = new TreeMap<Integer, Integer>(), max = new TreeMap<Integer, Integer>();
		int minSize = 0, maxSize = 0;
		for (int i = 0;i < Q;++ i) {
			int query = io.nextInt();
			if (query == 1) {
				int a = io.nextInt(), b = io.nextInt();
				x += b;
				min.put(a, min.getOrDefault(a, 0) + 1);
				++ minSize;
				minSum += a;
				if (minSize > maxSize + 1) {
					minSum -= min.lastKey();
					maxSum += min.lastKey();
					max.put(min.lastKey(), max.getOrDefault(min.lastKey(), 0) + 1);
					if (min.put(min.lastKey(), min.get(min.lastKey()) - 1) == 1) min.pollLastEntry();
					-- minSize;
					++ maxSize;
				}
				if (maxSize > 0) {
					while (min.lastKey() > max.firstKey()) {
						minSum += max.firstKey() - min.lastKey();
						maxSum -= max.firstKey() - min.lastKey();
						max.put(min.lastKey(), max.getOrDefault(min.lastKey(), 0) + 1);
						if (min.put(min.lastKey(), min.get(min.lastKey()) - 1) == 1) min.pollLastEntry();
						min.put(max.firstKey(), min.getOrDefault(max.firstKey(), 0) + 1);
						if (max.put(max.lastKey(), max.get(max.firstKey()) - 1) == 1) max.pollFirstEntry();
					}
				}
			} else {
				long mid = min.lastKey();
				io.println(mid + " " + (x + (minSize * mid - minSum) + (maxSum - maxSize * mid)));
			}
		}

		io.flush();
	}
	/**
	 * 二分探索を計算します。
	 * @param ok 演算範囲のtrue側の端(開区間)
	 * @param ng 演算範囲のfalse側の端(開区間)
	 * @param f 評価関数、単調性を満たす必要がある
	 * @return 境界に接し、評価関数がtrueを返す値
	 */
	public int binarySearch(int ok, int ng, java.util.function.Predicate<Integer> f) {
		int halfDiff, mid;
		while((halfDiff = (ok - ng / 2)) != 0) if (f.test(mid = ok + halfDiff)) ok = mid; else ng = mid;
		return ok;
	}

	public class FastIO {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;
		public final PrintWriter out = new PrintWriter(System.out, false);
		public final PrintWriter err = new PrintWriter(System.err, false);

		private boolean hasNextByte() {
			if (read < length) return true;
			else {
				try {
					read = 0;
					length = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return length > 0;
		}

		private int readByte() {
			return hasNextByte() ? buffer[read++] : -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private boolean isNumber(int c) {
			return '0' <= c && c <= '9';
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[read])) read++;
			return hasNextByte();
		}

		public char nextChar() {
			if (!hasNextByte())  throw new NoSuchElementException();
			return (char)readByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b;
			while (isPrintableChar(b = readByte())) sb.appendCodePoint(b);
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (!isNumber(b)) throw new NumberFormatException();
			while (true) {
				if (isNumber(b)) {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextInt(int width) {
			int[] ret = new int[width];
			for (int i = 0;i < width;++ i) ret[i] = nextInt();
			return ret;
		}

		public long[] nextLong(int width) {
			long[] ret = new long[width];
			for (int i = 0;i < width;++ i) ret[i] = nextLong();
			return ret;
		}

		public int[][] nextInt(int width, int height) {
			int[][] ret = new int[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[i][j] = nextInt();
			return ret;
		}

		public long[][] nextLong(int width, int height) {
			long[][] ret = new long[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextLong();
			return ret;
		}

		public boolean[] nextBoolean(char T) {
			char[] s = next().toCharArray();
			boolean[] ret = new boolean[s.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = s[i] == T;
			return ret;
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				in.close();
				out.close();
				err.close();
			}
		}

		public void print(boolean b) {
			out.print(b);
		}

		public void print(char c) {
			out.print(c);
		}

		public void print(char[] s) {
			out.print(s);
		}

		public void print(double d) {
			out.print(d);
		}

		public void print(float f) {
			out.print(f);
		}

		public void print(int i) {
			out.print(i);
		}

		public void print(long l) {
			out.print(l);
		}

		public void print(Object obj) {
			out.print(obj);
		}

		public void print(String s) {
			out.print(s);
		}

		public void printf(String format, Object... args) {
			out.printf(format, args);
		}

		public void printf(Locale l, String format, Object... args) {
			out.printf(l, format, args);
		}

		public void println() {
			out.println();
		}

		public void println(boolean b) {
			out.println(b);
		}

		public void println(char c) {
			out.println(c);
		}

		public void println(char[] s) {
			out.println(s);
		}

		public void println(double d) {
			out.println(d);
		}

		public void println(float f) {
			out.println(f);
		}

		public void println(int i) {
			out.println(i);
		}

		public void println(long l) {
			out.println(l);
		}

		public void println(Object obj) {
			out.println(obj);
		}

		public void println(String s) {
			out.println(s);
		}

		public void flush() {
			out.flush();
			err.flush();
		}
	}
}
