
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main implements Runnable{

	private static final int LIMIT = 1800; // ループで回せる時間
	private void solve(FastIO io) {
		/*
		 * author: 31536000
		 * Introduction to Heuristics Contest A問題
		 * 考察メモ
		 * まず、各日に決められるコンテストは高々1つなので、それを焼きなましすることを考える
		 * ここで、ある日に開くコンテストを変えた場合に変わる情報は次に開催するlastだけ
		 * 従って、更新はO(1)で行えるはず
		 *
		 * 実際に更新をO(1)で行う方法を考える
		 * データ構造として、双方向連結リストを考える
		 * 各日のコンテストは、直前と直後に開催されたコンテストを記録する
		 * この時、ある日のコンテストの種類を変更することは次のように表される
		 * 1. そのコンテストのスコアを減らす
		 * 2. そのコンテストの次に開かれた同じコンテストの直前コンテストを更新し、スコアを更新する(減らす)
		 * 3. コンテストを変更し、スコアを増やす
		 * 4. 直前と直後を繋ぐ…えー、O(D)やん、もっと速くならない？
		 *
		 * 次の情報: d日目以前に開かれたi番目のコンテストのうち、一番最後の物を求める
		 * これは、計算量O(logN) (TreeSet)以外にできるか？
		 * 区間max/一点更新で解けそうじゃない？
		 * つまり、一点更新で開かれたコンテストのポインタを入れれば、区間maxが最後のもの
		 * nullは最小、両方が非nullなら右側優先でおっけー
		 */
		io.setAutoFlush(true);
		Marathon marathon = new Marathon(io);
		MarathonTimer timer = new MarathonTimer(marathon);
		timer.start(LIMIT);
	}

	private class Marathon implements MarathonInterface {
		private FastIO io;
		private Random rnd;
		private int loop;

		static final int CONTEST = 26;
		final int D;
		final int[] c;
		final int[][] s;
		final int[] s2; // sを展開したもの、少し速くなると嬉しい……

		final Contest[] contest; // D日目に開かれたコンテスト
		final SegmentTree[] segment; // 各コンテストを高速検索するためのRMQ

		int score;

		class Contest {
			Contest last, next;
			int day, type;
			Contest(int day, int type) {
				this.type = type;
				this.day = day;
				last = next = this;
			}
			@Override
			public String toString() {
				return "Contest " + type + " is held " + day;
			}
		}

		private class SegmentTree {
			private Contest[] tree;
			private final int size;
			private final Contest MIN, MAX;
			public SegmentTree(int type) {
				size = Integer.highestOneBit(D + 1) << 1;
				tree = new Contest[size * 2];
				tree[size] = MIN = new Contest(-1, type);
				tree[tree.length - 1] = MAX = new Contest(D, type);
			}
			public final void set(int index, final Contest contest) {
				index += size + 1;
				tree[index] = contest;
				while(index > 0) {
					index >>= 1;
					tree[index] = tree[index << 1 | 1] == null ? tree[index << 1] : tree[index << 1 | 1];
				}
			}
			public final Contest get() {
				return MAX;
			}
			public final Contest get(int toIndex) {
				int fromIndex = size;
				toIndex += size;
				while(fromIndex <= toIndex) {
					if ((toIndex & 1) == 0) {
						Contest right = tree[toIndex];
						if (right != null) return right;
						-- toIndex;
					}
					fromIndex >>= 1;
					toIndex >>= 1;
				}
				return MIN;
			}
		}

		public Marathon(FastIO io) {
			this.io = io;
			rnd = new Random();
			D = io.nextInt();
			c = io.nextInt(CONTEST);
			s = io.nextInt(CONTEST, D);
			s2 = new int[CONTEST * D];
			for (int i = 0;i < D;++ i) {
				for (int j = 0;j < CONTEST;++ j) s2[i * CONTEST + j] = s[i][j];
			}
			contest = new Contest[D];
			segment = new SegmentTree[CONTEST];
			for (int i = 0;i < CONTEST;++ i) segment[i] = new SegmentTree(i);
		}

		private int want(final int contest, final int wait) {
			return c[contest] * wait * (wait - 1) >> 1;
		}

		@Override
		public void read() {
		}

		@Override
		public void init() {
			loop = 0;

			// 貪欲法で構築しておく
			for (int i = 0;i < D;++ i) {
				int max = 0, maxScore = -1;
				for (int j = 0;j < CONTEST;++ j) {
					int score = s2[i * CONTEST + j] + c[j] * (i - segment[j].get(i).day);
					if (maxScore < score) {
						maxScore = score;
						max = j;
					}
				}
				contest[i] = new Contest(i, max);
				contest[i].last = segment[max].get(i);
				contest[i].last.next = contest[i];
				segment[max].set(i, contest[i]);
				score += s2[i * CONTEST + max];
				score -= want(max, i - contest[i].last.day);
			}
			for (int i = 0;i < CONTEST;++ i) {
				Contest tmp = segment[i].get();
				tmp.last = segment[i].get(D);
				tmp.last.next = tmp;
				score -= want(i, D - tmp.last.day);
			}
			seed = rnd.nextInt();
		}

		int seed;
		static final int XOR_MASK = 0x7FFFFFFF;
		int xorshift() {
			seed = seed ^ (seed << 13);
			seed = seed ^ (seed >>> 17);
			return seed = seed ^ (seed << 5);
		}

		public int xorshift(int bound) {
			int bits, val;
			do {
				bits = xorshift() & XOR_MASK;
				val = bits % bound;
			} while (bits - val + (bound - 1) < 0);
			return val;
		}

		@Override
		public void update(int delay) {
			++ loop;

			int patturn = xorshift(101 - delay * 80 / LIMIT);
			if (patturn < 20) { // パターン1: 特定の日付のコンテストの種類を変える
				int day = xorshift(D);
				int swap = xorshift(CONTEST - 1);
				Contest now = contest[day];
				int type = now.type;
				if (swap >= now.type) ++ swap;

				int change = 0; // 更新されるスコアの増え幅
				change += want(type, day - now.last.day); // 元々の値
				change += want(type, now.next.day - day); // 元々の値
				change -= want(type, now.next.day - now.last.day);
				change -= s2[day * CONTEST + type];
				Contest swapNext = segment[swap].get(day).next;
				change += want(swap, swapNext.day - swapNext.last.day); // 元々の値
				change -= want(swap, swapNext.day - day);
				change -= want(swap, day - swapNext.last.day);
				change += s2[day * CONTEST + swap];
				if (isChange(change, delay)) {
					score += change;
					segment[type].set(day, null);
					segment[swap].set(day, now);
					now.type = swap;
					now.next.last = now.last;
					now.last.next = now.next;
					swapNext.last.next = now;
					now.last = swapNext.last;
					swapNext.last = now;
					now.next = swapNext;
				}
			} else { // パターン2: 二つのコンテストの日付を入れ替える
				int day1 = xorshift(D);
				int day2 = xorshift(D - 1);
				if (day2 >= day1) ++ day2;
				Contest d1 = contest[day1];
				Contest d2 = contest[day2];
				int type1 = d1.type, type2 = d2.type;
				SegmentTree segment1 = segment[type1], segment2 = segment[type2];
				if (d1.type == d2.type) {
					-- loop;
					return; // swapするだけ無駄
				}
				Contest day1Last = d1.last.day < day2 && day2 < d1.next.day ? null : segment1.get(day2);
				Contest day2Last =  d2.last.day < day1 && day1 < d2.next.day ? null : segment2.get(day1);
				int change = 0; // 更新されるスコアの増え幅
				change -= s2[day1 * CONTEST + type1];
				change += s2[day2 * CONTEST + type1];
				change += want(type1, d1.next.day - day1);
				change += want(type1, day1 - d1.last.day);
				if (day1Last == null) {
					change -= want(type1, d1.next.day - day2);
					change -= want(type1, day2 - d1.last.day);
				} else {
					change -= want(type1, d1.next.day - d1.last.day);
					change += want(type1, day1Last.next.day - day1Last.day);
					change -= want(type1, day1Last.next.day - day2);
					change -= want(type1, day2 - day1Last.day);
				}
				change -= s2[day2 * CONTEST + type2];
				change += s2[day1 * CONTEST + type2];
				change += want(type2, d2.next.day - day2);
				change += want(type2, day2 - d2.last.day);
				if (day2Last == null) {
					change -= want(type2, d2.next.day - day1);
					change -= want(type2, day1 - d2.last.day);
				} else {
					change -= want(type2, d2.next.day - d2.last.day);
					change += want(type2, day2Last.next.day - day2Last.day);
					change -= want(type2, day2Last.next.day - day1);
					change -= want(type2, day1 - day2Last.day);
				}
				if (isChange(change, delay)) {
					score += change;
					segment1.set(day1, null);
					segment1.set(day2, d1);
					segment2.set(day2, null);
					segment2.set(day1, d2);
					contest[day2] = d1;
					contest[day1] = d2;
					d1.day = day2;
					d2.day = day1;
					if (day1Last != null) {
						d1.last.next = d1.next;
						d1.next.last = d1.last;
						d1.next = day1Last.next;
						d1.last = day1Last;
						day1Last.next.last = d1;
						day1Last.next = d1;
					}
					if (day2Last != null) {
						d2.last.next = d2.next;
						d2.next.last = d2.last;
						d2.next = day2Last.next;
						d2.last = day2Last;
						day2Last.next.last = d2;
						day2Last.next = d2;
					}
				}
			}
		}

		private final int START_TEMP = 1500; // TODO 焼きなまし関数
		private final int END_TEMP = 100;

		private boolean isChange(int change, int delay) {
//			return change >= 0; // 山登り法
			double tmp = temperature(delay);
			return rnd.nextDouble() <= Math.exp(change / tmp);
		}

		private double temperature(int delay) {
			return (double)(START_TEMP - END_TEMP) * delay / LIMIT + END_TEMP;
		}

		@Override
		public void finish() {
			io.debugln("loop:" + loop + ", score:" + Math.max(1000000 + score, 0));
			for (int i = 0;i < D;++ i) {
				io.println(contest[i].type + 1);
			}
		}

	}

	/** デバッグ用コードのお供に */
	private static boolean DEBUG = false;
	/** 確保するメモリの大きさ(単位: MB)*/
	private static final long MEMORY = 64;
	private final FastIO io;

	public static void main(String[] args) {
	        Thread.setDefaultUncaughtExceptionHandler((t, e) -> e.printStackTrace());
	        new Thread(null, new Main(), "", MEMORY * 1048576).start();
	}

	public Main() {
		this(new FastIO());
	}

	public Main(FastIO io) {
		this.io = io;
		if (DEBUG) {
			io.setAutoFlush(true);
			io.debugln("debug mode");
		}
	}

	@Override
	public void run() {
		solve(io);
		io.flush();
	}

	// 以下、ライブラリ

	private static interface MarathonInterface {
		/**
		 * 標準入力を受け取る関数です。
		 */
		public void read();
		/**
		 * 受け取った標準入力から、処理しやすいように加工する関数です。
		 */
		public void init();
		/**
		 * 近傍を探したりなど、毎回更新の処理を行う関数です。
		 * @param delay 残り時間
		 */
		public void update(int delay);
		/**
		 * 求まった結果を出力する関数です。
		 */
		public void finish();
	}

	private static class MarathonTimer implements Runnable {

		private MarathonInterface marathon;
		private volatile boolean roopFlag;
		private ScheduledExecutorService  threadPool;
		private ScheduledFuture<?> future;

		public MarathonTimer(Marathon marathon) {
			this.marathon = marathon;
			threadPool = Executors.newScheduledThreadPool(2);
			marathon.read();
		}

		public void start(int millis) {
			marathon.init();
			roopFlag = true;
			future = threadPool.schedule(() -> roopFlag = false, millis, TimeUnit.MILLISECONDS);
			threadPool.execute(this);
			try {
				threadPool.awaitTermination(7, TimeUnit.DAYS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while(roopFlag) marathon.update((int)future.getDelay(TimeUnit.MILLISECONDS));
			marathon.finish();
			threadPool.shutdown();
		}
	}

	/**
	 * 高速な入出力を提供します。
	 * @author 31536000
	 *
	 */
	public static class FastIO {
		private InputStream in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;
		private PrintWriter out;
		private PrintWriter err;
		private boolean autoFlush = false;

		public FastIO() {
			this(System.in, System.out, System.err);
		}

		public FastIO(InputStream in, PrintStream out, PrintStream err) {
			this.in = in;
			this.out = new PrintWriter(out, false);
			this.err = new PrintWriter(err, false);
		}

		public final void setInputStream(InputStream in) {
			this.in = in;
		}

		public final void setInputStream(File in) {
			try {
				this.in = new FileInputStream(in);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public final void setOutputStream(PrintStream out) {
			this.out = new PrintWriter(out, false);
		}

		public final void setOutputStream(File out) {
			try {
				this.out = new PrintWriter(new FileOutputStream(out), false);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public final void setErrorStream(PrintStream err) {
			this.err = new PrintWriter(err, false);
		}

		public final void setErrorStream(File err) {
			try {
				this.err = new PrintWriter(new FileOutputStream(err), false);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public final void setAutoFlush(boolean flush) {
			autoFlush = flush;
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

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private static boolean isNumber(int c) {
			return '0' <= c && c <= '9';
		}

		public final boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[read])) read++;
			return hasNextByte();
		}

		public final char nextChar() {
			if (!hasNextByte())  throw new NoSuchElementException();
			return (char)readByte();
		}

		public final char[][] nextChar(int height) {
			char[][] ret = new char[height][];
			for (int i = 0;i < ret.length;++ i) ret[i] = next().toCharArray();
			return ret;
		}

		public final String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b;
			while (isPrintableChar(b = readByte())) sb.appendCodePoint(b);
			return sb.toString();
		}

		public final String nextLine() {
			StringBuilder sb = new StringBuilder();
			int b;
			while(!isPrintableChar(b = readByte()));
			do sb.appendCodePoint(b); while(isPrintableChar(b = readByte()) || b == ' ');
			return sb.toString();
		}

		public final long nextLong() {
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

		public final int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}

		public final double nextDouble() {
			return Double.parseDouble(next());
		}

		public final int[] nextInt(int width) {
			int[] ret = new int[width];
			for (int i = 0;i < width;++ i) ret[i] = nextInt();
			return ret;
		}

		public final int[] nextInts() {
			return nextInts(" ");
		}

		public final int[] nextInts(String parse) {
			String[] get = nextLine().split(parse);
			int[] ret = new int[get.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = Integer.valueOf(get[i]);
			return ret;
		}

		public final long[] nextLong(int width) {
			long[] ret = new long[width];
			for (int i = 0;i < width;++ i) ret[i] = nextLong();
			return ret;
		}

		public final long[] nextLongs() {
			return nextLongs(" ");
		}

		public final long[] nextLongs(String parse) {
			String[] get = nextLine().split(parse);
			long[] ret = new long[get.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = Long.valueOf(get[i]);
			return ret;
		}

		public final int[][] nextInt(int width, int height) {
			int[][] ret = new int[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[i][j] = nextInt();
			return ret;
		}

		public final long[][] nextLong(int width, int height) {
			long[][] ret = new long[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextLong();
			return ret;
		}

		public final boolean[] nextBoolean(char T) {
			char[] s = next().toCharArray();
			boolean[] ret = new boolean[s.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = s[i] == T;
			return ret;
		}

		public final boolean[][] nextBoolean(char T, int height) {
			boolean[][] ret = new boolean[height][];
			for (int i = 0;i < ret.length;++ i) {
				char[] s = next().toCharArray();
				ret[i] = new boolean[s.length];
				for (int j = 0;j < ret[i].length;++ j) ret[i][j] = s[j] == T;
			}
			return ret;
		}

		public final Point nextPoint() {
			return new Point(nextInt(), nextInt());
		}

		public final Point[] nextPoint(int width) {
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

		public final boolean print(boolean b) {
			out.print(b);
			if (autoFlush) flush();
			return b;
		}

		public final Object print(boolean b, Object t, Object f) {
			return b ? print(t) : print(f);
		}

		public final char print(char c) {
			out.print(c);
			if (autoFlush) flush();
			return c;
		}

		public final char[] print(char[] s) {
			out.print(s);
			return s;
		}

		public final double print(double d) {
			out.print(d);
			if (autoFlush) flush();
			return d;
		}

		public final double print(double d, int length) {
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
			if (autoFlush) flush();
			return d;
		}

		public final float print(float f) {
			out.print(f);
			if (autoFlush) flush();
			return f;
		}

		public final int print(int i) {
			out.print(i);
			if (autoFlush) flush();
			return i;
		}

		public final long print(long l) {
			out.print(l);
			if (autoFlush) flush();
			return l;
		}

		public final Object print(Object obj) {
			if (obj.getClass().isArray()) {
				if (obj instanceof boolean[][]) print(obj, "\n", " ");
				else if (obj instanceof byte[][]) print(obj, "\n", " ");
				else if (obj instanceof short[][]) print(obj, "\n", " ");
				else if (obj instanceof int[][]) print(obj, "\n", " ");
				else if (obj instanceof long[][]) print(obj, "\n", " ");
				else if (obj instanceof float[][]) print(obj, "\n", " ");
				else if (obj instanceof double[][]) print(obj, "\n", " ");
				else if (obj instanceof char[][]) print(obj, "\n", " ");
				else if (obj instanceof Object[][]) print(obj, "\n", " ");
				else print(obj, " ");
			} else {
				out.print(obj);
				if (autoFlush) flush();
			}
			return obj;
		}

		public final String print(String s) {
			out.print(s);
			if (autoFlush) flush();
			return s;
		}

		public final Object print(Object array, String... parse) {
			print(array, 0, parse);
			if (autoFlush) flush();
			return array;
		}

		private final Object print(Object array, int check, String... parse) {
			if (check >= parse.length) {
				if (array.getClass().isArray()) throw new IllegalArgumentException("not equal dimension");
				print(array);
				return array;
			}
			String str = parse[check];
			if (array instanceof Object[]) {
				Object[] obj = (Object[]) array;
				if (obj.length == 0) return array;
				print(obj[0], check + 1, parse);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i], check + 1, parse);
				}
				return array;
			}
			if (array instanceof Collection) {
				Iterator<?> iter = ((Collection<?>)array).iterator();
				if (!iter.hasNext()) return array;
				print(iter.next(), check + 1, parse);
				while(iter.hasNext()) {
					print(str);
					print(iter.next(), check + 1, parse);
				}
				return array;
			}
			if (!array.getClass().isArray()) throw new IllegalArgumentException("not equal dimension");
			if (check != parse.length - 1) throw new IllegalArgumentException("not equal dimension");
			if (array instanceof boolean[]) {
				boolean[] obj = (boolean[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else if (array instanceof byte[]) {
				byte[] obj = (byte[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
				return array;
			} else if (array instanceof short[]) {
				short[] obj = (short[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else if (array instanceof int[]) {
				int[] obj = (int[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else if (array instanceof long[]) {
				long[] obj = (long[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else if (array instanceof float[]) {
				float[] obj = (float[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else if (array instanceof double[]) {
				double[] obj = (double[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else if (array instanceof char[]) {
				char[] obj = (char[]) array;
				if (obj.length == 0) return array;
				print(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					print(str);
					print(obj[i]);
				}
			} else throw new AssertionError();
			return array;
		}

		public final Object[] print(String parse, Object... args) {
			print(args[0]);
			for (int i = 1;i < args.length;++ i) {
				print(parse);
				print(args[i]);
			}
			return args;
		}

		public final Object[] printf(String format, Object... args) {
			out.printf(format, args);
			if (autoFlush) flush();
			return args;
		}

		public final Object printf(Locale l, String format, Object... args) {
			out.printf(l, format, args);
			if (autoFlush) flush();
			return args;
		}

		public final void println() {
			out.println();
			if (autoFlush) flush();
		}

		public final boolean println(boolean b) {
			out.println(b);
			if (autoFlush) flush();
			return b;
		}

		public final Object println(boolean b, Object t, Object f) {
			return b ? println(t) : println(f);
		}

		public final char println(char c) {
			out.println(c);
			if (autoFlush) flush();
			return c;
		}

		public final char[] println(char[] s) {
			out.println(s);
			if (autoFlush) flush();
			return s;
		}

		public final double println(double d) {
			out.println(d);
			if (autoFlush) flush();
			return d;
		}

		public final double println(double d, int length) {
			print(d, length);
			println();
			return d;
		}

		public final float println(float f) {
			out.println(f);
			if (autoFlush) flush();
			return f;
		}

		public final int println(int i) {
			out.println(i);
			if (autoFlush) flush();
			return i;
		}

		public final long println(long l) {
			out.println(l);
			if (autoFlush) flush();
			return l;
		}

		public final Object println(Object obj) {
			print(obj);
			println();
			return obj;
		}

		public final String println(String s) {
			out.println(s);
			if (autoFlush) flush();
			return s;
		}

		public final Object println(Object array, String... parse) {
			print(array, parse);
			println();
			return array;
		}

		public final boolean debug(boolean b) {
			err.print(b);
			if (autoFlush) flush();
			return b;
		}

		public final Object debug(boolean b, Object t, Object f) {
			return b ? debug(t) : debug(f);
		}

		public final char debug(char c) {
			err.print(c);
			if (autoFlush) flush();
			return c;
		}

		public final char[] debug(char[] s) {
			err.print(s);
			return s;
		}

		public final double debug(double d) {
			err.print(d);
			if (autoFlush) flush();
			return d;
		}

		public final double debug(double d, int length) {
			if (d < 0) {
				err.print('-');
				d = -d;
			}
			d += Math.pow(10, -length) / 2;
			err.print((long)d);
			err.print('.');
			d -= (long)d;
			for (int i = 0;i < length;++ i) {
				d *= 10;
				err.print((int)d);
				d -= (int)d;
			}
			if (autoFlush) flush();
			return d;
		}

		public final float debug(float f) {
			err.print(f);
			if (autoFlush) flush();
			return f;
		}

		public final int debug(int i) {
			err.print(i);
			if (autoFlush) flush();
			return i;
		}

		public final long debug(long l) {
			err.print(l);
			if (autoFlush) flush();
			return l;
		}

		public final Object debug(Object obj) {
			if (obj.getClass().isArray()) {
				if (obj instanceof boolean[][]) debug(obj, "\n", " ");
				else if (obj instanceof byte[][]) debug(obj, "\n", " ");
				else if (obj instanceof short[][]) debug(obj, "\n", " ");
				else if (obj instanceof int[][]) debug(obj, "\n", " ");
				else if (obj instanceof long[][]) debug(obj, "\n", " ");
				else if (obj instanceof float[][]) debug(obj, "\n", " ");
				else if (obj instanceof double[][]) debug(obj, "\n", " ");
				else if (obj instanceof char[][]) debug(obj, "\n", " ");
				else if (obj instanceof Object[][]) debug(obj, "\n", " ");
				else debug(obj, " ");
			} else {
				err.print(obj);
				if (autoFlush) flush();
			}
			return obj;
		}

		public final String debug(String s) {
			err.print(s);
			if (autoFlush) flush();
			return s;
		}

		public final Object debug(Object array, String... parse) {
			debug(array, 0, parse);
			if (autoFlush) flush();
			return array;
		}

		private final Object debug(Object array, int check, String... parse) {
			if (check >= parse.length) {
				if (array.getClass().isArray()) throw new IllegalArgumentException("not equal dimension");
				debug(array);
				return array;
			}
			String str = parse[check];
			if (array instanceof Object[]) {
				Object[] obj = (Object[]) array;
				if (obj.length == 0) return array;
				debug(obj[0], check + 1, parse);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i], check + 1, parse);
				}
				return array;
			}
			if (array instanceof Collection) {
				Iterator<?> iter = ((Collection<?>)array).iterator();
				if (!iter.hasNext()) return array;
				debug(iter.next(), check + 1, parse);
				while(iter.hasNext()) {
					debug(str);
					debug(iter.next(), check + 1, parse);
				}
				return array;
			}
			if (!array.getClass().isArray()) throw new IllegalArgumentException("not equal dimension");
			if (check != parse.length - 1) throw new IllegalArgumentException("not equal dimension");
			if (array instanceof boolean[]) {
				boolean[] obj = (boolean[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else if (array instanceof byte[]) {
				byte[] obj = (byte[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
				return array;
			} else if (array instanceof short[]) {
				short[] obj = (short[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else if (array instanceof int[]) {
				int[] obj = (int[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else if (array instanceof long[]) {
				long[] obj = (long[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else if (array instanceof float[]) {
				float[] obj = (float[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else if (array instanceof double[]) {
				double[] obj = (double[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else if (array instanceof char[]) {
				char[] obj = (char[]) array;
				if (obj.length == 0) return array;
				debug(obj[0]);
				for (int i = 1;i < obj.length;++ i) {
					debug(str);
					debug(obj[i]);
				}
			} else throw new AssertionError();
			return array;
		}

		public final Object[] debug(String parse, Object... args) {
			debug(args[0]);
			for (int i = 1;i < args.length;++ i) {
				debug(parse);
				debug(args[i]);
			}
			return args;
		}

		public final Object[] debugf(String format, Object... args) {
			err.printf(format, args);
			if (autoFlush) flush();
			return args;
		}

		public final Object debugf(Locale l, String format, Object... args) {
			err.printf(l, format, args);
			if (autoFlush) flush();
			return args;
		}

		public final void debugln() {
			err.println();
			if (autoFlush) flush();
		}

		public final boolean debugln(boolean b) {
			err.println(b);
			if (autoFlush) flush();
			return b;
		}

		public final Object debugln(boolean b, Object t, Object f) {
			return b ? debugln(t) : debugln(f);
		}

		public final char debugln(char c) {
			err.println(c);
			if (autoFlush) flush();
			return c;
		}

		public final char[] debugln(char[] s) {
			err.println(s);
			if (autoFlush) flush();
			return s;
		}

		public final double debugln(double d) {
			err.println(d);
			if (autoFlush) flush();
			return d;
		}

		public final double debugln(double d, int length) {
			debug(d, length);
			debugln();
			return d;
		}

		public final float debugln(float f) {
			err.println(f);
			if (autoFlush) flush();
			return f;
		}

		public final int debugln(int i) {
			err.println(i);
			if (autoFlush) flush();
			return i;
		}

		public final long debugln(long l) {
			err.println(l);
			if (autoFlush) flush();
			return l;
		}

		public final Object debugln(Object obj) {
			debug(obj);
			debugln();
			return obj;
		}

		public final String debugln(String s) {
			err.println(s);
			if (autoFlush) flush();
			return s;
		}

		public final Object debugln(Object array, String... parse) {
			debug(array, parse);
			debugln();
			return array;
		}

		public final void flush() {
			out.flush();
			err.flush();
		}
	}
}
