import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lucasr
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		FConvolution solver = new FConvolution();
		solver.solve(1, in, out);
		out.close();
	}

	static class FConvolution {
		static int[] primes = new int[]{15013, 15017, 15031, 15053, 15061, 15073};
		static BigInteger MOD = BigInteger.valueOf(998244353);

		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] a = sc.nextIntArray(N);
			int[] b = sc.nextIntArray(M);
			int[][] res = new int[primes.length][];
			FFT fft = new FFT(1 << 20);
			for (int i = 0; i < primes.length; i++) {
				res[i] = getModulo(fft.multiply(getModulo(a, primes[i]), getModulo(b, primes[i])), primes[i]);
			}
			int[] tmp = new int[primes.length];
			for (int i = 0; i < N + M - 1; i++) {
				for (int j = 0; j < primes.length; j++) {
					tmp[j] = res[j][i];
				}
				out.print(MathLib.bigIntChineseRemainder(tmp, primes).mod(MOD).intValue() + " ");
			}
			out.println();
		}

		static int[] getModulo(int[] arr, int mod) {
			int[] ret = new int[arr.length];
			for (int i = 0; i < ret.length; i++) {
				ret[i] = arr[i] % mod;
			}
			return ret;
		}

		static int[] getModulo(long[] arr, int mod) {
			int[] ret = new int[arr.length];
			for (int i = 0; i < ret.length; i++) {
				ret[i] = (int) (arr[i] % mod);
			}
			return ret;
		}

	}

	static class MathLib {
		private static long xEuclid;
		private static long yEuclid;

		public static long positiveModule(long a, long mod) {
			return (a % mod + mod) % mod;
		}

		public static long inverse(long a, long mod) {
			euclid(a, mod);
			return positiveModule(xEuclid, mod);
		}

		private static void euclid(long a, long b) {
			if (b == 0) {
				xEuclid = 1;
				yEuclid = 0;
				return;
			}
			euclid(b, a % b);
			long tmp = xEuclid - a / b * yEuclid;
			xEuclid = yEuclid;
			yEuclid = tmp;
		}

		public static BigInteger bigIntChineseRemainder(int[] values, int[] modules) {
			BigInteger ret = BigInteger.valueOf(values[0]);
			BigInteger mod = BigInteger.valueOf(modules[0]);
			for (int i = 1; i < modules.length; i++) {
				long nextMod = modules[i];
				BigInteger nextModBi = BigInteger.valueOf(nextMod);
				long factor = positiveModule(values[i] - ret.mod(nextModBi).intValue(), nextMod) * inverse(mod.mod(nextModBi).intValue(), nextMod);
				ret = ret.add(mod.multiply(BigInteger.valueOf(positiveModule(factor, nextMod))));
				mod = mod.multiply(nextModBi);
			}
			return ret;
		}

	}

	static class FFT {
		double[] roots;
		int maxN;

		public FFT(int maxN) {
			this.maxN = maxN;
			initRoots();
		}

		public long[] multiply(int[] a, int[] b) {
			int minSize = a.length + b.length - 1;
			int bits = 1;
			while (1 << bits < minSize) bits++;
			int N = 1 << bits;
			double[] aa = toComplex(a, N);
			double[] bb = toComplex(b, N);
			fftIterative(aa, false);
			fftIterative(bb, false);
			double[] c = new double[aa.length];
			for (int i = 0; i < N; i++) {
				c[2 * i] = aa[2 * i] * bb[2 * i] - aa[2 * i + 1] * bb[2 * i + 1];
				c[2 * i + 1] = aa[2 * i] * bb[2 * i + 1] + aa[2 * i + 1] * bb[2 * i];
			}
			fftIterative(c, true);
			long[] ret = new long[minSize];
			for (int i = 0; i < ret.length; i++) {
				ret[i] = Math.round(c[2 * i]);
			}
			return ret;
		}

		static double[] toComplex(int[] arr, int size) {
			double[] ret = new double[size * 2];
			for (int i = 0; i < arr.length; i++) {
				ret[2 * i] = arr[i];
			}
			return ret;
		}

		void initRoots() {
			roots = new double[2 * (maxN + 1)];
			double ang = 2 * Math.PI / maxN;
			for (int i = 0; i <= maxN; i++) {
				roots[2 * i] = Math.cos(i * ang);
				roots[2 * i + 1] = Math.sin(i * ang);
			}
		}

		int bits(int N) {
			int ret = 0;
			while (1 << ret < N) ret++;
			if (1 << ret != N) throw new RuntimeException();
			return ret;
		}

		void fftIterative(double[] array, boolean inv) {
			int bits = bits(array.length / 2);
			int N = 1 << bits;
			for (int from = 0; from < N; from++) {
				int to = Integer.reverse(from) >>> (32 - bits);
				if (from < to) {
					double tmpR = array[2 * from];
					double tmpI = array[2 * from + 1];
					array[2 * from] = array[2 * to];
					array[2 * from + 1] = array[2 * to + 1];
					array[2 * to] = tmpR;
					array[2 * to + 1] = tmpI;
				}
			}
			for (int n = 2; n <= N; n *= 2) {
				int delta = 2 * maxN / n;
				for (int from = 0; from < N; from += n) {
					int rootIdx = inv ? 2 * maxN : 0;
					double tmpR, tmpI;
					for (int arrIdx = 2 * from; arrIdx < 2 * from + n; arrIdx += 2) {
						tmpR = array[arrIdx + n] * roots[rootIdx] - array[arrIdx + n + 1] * roots[rootIdx + 1];
						tmpI = array[arrIdx + n] * roots[rootIdx + 1] + array[arrIdx + n + 1] * roots[rootIdx];
						array[arrIdx + n] = array[arrIdx] - tmpR;
						array[arrIdx + n + 1] = array[arrIdx + 1] - tmpI;
						array[arrIdx] += tmpR;
						array[arrIdx + 1] += tmpI;
						rootIdx += (inv ? -delta : delta);
					}
				}
			}
			if (inv) {
				for (int i = 0; i < array.length; i++) {
					array[i] /= N;
				}
			}
		}

	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;

		public MyScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = nextInt();
			}
			return ret;
		}

	}
}

