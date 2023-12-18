import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		sc.fill(A);

		final int[] COSTS = new int[] { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		Pair[] pairs = new Pair[M];
		for (int i = 0; i < A.length; i++) {
			pairs[i] = new Pair(A[i], COSTS[A[i] - 1]);
		}
		Arrays.sort(pairs, Comparator.comparingInt(Pair::getCost).thenComparingInt(Pair::getNumberR));

		String result = calc(pairs, N, "", 0);
		char[] c = result.toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			sb.append(c[i]);
		}
		System.out.println(sb.reverse());
	}

	private static String calc(Pair[] pairs, int cost, String current, int dep) {
		for (Pair p : pairs) {
			int next = cost - p.cost;
			if (next == 0) {
				return p.number + current;
			}

			if (next > 0) {
				String result = calc(pairs, next, p.number + current, dep + 1);
				if (result != null) {
					return result;
				}
			}
		}

		return null;
	}

	private static class Pair {
		int number;
		int cost;

		public Pair(int number, int cost) {
			super();
			this.number = number;
			this.cost = cost;
		}

		public int getCost() {
			return cost;
		}

		public int getNumber() {
			return number;
		}

		public int getNumberR() {
			return Integer.MAX_VALUE - number;
		}

		@Override
		public String toString() {
			return Integer.toString(number);
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;

			int read = skip();
			do {
				num = num * 10 + (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;

			int read = skip();
			do {
				num = num * 10 + (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			StringBuilder builder = new StringBuilder();

			int read = skip();
			do {
				builder.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			return builder.toString();
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}