

import java.awt.Point;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastIO io = new FastIO();
		solve(io);
		io.flush();
	}

	private void solve(FastIO io) {
		/*
		 * author: 31536000
		 * ABC134 C問題
		 * 考察メモ
		 * 両側から累積和ではい
		 *
		 */
		int N = io.nextInt(), A[] = io.nextInt(N);
		SegmentTreeInterface<Integer, Integer> segment = new SegmentTree<Integer>(toArray(A), new Maximum<>());
		for (int i : IntRange.open(N)) io.println(segment.getAvoid(i));
	}

	// 以下、ライブラリ

	private static Integer[] toArray(int[] array) {
		Integer[] ret = new Integer[array.length];
		for (int i = 0;i < array.length;++ i) ret[i] = array[i];
		return ret;
	}

	public interface Associative<T> {
		public T operate(T left, T right);
	}

	public interface Monoid<T> extends Associative<T>, Unit<T> {

	}
	public interface Commutative<T> {

	}
	public interface RangeOperate<T, E> {
		public T function(T element, E reaction,  int N);
	}
	public interface Unit<T> {
		public T unit();
	}

	public class Maximum<T extends Comparable<T>> implements Monoid<T>, Commutative<T>, RangeOperate<T, T>{

		@Override
		public T operate(T left, T right) {
			if (left == null) return right;
			else if (right == null) return left;
			return left.compareTo(right) > 0 ? left : right;
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

	/**
	 * セグメント木です。<br>
	 * １点更新をO(logN)、範囲取得をO(logN)でできるデータ構造です。
	 * @author 31536000
	 *
	 * @param <T> 更新及び範囲取得を行いたいクラス
	 */
	public class SegmentTree<T> implements SegmentTreeInterface<T, T>{

		private Associative<T> semigroup; // 演算関数
		private T dat[]; // データ
		private int size;

		/**
		 * セグメント木を構築します。
		 * @param dat 初期値
		 * @param semigroup 演算関数
		 */
		public SegmentTree(int N, T dat, Associative<T> semigroup) {
			this.semigroup = semigroup;
			@SuppressWarnings("unchecked")
			T[] data = (T[]) new Object[N];
			Arrays.fill(data, dat);
			build(data);
		}

		/**
		 * セグメント木を構築します。
		 * @param dat 初期値
		 * @param semigroup 演算関数
		 */
		public SegmentTree(T[] dat, Associative<T> semigroup) {
			this.semigroup = semigroup;
			build(dat);
		}

		/**
		 * セグメント木を構築します。
		 * @param dat 初期値
		 * @throws ClassCastException 演算関数が定義されていなければ返す
		 */
		@SuppressWarnings("unchecked")
		public SegmentTree(int N, T dat) throws ClassCastException {
			this(N, dat, (Associative<T>) dat);
		}

		/**
		 * セグメント木を構築します。
		 * @param dat 初期値
		 * @throws ClassCastException 演算関数が定義されていなければ返す
		 */
		@SuppressWarnings("unchecked")
		public SegmentTree(T dat[]) throws ClassCastException {
			this(dat, (Associative<T>) dat[0]);
		}

		@SuppressWarnings("unchecked")
		private void build(T dat[]) { // セグ木を配列として作成
			size = dat.length;
			this.dat = (T[])new Object[Integer.highestOneBit(dat.length) << 2]; // 要素数を超える最小の2冪*2
			System.arraycopy(dat, 0, this.dat, this.dat.length >> 1, dat.length); // 最下段を埋める
			for (int i = this.dat.length / 2 - 1; i > 0; --i)
				this.dat[i] = operate(this.dat[i << 1], this.dat[i << 1 | 1]); // 最下段以外すべて、下から埋める
		}

		private T operate(T left, T right) { // 演算関数
			if (right == null) return left; // 右がnullの可能性の方がはるかに高いので
			else if (left == null) return right;
			else return semigroup.operate(left, right);
		}

		@Override
		public void update(T dat, int index) {
			index |= this.dat.length >> 1;
			this.dat[index] = dat;
			for (int i = index >> 1; i > 0; i >>= 1) this.dat[i] = operate(this.dat[i << 1], this.dat[i << 1 | 1]);
		}

		@Override
		public T[] get() {
			@SuppressWarnings("unchecked")
			T[] ret = (T[]) Array.newInstance(dat[size].getClass(), size);
			System.arraycopy(dat, dat.length >> 1, ret, 0, size);
			return  ret;
		}

		@Override
		public T get(int l, int r) {
			T L = null, R = null;
			l += dat.length >> 1;
			r += dat.length >> 1;
			while (l < r) {
				if ((l & 1) != 0) L = operate(L, dat[l++]);
				if ((r & 1) != 0) R = operate(dat[r ^ 1], R);
				l >>= 1;
				r >>= 1;
			}
			return operate(L, R);
		}

		@Override
		public T get(int index) {
			return dat[index | dat.length >> 1];
		}

		@Override
		public int size() {
			return size;
		}

		@Override
		public void update(T dat, int left, int right) {
			for (int i = left;i < right;++ i) update(dat, i);
		}

		private int revBinarySearch(int right, int left, Predicate<T> f) {
			left += dat.length >>> 1;
			right += dat.length >>> 1;
			T last = null, next;
			int i = 0;
			while (left >>> i < right) {
				if ((right & 1) == 0) { // 上がある
					if (f.test(next = operate(dat[right], last))) { // このright全部を含むか
						last = next;
						-- right;
					} else left = right << i; // 左辺を移動
				} else {
					right >>>= 1;
					++ i;
				}
			}
			while (i > 0) { // 今度は降下しながら見ていく
				right = right << 1 | 1;
				-- i;
				if ((left >>> i & 1) == 0) {
					if (f.test(next = operate( dat[right], last))) {
						last = next;
						-- right;
					} else left = right << i;
				}
			};
			return right - (dat.length >>> 1) + 1;
		}

		@Override
		public int binarySearch(int left, int right, Predicate<T> f) {
			if (left > right) return revBinarySearch(left - 1, right - 1, f);
			left += dat.length >>> 1;
			right += dat.length >>> 1;
			T last = null, next;
			int i = 0;
			while (left < right >>> i) {
				if ((left & 1) == 0) { // 上がある
					left >>>= 1;
					++ i;
				} else {
					if (f.test(next = operate(last, dat[left]))) { // このleft全部を含むか
						last = next;
						++ left;
					} else right = (left + 1 << i) - 1; // 左辺を移動
				}
			}
			while (i > 0) { // 今度は降下しながら見ていく
				left <<= 1;
				-- i;
				if ((right >>> i & 1) != 0) {
					if (f.test(next = operate(last, dat[left]))) {
						last = next;
						++ left;
					} else right = (left + 1 << i) - 1;
				}
			};
			return left - (dat.length >>> 1) - 1;
		}

		@Override
		public T getAvoid(int left, int right) {
			return operate(get(0, left), get(right, size));
		}
	}

	public interface SegmentTreeInterface<T, E> {
		/**
		 * データを更新します。
		 * @param dat 更新するデータ
		 * @param index 更新する場所
		 */
		public void update(E dat, int index);
		/**
		 * 区間[left, right)のデータを更新します。
		 * @param dat 更新するデータ
		 * @param left 更新する場所の左区間
		 * @param right 更新する場所の右区間
		 */
		public void update(E dat, int left, int right);
		/**
		 * 全ての値を取得します。
		 * @return 現在の値
		 */
		public T[] get();
		/**
		 * 指定した場所の値を取得します。
		 * @param index 取得したい場所
		 * @return その場所の値
		 */
		public T get(int index);

		/**
		 * 指定した値を除く場所の値を取得します。
		 * @param index 取得しない場所
		 * @return 全体からindexを取り除いた値
		 */
		public default T getAvoid(int index) {
			return getAvoid(index, index + 1);
		}

		/**
		 * 指定した範囲の合計を取得します。
		 * @param left 範囲の左区間
		 * @param right 範囲の右区間
		 * @return 半開区間[left, right)の合計
		 */
		public T get(int left, int right);

		/**
		 * 指定した範囲を除く区間の合計を取得します。
		 * @param left 範囲の左区間
		 * @param right 範囲の右区間
		 * @return 半開区間[0, left)+[right, size)の合計
		 */
		public T getAvoid(int left, int right);

		/**
		 * 全区間で二分探索を行います。
		 * @param f 単調性を持つ関数
		 * @return 半開区間[0, size)において関数fがtrueを返す最大の値(無ければleft-1)
		 */
		public default int binarySearch(Predicate<T> f) {
			return binarySearch(0, size(), f);
		}

		/**
		 * 指定した範囲で二分探索を行います。
		 * @param left 範囲の左区間
		 * @param f 単調性を持つ関数
		 * @return 半開区間[left, size)において関数fがtrueを返す最大の値(無ければleft-1)
		 */
		public default int binarySearch(int left, Predicate<T> f) {
			return binarySearch(left, size(), f);
		}
		/**
		 * 指定した範囲で二分探索を行います。
		 * @param left 範囲の左区間
		 * @param right 範囲の右区間
		 * @param f 単調性を持つ関数
		 * @return 半開区間[left, right)において関数fがtrueを返す最大の値(無ければleft-1)<br>
		 * ただしleft>rightなら、半開区間[right, left)において関数fがtrueを返す最小の値(無ければleft)
		 */
		public int binarySearch(int left, int right, Predicate<T> f);
		/**
		 * 要素数を返します。
		 * @return 要素数
		 */
		public int size();
	}

	public class FastIO {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;
		public final PrintWriter out;
		public final PrintWriter err;

		public FastIO() {
			this(System.in, System.out, System.err);
		}

		public FastIO(InputStream in, PrintStream out, PrintStream err) {
			this.in = in;
			this.out = new PrintWriter(out, false);
			this.err = new PrintWriter(err, false);
		}

		private boolean hasNextByte() {
			if (read < length) return true;
			read = 0;
			try {
				length = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
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

		public char[][] nextChar(int height) {
			char[][] ret = new char[height][];
			for (int i = 0;i < ret.length;++ i) ret[i] = next().toCharArray();
			return ret;
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

		public ModInteger nextModInt(int mod) {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return new ModInteger(mod, (int)nl);
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextInt(int width) {
			int[] ret = new int[width];
			for (int i = 0;i < width;++ i) ret[i] = nextInt();
			return ret;
		}

		public ModInteger[] nextModInt(int mod, int width) {
			ModInteger[] ret = new ModInteger[width];
			for (int i = 0;i < width;++ i) ret[i] = nextModInt(mod);
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

		public ModInteger[][] nextModInt(int mod, int width, int height) {
			ModInteger[][] ret = new ModInteger[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[i][j] = nextModInt(mod);
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

		public boolean[][] nextBoolean(char T, int height) {
			boolean[][] ret = new boolean[height][];
			for (int i = 0;i < ret.length;++ i) {
				char[] s = next().toCharArray();
				ret[i] = new boolean[s.length];
				for (int j = 0;j < ret[i].length;++ j) ret[i][j] = s[j] == T;
			}
			return ret;
		}

		public Point nextPoint() {
			return new Point(nextInt(), nextInt());
		}

		public Point[] nextPoint(int width) {
			Point[] ret = new Point[width];
			for (int i = 0;i < width;++ i) ret[i] = nextPoint();
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

		public void print(double d, int length) {
			if (d < 0) {
				out.print('-');
				d = -d;
			}
			d += Math.pow(10, -length) / 2;
			out.print((long)d);
			out.print('.');
			d -= (long)d;
			for (int i = 0;i < length;++ i) {
				d *= 10;
				out.print((int)d);
				d -= (int)d;
			}
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

		public void print(Object[] obj, String perse) {
			print(obj[0]);
			for (int i = 1;i < obj.length;++ i) {
				print(perse);
				print(obj[i]);
			}
		}

		public void print(Object[][] obj, String perse1, String perse2) {
			print(obj[0], perse1);
			for (int i = 1;i < obj.length;++ i) {
				print(perse2);
				print(obj[i], perse1);
			}
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

		public void println(double d, int length) {
			print(d, length);
			println();
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

		public void println(Object[] obj, String perse) {
			print(obj, perse);
			println();
		}

		public void println(Object[][] obj, String perse1, String perse2) {
			print(obj, perse1, perse2);
			println();
		}

		public void flush() {
			out.flush();
			err.flush();
		}
	}

	public enum BoundType {
		CLOSED, OPEN;
	}

	public static class Range<C> implements Serializable{

		private static final long serialVersionUID = -4702828934863023392L;
		protected C lower;
		protected C upper;
		protected BoundType lowerType;
		protected BoundType upperType;
		private Comparator<? super C> comparator;

		protected Range(C lower, BoundType lowerType, C upper, BoundType upperType) {
			this(lower, lowerType, upper, upperType, null);
		}

		protected Range(C lower, BoundType lowerType, C upper, BoundType upperType, Comparator<? super C> comparator) {
			this.lower = lower;
			this.upper = upper;
			this.lowerType = lowerType;
			this.upperType = upperType;
			this.comparator = comparator;
		}

		public static <C extends Comparable<? super C>> Range<C> range(C lower, BoundType lowerType, C upper, BoundType upperType) {
			if (lower != null && upper != null) {
				int comp = lower.compareTo(upper);
				if (comp > 0) return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED);
				else if (comp == 0 && (lowerType == BoundType.OPEN || upperType == BoundType.OPEN))return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED);
			}
			return new Range<C>(lower, lowerType, upper, upperType);
		}

		public static <C> Range<C> range(C lower, BoundType lowerType, C upper, BoundType upperType, Comparator<? super C> comparator) {
			if (lower != null && upper != null) {
				int comp = comparator.compare(lower, upper);
				if (comp > 0) return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, comparator);
				else if (comp == 0 && (lowerType == BoundType.OPEN || upperType == BoundType.OPEN)) return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, comparator);
			}
			return new Range<C>(lower, lowerType, upper, upperType, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> all() {
			return range(null, BoundType.OPEN, null, BoundType.OPEN);
		}

		public static <C> Range<C> all(Comparator<? super C> comparator) {
			return range(null, BoundType.OPEN, null, BoundType.OPEN, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> atMost(C upper) {
			return range(null, BoundType.OPEN, upper, BoundType.CLOSED);
		}

		public static <C> Range<C> atMost(C upper, Comparator<? super C> comparator) {
			return range(null, BoundType.OPEN, upper, BoundType.CLOSED, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> lessThan(C upper) {
			return range(null, BoundType.OPEN, upper, BoundType.OPEN);
		}

		public static <C> Range<C> lessThan(C upper, Comparator<? super C> comparator) {
			return range(null, BoundType.OPEN, upper, BoundType.OPEN, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> downTo(C upper, BoundType boundType) {
			return range(null, BoundType.OPEN, upper, boundType);
		}

		public static <C> Range<C> downTo(C upper, BoundType boundType, Comparator<? super C> comparator) {
			return range(null, BoundType.OPEN, upper, boundType, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> atLeast(C lower) {
			return range(lower, BoundType.CLOSED, null, BoundType.OPEN);
		}

		public static <C> Range<C> atLeast(C lower, Comparator<? super C> comparator) {
			return range(lower, BoundType.CLOSED, null, BoundType.OPEN, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> greaterThan(C lower) {
			return range(lower, BoundType.OPEN, null, BoundType.OPEN);
		}

		public static <C> Range<C> greaterThan(C lower, Comparator<? super C> comparator) {
			return range(lower, BoundType.OPEN, null, BoundType.OPEN, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> upTo(C lower, BoundType boundType) {
			return range(lower, boundType, null, BoundType.OPEN);
		}

		public static <C> Range<C> upTo(C lower, BoundType boundType, Comparator<? super C> comparator) {
			return range(lower, boundType, null, BoundType.OPEN, comparator  );
		}

		public static <C extends Comparable<? super C>> Range<C> open(C lower, C upper) {
			return range(lower, BoundType.OPEN, upper, BoundType.OPEN);
		}

		public static <C> Range<C> open(C lower, C upper, Comparator<? super C> comparator) {
			return range(lower, BoundType.OPEN, upper, BoundType.OPEN, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> openClosed(C lower, C upper) {
			return range(lower, BoundType.OPEN, upper, BoundType.CLOSED);
		}

		public static <C> Range<C> openClosed(C lower, C upper, Comparator<? super C> comparator) {
			return range(lower, BoundType.OPEN, upper, BoundType.CLOSED, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> closedOpen(C lower, C upper) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN);
		}

		public static <C> Range<C> closedOpen(C lower, C upper, Comparator<? super C> comparator) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> closed(C lower, C upper) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static <C> Range<C> closed(C lower, C upper, Comparator<? super C> comparator) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> singleton(C value) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED);
		}

		public static <C> Range<C> singleton(C value, Comparator<? super C> comparator) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> empty() {
			return range(null, BoundType.CLOSED, null, BoundType.CLOSED);
		}

		public static <C> Range<C> empty(Comparator<? super C> comparator) {
			return range(null, BoundType.CLOSED, null, BoundType.CLOSED, comparator);
		}

		public static <C extends Comparable<? super C>> Range<C> encloseAll(Iterable<C> values) {
			C lower = values.iterator().next();
			C upper = lower;
			for (C i : values) {
				if (lower.compareTo(i) > 0) lower = i;
				if (upper.compareTo(i) < 0) upper = i;
			}
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static <C> Range<C> encloseAll(Iterable<C> values, Comparator<? super C> comparator) {
			C lower = values.iterator().next();
			C upper = lower;
			for (C i : values) {
				if (comparator.compare(lower, i) > 0) lower = i;
				if (comparator.compare(upper, i) < 0) upper = i;
			}
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, comparator);
		}

		protected int compareLower(C value) {
			return compareLower(value, BoundType.CLOSED);
		}

		protected int compareLower(C value, BoundType boundType) {
			return compareLower(lower, lowerType, value, boundType);
		}

		protected int compareLower(C lower, BoundType lowerType, C value) {
			return compareLower(lower, lowerType, value, BoundType.CLOSED);
		}

		protected int compareLower(C lower, BoundType lowerType, C value, BoundType boundType) {
			if (lower == null) return value == null ? 0 : -1;
			else if (value == null) return 1;
			int compare;
			if (comparator == null) {
				@SuppressWarnings("unchecked")
				Comparable<C> comp = (Comparable<C>)lower;
				compare = comp.compareTo(value);
			} else compare = comparator.compare(lower, value);
			if (compare == 0) {
				if (lowerType == BoundType.CLOSED) -- compare;
				if (boundType == BoundType.CLOSED) ++ compare;
			}
			return compare;
		}

		protected int compareUpper(C value) {
			return compareUpper(value, BoundType.CLOSED);
		}

		protected int compareUpper(C value, BoundType boundType) {
			return compareUpper(upper, upperType, value, boundType);
		}

		protected int compareUpper(C upper, BoundType upperType, C value) {
			return compareUpper(upper, upperType, value, BoundType.CLOSED);
		}

		protected int compareUpper(C upper, BoundType upperType, C value, BoundType boundType) {
			if (upper == null) return value == null ? 0 : 1;
			if (value == null) return -1;
			int compare;
			if (comparator == null) {
				@SuppressWarnings("unchecked")
				Comparable<C> comp = (Comparable<C>)upper;
				compare = comp.compareTo(value);
			} else compare = comparator.compare(upper, value);
			if (compare == 0) {
				if (upperType == BoundType.CLOSED) ++ compare;
				if (boundType == BoundType.CLOSED) -- compare;
			}
			return compare;
		}

		public boolean hasLowerBound() {
			return lower != null;
		}

		public C lowerEndpoint() {
			if (hasLowerBound()) return lower;
			throw new IllegalStateException();
		}

		public BoundType lowerBoundType() {
			if (hasLowerBound()) return lowerType;
			throw new IllegalStateException();
		}

		public boolean hasUpperBound() {
			return upper != null;
		}

		public C upperEndpoint() {
			if (hasUpperBound()) return upper;
			throw new IllegalStateException();
		}

		public BoundType upperBoundType() {
			if (hasUpperBound()) return upperType;
			throw new IllegalStateException();
		}

		/**
		 * この区間が空集合か判定します。
		 * @return 空集合ならばtrue
		 */
		public boolean isEmpty() {
			return lower == null && upper == null && lowerType == BoundType.CLOSED;
		}

		/**
		 * 与えられた引数が区間の左側に位置するか判定します。<br>
		 * 接する場合は区間の左側ではないと判定します。
		 * @param value 調べる引数
		 * @return 区間の左側に位置するならtrue
		 */
		public boolean isLess(C value) {
			return isLess(value, BoundType.CLOSED);
		}

		protected boolean isLess(C value, BoundType boundType) {
			return compareLower(value, boundType) > 0;
		}

		/**
		 * 与えられた引数が区間の右側に位置するか判定します。<br>
		 * 接する場合は区間の右側ではないと判定します。
		 * @param value 調べる引数
		 * @return 区間の右側に位置するならtrue
		 */
		public boolean isGreater(C value) {
			return isGreater(value, BoundType.CLOSED);
		}

		private boolean isGreater(C value, BoundType boundType) {
			return compareUpper(value, boundType) < 0;
		}

		/**
		 * 与えられた引数が区間内に位置するか判定します。<br>
		 * 接する場合も区間内に位置すると判定します。
		 * @param value 調べる引数
		 * @return 区間内に位置するならtrue
		 */
		public boolean contains(C value) {
			return !isLess(value) && !isGreater(value) && !isEmpty();
		}

		/**
		 * 与えられた引数すべてが区間内に位置するか判定します。<br>
		 * 接する場合も区間内に位置すると判定します。
		 * @param value 調べる要素
		 * @return 全ての要素が区間内に位置するならtrue
		 */
		public boolean containsAll(Iterable<? extends C> values) {
			for (C i : values) if (!contains(i)) return false;
			return true;
		}

		/**
		 * 与えられた区間がこの区間に内包されるか判定します。<br>
		 *
		 * @param other
		 * @return 与えられた区間がこの区間に内包されるならtrue
		 */
		public boolean encloses(Range<C> other) {
			return !isLess(other.lower, other.lowerType) && !isGreater(other.upper, other.upperType);
		}

		/**
		 * 与えられた区間がこの区間と公差するか判定します。<br>
		 * 接する場合は公差するものとします。
		 * @param value 調べる引数
		 * @return 区間が交差するならtrue
		 */
		public boolean isConnected(Range<C> other) {
			if (this.isEmpty() || other.isEmpty()) return false;
			C lower, upper;
			BoundType lowerType, upperType;
			if (isLess(other.lower, other.lowerType)) {
				lower = other.lower;
				lowerType = other.lowerType;
			} else {
				lower = this.lower;
				lowerType = this.lowerType;
			}
			if (isGreater(other.upper, other.upperType)) {
				upper = other.upper;
				upperType = other.upperType;
			} else {
				upper = this.upper;
				upperType = this.upperType;
			}
			if (lower == null || upper == null) return true;
			int comp = compareLower(lower, lowerType, upper, upperType);
			return comp <= 0;
		}
		/**
		 * この区間との積集合を返します。
		 * @param connectedRange 積集合を求める区間
		 * @return 積集合
		 */
		public Range<C> intersection(Range<C> connectedRange) {
			if (this.isEmpty() || connectedRange.isEmpty()) {
				if (comparator == null) return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED);
				return empty(comparator);
			}
			C lower, upper;
			BoundType lowerType, upperType;
			if (isLess(connectedRange.lower, connectedRange.lowerType)) {
				lower = connectedRange.lower;
				lowerType = connectedRange.lowerType;
			} else {
				lower = this.lower;
				lowerType = this.lowerType;
			}
			if (isGreater(connectedRange.upper, connectedRange.upperType)) {
				upper = connectedRange.upper;
				upperType = connectedRange.upperType;
			} else {
				upper = this.upper;
				upperType = this.upperType;
			}
			if (comparator == null) {
				return new Range<C>(lower, lowerType, upper, upperType);
			}
			return range(lower, lowerType, upper, upperType, comparator);
		}

		/**
		 * この区間との和集合を返します。
		 * @param other 和集合を求める区間
		 * @return 和集合
		 */
		public Range<C> span(Range<C> other) {
			if (other.isEmpty()) return new Range<C>(lower, lowerType, upper, upperType);
			C lower, upper;
			BoundType lowerType, upperType;
			if (isLess(other.lower, other.lowerType)) {
				lower = this.lower;
				lowerType = this.lowerType;
			} else {
				lower = other.lower;
				lowerType = other.lowerType;
			}
			if (isGreater(other.upper, other.upperType)) {
				upper = this.upper;
				upperType = this.upperType;
			} else {
				upper = other.upper;
				upperType = other.upperType;
			}
			return new Range<C>(lower, lowerType, upper, upperType, comparator);
		}

		@Override
		public boolean equals(Object object) {
			if (this == object) return true;
			if (object instanceof Range) {
				@SuppressWarnings("unchecked")
				Range<C> comp = (Range<C>) object;
				return compareLower(comp.lower, comp.lowerType) == 0 && compareUpper(comp.upper, comp.upperType) == 0 && lowerType == comp.lowerType && upperType == comp.upperType;
			}
			return false;
		}

		@Override
		public int hashCode() {
			if (lower == null && upper == null) return 0;
			else if (lower == null) return upper.hashCode();
			else if (upper == null) return lower.hashCode();
			return lower.hashCode() ^ upper.hashCode();
		}

		@Override
		public String toString() {
			if (isEmpty()) return "()";
			return (lowerType == BoundType.OPEN ? "(" : "[") + (lower == null ? "" : lower.toString()) + ".." + (upper == null ? "" : upper.toString()) + (upperType == BoundType.OPEN ? ")" : "]");
		}
	}

	public static class IterableRange<C> extends Range<C> implements Iterable<C>{

		private static final long serialVersionUID = 9065915259748260688L;
		protected UnaryOperator<C> func;

		protected IterableRange(C lower, BoundType lowerType, C upper, BoundType upperType, UnaryOperator<C> func) {
			super(lower, lowerType, upper, upperType);
			this.func = func;
		}

		public static <C extends Comparable<? super C>> IterableRange<C> range(C lower, BoundType lowerType, C upper, BoundType upperType, UnaryOperator<C> func) {
			if (lower == null || upper == null) return new IterableRange<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, func);
			int comp = lower.compareTo(upper);
			if (comp > 0) return new IterableRange<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, func);
			else if (comp == 0 && (lowerType == BoundType.OPEN || upperType == BoundType.OPEN)) return new IterableRange<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, func);
			return new IterableRange<C>(lower, lowerType, upper, upperType, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> open(C lower, C upper, UnaryOperator<C> func) {
			if (lower == null) return new IterableRange<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, func);
			return range(func.apply(lower), BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> openClosed(C lower, C upper, UnaryOperator<C> func) {
			if (lower == null) return new IterableRange<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, func);
			return range(func.apply(lower), BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> closedOpen(C lower, C upper, UnaryOperator<C> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> closed(C lower, C upper, UnaryOperator<C> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> singleton(C value, UnaryOperator<C> func) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED, func);
		}

		protected class Iter implements Iterator<C> {
			C now;
			Iter() {
				now = lower;
			}
			@Override
			public final boolean hasNext() {
				return !isGreater(now);
			}

			@Override
			public final C next() {
				C ret = now;
				now = func.apply(now);
				return ret;
			}

			@Override
			public final void remove() {
				throw new UnsupportedOperationException();
			}
		}

		protected class EmptyIter implements Iterator<C> {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public C next() {
				return null;
			}

		}

		@Override
		public Iterator<C> iterator() {
			return lower == null || upper == null ? new EmptyIter() : new Iter();
		}

		public int getDistance() {
			C check = upper;
			int ret = 0;
			while (lower != check) {
				check = func.apply(check);
				++ ret;
			}
			return ret;
		}
	}

	public static class IntRange extends IterableRange<Integer>{

		private static final long serialVersionUID = 5623995336491967216L;
		private final boolean useFastIter;

		private static class Next implements UnaryOperator<Integer> {

			@Override
			public Integer apply(Integer value) {
				return value + 1;
			}
		}

		protected IntRange() {
			super(null, BoundType.CLOSED, null, BoundType.CLOSED, new Next());
			useFastIter = true;
		}

		protected IntRange(UnaryOperator<Integer> func) {
			super(null, BoundType.CLOSED, null, BoundType.CLOSED, func);
			useFastIter = false;
		}

		protected IntRange(int lower, BoundType lowerType, int upper, BoundType upperType) {
			super(lower, lowerType, upper, upperType, new Next());
			useFastIter = true;
		}

		protected IntRange(int lower, BoundType lowerType, int upper, BoundType upperType, UnaryOperator<Integer> func) {
			super(lower, lowerType, upper, upperType, func);
			useFastIter = false;
		}

		public static IntRange range(int lower, BoundType lowerType, int upper, BoundType upperType) {
			if (lower > upper) return new IntRange();
			if (lowerType == BoundType.OPEN) ++ lower;
			if (upperType == BoundType.OPEN) -- upper;
			return new IntRange(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static IntRange range(int lower, BoundType lowerType, int upper, BoundType upperType, UnaryOperator<Integer> func) {
			if (lower > upper) return new IntRange(func);
			if (lowerType == BoundType.OPEN) ++ lower;
			if (upperType == BoundType.OPEN) -- upper;
			return new IntRange(lower, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static IntRange open(int lower, int upper) {
			return range(lower, BoundType.OPEN, upper, BoundType.OPEN);
		}

		public static IntRange open(int lower, int upper, UnaryOperator<Integer> func) {
			return range(lower, BoundType.OPEN, upper, BoundType.OPEN, func);
		}

		public static IntRange open(int upper) {
			return range(0, BoundType.CLOSED, upper, BoundType.OPEN);
		}

		public static IntRange open(int upper, UnaryOperator<Integer> func) {
			return range(0, BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static IntRange openClosed(int lower, int upper) {
			return range(lower, BoundType.OPEN, upper, BoundType.CLOSED);
		}

		public static IntRange openClosed(int lower, int upper, UnaryOperator<Integer> func) {
			return range(lower, BoundType.OPEN, upper, BoundType.CLOSED, func);
		}

		public static IntRange closedOpen(int lower, int upper) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN);
		}

		public static IntRange closedOpen(int lower, int upper, UnaryOperator<Integer> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static IntRange closed(int lower, int upper) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static IntRange closed(int lower, int upper, UnaryOperator<Integer> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static IntRange closed(int upper) {
			return range(0, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static IntRange closed(int upper, UnaryOperator<Integer> func) {
			return range(0, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static IntRange singleton(int value) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED);
		}

		public static IntRange singleton(int value, UnaryOperator<Integer> func) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED, func);
		}

		private class FastIter implements Iterator<Integer> {
			int now;
			public FastIter() {
				now = lower;
			}
			@Override
			public final boolean hasNext() {
				return now <= upper;
			}

			@Override
			public final Integer next() {
				return now++;
			}

			@Override
			public final void remove() {
				throw new UnsupportedOperationException();
			}
		}

		private class Iter implements Iterator<Integer> {
			int now;
			public Iter() {
				now = lower;
			}
			@Override
			public final boolean hasNext() {
				return now <= upper;
			}

			@Override
			public final Integer next() {
				int ret = now;
				now = func.apply(now);
				return ret;
			}

			@Override
			public final void remove() {
				throw new UnsupportedOperationException();
			}
		}

		@Override
		public Iterator<Integer> iterator() {
			return lower == null || upper == null ? new EmptyIter() : useFastIter ? new FastIter() : new Iter();
		}

		@Override
		public int getDistance() {
			int ret = upper - lower;
			if (upperType == BoundType.CLOSED) ++ ret;
			return ret;
		}

		public int getClosedLower() {
			return lower;
		}

		public int getOpenLower() {
			return lower - 1;
		}

		public int getClosedUpper() {
			return upperType == BoundType.CLOSED ? upper : upper - 1;
		}

		public int getOpenUpper() {
			return upperType == BoundType.CLOSED ? upper + 1 : upper;
		}
	}

	public interface Ring<T> {
		public T add(T left, T right);
		public T addUnit();
		public T addInverse(T element);
		public T multiply(T left, T right);
		public T multiplyUnit();
		public T multiplyInverse(T element);
	}

	public class ModInteger extends Number implements Ring<ModInteger>{

		private static final long serialVersionUID = -8595710127161317579L;
		private final int mod;
		private int num;

		public ModInteger(int mod) {
			this.mod = mod;
			num = 0;
		}

		public ModInteger(int mod, int num) {
			this.mod = mod;
			this.num = validNum(num);
		}

		public ModInteger(ModInteger n) {
			mod = n.mod;
			num = n.num;
		}

		private ModInteger(ModInteger n, int num) {
			mod = n.mod;
			this.num = num;
		}

		private int validNum(int n) {
			n %= mod;
			if (n < 0) n += mod;
			return n;
		}

		protected int inverse(int n) {
			 int m = mod, u = 0, v = 1, t;
			 while(n != 0) {
				 t = m / n;
				 m -= t * n;
				 u -= t * v;
				 if (m != 0) {
					 t = n / m;
					 n -= t * m;
					 v -= t * u;
				 } else {
					 v %= mod;
					 if (v < 0) v += mod;
					 return v;
				 }
			 }
			 u %= mod;
			 if (u < 0) u += mod;
			 return u;
		}

		public boolean isPrime(int n) {
			if ((n & 1) == 0) return false; // 偶数
			for (int i = 3, j = 8, k = 9;k <= n;i += 2, k += j += 8) if (n % i == 0) return false;
			return true;
		}

		@Override
		public int intValue() {
			return num;
		}

		@Override
		public long longValue() {
			return num;
		}

		@Override
		public float floatValue() {
			return num;
		}

		@Override
		public double doubleValue() {
			return num;
		}

		public ModInteger add(int n) {
			return new ModInteger(this).addEqual(n);
		}

		public ModInteger add(ModInteger n) {
			return new ModInteger(this).addEqual(n);
		}

		public ModInteger addEqual(int n) {
			num = validNum(num + n);
			return this;
		}

		public ModInteger addEqual(ModInteger n) {
			if ((num += n.num) >= mod) num -= mod;
			return this;
		}

		public ModInteger subtract(int n) {
			return new ModInteger(this).subtractEqual(n);
		}

		public ModInteger subtract(ModInteger n) {
			return new ModInteger(this).subtractEqual(n);
		}

		public ModInteger subtractEqual(int n) {
			num = validNum(num - n);
			return this;
		}

		public ModInteger subtractEqual(ModInteger n) {
			if ((num -= n.num) < 0) num += mod;
			return this;
		}

		@Override
		public ModInteger add(ModInteger left, ModInteger right) {
			return new ModInteger(left).addEqual(right);
		}

		@Override
		public ModInteger addUnit() {
			return new ModInteger(mod, 0);
		}

		@Override
		public ModInteger addInverse(ModInteger element) {
			return new ModInteger(element, element.mod - element.num);
		}

		public ModInteger multiply(int n) {
			return new ModInteger(this).multiplyEqual(n);
		}

		public ModInteger multiply(ModInteger n) {
			return new ModInteger(this).multiplyEqual(n);
		}

		public ModInteger multiplyEqual(int n) {
			num = (int)((long)num * n % mod);
			if (num < 0) num += mod;
			return this;
		}

		public ModInteger multiplyEqual(ModInteger n) {
			num = (int)((long)num * n.num % mod);
			return this;
		}

		public ModInteger divide(int n) {
			return new ModInteger(this).divideEqual(n);
		}

		public ModInteger divide(ModInteger n) {
			return new ModInteger(this).divideEqual(n);
		}

		public ModInteger divideEqual(int n) {
			num = (int)((long)num * inverse(validNum(n)) % mod);
			return this;
		}

		public ModInteger divideEqual(ModInteger n) {
			num = (int)((long)num * n.inverse(n.num) % mod);
			return this;
		}

		@Override
		public ModInteger multiply(ModInteger left, ModInteger right) {
			return new ModInteger(left).multiplyEqual(right);
		}

		@Override
		public ModInteger multiplyUnit() {
			return new ModInteger(this, 1);
		}

		@Override
		public ModInteger multiplyInverse(ModInteger element) {
			return new ModInteger(element, element.inverse(element.num));
		}

		public ModInteger pow(int n) {
			return new ModInteger(this).powEqual(n);
		}

		public ModInteger pow(ModInteger n) {
			return new ModInteger(this).powEqual(n);
		}

		public ModInteger powEqual(int n) {
			long ans = 1, num = this.num;
			if (n < 0) {
				n = -n;
				while (n != 0) {
					if ((n & 1) != 0) ans = ans * num % mod;
					n >>>= 1;
					num = num * num % mod;
				}
				this.num = inverse((int)ans);
				return this;
			}
			while (n != 0) {
				if ((n & 1) != 0) ans = ans * num % mod;
				n >>>= 1;
				num = num * num % mod;
			}
			this.num = (int)ans;
			return this;
		}

		public ModInteger powEqual(ModInteger n) {
			long num = this.num;
			this.num = 1;
			int mul = n.num;
			while (mul != 0) {
				if ((mul & 1) != 0) this.num *= num;
				mul >>>= 1;
				num *= num;
				num %= mod;
			}
			return this;
		}

		public ModInteger equal(int n) {
			num = validNum(n);
			return this;
		}

		public ModInteger equal(ModInteger n) {
			num = n.num;
			return this;
		}

		public int toInt() {
			return num;
		}

		public int getMod() {
			return mod;
		}

		@Override
		public boolean equals(Object x) {
			if (x instanceof ModInteger) return ((ModInteger)x).num == num && ((ModInteger)x).mod == mod;
			return false;
		}

		@Override
		public int hashCode() {
			return num ^ mod;
		}

		@Override
		public String toString() {
			return String.valueOf(num);
		}

		@Deprecated
		public String debug() {
			int min = num, ans = 1;
			for (int i = 2;i < min;++ i) {
				int tmp = multiply(i).num;
				if (min > tmp) {
					min = tmp;
					ans = i;
				}
			}
			return min + "/" + ans;
		}
	}

	/**
	 * 素数を法とする演算上で、組み合わせの計算を高速に行います。
	 * @author 31536000
	 *
	 */
	public class ModUtility {
		private final int mod, totient;
		private int[] fact, inv, invfact;
		/**
		 * modを法とする
		 * @param mod
		 */
		public ModUtility(int mod) {
			this(mod, 2);
		}

		public ModUtility(int mod, int calc) {
			if (mod <= 0) throw new IllegalArgumentException("illegal mod: " + mod);
			this.mod = mod;
			int totient = mod;
			for (int i = 2;i * i <= mod;++ i) {
				if (mod % i == 0) {
					totient = totient / i * (i - 1);
					while ((mod %= i) % i == 0);
				}
			}
			this.totient = totient;
			precalc(calc);
		}

		public void precalc(int calc) {
			if (calc < 2) calc = 2;
			fact = new int[calc];
			inv = new int[calc];
			invfact = new int[calc];
			fact[0] = invfact[0] = fact[1] = invfact[1] = inv[1] = 1;
			for (int i = 2;i < calc;++ i) {
				fact[i] = (int)((long)fact[i - 1] * i % mod);
				inv[i] = (int)(mod - (long)inv[mod % i] * (mod / i) % mod);
				invfact[i] = (int)((long)invfact[i - 1] * inv[i] % mod);
			}
		}

		public ModInteger create() {
			return create(0);
		}

		public ModInteger create(int n) {
			return new ModInt(n);
		}

		private class ModInt extends ModInteger {

			private static final long serialVersionUID = -2435281861935422575L;

			public ModInt(int n) {
				super(mod, n);
			}

			@Override
			protected int inverse(int n) {
				return ModUtility.this.inverse(n);
			}
		}

		public int inverse(int n) {
			try {
				if (inv.length > n) return inv[n];
				 int m = mod, u = 0, v = 1, t;
				 while(n != 0) {
					 t = m / n;
					 m -= t * n;
					 u -= t * v;
					 if (m != 0) {
						 t = n / m;
						 n -= t * m;
						 v -= t * u;
					 } else {
						 v %= mod;
						 if (v < 0) v += mod;
						 return v;
					 }
				 }
				 u %= mod;
				 if (u < 0) u += mod;
				 return u;
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new IllegalArgumentException();
			}
		}

		public int factorial(int n) {
			try {
				if (fact.length > n) return fact[n];
				long ret = fact[fact.length - 1];
				for (int i = fact.length;i <= n;++ i) ret = ret * i % mod;
				return (int)ret;
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new IllegalArgumentException();
			}
		}

		public int permutation(int n, int k) {
			if (k < 0) throw new IllegalArgumentException();
			if (n < k) return 0;
			if (fact.length > n) return (int)((long)fact[n] * invfact[n - k] % mod);
			long ret = 1;
			for (int i = n - k + 1;i <= n;++ i) ret = ret * i % mod;
			return (int)ret;
		}

		public int combination(int n, int k) {
			if (k < 0) throw new IllegalArgumentException();
			if (n < k) return 0;
			if (fact.length > n) return (int)((long)fact[n] * invfact[k] % mod * invfact[n - k] % mod);
			long ret = 1;
			if (n < 2 * k) k = n - k;
			if (invfact.length > k) ret = invfact[k];
			else ret = inverse(factorial(k));
			for (int i = n - k + 1;i <= n;++ i) ret = ret * i % mod;
			return (int)ret;
		}

		public int multinomial(int n, int... k) {
			int sum = 0;
			for (int i : k) sum += i;
			long ret = factorial(n);
			if (fact.length > n) {
				for (int i : k) {
					if (i < 0) throw new IllegalArgumentException();
					ret = ret * invfact[i] % mod;
					sum += i;
				}
				if (sum > n) return 0;
				ret = ret * invfact[n - sum] % mod;
			} else {
				for (int i : k) {
					if (i < 0) throw new IllegalArgumentException();
					if (invfact.length > i) ret = ret * invfact[i] % mod;
					else ret = ret * inverse(factorial(i)) % mod;
					sum += i;
				}
				if (sum > n) return 0;
				if (invfact.length > n - sum) ret = ret * invfact[n - sum] % mod;
				else ret = ret * inverse(factorial(n - sum)) % mod;
			}
			return (int)ret;
		}

		public int multichoose(int n, int k) {
			return combination(n + k - 1, k);
		}

		public int pow(int n, int m) {
			long ans = 1, num = n;
			if (m < 0) {
				m = -m;
				while (m != 0) {
					if ((m & 1) != 0) ans = ans * num % mod;
					m >>>= 1;
					num = num * num % mod;
				}
				return inverse((int)ans);
			}
			while (m != 0) {
				if ((m & 1) != 0) ans = ans * num % mod;
				m >>>= 1;
				num = num * num % mod;
			}
			return (int)ans;
		}

		public int pow(long n, long m) {
			return pow((int)(n % mod), (int)(n % (mod - 1)));
		}

		public int totient() {
			return totient;
		}

		public boolean isPrime() {
			return totient == mod - 1;
		}

		public int mod(int n) {
			return (n %= mod) < 0 ? n + mod : n;
		}

		public int add(int n, int m) {
			return mod(n + m);
		}

		public int subtract(int n, int m) {
			return mod(n - m);
		}

		public int multiply(int n, int m) {
			int ans = (int)((long)n * m % mod);
			return ans < 0 ? ans + mod : ans;
		}

		public int divide(int n, int m) {
			return multiply(n, inverse(m));
		}
	}
}
