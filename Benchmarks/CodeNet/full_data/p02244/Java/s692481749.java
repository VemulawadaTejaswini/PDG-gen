import java.io.*;
import java.util.*;

// AOJ ALDS1_13_A 8Queens
public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int k = sc.nextInt();

		int[] r = new int[k];
		int[] c = new int[k];
		for (int i = 0; i < k; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		int n = 8;

		Permutation np = new Permutation(n);
		out:
		for (List<Integer> perm : np) {
//			pr.println(perm);
			for (int i = 0; i < k; i++) {
				if (perm.get(r[i]) != c[i]) {
					continue out;
				}
			}

			if (!isOK(perm)) {
				continue out;
			}

	    	String[] q = {"Q.......", ".Q......", "..Q.....", "...Q....", "....Q...", ".....Q..", "......Q.", ".......Q"};
	    	for (int i = 0; i < 8; i++) {
	    		pr.println(q[perm.get(i)]);
	    	}

	    	return;
		}
	}

	private static boolean isOK(List<Integer> perm) {
		int n = perm.size();

		for (int i = 0; i < n; i++) {
			int p = perm.get(i);
			for (int j = 1; i + j < n; j++) {
				if (p + j < n && p + j == perm.get(i + j)) {
					return false;
				}
				if (p - j >= 0 && p - j == perm.get(i + j)) {
					return false;
				}
			}
		}

		return true;
	}

	private static class Permutation implements Iterable<List<Integer>>{
		int n;
		long nn;

		Permutation(int n) {
			this.n = n;

			nn = 1;
			for (int i = 2; i <= n; i++) {
				nn *= i;
			}
		}

		@Override
		public Iterator<List<Integer>> iterator() {
			return new PermutationIterator();
		}

		private class PermutationIterator implements Iterator<List<Integer>> {
			boolean[] used;
			List<Integer> perm;
			Deque<Integer> ist;
			long cnt = 0;

			PermutationIterator() {
				used = new boolean[n];
				perm = new ArrayList<Integer>(n);
				ist = new ArrayDeque<Integer>();
				ist.add(-1);
			}

			@Override
			public boolean hasNext() {
				return cnt < nn;
			}

			@Override
			public List<Integer> next() {
				out:
				while (!ist.isEmpty()) {
					int k = ist.pop();

					if (k != -1) {
						// ループ途中での戻り
						used[k] = false;
						perm.remove(perm.size() - 1);
					} else {
						// 最初から
						int pos = perm.size();

						if (pos == n) {
							cnt++;
							// perm に対する操作 =========================
							return perm;
							// perm に対する操作 =========================
						}
					}

					for (int i = k + 1; i < n; i++) {
						if (!used[i]) {
							ist.push(i);

							used[i] = true;
							perm.add(i);
							ist.push(-1);
							continue out;
						}
					}
				}

				return null;
			}

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

