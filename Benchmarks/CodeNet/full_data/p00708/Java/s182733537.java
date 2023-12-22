import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class Main {
	int[] par;

	class Ball {
		double x, y, z;
		double r;

		Ball(double x, double y, double z, double r) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.r = r;
		}
	}

	class Edge implements Comparable<Edge>{
		double len;
		int x, y;

		Edge(double len, int x, int y) {
			this.len = len;
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Edge o) {
			if (this.len - o.len > 0) return 1;
			if (this.len - o.len < 0) return -1;
			return 0;
		}
	}

	double dist(Ball a, Ball b) {
		double res = 0;
		res = Math.hypot(Math.abs(a.x - b.x), Math.abs(a.y - b.y));
		res = Math.hypot(res, Math.abs(a.z - b.z));
		return res;
	}

	boolean isTouching(Ball a, Ball b) {
		return dist(a, b) < a.r + b.r;
	}

	void union(int x, int y) {
		x = root(x);
		y = root(y);
		par[x] = y;
	}

	boolean find(int x, int y) {
		return root(x) == root(y);
	}

	int root(int x) {
		if (par[x] == x) return x;
		return root(par[x]);
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			Ball[] b = new Ball[n];
			for (int i = 0; i < n; i++) {
				b[i] = new Ball(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			}

			par = new int[n];
			for (int i = 0; i < n; i++) {
				par[i] = i;
			}

			List<Edge> list = new LinkedList<Edge>();
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (!isTouching(b[i], b[j])) {
						list.add(new Edge(dist(b[i], b[j]) - b[i].r - b[j].r, i, j));
					} else {
						union(i, j);
					}
				}
			}

			double sum = 0;
			Collections.sort(list);
			for (Edge E: list) {
				if (!find(E.x, E.y)) {
					union(E.x, E.y);
					sum += E.len;
				}
			}

			System.out.printf("%.3f\n", sum);
		}
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
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
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

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
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