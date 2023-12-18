import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	public void run() throws Exception {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		ArrayList<Integer> len = new ArrayList<>();
		StringBuilder[] sb = new StringBuilder[n];
		for (int i = 0; i < n; ++i)
			sb[i] = new StringBuilder();
		int[] X = new int[n];
		int[] Y = new int[n];
		for (int i = 0; i < n; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			if (X[i] % 2 == 0) {
				sb[i].append("R");
				--X[i];
			}
			if (Y[i] % 2 == 0) {
				sb[i].append("U");
				--Y[i];
			}
		}
		for (int i = 0; i < n; ++i) {
			if (sb[i].length() != sb[0].length()) {
				System.out.println(-1);
				return;
			}
		}
		for (int i = 0; i < sb[0].length(); ++i)
			len.add(1);
		for (int i = 0; i < 19; ++i) {
			len.add(1 << i);
			for (int j = 0; j < n; ++j)
				X[j] += 1 << i;
		}
		for (int i = 0; i < 19; ++i) {
			len.add(1 << i);
			for (int j = 0; j < n; ++j)
				Y[j] += 1 << i;
		}
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 19; ++j) {
				if ((X[i] & (1L << (j + 1))) > 0) {
					sb[i].append("R");
				} else {
					sb[i].append("L");
				}
			}
		}
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 19; ++j) {
				if ((Y[i] & (1L << (j + 1))) > 0) {
					sb[i].append("U");
				} else {
					sb[i].append("D");
				}
			}
		}
		System.out.println(len.size());
		for (int i = 0; i < len.size(); ++i) {
			System.out.print(len.get(i) + (i == len.size() - 1 ? "\n" : " "));
		}
		for (int i = 0; i < n; ++i) {
			System.out.println(sb[i].toString());
		}
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

		public int nextInt() {
			return (int) nextLong();
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
	}
}