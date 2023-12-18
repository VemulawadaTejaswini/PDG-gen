import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] a = new int[H][W];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				a[i][j] = sc.nextInt() % 2;
			}
		}

		ArrayList<String> ans = new ArrayList<>();
		for (int j = 0; j < W; ++j) {
			for (int i = 0; i < H; ++i) {
				if (a[i][j] == 0 || i == H - 1)
					continue;
				ans.add((i + 1) + " " + (j + 1) + " " + (i + 2) + " " + (j + 1));
				a[i + 1][j] ^= 1;
				a[i][j] ^= 1;
			}
			for (int i = 0; i < H; ++i) {
				if (a[i][j] == 0 || j == W - 1)
					continue;
				ans.add((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2));
				a[i][j] ^= 1;
				a[i][j + 1] ^= 1;
			}
		}
		System.out.println(ans.size());
		for (String str : ans) {
			System.out.println(str);
		}
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

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}