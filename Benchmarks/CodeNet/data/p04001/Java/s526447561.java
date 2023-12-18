import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はMainC

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMainC sc = new FastScannerMainC(System.in);

		try {
			String S = sc.nextLine().trim();
			int N = S.length();
			String ans = (String) S.subSequence(0, 1);
			ArrayList<Long> arr = new ArrayList<Long>();

			/*
			for (int i = 0; i < N; i++) {
				//System.out.println(S.subSequence(i, i + 1));
				A[i] = (String) S.subSequence(i, i + 1);
			}
			*/

			dfs(ans, S, N, 1, arr);
			long printans = 0;
			for (int i = 0; i < arr.size(); i++) {
				printans += arr.get(i);
			}

			//System.out.println("----");
			System.out.println(printans);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dfs(String Ans, String S, int N, int next, ArrayList<Long> arr) {
		if (next == N) {
			//System.out.println(Ans);
			long ansn = 0;
			String[] plus = Ans.split(",", -1);
			for (int i = 0; i < plus.length; i++) {
				//	System.out.println(" " + Integer.valueOf(plus[i]));
				ansn += Long.valueOf(plus[i]);
			}
			arr.add(ansn);
			//System.out.println(ansn);

		} else {
			String Ans1 = Ans + "," + (String) S.subSequence(next, next + 1);
			dfs(Ans1, S, N, next + 1, arr);

			String Ans2 = Ans + (String) S.subSequence(next, next + 1);
			dfs(Ans2, S, N, next + 1, arr);

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
