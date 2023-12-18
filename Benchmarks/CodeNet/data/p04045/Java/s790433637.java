

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
public class Main implements Runnable { //クラス名はMain

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 256 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		try {
			FastScannerMainC sc = new FastScannerMainC(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] D = new int[K];

			for (int i = 0; i < K; i++) {
				D[i] = sc.nextInt();
			}

			dfs(N, N, D);

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

	private void dfs(int sum, int N, int[] D) {
		try {
			boolean ans = true;
			//System.out.println(sum);
			for (int i = 0; i < D.length; i++) {
				//System.out.println(D[i]);
				if (String.valueOf(sum).contains(String.valueOf(D[i]))) {
					ans = false;
					break;
				}
			}
			if (ans) {
				System.out.println(sum);
			} else {
				dfs(sum + 1, N, D);
			}
		} catch (

		Exception e) {
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
