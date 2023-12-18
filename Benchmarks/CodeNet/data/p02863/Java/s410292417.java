//check violation of constraints

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	final long MOD = (long) 1e9 + 7;
	long[] fac = new long[1123456];
	long[] ifac = new long[1123456];
	long[] inv = new long[1123456];
	{
		fac[0] = fac[1] = ifac[0] = ifac[1] = inv[0] = inv[1] = 1;
		for (int i = 2; i < fac.length; ++i) {
			fac[i] = i * fac[i - 1] % MOD;
			inv[i] = MOD - inv[(int) (MOD % i)] * (MOD / i) % MOD;
			ifac[i] = ifac[i - 1] * inv[i] % MOD;
		}
	}

	void run(int N, int T, long[] A, long[] B) {
		long[] dp = new long[T + 1];
		for (int i = 0; i < N; ++i) {
			for (int t = T - 1; t >= 0; --t) {
				int nt = Math.min(T, t + (int) A[i]);
				dp[nt] = Math.max(dp[nt], dp[t] + B[i]);
			}
		}
		long ans = 0;
		for (long v : dp)
			ans = Math.max(ans, v);
		System.out.println(ans);
	}

	public static void main(String[] args) throws FileNotFoundException {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int T = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		new Main().run(N, T, A, B);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

class FastScanner {
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