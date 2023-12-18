
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
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] ss = new char[H][W];
			int[][] left = new int[H][W];
			int[][] right = new int[H][W];
			int[][] up = new int[H][W];
			int[][] down = new int[H][W];
			for (int i = 0; i < H; i++) {
				String S = sc.nextLine().trim();
				for (int j = 0; j < W; j++) {
					ss[i][j] = S.charAt(j);
				}
			}

			int count = 0;
			//left
			for (int i = 0; i < H; i++) {
				count = 0;
				for (int j = 0; j < W; j++) {
					if (ss[i][j] == '#') {
						count = 0;
					} else {
						count++;
						left[i][j] = count;
					}
				}
			}
			//right
			for (int i = 0; i < H; i++) {
				count = 0;
				for (int j = W - 1; j >= 0; j--) {
					if (ss[i][j] == '#') {
						count = 0;
					} else {
						count++;
						right[i][j] = count;
					}
				}
			}
			//up
			for (int j = 0; j < W; j++) {
				count = 0;
				for (int i = 0; i < H; i++) {
					if (ss[i][j] == '#') {
						count = 0;
					} else {
						count++;
						up[i][j] = count;
					}
				}
			}

			//down
			for (int j = 0; j < W; j++) {
				count = 0;
				for (int i = H - 1; i >= 0; i--) {
					if (ss[i][j] == '#') {
						count = 0;
					} else {
						count++;
						down[i][j] = count;
					}
				}
			}

			/*
			for (int i = 0; i < H; i++) {
				System.out.println(Arrays.toString(ss[i]));
			}
			
			for (int i = 0; i < H; i++) {
				//System.out.println("l : " + Arrays.toString(left[i]));
				//System.out.println("r : " + Arrays.toString(right[i]));
				//System.out.println("u : " + Arrays.toString(up[i]));
				System.out.println("d : " + Arrays.toString(down[i]));
			}
			*/

			long ans = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					long val = left[i][j] + right[i][j] + up[i][j] + down[i][j] - 3;
					ans = Math.max(ans, val);
				}
			}

			System.out.println(ans);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
