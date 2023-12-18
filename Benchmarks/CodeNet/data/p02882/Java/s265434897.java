
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {} System.out.println(); HashMap<Integer,
	 * Integer> hm = new HashMap<>(); int[] s = new int[M]; ArrayDeque<Integer> deq
	 * = new ArrayDeque<>();
	 *
	 * 文字列のSort String sorted = S.chars() .sorted() .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString(); for (char
	 * i = 'a'; i <= 'z'; i++) {}
	 */
	public void run() {
		FastScannerMainD sc = new FastScannerMainD(System.in);

		try {
			// String S = sc.nextLine().trim();

			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();

			/*
			double ya = 60;
			double xa = 30;
			
			double left = b * Math.sin(xa);
			double right = a * Math.sin(ya);
			
			double volume = 0;
			if (left > right) {
				volume = a * a * b - a * a * Math.tan(ya) * a / 2;
			} else if (left == right) {
				volume = a * a * b / 2;
			} else {
				volume = a * (b * Math.cos(xa) + Math.tan(xa) * a * Math.sin(xa)) * a * Math.sin(xa) / 2;
			}
			
			if (x > volume) {
				System.out.println("Yes");
			} else if (x == volume) {
				System.out.println("Same");
			} else {
				System.out.println("No");
			}
			*/

			double max = 90.0;
			double min = 0.0;
			double mid = 0;
			double ya = 0;
			double xa = 0;
			double volume = 0;

			//System.out.println(Math.sin(Math.toRadians(30)));
			//System.out.println(Math.sin(Math.toRadians(60)));

			while (max - min > 0.0000000001) {
				mid = (max + min) / 2;
				ya = Math.toRadians(mid);
				xa = Math.toRadians((90 - mid));
				/*
				System.out.println("max:" + max + " ,min:" + min + " ,mid:" + mid + " ,ya:" + ya + " ,xa:" + xa);
				System.out.println("Math.cos(xa):" + Math.cos(xa) + " ,Math.tan(xa):" + Math.tan(xa) + " ,Math.sin(xa):"
						+ Math.sin(xa) + " ,ya:" + ya + " ,xa:" + xa);
						*/

				double left = Math.abs(b * Math.sin(xa));
				double right = Math.abs(a * Math.sin(ya));

				if (left > right) {
					volume = Math.abs(a * a * b - a * a * Math.tan(ya) * a / 2);
				} else if (left == right) {
					volume = Math.abs(a * a * b / 2);
				} else {
					volume = Math.abs(a * (b * Math.cos(xa) + Math.tan(xa) * b * Math.sin(xa)) * b * Math.sin(xa) / 2);
				}
				//System.out.println("vloume:" + volume + " ,left:" + left + " ,right:" + right);

				if (x > volume) {
					//System.out.println("volumeが小さい");
					max = mid;
				} else if (x == volume) {
					//System.out.println("Same");
					break;
				} else {
					//System.out.println("volumeがでかい");
					min = mid;
				}
			}

			System.out.println(mid);

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 下記はオーバーフローでExceptionをキャッチするよう
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int add(int a, int b) {
		int ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}
}

// 高速なScanner
class FastScannerMainD {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD(InputStream in) {
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
