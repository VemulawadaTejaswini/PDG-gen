

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
		FastScannerMain1 sc = new FastScannerMain1(System.in);

		try {
			String S = sc.nextLine().trim();
			String T = sc.nextLine().trim();

			int[] t = new int[T.length()];

			int seq_question = 0;
			int question = 0;

			for (int i = 0; i < S.length(); i++) {

				if (S.substring(i, i + 1).equals("?")) {
					seq_question++;
					question++;
				} else {
					seq_question = 0;
				}
			}

			boolean restore = false;

			int sl = 0;
			int slm = 0;
			int lastposition = -1;
			int count = 0;
			Investigation: while (true) {

				sl = slm;
				//System.out.println(count++ + " slm:" + slm + " sl:" + sl);
				T: for (int i = 0; i < T.length(); i++) {
					if (S.substring(sl, sl + 1).equals("?") || T.substring(i, i + 1).equals(S.substring(sl, sl + 1))) {
						if (i == T.length() - 1) {
							lastposition = sl;
							restore = true;
							break T;
						}
						sl++;
					} else {
						break T;
					}
				}
				slm++;

				//調べられる文字を越したらBreak
				if (slm > (S.length() - T.length())) {
					break Investigation;
				}
			}

			//System.out.println(restore);
			//System.out.println(lastposition);
			if (restore) {
				//Tの開始位置
				int start_T = lastposition - T.length() + 1;
				//T開始前までのsubstring
				String SAns = S.substring(0, start_T);
				SAns += T;
				//System.out.println(SAns);
				SAns = SAns.replace("?", "a");

				System.out.println(SAns);
			} else {
				System.out.println("UNRESTORABLE");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMain1 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain1(InputStream in) {
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
