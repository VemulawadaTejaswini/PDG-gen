import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] X = new long[N];
		long[] Y = new long[N];
		long[] Z = new long[N];
		for (int i = 0; i < N; ++i) {
			X[i] = sc.nextLong();
			Y[i] = sc.nextLong();
			Z[i] = sc.nextLong();
		}
		long ans = 0;
		for (int i = -1; i <= 1; i += 2) {
			for (int j = -1; j <= 1; j += 2) {
				for (int k = -1; k <= 1; k += 2) {

					long[][] a = new long[N][];
					for (int t = 0; t < N; ++t) {
						a[t] = new long[] { X[t] * i, Y[t] * j, Z[t] * k };
					}
					Arrays.sort(a, new Comparator<long[]>() {
						@Override
						public int compare(long[] o1, long[] o2) {
							return Long.compare(o1[0] + o1[1] + o1[2], o2[0] + o2[1] + o2[2]);
						}
					});
					long x = 0, y = 0, z = 0;
					for (int t = 0; t < M; ++t) {
						x += a[t][0];
						y += a[t][1];
						z += a[t][2];
					}
					ans = Math.max(ans, Math.abs(x) + Math.abs(y) + Math.abs(z));
				}
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	class Scanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		int nextInt() {
			return (int) nextLong();
		}
	}

}
