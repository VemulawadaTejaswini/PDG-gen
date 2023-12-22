import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class AtCoderACL {

	static final int P = 998_244_353;

	void submit() {
		int n = nextInt();
		int[] cnt = new int[100_000];
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

	static final int NAIVE_MULT_THRESHOLD = 64;
	static final long P2 = (long)P * P;
	
	int[] mult(int[] a, int[] b) {
		return multSmall(a, b).orElse(multFFT(a, b));
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

	Optional<int[]> multSmall(int[] a, int[] b) {
		int[] nza = getNonZeroesIdx(a);
		int[] nzb = getNonZeroesIdx(b);
		if (nza.length == 0 || nzb.length == 0) {
			return Optional.of(new int[] {0});
		}
		if (Math.min(nza.length, nzb.length) <= NAIVE_MULT_THRESHOLD) {
			long[] c = new long[nza[0] + nzb[0] + 1];
			for (int i : nza) {
				for (int j : nzb) {
					c[i + j] += (long)a[i] * b[j];
					if (c[i + j] >= P2) {
						c[i + j] -= P2;
					}
				}
			}
			int[] ret = new int[c.length];
			for (int i = 0; i < c.length; i++) {
				ret[i] = (int) (c[i] % P);
			}
			return Optional.of(removeLeadingZeroes(ret));
		}
		return Optional.empty();
	}
	
	static int nextPowerOf2(int x) {
		return x == 1 ? 1 : Integer.highestOneBit(x - 1) << 1;
	}

	static class CompV {
		double[] re, im;

		void add(CompV o) {
			for (int i = 0; i < re.length; i++) {
				re[i] += o.re[i];
				im[i] += o.im[i];
			}
		}

		static CompV times(CompV a, CompV b) {
			double[] aRe = a.re;
			double[] aIm = a.im;
			double[] bRe = b.re;
			double[] bIm = b.im;
			double[] re = new double[aRe.length];
			double[] im = new double[aRe.length];

			for (int i = 0; i < aRe.length; i++) {
				re[i] = aRe[i] * bRe[i] - aIm[i] * bIm[i];
				im[i] = aRe[i] * bIm[i] + aIm[i] * bRe[i];
			}

			return new CompV(re, im);
		}

		static CompV plus(CompV a, CompV b) {
			double[] aRe = a.re;
			double[] aIm = a.im;
			double[] bRe = b.re;
			double[] bIm = b.im;
			double[] re = new double[aRe.length];
			double[] im = new double[aRe.length];

			for (int i = 0; i < aRe.length; i++) {
				re[i] = aRe[i] + bRe[i];
				im[i] = aIm[i] + bIm[i];
			}

			return new CompV(re, im);
		}

		/**
		 * @return a + bi
		 */
		static CompV packFFT(CompV a, CompV b) {
			double[] aRe = a.re;
			double[] aIm = a.im;
			double[] bRe = b.re;
			double[] bIm = b.im;
			double[] re = new double[aRe.length];
			double[] im = new double[aRe.length];
			for (int i = 0; i < aRe.length; i++) {
				re[i] = aRe[i] - bIm[i];
				im[i] = aIm[i] + bRe[i];
			}
			return new CompV(re, im);
		}

		/**
		 * for real-valued a and b restores FFT(a) and FFT(b) from FFT(a + bi)
		 */
		void unpackFFT(CompV a, CompV b) {
			int n = re.length;
			double[] aRe = a.re;
			double[] aIm = a.im;
			double[] bRe = b.re;
			double[] bIm = b.im;
			for (int i = 0; i < n; i++) {
				int j = i == 0 ? 0 : n - i;
				aRe[i] = (re[i] + re[j]) * 0.5;
				aIm[i] = (im[i] - im[j]) * 0.5;
				bRe[i] = (im[i] + im[j]) * 0.5;
				bIm[i] = (re[j] - re[i]) * 0.5;
			}
		}

		public CompV(double[] re, double[] im) {
			this.re = re;
			this.im = im;
		}

		public CompV(int len) {
			re = new double[len];
			im = new double[len];
		}
	}

	static final int L = (int) Math.sqrt(P);
	static final int L2 = L * L;

	public static int[] multFFT(int[] a, int[] b) {
		int len = nextPowerOf2(a.length + b.length - 1);

		double[] p1 = new double[len];
		double[] q1 = new double[len];
		for (int i = 0; i < a.length; i++) {
			p1[i] = a[i] % L;
			q1[i] = a[i] / L;
		}

		double[] p2 = new double[len];
		double[] q2 = new double[len];
		for (int i = 0; i < b.length; i++) {
			p2[i] = b[i] % L;
			q2[i] = b[i] / L;
		}

		CompV p1p2Pack = new CompV(p1, p2);
		CompV q1q2Pack = new CompV(q1, q2);

		fft(p1p2Pack, false);
		fft(q1q2Pack, false);

		CompV fp1 = new CompV(len);
		CompV fp2 = new CompV(len);
		p1p2Pack.unpackFFT(fp1, fp2);

		CompV fq1 = new CompV(len);
		CompV fq2 = new CompV(len);
		q1q2Pack.unpackFFT(fq1, fq2);

		CompV back0 = CompV.times(fp1, fp2);

		CompV back1 = CompV.times(fp1, fq2);
		back1.add(CompV.times(fq1, fp2));

		CompV back2 = CompV.times(fq1, fq2);

		CompV back01 = CompV.packFFT(back0, back1);

		fft(back01, true);
		fft(back2, true);

		int[] ret = new int[len];

		for (int i = 0; i < len; i++) {
			long v0 = Math.round(back01.re[i]) % P;
			long v1 = Math.round(back01.im[i]) % P * L % P;
			long v2 = Math.round(back2.re[i]) % P * L2 % P;
			ret[i] = (int) ((v0 + v1 + v2) % P);
		}

		return removeLeadingZeroes(ret);
	}

	public static void fft(CompV v, boolean invert) {
		double[] a = v.re;
		double[] b = v.im;
		
		int n = a.length;
		int shift = 32 - Integer.numberOfTrailingZeros(n);
		prepareArrays(32 - shift);
		int[] rev = rev2D[32 - shift];
		for (int i = 1; i < n; i++) {
			int j = rev[i];
			if (i < j) {
				double temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
		}

		double multInv = invert ? -1 : 1;

		for (int len = 2, row = 0; len <= n; len <<= 1, row++) {
			int halfLen = len >> 1;
			double[] multReArr = powRe[row];
			double[] multImArr = powIm[row];
			for (int i = 0; i < n; i += len) {
				int toJ = i + halfLen;

				for (int j1 = i, j2 = toJ, k = 0; k < halfLen; j1++, j2++, k++) {
					double uA = a[j1];
					double uB = b[j1];

					double multRe = multReArr[k];
					double multIm = multImArr[k] * multInv;

					double vA = a[j2] * multRe - b[j2] * multIm;
					double vB = a[j2] * multIm + b[j2] * multRe;
					a[j1] = uA + vA;
					b[j1] = uB + vB;
					a[j2] = uA - vA;
					b[j2] = uB - vB;
				}
			}
		}
		if (invert) {
			for (int i = 0; i < n; i++) {
				a[i] /= n;
				b[i] /= n;
			}
		}
	}

	static double[][] powRe = { { 1 } };
	static double[][] powIm = { { 0 } };
	static int[][] rev2D = {};

	static void prepareArrays(int n) {

		if (rev2D.length < n + 1) {
				rev2D = Arrays.copyOf(rev2D, n + 1);
		}

		if (rev2D[n] == null) {
			int[] tmp = rev2D[n] = new int[1 << n];
			for (int i = 0; i < (1 << n); i++) {
				tmp[i] = tmp[i >> 1] >> 1;
				if ((i & 1) == 1) {
					tmp[i] |= 1 << (n - 1);
				}
			}
		}

		int oldN = powRe.length;

		if (oldN >= n) {
			return;
		}

		powRe = Arrays.copyOf(powRe, n);
		powIm = Arrays.copyOf(powIm, n);

		for (int i = oldN; i < n; i++) {

			double angle = Math.PI / (1 << i);

			double multRe = Math.cos(angle);
			double multIm = Math.sin(angle);

			double[] toRe = powRe[i] = new double[1 << i];
			double[] toIm = powIm[i] = new double[1 << i];

			double[] fromRe = powRe[i - 1];
			double[] fromIm = powIm[i - 1];

			for (int j = 0; j < 1 << (i - 1); j++) {

				double re = fromRe[j];
				double im = fromIm[j];

				toRe[j << 1] = re;
				toIm[j << 1] = im;
				toRe[(j << 1) | 1] = re * multRe - im * multIm;
				toIm[(j << 1) | 1] = re * multIm + im * multRe;
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

	AtCoderACL() throws IOException {
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
		new AtCoderACL();
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