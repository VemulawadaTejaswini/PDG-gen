
//for (int i = 2; i <= 10000; ++i) {
//	int cur = f(i);
//	int cp = 1;
//	for (int j = 2; j <= 10000; ++j) {
//		int tmp = cur;
//		cur = Math.min(cur, f((long) i * j));
//		if (tmp != cur)
//			cp = j;
//	}
//	if (i < cp)
//		tr(i, cur, cp);
//}
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
		// System.err.println(System.currentTimeMillis() - t);
	}

	int K;
	int[] p10 = new int[200];

	public void run() {
		Scanner sc = new Scanner();
		K = sc.nextInt();
		p10[0] = 1;
		for (int i = 1; i < 200; ++i) {
			p10[i] = p10[i - 1] * 10 % K;
		}

		int ans = f(K);
		for (int i = 199; i >= 1; --i) {
			ans = Math.min(ans, g(i, 0, 0));
		}
		System.out.println(ans);
	}

	int[][][] memo = new int[2][200][100000];
	{
		for (int i = 0; i < memo.length; ++i) {
			for (int j = 0; j < memo[i].length; ++j) {
				for (int k = 0; k < memo[i][j].length; ++k)
					memo[i][j][k] = -1;// -1:不明
			}
		}
	}

	int g(int x, int y, int z) {
		if (x == 0) {
			if (z == 1 && y == 0)
				return 0;
			else
				return Integer.MAX_VALUE / 3;
		}
		if (x == 0 && y != 0)
			return Integer.MAX_VALUE / 3;
		if (y == 0 && z == 1)
			return 0;
		if (memo[z][x][y] != -1) {
			return memo[z][x][y];
		}
		int ret = Integer.MAX_VALUE / 3;
		for (int i = 1; i <= 9; ++i) {
			int add = p10[x] * i % K;
			ret = Math.min(ret, i + g(x - 1, (y - add + K) % K, z | 1));
		}
		ret = Math.min(ret, g(x - 1, y, z));
		return memo[z][x][y] = ret;
	}

	// g(i,j)=桁数iで%K=jとなる時の桁和のmin
	// i<=20
	// j<=10^5
	int f(long v) {
		int ret = 0;
		while (v > 0) {
			ret += v % 10;
			v /= 10;
		}
		return ret;
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

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}