
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		FastScannerMain1 sc = new FastScannerMain1(System.in);

		try {
			//String S = sc.nextLine().trim();
			int N = sc.nextInt();
			long[] A = new long[N];
			long[] mid = new long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
				mid[i] = A[i]-(i+1);
			}
			Arrays.sort(mid);


			int loc = (N-1)/2;
			long b = mid[loc];
			
			if((N-1)%2!=0){
				b = (mid[loc]+mid[loc+1])/2;
			}
			long ans = 0;
			for (int i = 0; i < N; i++) {
				ans+=Math.abs(A[i]-(b+(i+1)));
			}

			//System.out.println(Arrays.toString(A));
			
			//System.out.println(Arrays.toString(mid));
			//System.out.println(b);
			//System.out.println(loc);
			System.out.println(ans);

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
