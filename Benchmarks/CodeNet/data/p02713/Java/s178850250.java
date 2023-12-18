
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	static int mod = 1000000000 + 7; //10^9+7

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain1 sc = new FastScannerMain1(System.in);

		try {
			/**
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
			 *   String S = sc.nextLine().trim();
			 *   for (char i = 'a'; i <= 'z'; i++) {}
			 *   S.substring(1,2);//あいうえお → い
			 *   S.substring(0,1); // 1文字目をとりたいとき
			 *   文字列のSort
			 *    String sorted = S.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append) .toString();
			 */
			// long l = sc.nextLong();
			//int N = sc.nextInt();
			//int[] A = new int[N];
			//String S = sc.nextLine().trim();
			int K = sc.nextInt();
			long ans = 0;
			for (int a = 1; a <= K; a++) {
				for (int b = 1; b <= K; b++) {
					for (int c = 1; c <= K; c++) {
						//System.out.println("a:" + a + " ,b:" + b + " ,c:" + c);
						long ab = Gcd.getGcd(a, b);
						long abc = Gcd.getGcd(c, ab);
						ans += abc;
					}
					//A[i] = sc.nextInt();

					//Gcd.getGcd(a, b);
				}
			}

			// System.out.println(Arrays.toString(A));

			System.out.println(ans);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int add(int a, int b) {
		int ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

}

/**
 * 最大公約数 / 最小公倍数を求める
 */
class Gcd {
	/**
	 * ユークリッドの互除法で最大公約数を求める
	 *
	 * ユークリッドの互除法の使い方
	 * 	a(割られる数) = b(割る数) * q(商) + r(余り)
	 * 	【1】大きい数を小さい数で割る場合の商と余りの関係式を作る。
	 * 	3231=2853⋅1+378
	 * 	【2】割る数（2853）を余り（378）で割る場合の関係式を作る。
	 * 	2853=378⋅7+207
	 * 	【3】【2】と同様の計算を余りが出なくなる（割り切れる）まで続ける。
	 * 	378=207⋅1+171
	 * 	207=171⋅1+36
	 * 	171=36⋅4+27
	 * 	36=27⋅1+9
	 * 	27=9⋅3
	 * 	【4】最後の式の「割る数」が2つの数の最大公約数となる。
	 * 	最後の式の「割る数」は9なので、3231と2853の最大公約数は9です。
	 */
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
	public long getGcds(int n, long[] a) {
		long cmd = a[0];
		//最大公約数を前から順次計算していく。
		for (int i = 1; i < n; i++) {
			cmd = this.getGcd(cmd, a[i]);
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

// 高速なScanner
class FastScannerMain1 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain1(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
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
}
