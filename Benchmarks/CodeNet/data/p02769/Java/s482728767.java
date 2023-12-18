import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;

	static class Combination {
		long n;
		long[] array;

		public Combination(long n) {
			this.n = n;
			this.array = new long[(int) (n + 1)];
			array[0] = 0L;
			array[1] = 1L;
			for (long i = 2; i <= n; ++i) {
				int index = (int) i;
				array[index] = array[index - 1] * i % MOD;
			}

		}

		static long pow(long base, long n) {
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

		static long inv(long val) {
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

		static long simpleCombi(long n, long c) {
			long result = 1L;
			if (c == 0 || c == n) {
				return 1L;
			}
			if (c > n / 2) {
				return simpleCombi(n, n - c);
			}
			for (long i = n; i > n - c; --i) {
				result *= i;
				result %= MOD;
			}
			for (long i = c; i > 0; --i) {
				result *= inv(i);
				result %= MOD;
			}
			return result;

		}

		long calcCombi(long c) {
			if (c == 0) {
				return 1L;
			}
			// まず階乗の配列を計算する
			long val = array[(int) (n)];
			val *= inv(array[(int) (n - c)]);
			val %= MOD;
			val *= inv(array[(int) (c)]);
			val %= MOD;
			return val;
		}

	}

	int n;
	long k;
	Map<Long, Combination> combiMap = new HashMap<>();
	long result = 0L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Combination getCombi(Long n) {
		if (!combiMap.containsKey(n)) {
			combiMap.put(n, new Combination(n));
		}
		return combiMap.get(n);
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		n = Integer.parseInt(tokens[0]);
		k = Long.parseLong(tokens[1]);
	}

	long sub(long n, long m) {
		long val = getCombi(n).calcCombi(m);
		val *= getCombi(n - 1).calcCombi((n - m) - 1) % MOD;
		return val;
	}

	void calc() {
		result = 1;
		for (long i = 1; i <= Math.min(k, n - 1); ++i) {
			result += sub(n, i);
			result %= MOD;
		}
	}

	void showResult() {
		System.out.println(result);
	}

}