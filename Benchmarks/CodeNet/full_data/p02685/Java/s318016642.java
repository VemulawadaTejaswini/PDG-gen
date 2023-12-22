import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		Functions fn = new Functions();
		int n = fs.nextInt();
		int m = fs.nextInt();
		int k = fs.nextInt();
		long ans = 0;
		long col = m;
		for (int i = n - 1; i >= 0; i--) {
			long now = col;
			if (i <= k) {
				now *= fn.fermatComb(n - 1, i);
				ans += now % 998244353;
				ans %= 998244353;
			}
			col *= (m - 1);
			col %= 998244353;
		}
		System.out.println(ans);
	}
}

class Functions {
	static int mod = 998244353;

	static long fermatComb(long a, long b) {
		if (b > a - b)
			return fermatComb(a, a - b);
		long mul = 1; // 分子
		long div = 1; // 分母
		for (int i = 0; i < b; i++) {
			mul *= (a - i);
			mul %= mod;
			div *= (i + 1);
			div %= mod;
		}
		long ans = mul * modpow(div, mod - 2) % mod; // フェルマーの小定理を利用して掛け算で計算
		return ans;
	}

	// mod条件下の高速pow
	static long modpow(long a, long p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			long root = modpow(a, p / 2);
			return root * root % mod;
		} else
			return a * modpow(a, p - 1) % mod;
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