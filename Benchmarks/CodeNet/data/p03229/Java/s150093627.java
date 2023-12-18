
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);
	static int mod = 1000000000 + 7; //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			int N = sc.nextInt();
			List<Long> mainList = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				mainList.add(sc.nextLong());
			}
			Collections.sort(mainList);

			int loc = N % 2 == 0 ? N / 2 : N / 2 + 1;
			List<Long> As = mainList.subList(0, loc);
			List<Long> Ab = mainList.subList(loc, N);

			Long[] A = new Long[N];
			if (N % 2 == 0) {
				for (int i = 0; i < N; i++) {
					if (i % 2 == 0) {
						A[i] = Ab.get(i / 2);
					} else {
						A[i] = As.get(i / 2);
					}
				}
				long ans = 0;
				for (int i = 1; i < N; i++) {
					ans += Math.abs(A[i - 1] - A[i]);
				}
				out.println(ans);
				return;
			} else {

				A[0] = As.get(loc - 1);

				for (int i = 1; i < N; i++) {
					if (i % 2 == 0) {
						A[i] = Ab.get(N - loc - i / 2);
					} else {
						A[i] = As.get(i / 2);
					}
				}
				long ans0 = 0;
				for (int i = 1; i < N; i++) {
					ans0 += Math.abs(A[i - 1] - A[i]);
				}

				for (int i = 1; i < N; i++) {
					if (i % 2 == 0) {
						A[i] = As.get(i / 2 - 1);
					} else {
						A[i] = Ab.get(i / 2);
					}
				}
				long ans1 = 0;
				for (int i = 1; i < N; i++) {
					ans1 += Math.abs(A[i - 1] - A[i]);
				}

				long ans = Math.max(ans0, ans1);

				for (int i = 1; i < N; i++) {
					if (i % 2 != 0) {
						A[i] = As.get(i / 2);
					} else {
						A[i] = Ab.get(i / 2 - 1);
					}
				}
				long ans2 = 0;
				for (int i = 1; i < N; i++) {
					ans2 += Math.abs(A[i - 1] - A[i]);
				}

				ans = Math.max(ans, ans2);
				out.println(ans);
			}

		} catch (

		ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}

	}

	class Exm implements Comparable<Exm> {

		public int a;
		public int b;

		public Exm(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Exm o) {

			//return this.a - o.a;//昇順
			// return o.a - this.a;//降順

			//複数項目で並び替え。aの降順、aが同じならbの降順
			if (this.a == o.a) {
				return o.b - this.b;
			} else {
				return o.a - this.a;
			}
		}

	}

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す(mod無しなので、大きい値には使用できない桁溢れする)
	 */
	long calcCombination(int n, int m) {
		if (n < m || m < 0) {
			throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
		}
		long c = 1;
		m = (n - m < m ? n - m : m);
		for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
			c *= ns;
			c /= ms;
		}
		return c;
	}

	/*
	 * 使用するときはModに注意。Global変数を参照
	 */
	public static long comb(long a, long b) {
		if (a < b)
			return 0;
		long res = 1;
		long inv = pow(fact(Math.min(b, a - b)), mod - 2);
		for (long i = a; i > a - Math.min(b, a - b); i--) {
			res *= i;
			res %= mod;
		}
		res *= inv;
		res %= mod;
		return res;
	}

	public static long pow(long x, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				res *= x;
				res %= mod;
			}
			x *= x;
			x %= mod;
			n >>= 1;
		}
		return res;
	}

	public static long fact(long n) {
		long res = 1;
		while (n > 0) {
			res *= n;
			res %= mod;
			n--;
		}
		return res;
	}

	/*
	 * HashmapのSort
	 * hmはhashmap
	 * keyvalは"key" or "val"を指定して
	 * ascdescは"asc" or "desc"を指定して
	 */
	private static List<Entry<Integer, Integer>> sortHashMapValue(HashMap<Integer, Integer> hm, String keyval,
			String ascdesc) {
		// 1.Map.Entryのリストを作成する
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(hm.entrySet());

		// 2.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				if (keyval.equals("val")) {
					if (ascdesc.equals("asc")) {
						// 昇順(value)
						return obj1.getValue().compareTo(obj2.getValue());
					} else {
						// 降順(value)
						return obj2.getValue().compareTo(obj1.getValue());
					}
				} else {
					if (ascdesc.equals("asc")) {
						// 昇順(value)
						return obj1.getKey().compareTo(obj2.getKey());
					} else {
						// 降順(value)
						return obj2.getKey().compareTo(obj1.getKey());
					}
				}
			}
		});
		/*
		// 3. ループで要素順に値を取得する
		for (Entry<Integer, Integer> entry : list_entries) {
			out.println(entry.getKey() + " : " + entry.getValue());
		}
		*/
		return list_entries;
	}

	// 高速なScanner
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
