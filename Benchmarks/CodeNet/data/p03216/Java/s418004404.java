import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int Q = sc.nextInt();
		int[] k = new int[Q];
		sc.fill(k);

		Map<Integer, Pair> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		Integer[] cache = null;
		for (int i = 0; i < S.length; i++) {
			switch (S[i]) {
			case 'D':
				list.add(i);
				cache = null;
				break;
			case 'M':
				if (cache == null) {
					cache = list.toArray(new Integer[list.size()]);
				}
				Pair p = new Pair();
				p.d = cache;
				map.put(i, p);
				break;
			}
		}

		list.clear();
		cache = null;
		for (int i = S.length - 1; i >= 0; i--) {
			switch (S[i]) {
			case 'C':
				list.add(i);
				cache = null;
				break;
			case 'M':
				if (cache == null) {
					cache = list.toArray(new Integer[list.size()]);
				}
				Pair p = map.get(i);
				p.c = cache;
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k.length; i++) {
			long dmc = 0;
			for (Pair p : map.values()) {
				for (int d : p.d) {
					for (int c : p.c) {
						if (c - d < k[i]) {
							dmc++;
						}
					}
				}
			}

			sb.append(dmc).append(System.lineSeparator());
		}

		System.out.print(sb.toString());
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	private static class Pair {
		private final static Integer[] EMPTY = new Integer[0];
		public Integer[] d = EMPTY;
		public Integer[] c = EMPTY;

		@Override
		public String toString() {
			return "Pair [d=" + Arrays.toString(d) + ", c=" + Arrays.toString(c) + "]";
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