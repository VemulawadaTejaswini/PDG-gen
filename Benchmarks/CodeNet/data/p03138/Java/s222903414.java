
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

	static int mod = 1000000000 + 7; //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	long[][] dp;
	boolean[][] dp2;

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc = new InputReader(System.in);

		try {
			/**
			 * Bit 全探索
				//Nは要素数 (bit全探索)
				//計算量はO(2^N) Nが0-20~25 (30は多分無理)くらいまでしか使えない
				Out: for (int bit = 0; bit < (1 << N); bit++) {
					System.out.println(Integer.toBinaryString(bit));
					In: for (int j = 0; j < N; j++) {
						System.out.println(1 & (bit >> j));
						//1が立ってれば対象。例えば101だったら1桁目と3桁目は選ばれている
						//「二進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する」
						if ((1 & bit >> j) == 1) {
						}
					}
				}
			 *
			 * 表示系
			 *   System.out.println();
			 *   System.out.println("i:" + i + " ,j:" + j);
			 *   System.out.println(Arrays.toString(A));
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
			long K = sc.nextLong();
			long[] A = new long[N];
			int[] cnt = new int[50];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
				for (int j = 0; j < 50; j++) {
					if ((1 & A[i] >> j) == 1) {
						cnt[49 - j]++;
					}
				}
			}

			int[] k = new int[50];
			String kb = Long.toBinaryString(K);
			//out.println(kb + " " + kb.length());
			for (int j = 0; j < kb.length(); j++) {
				k[49 - kb.length() + j + 1] = Integer.valueOf(kb.substring(j, j + 1));
			}

			//out.println("cnt:" + Arrays.toString(cnt));
			//out.println("k:" + Arrays.toString(k));

			dp = new long[2][50];
			dp2 = new boolean[2][50];

			rec(N, k, cnt, 0, true);

			//out.println("dp0:" + Arrays.toString(dp[0]));
			//out.println("dp1:" + Arrays.toString(dp[1]));

			StringBuffer dp0 = new StringBuffer();
			StringBuffer dp1 = new StringBuffer();
			for (int j = 0; j < 50; j++) {
				dp0.append(dp[0][j]);
				dp1.append(dp[1][j]);
			}

			//out.println(dp0.toString());

			long dp0long = Long.parseLong(dp0.toString(), 2);
			long dp1long = Long.parseLong(dp1.toString(), 2);

			//out.println(dp0long);
			//out.println(dp1long);

			long x = dp0long > dp1long ? dp0long : dp1long;

			long ans = 0;
			for (int i = 0; i < N; i++) {
				ans += x ^ A[i];
			}

			out.println(ans);
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

	private void rec(int N, int[] k, int[] cnt, int now, boolean tight) {

		int x = k[now];
		int r = tight ? x : 1;
		int t = tight ? 0 : 1;

		if (dp2[t][now]) {
			return;
		}

		if (tight) {
			if (x == 0) {
				dp[t][now] = 0;
			} else {
				if (cnt[now] < (N - cnt[now])) {
					dp[t][now] = 1;
				} else {
					dp[t][now] = 0;
					tight = false;
				}
			}
		} else {
			if (cnt[now] < (N - cnt[now])) {
				dp[t][now] = 1;
				dp[0][now] = 1;
			} else {
				dp[t][now] = 0;
				dp[0][now] = 0;
			}
		}
		dp2[t][now] = true;

		if (now == 49) {
			return;
		} else {
			for (int i = 0; i <= r; i++) {
				if (i == r && tight) {
					rec(N, k, cnt, now + 1, true);
				} else {
					rec(N, k, cnt, now + 1, false);
				}
			}
		}
	}

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
			System.out.println(entry.getKey() + " : " + entry.getValue());
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
