import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	private final static int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] map = new char[H][];
		for (int i = 0; i < H; i++) {
			map[i] = sc.next().toCharArray();
		}

		int[][] light = new int[H][W];
		for (int h = 0; h < H; h++) {
			int left = 0;
			int count = 0;
			for (int w = 0; w < W; w++) {
				if (map[h][w] == '#') {
					for (int k = left; k < w; k++) {
						light[h][k] += count;
					}
					count = 0;
					left = w + 1;
				} else {
					count++;
				}
			}
			for (int k = left; k < W; k++) {
				light[h][k] += count;
			}
		}
				
		for (int w = 0; w < W; w++) {
			int top = 0;
			int count = 0;
			for (int h = 0; h < H; h++) {
				if (map[h][w] == '#') {
					for (int k = top; k < h; k++) {
						light[k][w] += count;
					}
					count = 0;
					top = h + 1;
				} else {
					count++;
				}
			}
			for (int k = top; k < H; k++) {
				light[k][w] += count;
			}
		}

		long max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				max = Math.max(max, light[i][j] - 1);
			}
		}

		System.out.println(max);
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
