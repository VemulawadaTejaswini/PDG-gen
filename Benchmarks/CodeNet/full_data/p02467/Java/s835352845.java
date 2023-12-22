import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		Prime prime = new Prime((int)Math.sqrt(n));

		Map<Long, Integer> hm = prime.primeFactorize(n);

		pr.printf("%d:", n);
		for (Entry<Long, Integer> e : hm.entrySet()) {
			long p = e.getKey();
			for (int i = 0, size = e.getValue(); i < size; i++) {
				pr.print(' ');
				pr.print(p);
			}
		}
		pr.println();
	}

	static class Prime implements Iterable<Integer> {
		private int n;
		private BitSet p;

		Prime(int n) {
			this.n = n;

			p = new BitSet(n / 2);
			int m = (int)Math.sqrt(n);

//			for (int i = 1; i <= m; i++) {
			for (int bi = p.nextClearBit(0); 2 * (bi + 1) + 1 <= m; bi = p.nextClearBit(bi + 1)) {
				long i = bi + 1;
//				if (p.get(i - 1)) {
//					continue;
//				}

				for (long j = 2 * i * (i + 1); 2 * j + 1 <= n; j += 2 * i + 1) {
					p.set((int)(j - 1));
				}
			}
		}

		boolean isPrime(int n) {
			if (n == 2) {
				return true;
			}

			if (n == 1 || (n & 0x1) == 0) {
				return false;
			}

			return !p.get(n / 2 - 1);
		}

		List<Integer> getPrimeList() {
			List<Integer> ret = new ArrayList<>();
			for (int p : this) {
				ret.add(p);
			}

			return ret;
		}

		Map<Long, Integer> primeFactorize(long x) {
			Map<Long, Integer> hm = new HashMap<>();
			long n = x;
			for (int p : this) {
				if ((long)p * p > n) {
					break;
				}
				int cnt = 0;
				while (n % p == 0) {
					cnt++;
					n /= p;
				}
				if (cnt > 0) {
					hm.put((long)p, cnt);
				}
			}
			if (n != 1) {
				hm.put(n, 1);
			}

			return hm;
		}

		@Override
		public Iterator<Integer> iterator() {
			return new PrimeIterator();
		}

		private class PrimeIterator implements Iterator<Integer> {
			int index;

			PrimeIterator() {
				index = -1;
			}

			@Override
			public boolean hasNext() {
				if (index == -1) {
					if (n >= 2) {
						return true;
					} else {
						return false;
					}
				} else if (2 * (index + 1) + 1 <= n) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public Integer next() {
				if (index == -1) {
					if (n >= 2) {
						index = p.nextClearBit(0);
						return 2;
					} else {
						throw new NoSuchElementException();
					}
				} else {
					int ret = 2 * (index + 1) + 1;

					if (ret <= n) {
						index = p.nextClearBit(index + 1);

						return ret;
					} else {
						throw new NoSuchElementException();
					}
				}
			}
		}

		static boolean isPrime(long n) {
			if (n == 2) {
				return true;
			}

			if (n == 1 || (n & 0x1) == 0) {
				return false;
			}

			for (long i = 3; i * i <= n; i += 2) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}

