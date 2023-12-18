
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
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
			//String S = sc.nextLine().trim();
			int N = sc.nextInt();
			Robot[] r = new Robot[N];

			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int i = 0; i < N; i++) {
				int start = sc.nextInt();
				int length = sc.nextInt();
				int end = start + length;
				Robot robot = new Robot();
				robot.start = start;
				robot.length = length;
				robot.end = end;
				r[i] = robot;
			}

			Arrays.sort(r, new Comparator<Robot>() {
				public int compare(Robot robot1, Robot robot2) {
					return robot1.end - robot2.end;
				}
			});

			int end = -1;
			int ans = 0;
			for (int i = 0; i < N; i++) {
				//System.out.println(r[i].start + " " + r[i].length + " " + r[i].end);
				if (r[i].start > end && end < r[i].end) {
					end = r[i].end;
					ans++;
				}

			}

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Robot {
	int start;
	int length;
	int end;
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
