import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.io.*;

class Main {
	static int N;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner();
		long time = System.currentTimeMillis();
		PrintWriter pw = new PrintWriter(System.out);
		out: while (sc.hasNext()) {
			N = sc.nextInt();
			if (N == 0)
				break;

			ArrayList<long[]> mul_lis = new ArrayList<>();
			ArrayList<long[]> sin_lis = new ArrayList<>();
			for (int i = 0; i < N; ++i) {
				long p = sc.nextLong();
				long d = sc.nextLong();
				if (d >= 2)
					mul_lis.add(new long[] { p, d });
				else
					sin_lis.add(new long[] { p, d });
			}

			Collections.sort(mul_lis, new Comparator<long[]>() {
				@Override
				public int compare(long[] o1, long[] o2) {
					return Long.compare(o1[0], o2[0]);
				}
			});
			Collections.sort(sin_lis, new Comparator<long[]>() {
				@Override
				public int compare(long[] o1, long[] o2) {
					return Long.compare(o1[0], o2[0]);
				}
			});

			if (mul_lis.size() == 1) {
				if (mul_lis.get(0)[1] < sin_lis.size()) {
					pw.println(-1);
				} else {
					long ans = 0;
					for (int i = 0; i < sin_lis.size(); ++i) {
						ans += Math.abs(sin_lis.get(i)[0] - mul_lis.get(0)[0]);
					}
					pw.println(ans);
				}
				continue out;
			}

			ArrayList<Long> mul = new ArrayList<>();
			ArrayList<Long> sin = new ArrayList<>();
			for (int i = 0; i < mul_lis.size(); ++i) {
				for (int j = 0; j < mul_lis.get(i)[1] - 1 - ((i == 0 || i == mul_lis.size() - 1) ? 0 : 1); ++j) {
					mul.add(mul_lis.get(i)[0]);
				}
			}
			for (int i = 0; i < sin_lis.size(); ++i) {
				sin.add(sin_lis.get(i)[0]);
			}
			
			if (sin.size() > mul.size()) {
				if (mul.size() == 0 && sin.size() == 2) {
					pw.println(sin.get(0) + sin.get(1));
				} else
					pw.println(-1);
				continue out;
			}
			int[] upper = new int[sin.size()];
			int[] lower = new int[sin.size()];
			int p = 0;
			for (int i = 0; i < sin.size(); ++i) {
				while (p + 1 < mul.size() && Math.abs(sin.get(i) - mul.get(p + 1)) <= Math.abs(sin.get(i) - mul.get(p)))
					++p;
				upper[i] = Math.min(mul.size() - 1, p + sin.size());
				lower[i] = Math.max(0, p - sin.size());
			}
			long[] dp = new long[sin.size()];
			long ans = 0;
			Arrays.fill(dp, Long.MAX_VALUE / 16);
			if (sin.size() > 0) {
				int left = 0, right = 0;
				for (int i = 0; i < mul.size(); ++i) {
					while (left < sin.size() && upper[left] < i) {
						++left;
					}
					while (right < sin.size() && lower[right] <= i)
						++right;
					for (int j = right - 1; j >= Math.max(left, 1); --j) {
						dp[j] = Math.min(dp[j], dp[j - 1] + Math.abs(mul.get(i) - sin.get(j)));
					}

					dp[0] = Math.min(dp[0], Math.abs(mul.get(i) - sin.get(0)));
				}
				ans = dp[sin.size() - 1];
			}
			ans += mul_lis.get(mul_lis.size() - 1)[0] - mul_lis.get(0)[0];
			if (ans >= Long.MAX_VALUE / 16) {
				pw.println(-1);
			} else
				pw.println(ans);
		}
		pw.close();
		System.err.println(System.currentTimeMillis() - time);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	static class Scanner {
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

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
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

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}