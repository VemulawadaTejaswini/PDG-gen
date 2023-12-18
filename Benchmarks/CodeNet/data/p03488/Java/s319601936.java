
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
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
		try {
			String S = sc.next().trim();
			int N = S.length();
			int x = sc.nextInt();
			int y = sc.nextInt();
			char[] A = new char[N];
			for (int i = 0; i < N; i++) {
				A[i] = S.charAt(i);
			}

			ArrayList<Integer> arr = new ArrayList<Integer>();
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (A[i] == 'F') {
					cnt++;
				} else {
					arr.add(cnt);
					cnt = 0;
				}
			}
			if (cnt > 0) {
				arr.add(cnt);
			}

			boolean[][] dpx = new boolean[8001][16002];
			boolean[][] dpy = new boolean[8001][16002];

			//原点はTrue
			dpx[0][8000] = true;
			dpy[0][8000] = true;
			//最初はXの正方向にのみ動くので
			dpx[1][8000 + arr.get(0)] = true;
			int cnt_x = 1, cnt_y = 0;

			for (int i = 1; i < arr.size(); i++) {
				if (i % 2 != 0) {
					//iが奇数の時はY方向
					cnt_y++;
					for (int j = 0; j < 16002; j++) {
						if (dpy[cnt_y - 1][j]) {
							if (j + arr.get(i) < 16002)
								dpy[cnt_y][j + arr.get(i)] = true;
							if (j - arr.get(i) >= 0)
								dpy[cnt_y][j - arr.get(i)] = true;
						}
					}
				} else {
					//iが偶数の時はX方向
					cnt_x++;
					for (int j = 0; j < 16002; j++) {
						if (dpx[cnt_x - 1][j]) {
							if (j + arr.get(i) < 16002)
								dpx[cnt_x][j + arr.get(i)] = true;
							if (j - arr.get(i) >= 0)
								dpx[cnt_x][j - arr.get(i)] = true;
						}
					}
				}
			}

			//out.println("x:" + dpx[cnt_x][8000 + x] + " , y:" + dpy[cnt_y][8000 + y]);
			if (dpx[cnt_x][8000 + x] && dpy[cnt_y][8000 + y]) {
				out.println("Yes");
			} else {
				out.println("No");
			}

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

	class InfoLong implements Comparable<InfoLong> {
		public long a;
		public long b;

		public InfoLong(long a, long b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(InfoLong o) {
			//return this.a - o.a;//昇順
			// return o.a - this.a;//降順
			//複数項目で並び替え。aの降順、aが同じならbの降順
			if (this.a == o.a) {
				return Long.compare(o.b, this.b);
			} else {
				return Long.compare(o.a, this.a);
			}
		}
	}

	class InfoInt implements Comparable<InfoInt> {
		public int a;
		public int b;

		public InfoInt(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(InfoInt o) {
			//return this.a - o.a;//昇順
			// return o.a - this.a;//降順
			//複数項目で並び替え。aの降順、aが同じならbの降順
			if (this.a == o.a) {
				return Integer.compare(o.b, this.b);
			} else {
				return Integer.compare(o.a, this.a);
			}
		}
	}

	//Arrays.sort(Sample,new Comp());
	class Comp implements Comparator<InfoLong> {
		public int compare(InfoLong be, InfoLong af) {
			return Long.compare(af.a, be.a);
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
