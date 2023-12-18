

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
public class Main implements Runnable { //クラス名はMonstersBattleRoyale

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		try {
			FastScannerMonstersBattleRoyale sc = new FastScannerMonstersBattleRoyale(System.in);
			int N = sc.nextInt();
			long[] A = new long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			Gcd gcd = new Gcd();
			System.out.println(gcd.getGcds(N, A));

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}

class Gcd {

	/**
	 * ユークリッドの互除法で最大公約数を求める
	 */
	public long getGcd(long a, long b) {
		if (b == 0)
			return a;
		return getGcd(b, a % b);
	}

	/**
	 * 配列全ての最大公約数を求める。
	 */
	public long getGcds(int n, long[] a) {
		long cmd = a[0];
		//最大公約数を前から順次計算していく。
		for (int i = 1; i < n; i++) {
			cmd = this.getGcd(cmd, a[i]);
		}
		return cmd;
	}

}

//高速なScanner
class FastScannerMonstersBattleRoyale {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMonstersBattleRoyale(InputStream in) {
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
