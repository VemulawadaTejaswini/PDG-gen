import java.util.*;
import java.io.*;

public class Main {
	static final long MOD = 1000000000 + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = sc.nextLongArray(n);
		long[] y = sc.nextLongArray(m);
		Arrays.sort(x);
		Arrays.sort(y);
		long xmax = x[0] - x[x.length - 1];
		long ymax = y[0] - y[y.length - 1];
		long sum = xmax * ymax * ((x.length - 1) * (y.length - 1));
		System.out.println(String.valueOf(sum));
	}

	static class Scanner {
		private InputStream in;
		private final byte[] buf = new byte[1024];
		private int cur = 0;
		private int len = 0;

		Scanner (InputStream in) {
			this.in = in;
		}

		private int read() {
			if (cur >= len) {
				cur = 0;
				try {
					len = in.read(buf);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (len < 0) {
					return -1;
				}
			}
			return (int)buf[cur++];
		}

		public String next() {
			int c = read();
			if (c == -1) {
				throw new NoSuchElementException();
			}
			while (c < 33 || 126 < c) {
				c = read();
			}
			StringBuilder sb = new StringBuilder();
			while (33 <= c && c <= 126) {
				sb.appendCodePoint(c);
				c = read();
			}
			return sb.toString();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		public long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}
			return array;
		}
	}
}
