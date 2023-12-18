import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] s = S.toCharArray();

		// # をすべて . にする
		long x = 0;
		char[] xx = Arrays.copyOf(s, s.length);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '#') {
				x++;
				xx[i] = '.';
			}
		}

		// 最初の # 以降を . → #
		int state = 0;
		long y = 0;
		char[] yy = Arrays.copyOf(s, s.length);
		for (int i = 0; i < s.length; i++) {
			if (state == 0) {
				if (s[i] == '#') {
					state = 1;
				}
			} else {
				if (s[i] == '.') {
					y++;
					yy[i] = '#';
				}
			}
		}

		// 最後の # より左は # → . 、最後の # より右は . → #
		long z = 0;
		char[] zz = Arrays.copyOf(s, s.length);
		int index = S.lastIndexOf('#');
		for (int i = 0; i < s.length; i++) {
			if (i < index) {
				if (s[i] == '#') {
					z++;
					zz[i] = '.';
				}
			} else {
				if (s[i] == '.') {
					z++;
					zz[i] = '#';
				}
			}
		}

		if (isDebug) {
			boolean ok = true;
			for (int i = 0; i < s.length - 1; i++) {
				if (xx[i] == '#' && xx[i + 1] == '.') {
					ok = false;
					break;
				}
				if (yy[i] == '#' && yy[i + 1] == '.') {
					ok = false;
					break;
				}
				if (zz[i] == '#' && zz[i + 1] == '.') {
					ok = false;
					break;
				}
			}

			if (!ok) {
				debug(S, x, y, z);
				debug(new String(xx));
				debug(new String(yy));
				debug(new String(zz));
			}
		}

		long min = Math.min(Math.min(x, y), z);

		System.out.println(min);
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

		public char nextChar() throws IOException {
			return (char) skip();
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