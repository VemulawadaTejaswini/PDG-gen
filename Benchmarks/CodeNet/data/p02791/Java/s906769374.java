import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はLowElements

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerLowElements sc = new FastScannerLowElements(System.in);

		int N = sc.nextInt();
		int h[] = new int[N];

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		int count = N;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				if (h[j] < h[i]) {
					count--;
					break;
				}
			}
		}

		System.out.println(count);

	}
}

//高速なScanner
class FastScannerLowElements {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerLowElements(InputStream in) {
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
