
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	
	double calc(Line2D.Double line, double x, double y, double h) {
		double d1 = line.ptSegDist(x, y);
		double d2 = (d1 * d1 + h * h) / (2 * h);
		return Math.max(d1, d2);
	}
	
	public void solve() {
		while (true) {
			int N = in.nextInt();
			if (N == 0) break;
			
			int sx = in.nextInt(), sy = in.nextInt(), ex = in.nextInt(), ey = in.nextInt();
			Line2D.Double line = new Line2D.Double(sx, sy, ex, ey);
			
			double rmax = Double.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				int minx = in.nextInt(), miny = in.nextInt();
				int maxx = in.nextInt(), maxy = in.nextInt();
				int h = in.nextInt();
				
				Rectangle2D.Double rect = 
						new Rectangle2D.Double(minx, miny, maxx - minx, maxy - miny);
				if (line.intersectsLine(minx, miny, minx, maxy)) rmax = 0;
				if (line.intersectsLine(minx, miny, maxx, miny)) rmax = 0;
				if (line.intersectsLine(maxx, maxy, minx, maxy)) rmax = 0;
				if (line.intersectsLine(maxx, maxy, maxx, miny)) rmax = 0;
				if (rect.contains(sx, sy)) rmax = 0;
				if (rect.contains(ex, ey)) rmax = 0;
				
				rmax = Math.min(rmax, calc(line, minx, miny, h));
				rmax = Math.min(rmax, calc(line, minx, maxy, h));
				rmax = Math.min(rmax, calc(line, maxx, miny, h));
				rmax = Math.min(rmax, calc(line, maxx, maxy, h));
				if (minx <= sx && sx <= maxx) {
					rmax = Math.min(rmax, calc(line, sx, miny, h));
					rmax = Math.min(rmax, calc(line, sx, maxy, h));
				}
				if (miny <= sy && sy <= maxy) {
					rmax = Math.min(rmax, calc(line, minx, sy, h));
					rmax = Math.min(rmax, calc(line, maxx, sy, h));
				}
				if (minx <= ex && ex <= maxx) {
					rmax = Math.min(rmax, calc(line, ex, miny, h));
					rmax = Math.min(rmax, calc(line, ex, maxy, h));
				}
				if (miny <= ey && ey <= maxy) {
					rmax = Math.min(rmax, calc(line, minx, ey, h));
					rmax = Math.min(rmax, calc(line, maxx, ey, h));
				}
			}
			System.out.println(rmax);
		}
	}	
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = nextIntArray(m);
			}
			return map;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = nextLongArray(m);
			}
			return map;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = nextDoubleArray(m);
			}
			return map;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}