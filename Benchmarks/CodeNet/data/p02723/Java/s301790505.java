
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
	 * for (char i = 'a'; i <= 'z'; i++) {}
	 */
	public void run() {
		FastScannerMainA sc = new FastScannerMainA(System.in);

		try {
			String S = sc.nextLine().trim();
			//int[] a = new int[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();
			//for (int i = 0; i < N; i++) {}
			//for (char i = 'a'; i <= 'z'; i++) {}

			boolean s34 = false;
			boolean s56 = false;

			//System.out.println(S.substring(2, 3));
			//System.out.println(S.substring(3, 4));
			if (S.substring(2, 3).equals(S.substring(3, 4))) {
				s34 = true;
			}

			if (S.substring(4, 5).equals(S.substring(5, 6))) {
				s56 = true;
			}

			if (s34 && s56) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMainA {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainA(InputStream in) {
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
