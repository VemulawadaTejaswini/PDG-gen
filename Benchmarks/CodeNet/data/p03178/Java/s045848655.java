
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	Long MOD = 1000000007L;
	long[][][] dp;
	boolean[][][] dp2;

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
			int D = sc.nextInt();
			String N = sc.nextLine().trim();
			char[] n = new char[N.length()];

			for (int i = 0; i < N.length(); i++) {
				n[i] = N.charAt(i);
			}

			/*
			 * 1. Nの桁数
			 * 2. 下の桁で全ての数字を使えるかどうか//0:制限有り、1:制限なし
			 * 3. Dの余り
			 */
			/*
			long[][][] dp = new long[N.length() + 1][2][D];
			
			dp[0][0][0] = 1;
			
			for (int i = 0; i < N.length(); i++) {
				int now = n[i] - '0';
				for (int j = 0; j < 2; j++) {
					for (int k = 0; k < D; k++) {
						for (int l = 0; l <= (j == 0 ? now : 9); l++) {
							int nj = (j == 0 && l == now ? 0 : 1);
							int nk = (k + l) % D;
							dp[i + 1][nj][nk] += dp[i][j][k];
							dp[i + 1][nj][nk] %= MOD;
						}
					}
				}
			}
			
			System.out.println(dp[N.length()][0][0] + dp[N.length()][1][0] - 1);
			*/

			//3番目の配列はsum%Dを保持するため、Dで足りる
			dp = new long[N.length() + 1][2][D];
			dp2 = new boolean[N.length() + 1][2][D];

			//0は含まないため、-1
			long ans = 0;
			ans = rec(N, D, n, 0, true, 0) - 1;

			System.out.println(ans);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private long rec(String N, int D, char[] n, int k, boolean tight, int sum) {
		//System.out.println("k:" + k + " ,sum:" + sum);
		if (k == N.length()) {
			if (sum % D == 0) {
				return 1;
			} else {
				return 0;
			}
		}

		int x = n[k] - '0';
		int r = tight ? x : 9;
		int t = tight ? 0 : 1;
		long res = 0;

		//dp[k][t][sum]>0とやるとTLE
		if (dp2[k][t][sum]) {
			//System.out.println("k:" + k + " ,t:" + t + " ,sum:" + sum);
			//System.out.println("dp:" + dp[k][t][sum]);
			return dp[k][t][sum];
		}

		//k+1桁目以降に責任転嫁し、その結果をまとめ上げる
		//tight=trueなら0~xまでしか遷移できないが
		//falseなら0~9まで遷移できる
		for (int i = 0; i <= r; i++) {
			//tight && i==rは
			//下位の桁に責任転嫁するとき、k桁目で自由かどうかを渡している
			//k-1桁目までで既にtight=falseなら &&演算を行った時点で強制的にfalse(自由)になる。
			//しかし、k-1桁目まででtight=trueかつ、i==r(k+1桁目以降も自由じゃない)ときはtrueになってしまう。
			if (i == r && tight) {
				res += rec(N, D, n, k + 1, true, (sum + i) % D);
			} else {
				res += rec(N, D, n, k + 1, false, (sum + i) % D);
			}

			dp[k][t][sum] = res % MOD;
			dp2[k][t][sum] = true;
			res %= MOD;

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

	/*
	 * HashmapのSort
	 * hmはhashmap
	 * keyvalは"key" or "val"を指定して
	 * ascdescは"asc" or "desc"を指定して
	 */
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
