
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);
	static int mod = (int) (1e9 + 7); //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		//TODO 復習
		// 素因数分解するとこまではできたが、その先がわからなかった。
		try {
			//String S = sc.next().trim();
			int N = sc.nextInt();
			int[] cnt = new int[N + 1];
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i = 1; i <= N; i++) {
				HashMap<Integer, Integer> eachhm = primefactorizationhm(i);
				eachhm.forEach((k, v) -> hm.merge(k, v, Integer::sum));
				for (Entry<Integer, Integer> e : eachhm.entrySet()) {
					cnt[e.getKey()] += e.getValue();
				}
			}
			//p^4 * q^4 * r^2
			//p^24 * q^2
			//p^14 * q^4
			//p^74
			long ans = 0;

			//p^4 * q^4 * r^2
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					for (int k = j + 1; k <= N; k++) {
						if (i != j && i != k && j != k && 2 <= cnt[i] && 4 <= cnt[j] && 4 <= cnt[k])
							ans++;
					}
				}
			}

			//p^24 * q^2
			//p^14 * q^4
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i != j && cnt[i] >= 24 && cnt[j] >= 2) {
						ans++;
					}

					if (i != j && cnt[i] >= 14 && cnt[j] >= 4) {
						ans++;
					}
				}
			}
			//p^74
			for (int i = 1; i <= N; i++) {
				if (cnt[i] >= 74)
					ans++;
			}

			out.println(ans);

		} catch (ArithmeticException ae) {
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

	public static HashMap<Integer, Integer> primefactorizationhm(int number) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				while (number % i == 0) {
					arr.add(i);
					if (hm.containsKey(i)) {
						int count = hm.get(i);
						count++;
						hm.put(i, count);
					} else {
						hm.put(i, 1);
					}
					number /= i;
				}
			}
		}
		// 最後に残った数について
		if (number != 1) {
			arr.add(number);
			if (hm.containsKey(number)) {
				int count = hm.get(number);
				count++;
				hm.put(number, count);
			} else {
				hm.put(number, 1);
			}
		}

		return hm;
	}

	/*
	 * 約数列挙(O(√N ))
	 */
	public static ArrayList<Long> enum_divisors(long number) {
		ArrayList<Long> arr = new ArrayList<Long>();
		for (long i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				arr.add(i);
				// 重複しないならば i の相方である N/i も push
				if (number / i != i)
					arr.add(number / i);
			}
		}

		Collections.sort(arr);

		return arr;
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
