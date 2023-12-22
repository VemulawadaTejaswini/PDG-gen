import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
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
		static int MOD = 998244353;

		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] a = sc.nextIntArray(N);
			int[] b = sc.nextIntArray(M);
			DiscreteFFT fft = new DiscreteFFT(1 << 20, MOD);
			int[] res = fft.multiply(a, b);
			for (int i = 0; i < N + M - 1; i++) {
				out.print(res[i] + " ");
			}
			out.println();
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

	static class DiscreteFFT {
		int maxN;
		int[] roots;
		DiscreteFFT.Prime p;

		public DiscreteFFT(int maxN, int prime) {
			this.maxN = maxN;
			p = new DiscreteFFT.Prime(prime);
			roots = p.getNthRootPots(maxN);
		}

		public int[] multiply(int[] a, int[] b) {
			int minSize = a.length + b.length - 1;
			int bits = 1;
			while (1 << bits < minSize) bits++;
			int[] aa = Arrays.copyOf(a, 1 << bits);
			int[] bb = Arrays.copyOf(b, 1 << bits);
			fftIterative(aa, false);
			fftIterative(bb, false);
			int[] c = new int[aa.length];
			for (int i = 0; i < c.length; i++) {
				c[i] = p.mul(aa[i], bb[i]);
			}
			fftIterative(c, true);
			return c;
		}

		void fftIterative(int[] array, boolean inv) {
			int bits = bits(array.length);
			int N = 1 << bits;
			for (int from = 0; from < N; from++) {
				int to = Integer.reverse(from) >>> (32 - bits);
				if (from < to) {
					int tmp = array[from];
					array[from] = array[to];
					array[to] = tmp;
				}
			}
			for (int n = 2; n <= N; n *= 2) {
				int delta = maxN / n;
				int nNext = n / 2;
				for (int from = 0; from < N; from += n) {
					int rootIdx = inv ? maxN : 0;
					int tmp;
					for (int arrIdx = from; arrIdx < from + nNext; arrIdx++) {
						tmp = p.mul(array[arrIdx + nNext], roots[rootIdx]);
						array[arrIdx + nNext] = p.sub(array[arrIdx], tmp);
						array[arrIdx] = p.add(array[arrIdx], tmp);
						rootIdx += (inv ? -delta : delta);
					}
				}
			}
			if (inv) {
				int invN = p.inverse(N);
				for (int i = 0; i < array.length; i++) {
					array[i] = p.mul(array[i], invN);
				}
			}
		}

		int bits(int N) {
			int ret = 0;
			while (1 << ret < N) ret++;
			if (1 << ret != N) throw new RuntimeException();
			return ret;
		}

		static class Prime {
			long prime;
			int[] factors;
			int primitiveRoot;

			Prime(int prime) {
				this.prime = prime;
				factors = new int[10]; // product of first 10 primes is > 6 * 10^9 (doesn't fit in 32-bit int)
				int size = 0;
				int number = prime - 1;
				for (int pDiv = 2; pDiv * pDiv <= number; pDiv++) {
					if (number % pDiv == 0) {
						factors[size++] = pDiv;
						while (number % pDiv == 0) number /= pDiv;
					}
				}
				if (number > 1) {
					factors[size++] = number;
				}
				factors = Arrays.copyOf(factors, size);
				for (primitiveRoot = 2; !isPrimitiveRoot(primitiveRoot); primitiveRoot++) ; // do nothing
			}

			int getNthPrimitiveRoot(int n) {
				if ((prime - 1) % n != 0) return 0;
				return pow(primitiveRoot, (int) ((prime - 1) / n));
			}

			int[] getNthRootPots(int n) {
				int root = getNthPrimitiveRoot(n);
				int[] pots = new int[n + 1];
				pots[0] = 1;
				for (int i = 1; i < pots.length; i++) {
					pots[i] = mul(pots[i - 1], root);
				}
				return pots;
			}

			boolean isPrimitiveRoot(int number) {
				if (number <= 0 || number >= prime) return false;
				int phi = (int) prime - 1;
				for (int factor : factors) {
					if (pow(number, phi / factor) == 1) return false;
				}
				return true;
			}

			int inverse(int number) {
				return pow(number, (int) prime - 2);
			}

			int pow(int number, int exponent) {
				if (exponent == 0) return 1;
				int ret = pow(number, exponent / 2);
				ret = mul(ret, ret);
				if (exponent % 2 == 1) ret = mul(ret, number);
				return ret;
			}

			int mul(int a, int b) {
				return (int) ((a * (long) b) % prime);
			}

			int add(int a, int b) {
				long ret = a + (long) b;
				return (int) (ret >= prime ? ret - prime : ret);
			}

			int sub(int a, int b) {
				int ret = a - b;
				return (int) (ret >= 0 ? ret : ret + prime);
			}

		}

	}
}

