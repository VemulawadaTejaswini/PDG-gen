import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * @author mj
 *
 */
public class Main implements Runnable { //クラス名はMain2

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain2 sc = new FastScannerMain2(System.in);

		try {
			long N = sc.nextInt();
			long A = sc.nextInt();
			long B = sc.nextInt();
			long ans = 0;

			if (A == 0 || (A == 0 && B == 0)) {
				ans = 0;
			} else {
				long sumA = 0;
				long num = N / (A + B);
				long num2 = N % (A + B);

				sumA += num * A;

				if (num2 > A) {
					sumA += A;
				} else {
					sumA += num2;
				}

				ans = sumA;

				if (A == 0) {
					ans = 0;
				}
			}

			System.out.println(ans);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMain2 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain2(InputStream in) {
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
