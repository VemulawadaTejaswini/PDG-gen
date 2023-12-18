import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		int k = fs.nextInt();
		Mod.pre_factrials(n);
		long ans = 0;
		for (int i = 0; i <= k; i++) {
			ans += Mod.mul(Mod.mul(m, Mod.modpow(m - 1, n - 1 - i)), Mod.fastFermatComb(n - 1, i));
			ans %= 998244353;
		}
		System.out.println(ans);
	}
}

class Mod {
	static int mod = 998244353;
	// Fast Fermat Combination
	static long factorials[];
	static long factorialDivs[];

	static void pre_factrials(int n) {
		factorials = new long[n + 1];
		factorialDivs = new long[n + 1];// 割算の結果を格納する配列
		factorials[0] = 1;
		for (int i = 0; i < n; i++) {
			factorials[i + 1] = mul(i + 1, factorials[i]);
		}
		factorialDivs[n] = div(1, factorials[n]);// 最初に1/(n!)を求める事で、1/(n-1)!からは掛け算で求める事ができる。
		for (int i = n - 1; i >= 0; i--) {
			factorialDivs[i] = mul(factorialDivs[i + 1], i + 1);
		}
	}

	static long fastFermatComb(int a, int b) {
		if (factorials.length == 0)
			System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
		long af = factorials[a];
		long bf = factorialDivs[b];
		long abf = factorialDivs[a - b];
		long res = mul(mul(af, bf), abf);
		return res;
	}

	static long plus(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x + y) % mod;
		return res;
	}

	static long sub(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x - y + mod) % mod;
		return res;
	}

	static long mul(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * y % mod;
		return res;
	}

	static long div(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * modpow(y, mod - 2) % mod;
		return res;
	}

	static long modpow(long a, long p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			long halfP = p / 2;
			long root = modpow(a, halfP);
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