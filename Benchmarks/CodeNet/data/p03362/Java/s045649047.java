import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		Prime prime = new Prime(55555);

		int n = sc.nextInt();

		List<Integer> ans = new ArrayList<>();
		for (int p : prime) {
			if (ans.size() >= n) {
				break;
			}

			if (p % 10 == 1) {
				ans.add(p);
			}
		}

		for (int i = 0, size = ans.size(); i < size; i++) {
			if (i > 0) {
				pr.print(' ');
			}
			pr.print(ans.get(i));
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
			Map<Long, Integer> hm = new TreeMap<>();
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
					return n >= 2;
				} else {
					return 2 * (index + 1) + 1 <= n;
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

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
