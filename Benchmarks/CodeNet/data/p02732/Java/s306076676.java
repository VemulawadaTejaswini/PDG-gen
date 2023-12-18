

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMainD sc = new FastScannerMainD(System.in);

		try {
			//String S = sc.nextLine().trim();
			int N = sc.nextInt();
			int[] a = new int[N];
			HashMap<Integer, Integer> hm = new HashMap<>();
			HashMap<Integer, Integer> hm2 = new HashMap<>();
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();

				if (hm.containsKey(a[i])) {
					int count = hm.get(a[i]);
					count++;
					hm.put(a[i], count);
				} else {
					hm.put(a[i], 1);
				}
			}

			//System.out.println(Arrays.toString(val));

			long ans = 0;
			for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
				//System.out.println(entry.getKey() + " : " + entry.getValue());
				if (entry.getValue() >= 2) {
					ans += calcCombination(entry.getValue(), 2);
				}
			}

			for (int i = 0; i < N; i++) {
				if (hm.get(a[i]) >= 3) {
					System.out.println(ans - calcCombination(hm.get(a[i]), 2) + calcCombination(hm.get(a[i]) - 1, 2));
				} else if (hm.get(a[i]) == 2) {
					System.out.println(ans - calcCombination(hm.get(a[i]), 2));
				} else {
					System.out.println(ans);
				}
			}

			//System.out.println(ans);

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

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
}

//高速なScanner
class FastScannerMainD {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD(InputStream in) {
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
