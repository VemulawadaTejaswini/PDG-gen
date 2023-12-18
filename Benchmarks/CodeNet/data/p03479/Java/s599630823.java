
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {}
	 * System.out.println();
	 * HashMap<Integer, Integer> hm = new HashMap<>();
	 * int[] s = new int[M];
	 * ArrayDeque<Integer> deq = new ArrayDeque<>();
	 *
	 * 文字列のSort
	 * String sorted = S.chars()
						.sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
						.toString();
	 */
	public void run() {
		FastScannerMainC sc = new FastScannerMainC(System.in);

		try {
			//String S = sc.nextLine().trim();
			long X = sc.nextLong();
			long Y = sc.nextLong();
			//int[] a = new int[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();
			//for (int i = 0; i < N; i++) {}
			//for (char i = 'a'; i <= 'z'; i++) {}

			long multiple = 2;
			long count = 1;
			long tmp = X;

			while (true) {
				tmp *= multiple;
				if (tmp > Y) {
					break;
				} else {
					count++;
				}
			}

			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMainC {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainC(InputStream in) {
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
