import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain2

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain2 sc = new FastScannerMain2(System.in);

		try {
			int[][] bingo = new int[3][3];
			int[][] bingoresult = new int[3][3];

			for (int i = 0; i < 3; i++) {
				bingo[i][0] = sc.nextInt();
				bingo[i][1] = sc.nextInt();
				bingo[i][2] = sc.nextInt();
			}

			int N = sc.nextInt();
			int[] ans = new int[N];

			for (int n = 0; n < N; n++) {
				ans[n] = sc.nextInt();
				for (int i = 0; i < 3; i++) {
					if (ans[n] == bingo[i][0]) {
						bingoresult[i][0] = 1;
					} else if (ans[n] == bingo[i][1]) {
						bingoresult[i][1] = 1;
					} else if (ans[n] == bingo[i][2]) {
						bingoresult[i][2] = 1;
					}
				}
			}

			//System.out.println(Arrays.deepToString(bingoresult));

			String ansprint = "No";
			if ((bingoresult[0][0] == 1 && bingoresult[0][1] == 1 && bingoresult[0][2] == 1)
					|| (bingoresult[1][0] == 1 && bingoresult[1][1] == 1 && bingoresult[1][2] == 1)
					|| (bingoresult[2][0] == 1 && bingoresult[2][1] == 1 && bingoresult[2][2] == 1)) {
				ansprint = "Yes";
			} else if ((bingoresult[0][0] == 1 && bingoresult[1][0] == 1 && bingoresult[2][0] == 1)
					|| (bingoresult[0][1] == 1 && bingoresult[1][1] == 1 && bingoresult[2][1] == 1)
					|| (bingoresult[0][2] == 1 && bingoresult[1][2] == 1 && bingoresult[2][2] == 1)) {
				ansprint = "Yes";
			} else if ((bingoresult[0][0] == 1 && bingoresult[1][1] == 1 && bingoresult[2][2] == 1)
					|| (bingoresult[0][2] == 1 && bingoresult[1][1] == 1 && bingoresult[2][0] == 1)) {
				ansprint = "Yes";
			}

			System.out.println(ansprint);
		} catch (

		Exception e) {
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
