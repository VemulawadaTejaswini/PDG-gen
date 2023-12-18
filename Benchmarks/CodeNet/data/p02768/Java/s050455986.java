import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;

	static class Combi {
		private int n;
		long[] array;

		public Combi(int n) {
			long fact = fact(n);
			this.n = n;
			array = new long[(int) (n + 1)];
			array[0] = 0L;
			array[1] = 1L;
			for (long i = 2; i <= Math.min(200000, n); ++i) {
				int index = (int) i;
				array[index] = array[index - 1] * i % MOD;
			}
			array[n] = fact;
			for (long i = n; i >= Math.max(n - 200000, n / 2); --i) {
				int index = (int) i;
				array[index - 1] = array[index] * inv(i) % MOD;
			}
		}

		private long fact(long val) {
			int arrayLen = 0;
			if(val %2 == 0) {
				arrayLen = (int)val /2;
			}else {
				arrayLen = (int)val/2+1;
			}
			long[] array = new long[(int) arrayLen];
			for (int i = 0; i < array.length; ++i) {
				if ((i*2) + 2 <= val) {
					array[i] = (((long)(i * 2) + 1) * ((long)(i * 2) + 2)) % MOD;
				} else {
					array[i] = (i * 2) + 1;
				}
			}
//			long[] array = new long[(int)val];
//			for(int i = 0; i < array.length; ++i) {
//				array[i] = i+1;
//			}
			int t = 1, len = array.length;
			while (t <= len) {
				for (int i = 0; i < len; i += t * 2) {
					if (t + i < len) {
						array[i] *= array[i + t];
						array[i] %= MOD;
					}
				}
				t *= 2;
			}
			array[0] %= MOD;
			// System.out.println(array[0]);
			return array[0];
		}

		public long pow(long base, long n) {
			long result = 1L;
			long y = base;
			long times = n;
			while (times != 0) {
				if ((times & 1L) > 0) {
					result = (result * y) % MOD;
				}
				y = (y * y) % MOD;
				times /= 2;
			}
			return result;
		}

		private long inv(long val) {
			long result = 1L;
			long k = MOD - 2L;
			long y = val;
			while (k != 0) {
				if ((k & 1L) > 0) {
					result = (result * y) % MOD;
				}
				y = (y * y) % MOD;
				k /= 2;
			}
			return result;

		}

		public long calcCombi(long n, long c) {
			if (c == 0) {
				return 1L;
			}

			long val = array[(int) (n)];
			val *= inv(array[(int) (n - c)]);
			val %= MOD;
			val *= inv(array[(int) (c)]);
			val %= MOD;
			return val;
		}
	}

	int n, a, b;
	long result = 0;
	Combi combi;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		n = Integer.parseInt(tokens[0]);
		a = Integer.parseInt(tokens[1]);
		b = Integer.parseInt(tokens[2]);
		this.combi = new Combi(n);
		result = combi.pow(2, n) - 1;
	}

	void calc() {
		// System.out.println(result);
		result -= combi.calcCombi(n, a);
		if (result < 0) {
			result += MOD;
		}
		result -= combi.calcCombi(n, b);
		if (result < 0) {
			result += MOD;
		}

	}

	void showResult() {
		System.out.println(result);
	}

}