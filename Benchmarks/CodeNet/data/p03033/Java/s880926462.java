package abc128;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastIO io = new FastIO();
		int N = io.nextInt(), Q = io.nextInt();
		List<Integer> zip = new ArrayList<Integer>();
		zip.add(-1);
		int[] S = new int[N], T = new int[N], X = new int[N];
		for (int i = 0;i < N;++ i) {
			S[i] = io.nextInt();
			T[i] = io.nextInt();
			X[i] = io.nextInt();
			zip.add(S[i] -= X[i]);
			zip.add(T[i] -= X[i]);
		}
		int[] D = io.nextInt(Q);
		CompressTree<Integer> comp = new CompressTree<Integer>(zip);
		DualSegmentTree<Integer> segment = new DualSegmentTree<Integer>(comp.size(), Integer.MAX_VALUE, new Minimum<Integer>());
		for (int i = 0;i < N;++ i) segment.update(X[i], comp.zip(S[i]), comp.zip(T[i]));
		Integer[] get = segment.get();
		for (int i : D) io.println(((get[comp.zip(i)] + 1) & Integer.MAX_VALUE) - 1);
		io.flush();
	}

	public interface Unit<T> {
		public T unit();
	}

	public interface Commutative<T> {

	}

	public interface Monoid<T> extends Associative<T>, Unit<T> {

	}

	public interface RangeOperate<T, E> {
		public T function(T element, E reaction,  int N);
	}

	public class Minimum<T extends Comparable<T>> implements Monoid<T>, Commutative<T>, RangeOperate<T, T>{

		@Override
		public T operate(T left, T right) {
			if (left == null) return right;
			else if (right == null) return left;
			return left.compareTo(right) < 0 ? left : right;
		}

		@Override
		public T unit() {
			return null;
		}

		@Override
		public T function(T element, T reaction, int N) {
			return operate(element, reaction);
		}

	}

	public class CompressTree<T extends Comparable<T>>{
		private TreeMap<T, Integer> zip;
		private Object[] unzip;

		public CompressTree(T[] dat) {
			Arrays.sort(dat);
			zip = new TreeMap<T, Integer>();
			List<T> unzip = new ArrayList<T>();
			for (int i = 0, j = 0;i < dat.length;++ i) {
				if (zip.put(dat[i], j++) != null) {
					zip.put(dat[i], --j-1);
				} else unzip.add(dat[i]);
			}
			this.unzip = unzip.toArray();
		}

		public CompressTree(List<T> dat) {
			dat.sort(null);
			Object[] dats = dat.toArray();
			zip = new TreeMap<T, Integer>();
			List<T> unzip = new ArrayList<T>();
			for (int i = 0, j = 0;i < dats.length;++ i) {
				@SuppressWarnings("unchecked")
				T push = (T) dats[i];
				if (zip.put(push, j++) != null) {
					zip.put(push, --j-1);
				} else unzip.add(push);
			}
			this.unzip = unzip.toArray();
		}

		public int zip(T dat) {
			return zip.floorEntry(dat).getValue();
		}

		public T unzip(int index) {
			@SuppressWarnings("unchecked")
			T ret = (T)unzip[index];
			return ret;
		}

		public int size() {
			return unzip.length;
		}
	}

	public interface Associative<T> {
		public T operate(T left, T right);
	}

	/**
	 * 双対セグメント木です。<br>
	 * 範囲更新をO(logN)、1点取得をO(logN)でできるデータ構造です。
	 * @author 31536000
	 *
	 * @param <T> 範囲更新及び1点取得を行いたいクラス
	 */
	public class DualSegmentTree<T> {
		private Associative<T> semigroup; // 演算関数
		private T dat[]; // データ
		private int size;

		/**
		 * 双対セグメント木を構築します。
		 * @param N 要素数
		 * @param dat 初期値
		 * @param semigroup 演算関数
		 */
		public DualSegmentTree(int N, T dat, Associative<T> semigroup) {
			this.semigroup = semigroup;
			@SuppressWarnings("unchecked")
			T[] data = (T[]) new Object[N];
			Arrays.fill(data, dat);
			build(data);
		}

		/**
		 * 双対セグメント木を構築します。
		 * @param dat 初期値
		 * @param semigroup 演算関数
		 */
		public DualSegmentTree(T[] dat, Associative<T> semigroup) {
			this.semigroup = semigroup;
			build(dat);
		}

		/**
		 * 双対セグメント木を構築します。
		 * @param N 要素数
		 * @param dat 初期値
		 * @throws ClassCastException 演算関数が定義されていなければ返す
		 */
		@SuppressWarnings("unchecked")
		public DualSegmentTree(int N, T dat) throws ClassCastException {
			this(N, dat, (Associative<T>)dat);
		}

		/**
		 * 双対セグメント木を構築します。
		 * @param dat 初期値
		 * @throws ClassCastException 演算関数が定義されていなければ返す
		 */
		@SuppressWarnings("unchecked")
		public DualSegmentTree(T dat[]) throws ClassCastException {
			this(dat, (Associative<T>)dat[0]);
		}

		@SuppressWarnings("unchecked")
		private void build(T dat[]) { // セグ木を配列として作成
			size = dat.length;
			this.dat = (T[])new Object[Integer.highestOneBit(dat.length - 1) << 2]; // 要素数を超える最小の2冪*2
			System.arraycopy(dat, 0, this.dat, this.dat.length >> 1, dat.length); // 最下段を埋める
		}

		private T operate(T left, T right) { // 演算関数
			if (right == null) return left; // 右がnullの可能性の方がはるかに高いので
			else if (left == null) return right;
			else return semigroup.operate(left, right);
		}

		/**
		 * データを更新します
		 * @param data 更新するデータ
		 * @param l 更新する場所の左閉区間
		 * @param r 更新する場所の右開区間
		 */
		public void update(T data, int l, int r) {
			l += dat.length >> 1;
			r += dat.length >> 1;
			while (l < r) {
				if ((l & 1) != 0) dat[l] = operate(dat[l++], data);
				if ((r & 1) != 0) dat[r ^ 1] = operate(dat[r ^ 1], data);
				l >>= 1;
				r >>= 1;
			}
		}

		/**
		 * 全ての値を取得します。
		 * @return 現在の値
		 */
		@SuppressWarnings("unchecked")
		public T[] get() { // TODO これから
			for (int i = 1, l = dat.length >> 1;i < l;++ i) {
				dat[i << 1] = operate(dat[i << 1], dat[i]);
				dat[i << 1 | 1] = operate(dat[i << 1 | 1], dat[i]);
				dat[i] = null;
			}
			T[] ret = (T[]) Array.newInstance(dat[dat.length >> 1].getClass(), size);
			System.arraycopy(dat, dat.length >> 1, ret, 0, size);
			return  ret;
		}

		/**
		 * 指定した場所の値を取得します。
		 * @param index 取得したい場所
		 * @return その場所の値
		 */
		public T get(int index) {
			T ret = null;
			for (int i = dat.length >> 1 | index; i > 0; i >>= 1) ret = operate(ret, dat[i]);
			return ret;
		}

		/**
		 * 要素数を返します。
		 * @return 要素数
		 */
		public int size() {
			return size;
		}
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
