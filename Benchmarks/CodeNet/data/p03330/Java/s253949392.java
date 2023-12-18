import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[][] D = new int[C][C];
		int[][] c = new int[N][N];
		for (int i = 0; i < C; ++i) {
			for (int j = 0; j < C; ++j) {
				D[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				c[i][j] = sc.nextInt() - 1;
			}
		}

		int[][] rec = new int[3][C];
		for (int col = 0; col < C; ++col) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					rec[(i + j) % 3][col] += D[c[i][j]][col];
				}
			}
		}

		int ans = Integer.MAX_VALUE / 3;
		for (int c1 = 0; c1 < C; ++c1) {
			for (int c2 = 0; c2 < C; ++c2) {
				for (int c3 = 0; c3 < C; ++c3) {
					if (c1 == c2 || c2 == c3 || c3 == c1)
						continue;
					int cur = rec[0][c1] + rec[1][c2] + rec[2][c3];
					ans = Math.min(ans, cur);
				}
			}
		}
		System.out.println(ans);
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
