import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はNextPrime

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerNextPrime sc = new FastScannerNextPrime(System.in);

		try {
			//String S = sc.nextLine().trim();
			//long N = sc.nextlong();
			int X = sc.nextInt();

			PrimeNumber primeNumber = new PrimeNumber();

			while (true) {
				if (primeNumber.judgePrime(X))
					break;
				X++;
			}

			System.out.println(X);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class PrimeNumber {
	/**
	 * 素数の場合、Trueを返す
	 * @param N
	 * @return
	 */
	public boolean judgePrime(int N) {
		for (int i = 2; i * i < N; i++) {
			if (N % i == 0)
				return false;
		}
		return true;
	}
}

//高速なScanner
class FastScannerNextPrime {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerNextPrime(InputStream in) {
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
