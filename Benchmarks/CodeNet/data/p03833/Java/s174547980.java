import java.io.IOException;
import java.util.*;

import org.omg.CORBA.portable.InputStream;

public class Main {
	static class FastScanner {
		private final java.io.InputStream in = System.in;
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
	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = (int) sc.nextLong();
		int M = (int) sc.nextLong();
		long[] A = new long[N];
		for (int i = 1; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		int[][] B = new int[N][M];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				B[i][j] = (int) sc.nextLong();
			}
		}
		long[][] sum = new long[N + 1][N + 1];
		for (int i = 0; i < M; ++i) {
			int[][] a = new int[N][];
			for (int j = 0; j < N; ++j) {
				a[j] = new int[] { j, B[j][i] };
			}
			Arrays.sort(a, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[1], o2[1]);
				}
			});
			boolean[] vis = new boolean[N];
			int[] mate = new int[N];
			for (int j = 0; j < N; ++j) {
				mate[j] = j;
			}
			for (int j = 0; j < N; ++j) {
				int idx = a[j][0];
				int l = idx, r = idx;
				if (idx > 0 && vis[idx - 1]) {
					l = mate[idx - 1];
				}
				if (idx + 1 < N && vis[idx + 1]) {
					r = mate[idx + 1];
				}
				sum[l][idx] += a[j][1];
				sum[idx + 1][r + 1] += a[j][1];
				sum[l][r + 1] -= a[j][1];
				sum[idx + 1][idx] -= a[j][1];
				vis[idx] = true;
				if (idx > 0 && idx + 1 < N && vis[idx - 1] && vis[idx + 1]) {
					mate[l] = r;
					mate[r] = l;
				} else if (idx > 0 && vis[idx - 1]) {
					mate[l] = idx;
					mate[idx] = l;
				} else if (idx + 1 < N && vis[idx + 1]) {
					mate[r] = idx;
					mate[idx] = r;
				}
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (j > 0)
					sum[i][j] += sum[i][j - 1];
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (j > 0)
					sum[j][i] += sum[j - 1][i];
			}
		}
		for (int i = 0; i < N; ++i) {
			if (i > 0)
				A[i] += A[i - 1];
		}
		long best = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = i; j < N; ++j) {
				best = Math.max(best, sum[i][j] - (A[j] - A[i]));
			}
		}
		System.out.println(best);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
