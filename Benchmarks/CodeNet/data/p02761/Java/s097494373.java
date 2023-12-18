import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain3

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain3 sc = new FastScannerMain3(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] s = new int[M];
			int[] c = new int[M];
			int ans = -1;
			boolean judge = true;
			HashMap<Integer, Integer> hm = new HashMap<>();

			for (int i = 0; i < M; i++) {
				int si = sc.nextInt();
				int ci = sc.nextInt();

				s[i] = si;
				c[i] = ci;
				if (N != 1 && si == 1 && ci == 0) {
					judge = false;
					break;
				}
				if (hm.containsKey(si)) {
					if (hm.get(si) != ci) {
						judge = false;
						break;
					}
				} else {
					hm.put(si, ci);
				}
			}

			if (judge) {
				ans = 0;
				for (int n = 1; n <= N; n++) {
					//System.out.println("n " + n);
					if (n == 1 && !hm.containsKey(n) && M != 0) {
						ans += (int) (1 * (Math.pow(10, (N - n))));
					} else if (hm.containsKey(n)) {
						ans += (int) (hm.get(n) * (Math.pow(10, (N - n))));
					}
				}

			}
			//System.out.println(judge);
			System.out.println(ans);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMain3 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain3(InputStream in) {
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
