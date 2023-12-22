// package beginner00177;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {
	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int n = in.ni();
		int[] nums = in.nia(n);
		int max = Arrays.stream(nums).parallel().max().getAsInt();
		String pairwise = "pairwise coprime";
		String setwise = "setwise coprime";
		String neither = "not coprime";

		SieveOfEratosthenis sieve = new SieveOfEratosthenis(max);
		int[] count = new int[max + 1];

		long gcd = nums[0];
		for (int num : nums) {
//			System.out.print("GCD of " + gcd + " and " + num + " is ");
			gcd = SieveOfEratosthenis.gcd(gcd, num);
//			System.out.println(gcd);
			Map<Long, Integer> fact = sieve.factorize(num);
			for (long prime : fact.keySet()) {
				count[(int) prime]++;
			}
		}

		int maxPrimeCount = Arrays.stream(count).parallel().max().getAsInt();
		if (maxPrimeCount > 1) {
			if (gcd == 1)
				out.println(setwise);
			else
				out.println(neither);
		} else {
			out.println(pairwise);
		}
	}

	public static void main(String[] args) throws IOException {
		// long start = System.nanoTime();
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		// System.out.println("Elapsed: " + (System.nanoTime() - start) / 1000000 +
		// "ns");
	}

	static class SieveOfEratosthenis {
		private final int[] minFactor; // minFactor[i] = i's minimum prime factor, minFactor[i] > 1
		private final List<Integer> primes;
		private final int max;

		/**
		 * Space: O(N)
		 * 
		 * Time: O(NloglogN)
		 * 
		 */
		public SieveOfEratosthenis(int n) {
			max = n;
			minFactor = new int[n + 1];
			for (int i = 0; i < minFactor.length; i++)
				minFactor[i] = i;
			primes = new ArrayList<>();

			for (int factor = 2; factor <= max; factor++) {
				if (minFactor[factor] == factor) {
					primes.add(factor);
					for (int multi = factor; multi <= max; multi += factor)
						minFactor[multi] = factor;
				}
			}
		}

		/**
		 * Returns the prime factorization of a specified integer {@code n}, 0 < n <=
		 * max * max.
		 * 
		 * Space: O(logn)
		 * 
		 * Time: O(max/logmax)
		 * 
		 * @param n the integer
		 * @return the prime factorization of a specified integer
		 */
		public Map<Long, Integer> factorize(int n) {
			assert n > 0;
			assert n <= (long) max * max;
			Map<Long, Integer> map = new HashMap<>();
			if (n < max) {
				while (n > 1) {
					long prime = (long) minFactor[n];
					map.put(prime, map.getOrDefault(prime, 0) + 1);
					n /= minFactor[n];
				}
			} else {
				for (int prime : primes) {
					while (n % prime == 0) {
						map.put((long) prime, map.getOrDefault(prime, 0) + 1);
						n /= prime;
					}
				}
				if (n > 1)
					map.put((long) n, map.getOrDefault(n, 0) + 1);
			}
			return map;
		}

		/**
		 * Returns the divisors of a specified integer n, 0 < n < max * max.
		 * 
		 * @param n the integer
		 * @return the divisors of a specified integer n, 0 < n < max * max
		 */
		public List<Integer> divisors(int n) {
			List<Integer> divisors = new ArrayList<>();
			divisors.add(1);
			Map<Long, Integer> factorization = factorize(n);
			for (long prime : factorization.keySet()) {
				int size = divisors.size();
				for (int i = 0; i < size; i++) {
					int count = factorization.get(prime);
					for (int p = 1, c = 1; c < count; c++) {
						p *= prime;
						divisors.add(p * divisors.get(i));
					}
				}
			}
			return divisors;
		}

		public int[] moebiusFunctionTable() {
			int[] moebius = new int[max];
			for (int i = 1; i < max; i++) {
				if (i == 1)
					moebius[i] = 1;
				else if (i / minFactor[i] % minFactor[i] == 0)
					moebius[i] = 0;
				else
					moebius[i] = -moebius[i / minFactor[i]];
			}
			return moebius;
		}

		public int max() {
			return max;
		}

		public static long gcd(long a, long b) {
			return a % b == 0 ? b : gcd(b, a % b);
		}

		// BUGGY :: wrong result in Circuits19_DeltaFunction.java [HackerEarth]
		public static int gcdLarge(int a, int b) {
			return gcdLarge(a, b, 1);
		}

		private static int gcdLarge(int a, int b, int res) {
			if (a == b)
				return res * a;
			else if (a % 2 == 0 && b % 2 == 0)
				return gcdLarge(a / 2, b / 2, res);
			else if (a % 2 == 0)
				return gcdLarge(a / 2, b, res);
			else if (b % 2 == 0)
				return gcdLarge(a, b / 2, res);
			else if (a > b)
				return gcdLarge(a - b, b, res);
			else
				return gcdLarge(a, b - a, res);
		}

		public static long lcm(long a, long b) {
			return a * b / gcd(a, b);
		}
	}

	@SuppressWarnings("unused")
	private static class In {
		final private static int BUFFER_SIZE = 1024;
		private byte[] buf;
		private InputStream is;
		private int buflen;
		private int bufptr;

		public In() {
			is = System.in;
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public In(String input) {
			is = new ByteArrayInputStream(input.getBytes());
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public int readByte() {
			if (bufptr >= buflen) {
				try {
					buflen = is.read(buf);
				} catch (IOException ioe) {
					throw new InputMismatchException();
				}
				bufptr = 0;
			}
			if (buflen <= 0)
				return -1;
			return buf[bufptr++];
		}

		public boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		public int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		/* Next character */
		public char nc() {
			return (char) skip();
		}

		/* Next double */
		public double nd() {
			return Double.parseDouble(ns());
		}

		/* Next string */
		public String ns() {
			final StringBuilder sb = new StringBuilder();
			int b = skip();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		/* Next integer */
		public int ni() {
			boolean minus = false;
			int num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next long */
		public long nl() {
			boolean minus = false;
			long num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next integer 1D array */
		public int[] nia(int n) {
			final int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = ni();
			return arr;
		}

		/* Next long 1D array */
		public long[] nla(int n) {
			final long[] arr = new long[n];
			for (int i = 0; i < n; i++)
				arr[i] = nl();
			return arr;
		}

		/* Next string 1D array */
		public String[] nsa(int n) {
			final String[] arr = new String[n];
			for (int i = 0; i < n; i++)
				arr[i] = ns();
			return arr;
		}

		/* Next char 1D array */
		public char[] nca(int n) {
			final char[] arr = new char[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next double 1D array */
		public double[] nda(int n) {
			final double[] arr = new double[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next integer matrix */
		public int[][] nim(int n, int m) {
			final int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ni();
			return arr;
		}

		/* Next long matrix */
		public long[][] nlm(int n, int m) {
			final long[][] arr = new long[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nl();
			return arr;
		}

		/* Next string matrix */
		public String[][] nsm(int n, int m) {
			final String[][] arr = new String[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ns();
			return arr;
		}

		/* Next char matrix */
		public char[][] ncm(int n, int m) {
			final char[][] arr = new char[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nc();
			return arr;
		}

		/* Next double matrix */
		public double[][] ndm(int n, int m) {
			final double[][] arr = new double[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nd();
			return arr;
		}

		public static void log(Object... o) {
			System.out.println(Arrays.deepToString(o));
		}
	}

}
