
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
public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMainB sc = new FastScannerMainB(System.in);

		try {
			String S = sc.nextLine().trim();
			int N = S.length();
			int hN = N / 2;

			int N1 = (N - 1) / 2;
			int N2 = (N + 3) / 2;
			//int[] a = new int[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();
			//for (int i = 0; i < N; i++) {}

			boolean con1 = true;
			boolean con2 = true;
			boolean con3 = true;

			for (int i = 0; i < hN; i++) {
				String s1 = S.substring(i, i + 1);
				String s2 = S.substring(N - i - 1, N - i);
				//System.out.println("s1:" + s1 + " s2:" + s2);
				if (!s1.equals(s2)) {
					con1 = false;
				}
			}

			for (int i = 0; i < N1; i++) {
				String s1 = S.substring(i, i + 1);
				String s2 = S.substring(N1 - i - 1, N1 - i);
				//System.out.println("s1:" + s1 + " s2:" + s2);
				if (!s1.equals(s2)) {
					con2 = false;
				}
			}

			int count = 0;
			for (int i = N2 - 1; i < N; i++) {
				String s1 = S.substring(i, i + 1);
				String s2 = S.substring(N - count - 1, N - count);
				//System.out.println("s1:" + s1 + " s2:" + s2);
				if (!s1.equals(s2)) {
					con3 = false;
				}
				count++;
			}

			if (con1 && con2 && con3) {
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
class FastScannerMainB {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainB(InputStream in) {
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
