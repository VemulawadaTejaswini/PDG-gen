import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	private final static int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		sc.fill(x, y);

		Set<Pair> all = new HashSet<>();
		for (int i = 0; i < N; i++) {
			all.add(new Pair(x[i], y[i]));
		}

		Map<Integer, List<Integer>> xx = new HashMap<>();
		for (int i = 0; i < N; i++) {
			xx.computeIfAbsent(x[i], (k) -> new ArrayList<>()).add(y[i]);
		}
		Map<Integer, List<Integer>> yy = new HashMap<>();
		for (int i = 0; i < N; i++) {
			yy.computeIfAbsent(y[i], (k) -> new ArrayList<>()).add(x[i]);
		}

		long count = 0;
		List<Pair> temp = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			List<Integer> xxx = yy.get(x[i]);
			List<Integer> yyy = xx.get(y[i]);
			if (xxx == null || yyy == null) {
				continue;
			}

			for (Integer xxxx : xxx) {
				for (Integer yyyy : yyy) {
					Pair pair = new Pair(yyyy, xxxx);
					if (!all.contains(pair)) {
						count++;
						temp.add(pair);
					}
				}
			}

			all.addAll(temp);
			for (Pair pair : temp) {
				xx.computeIfAbsent(pair.x, (k) -> new ArrayList<>()).add(pair.y);
				yy.computeIfAbsent(pair.y, (k) -> new ArrayList<>()).add(pair.x);
			}

			temp.clear();
		}

		System.out.println(count);
	}

	public static class Pair {
		private int x;
		private int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			return x + y;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "[" + x + ", " + y + "]";
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	private static int add(int a, int b) {
		return (a + b) % MOD;
	}

	private static int sub(int a, int b) {
		return (a - b % MOD) % MOD;
	}

	private static int mul(int a, int b) {
		return ((a % MOD) * (b % MOD)) % MOD;
	}

	public static class Scanner {
		private BufferedInputStream inputStream;
		private StringBuilder buffer = new StringBuilder();

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
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
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
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
			int read = skip();
			do {
				buffer.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			String text = buffer.toString();
			buffer.delete(0, buffer.length());

			return text;
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}
