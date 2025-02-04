import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	static final int P = 998_244_353;

	void submit() {
		int[] cnt = new int[100_000];
		int n = nextInt();
		for (int i = 0; i < 2 * n; i++) {
			cnt[nextInt() - 1]++;
		}

		long[] pair = new long[n + 1];
		pair[0] = 1;
		for (int i = 1; i < pair.length; i++) {
			pair[i] = pair[i - 1] * (2 * i - 1) % P;
		}

		long[] inv = new long[2 * n + 1];
		inv[1] = 1;

		for (int i = 2; i < inv.length; i++) {
			inv[i] = P - (long) (P / i) * inv[P % i] % P;
		}

		PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> Integer.compare(a.length, b.length));
		pq.add(new int[] { 1 });
		for (int x : cnt) {
			if (x < 2) {
				continue;
			}
			int[] p = new int[x / 2 + 1];
			long cur = p[0] = 1;
			for (int i = 1; i < p.length; i++) {
				cur = cur * (x - 2 * i + 2) % P * (x - 2 * i + 1) % P * inv[2 * i - 1] % P * inv[2 * i] % P;
				p[i] = (int) (cur * pair[i] % P);
			}
			pq.add(p);
		}

		while (pq.size() > 1) {
			int[] a = pq.poll();
			int[] b = pq.poll();
			pq.add(mult(a, b));
		}

		int[] p = pq.poll();
		long ans = 0;
		for (int i = 0; i < p.length; i++) {
			ans += (1 - i % 2 * 2) * p[i] * pair[n - i];
			if (ans >= P2) {
				ans -= P2;
			}
			if (ans < 0) {
				ans += P2;
			}
		}
		out.println(ans % P);
	}

	static final int NAIVE_MULT_THRESHOLD = 128;
	static final long P2 = (long) P * P;

	int[] mult(int[] a, int[] b) {
		int[] ret = multSmall(a, b);
		return ret != null ? ret : multFFT(a, b);
	}

	static int[] getNonZeroesIdx(int[] p) {
		int n = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 0) {
				n++;
			}
		}
		int[] ret = new int[n];
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 0) {
				ret[--n] = i;
			}
		}
		return ret;
	}

	static int[] removeLeadingZeroes(int[] a) {
		int i = a.length - 1;
		while (i >= 0 && a[i] == 0) {
			i--;
		}
		return i == a.length - 1 ? a : Arrays.copyOf(a, i + 1);
	}

	int[] multSmall(int[] a, int[] b) {
		int[] nza = getNonZeroesIdx(a);
		int[] nzb = getNonZeroesIdx(b);
		if (nza.length == 0 || nzb.length == 0) {
			return new int[] { 0 };
		}
		if (Math.min(nza.length, nzb.length) <= NAIVE_MULT_THRESHOLD) {
			long[] c = new long[nza[0] + nzb[0] + 1];
			for (int i : nza) {
				for (int j : nzb) {
					c[i + j] += (long) a[i] * b[j];
					if (c[i + j] >= P2) {
						c[i + j] -= P2;
					}
				}
			}
			int[] ret = new int[c.length];
			for (int i = 0; i < c.length; i++) {
				ret[i] = (int) (c[i] % P);
			}
			return removeLeadingZeroes(ret);
		}
		return null;
	}

	static int nextPowerOf2(int x) {
		return x == 1 ? 1 : Integer.highestOneBit(x - 1) << 1;
	}

	static final int L = (int) Math.sqrt(P);
	static final int L2 = L * L;

	/**
	 * Decomposes intV into vectors a and b s.t. intV = a + b * L.
	 * 
	 * @param len - length to pad intV to. !!! MUST BE A POWER OF 2 !!!
	 * @return double[][]{FFT(a), FFT(b)}.
	 */
	static double[][] decomposeAndFFT(int[] intV, int len) {
		// pack into one complex vector
		double[] f = new double[len << 1];
		for (int i = 0; i < intV.length; i++) {
			f[i << 1] = intV[i] % L;
			f[i << 1 | 1] = intV[i] / L;
		}

		fft(f, false);

		// unpack
		double[] f1 = new double[len << 1];
		double[] f2 = new double[len << 1];
		int zzz = (len << 1) - 1;
		for (int i = 0; i < len << 1; i += 2) {
			int j = (-i) & zzz;
			f1[i] = .5 * (f[i] + f[j]);
			f1[i + 1] = .5 * (f[i + 1] - f[j + 1]);
			f2[i] = .5 * (f[i + 1] + f[j + 1]);
			f2[i + 1] = .5 * (f[j] - f[i]);
		}

		return new double[][] { f1, f2 };
	}

	public static int[] multFFT(int[] a, int[] b) {
		int len = nextPowerOf2(a.length + b.length - 1);
		int len2 = len << 1;

		double[][] fA = decomposeAndFFT(a, len);
		double[][] fB = decomposeAndFFT(b, len);

		// Multiply FFT-ed vectors and pack them in pairs for inverse FFT.
		// We need to calcualte smth like (a0 b0) + L(a0 b1 + a1 b0) + L^2 (a1 b1)
		// a0 b0 goes into invF[0] real part
		// (a0 b1 + a1 b0) invF[0] imag part
		// a1 b1 -> invF[1] real part
		double[][] invF = new double[2][len2];
		for (int ia = 0; ia < 2; ia++) {
			for (int ib = 0; ib < 2; ib++) {

				double[] r = invF[(ia + ib) >> 1];
				double[] p = fA[ia];
				double[] q = fB[ib];

				if (((ia + ib) & 1) == 0) {
					for (int i = 0; i < len2; i += 2) {
						r[i] += p[i] * q[i] - p[i + 1] * q[i + 1];
						r[i + 1] += p[i] * q[i + 1] + p[i + 1] * q[i];
					}

				} else {
					for (int i = 0; i < len2; i += 2) {
						r[i] -= p[i] * q[i + 1] + p[i + 1] * q[i];
						r[i + 1] += p[i] * q[i] - p[i + 1] * q[i + 1];
					}
				}

			}
		}

		fft(invF[0], true);
		fft(invF[1], true);

		int[] ret = new int[len];

		for (int i = 0; i < len2; i += 2) {
			long v0 = Math.round(invF[0][i]);
			long v1 = Math.round(invF[0][i + 1]) % P * L;
			long v2 = Math.round(invF[1][i]) % P * L2;
			ret[i >> 1] = (int) ((v0 + v1 + v2) % P);
		}

		return removeLeadingZeroes(ret);
	}

	public static void fft(double[] v, boolean invert) {
		int n2 = v.length;
		int n = n2 >> 1;
		int logN = Integer.numberOfTrailingZeros(n);
		prepareArrays(logN);
		int[] rev = rev2D[logN];

		for (int i = 0; i < n2; i += 2) {
			int j = rev[i >> 1] << 1;
			if (i < j) {
				double t = v[i];
				v[i] = v[j];
				v[j] = t;
				t = v[i + 1];
				v[i + 1] = v[j + 1];
				v[j + 1] = t;
			}
		}

		double conj = invert ? -1 : 1;

		for (int len = 2, row = 0; len <= n; len <<= 1, row++) {
			double[] pow = pow2D[row];
			for (int i = 0; i < n; i += len) {
				for (int j1 = i << 1, j2 = j1 + len, k = 0; k < len; j1 += 2, j2 += 2, k += 2) {
					double uA = v[j1];
					double uB = v[j1 + 1];

					double mRe = pow[k];
					double mIm = pow[k + 1] * conj;

					double vA = v[j2] * mRe - v[j2 + 1] * mIm;
					double vB = v[j2] * mIm + v[j2 + 1] * mRe;

					v[j1] = uA + vA;
					v[j1 + 1] = uB + vB;
					v[j2] = uA - vA;
					v[j2 + 1] = uB - vB;
				}
			}
		}
		if (invert) {
			for (int i = 0; i < n2; i++) {
				v[i] /= n;
			}
		}
	}

	static double[][] pow2D = { { 1, 0 } };
	static int[][] rev2D = {};

	static void prepareArrays(int n) {
		if (rev2D.length < n + 1) {
			rev2D = Arrays.copyOf(rev2D, n + 1);
		}

		if (rev2D[n] == null) {
			int[] tmp = rev2D[n] = new int[1 << n];
			for (int i = 0; i < (1 << n); i++) {
				tmp[i] = (tmp[i >> 1] >> 1) | ((i & 1) << (n - 1));
			}
		}

		int oldN = pow2D.length;

		if (oldN >= n) {
			return;
		}

		pow2D = Arrays.copyOf(pow2D, n);

		for (int i = oldN; i < n; i++) {
			double angle = Math.PI / (1 << i);

			double mRe = Math.cos(angle);
			double mIm = Math.sin(angle);

			double[] dst = pow2D[i] = new double[2 << i];
			double[] src = pow2D[i - 1];

			for (int j = 0; j < 1 << i; j += 2) {
				double re = src[j];
				double im = src[j + 1];

				dst[j << 1] = re;
				dst[j << 1 | 1] = im;
				dst[j << 1 | 2] = re * mRe - im * mIm;
				dst[j << 1 | 3] = re * mIm + im * mRe;
			}
		}
	}

	void test() {

	}

	void stress() {
		for (int tst = 0;; tst++) {
			if (false) {
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();
	static final int C = 5;

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}