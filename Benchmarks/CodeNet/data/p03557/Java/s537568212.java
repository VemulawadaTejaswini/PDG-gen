import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はSnukeFestival

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerSnukeFestival sc = new FastScannerSnukeFestival(System.in);

		try {
			//String S = sc.nextLine().trim();
			int N = sc.nextInt();
			double[] a = new double[N];
			double[] b = new double[N];
			double[] c = new double[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
			}

			for (int i = 0; i < N; i++) {
				b[i] = sc.nextLong();
			}

			for (int i = 0; i < N; i++) {
				c[i] = sc.nextLong();
			}

			Arrays.sort(a);
			Arrays.sort(c);

			long ans = 0;
			int numa = 0;
			int numc = 0;
			for (int i = 0; i < N; i++) {
				/**
				 * binarySearchメソッドの戻り値は、
				 * listの中に該当する値があるときはその値の格納場所を返す。indexは0から始まる。
				 *
				 * 該当する値がないときは、その値が格納されるであろう場所の符号をマイナスにし、その値にさらに1を引いた値が返される。
				 * 符号をマイナスにするだけであると先頭に格納されたとき(index=0)は該当する値があるときとないときでは区別できなくなってしまうため、1を引く必要がある。
				 */
				//System.out.println(b[i]);
				//System.out.println(Arrays.binarySearch(a, b[i] - 0.1));
				numa = Arrays.binarySearch(a, b[i] - 0.1);
				//System.out.println(Arrays.binarySearch(c, b[i] + 0.1));
				numc = Arrays.binarySearch(c, b[i] + 0.1);

				numa = 0 - (numa + 1);
				numc = 0 - (numc + 1);

				//System.out.println(numa + " " + numc);

				if (numa > 0 && numc < N) {
					ans += numa * (N - numc);
				}
				//System.out.println("ans " + ans);
			}

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerSnukeFestival {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerSnukeFestival(InputStream in) {
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
