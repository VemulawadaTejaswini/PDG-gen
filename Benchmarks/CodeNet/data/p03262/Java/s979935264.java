
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);
	static int mod = 1000000000 + 7; //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			/**
			 * 2の累乗一覧
			 * http://www.gaoshukai.com/20/06/0022/
			 *
			 * Bit 全探索
				//Nは要素数 (bit全探索)
				//計算量はO(2^N) Nが0-20~25 (30は多分無理)くらいまでしか使えない
				Out: for (int bit = 0; bit < (1 << N); bit++) {
					out.println(Integer.toBinaryString(bit));
					In: for (int j = 0; j < N; j++) {
						out.println(1 & (bit >> j));
						//1が立ってれば対象。例えば101だったら1桁目と3桁目は選ばれている
						//「二進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する」
						if ((1 & bit >> j) == 1) {
						}
					}
				}
			 *
			 * 表示系
			 *   out.println();
			 *   out.println("i:" + i + " ,j:" + j);
			 *   out.println(Arrays.toString(A));
			 *
			 * Sort (Arrays)
			 *  Integer[] A = new Integer[N];
			 *    Desc : Arrays.sort(A , Collections.reverseOrder());
			 *    Asc  : Arrays.sort(A);
			 *
			 * 定義系
			 *   int[] s = new int[M];
			 *   ArrayDeque<Integer> deq= new ArrayDeque<>();//先頭と末尾への要素の追加・先頭と末尾の要素の取り出しと削除が定数時間
			 *   ArrayList<Integer> arr = new ArrayList<Integer>();//定数時間
			 *   HashMap<Integer,Integer> hm = new HashMap<>(); //定数時間
			 *
			 *   //要素の追加と、最小の要素の取り出しと削除が対数時間
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>();//昇順
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //逆順。降順
			 *
			 *   TreeSet<Integer> ts = new TreeSet<>();//対数時間(重複はできない)
			 *
			 * 文字系
			 *   String S = sc.next().trim();
			 *   for (char i = 'a'; i <= 'z'; i++) {}
			 *   S.substring(1,2);//あいうえお → い
			 *   S.substring(0,1); // 1文字目をとりたいとき
			 *   文字列のSort
			 *    String sorted = S.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append) .toString();
			 */
			// long l = sc.nextLong();
			//String S = sc.next().trim();
			//int N = sc.nextInt();
			//int[] A = new int[N];
			int N = sc.nextInt();
			long X = sc.nextLong();
			long[] x = new long[N];

			for (int i = 0; i < N; i++) {
				x[i] = sc.nextLong();
			}
			long ini = 0;
			if (N >= 2) {
				ini = getGcd(Math.abs(X - x[0]), Math.abs(X - x[1]));

				for (int i = 2; i < N; i++) {
					ini = getGcd(ini, Math.abs(X - x[i]));
				}
			} else {
				ini = Math.abs(X - x[0]);
			}

			out.println(ini);
			//Flushしてからcloseするのが無難
			out.flush();
			out.close();

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public static long getGcd(long a, long b) {
		if (b == 0)
			return a;
		return getGcd(b, a % b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return 最小公倍数(a=2,b=3であれば6を返却)
	 */
	public static long lcm(long a, long b) {
		return a * b / getGcd(a, b);
	}

	/**
	 *
	 * @param a 2つ以上の数字
	 * @return 配列全ての最小公倍数
	 */
	public static long lcms(long[] a) {
		long ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = lcm(ans, a[i]);
		}
		return ans;
	}

	/**
	 * 配列全ての最大公約数を求める。
	 */
	public static long getGcds(int n, long[] a) {
		long cmd = a[0];
		//最大公約数を前から順次計算していく。
		for (int i = 1; i < n; i++) {
			cmd = getGcd(cmd, a[i]);
		}
		return cmd;
	}

	/**<h1>拡張ユークリッド互除法</h1>
	 * <p>ax + by = gcd(a, b) となる a, b の最大公約数と解 x, y を求める。</p>
	 * @param a ： 数値１(>0)
	 * @param b ： 数値２(>0)
	 * @return<b>int[]</b> ： {[0]:gcd, [1]:x, [2]:y}：最大公約数(なし=1 [互いに素])と解 x, y
	 */
	public static final int[] extgcd(int a, int b) {
		int x0 = 1, x1 = 0;
		int y0 = 0, y1 = 1;

		while (b != 0) {
			int q = a / b;
			int r = a % b;
			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;

			a = b;
			b = r;
			x0 = x1;
			x1 = x2;
			y0 = y1;
			y1 = y2;
		}

		return new int[] { a, x0, y0 };
	}

	class Exm implements Comparable<Exm> {

		public int a;
		public int b;

		@Override
		public int compareTo(Exm o) {

			//return this.a - o.a;//昇順
			// return o.a - this.a;//降順

			//複数項目で並び替え。aの降順、aが同じならbの降順
			if (this.a == o.a) {
				return o.b - this.b;
			} else {
				return o.a - this.a;
			}
		}
	}

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す(mod無しなので、大きい値には使用できない桁溢れする)
	 */
	long calcCombination(int n, int m) {
		if (n < m || m < 0) {
			throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
		}
		long c = 1;
		m = (n - m < m ? n - m : m);
		for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
			c *= ns;
			c /= ms;
		}
		return c;
	}

	/*
	 * 使用するときはModに注意。Global変数を参照
	 */
	public static long comb(long a, long b) {
		if (a < b)
			return 0;
		long res = 1;
		long inv = pow(fact(Math.min(b, a - b)), mod - 2);
		for (long i = a; i > a - Math.min(b, a - b); i--) {
			res *= i;
			res %= mod;
		}
		res *= inv;
		res %= mod;
		return res;
	}

	public static long pow(long x, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				res *= x;
				res %= mod;
			}
			x *= x;
			x %= mod;
			n >>= 1;
		}
		return res;
	}

	public static long fact(long n) {
		long res = 1;
		while (n > 0) {
			res *= n;
			res %= mod;
			n--;
		}
		return res;
	}

	// 下記はオーバーフローでExceptionをキャッチするよう
	@SuppressWarnings("unused")
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	@SuppressWarnings("unused")
	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	@SuppressWarnings("unused")
	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	@SuppressWarnings("unused")
	private int add(int a, int b) {
		int ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	/*
	 * HashmapのSort
	 * hmはhashmap
	 * keyvalは"key" or "val"を指定して
	 * ascdescは"asc" or "desc"を指定して
	 */
	@SuppressWarnings("unused")
	private List<Entry<Integer, Integer>> sortHashMapValue(HashMap<Integer, Integer> hm, String keyval,
			String ascdesc) {
		// 1.Map.Entryのリストを作成する
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(hm.entrySet());

		// 2.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				if (keyval.equals("val")) {
					if (ascdesc.equals("asc")) {
						// 昇順(value)
						return obj1.getValue().compareTo(obj2.getValue());
					} else {
						// 降順(value)
						return obj2.getValue().compareTo(obj1.getValue());
					}
				} else {
					if (ascdesc.equals("asc")) {
						// 昇順(value)
						return obj1.getKey().compareTo(obj2.getKey());
					} else {
						// 降順(value)
						return obj2.getKey().compareTo(obj1.getKey());
					}
				}
			}
		});
		/*
		// 3. ループで要素順に値を取得する
		for (Entry<Integer, Integer> entry : list_entries) {
			out.println(entry.getKey() + " : " + entry.getValue());
		}
		*/
		return list_entries;
	}

	// 高速なScanner
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
}
