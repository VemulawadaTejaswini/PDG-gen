
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		//TODO 復習
		//解説の解き方が浮かんでいたが正確にどのように実施するかわからず解けなかった
		//8パターンためすのはわかっていたから悔しい

		try {
			//String S = sc.next().trim();
			int N = sc.nextInt();
			int M = sc.nextInt();
			InfoLong[] info = new InfoLong[N];
			for (int i = 0; i < N; i++) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				long z = sc.nextLong();
				InfoLong e = new InfoLong(x, y, z);
				info[i] = e;
			}

			long ans = 0;
			ArrayList<Long> arr = new ArrayList<Long>();
			//Nは要素数 (bit全探索)
			//計算量はO(2^N) Nが0-20~25 (30は多分無理)くらいまでしか使えない
			Out: for (int bit = 0; bit < (1 << 3); bit++) {
				arr = new ArrayList<Long>();
				//out.println("------------");
				//out.println(Integer.toBinaryString(bit));
				boolean x_p = true;
				boolean y_p = true;
				boolean z_p = true;
				In: for (int j = 0; j < 3; j++) {
					if ((1 & bit >> j) == 1) {
						//out.println(j);
						if (j == 0) {
							x_p = false;
						} else if (j == 1) {
							y_p = false;
						} else {
							z_p = false;
						}
					}
				}
				//out.println(x_p + " " + y_p + " " + z_p);

				for (int i = 0; i < N; i++) {
					long sum = 0;
					if (x_p) {
						sum += info[i].x;
					} else {
						sum -= info[i].x;
					}
					if (y_p) {
						sum += info[i].y;
					} else {
						sum -= info[i].y;
					}
					if (z_p) {
						sum += info[i].z;
					} else {
						sum -= info[i].z;
					}
					arr.add(sum);
				}
				Collections.sort(arr, Collections.reverseOrder());

				long each = 0;
				for (int i = 0; i < M; i++) {
					each += arr.get(i);
				}
				ans = Math.max(ans, each);

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

	class InfoLong {
		public long x;
		public long y;
		public long z;

		public InfoLong(long x, long y, long z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
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
