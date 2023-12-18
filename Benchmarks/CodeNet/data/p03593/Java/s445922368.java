import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		Character[] a = new Character[H * W];
		for (int i = 0; i < H; i++) {
			char[] temp = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				a[i * W + j] = temp[j];
			}
		}

		Map<Character, Integer> count = new HashMap<>();
		for (char c : a) {
			count.compute(c, (key, value) -> value == null ? 1 : value + 1);
		}

		Queue<Map.Entry<Character, Integer>> tree = new PriorityQueue<Map.Entry<Character, Integer>>(
				(e1, e2) -> e2.getValue() - e1.getValue());
		for (Map.Entry<Character, Integer> e : count.entrySet()) {
			tree.add(e);
		}

		for (int i = 0; i < (int) ((H / 2.0) + 0.5); i++) {
			int useH = i >= H / 2 ? 1 : 2;
			for (int j = 0; j < (int) ((W / 2.0) + 0.5); j++) {
				int useW = i >= W / 2 ? 1 : 2;
				int use = useH * useW;
				Map.Entry<Character, Integer> entry = tree.poll();
				if (entry == null || entry.getValue() < use) {
					System.out.println("No");
					return;
				}

				entry.setValue(entry.getValue() - use);
				if (entry.getValue() > 0) {
					tree.add(entry);
				}
			}
		}

		System.out.println("Yes");
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

		public void fill(int[] a, int[] b, int[] c) throws IOException {
			if (a.length != b.length || b.length != c.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
				c[i] = nextInt();
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