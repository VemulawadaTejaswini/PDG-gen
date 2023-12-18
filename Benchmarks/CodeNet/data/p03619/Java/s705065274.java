import java.io.*;
import java.util.*;

public class Main {

	boolean in(int p, int q, int x) {
		// is x in segment p-q(inclusive)
		return (p <= x && x <= q) || (q <= x && x <= p);
	}

	static class Point implements Comparable<Point> {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			return Integer.compare(x, o.x);
		}
	}

	void submit() {
		int x1 = nextInt();
		int y1 = nextInt();
		int x2 = nextInt();
		int y2 = nextInt();

		int n = nextInt();

		Point[] a = new Point[n];

		int ptr = 0;

		for (int i = 0; i < n; i++) {
			int x = nextInt();
			int y = nextInt();
			if (!in(x1, x2, x) || !in(y1, y2, y)) {
				continue;
			}

			x = Math.abs(x - x1);
			y = Math.abs(y - y1);

			a[ptr++] = new Point(x, y);
		}

		a = Arrays.copyOf(a, ptr);

		int dx = Math.abs(x2 - x1);
		int dy = Math.abs(y2 - y1);

		if (dx > dy) {
			int tmp = dy;
			dy = dx;
			dx = tmp;

			for (Point p : a) {
				tmp = p.x;
				p.x = p.y;
				p.y = tmp;
			}
		}

		Arrays.sort(a);

		long base = 100L * (dx + dy);

		if (dx == 0) {
			if (a.length == 1) {
				out.println(base + PENALTY);
			} else if (a.length == 0) {
				out.println(base);
			} else {
				throw new AssertionError();
			}
			return;
		}

		if (dx == 1) {
			if (a.length == 0) {
				out.println(base);
			} else if (a.length == 1) {
				out.println(base - BONUS);
			} else if (a.length == 2) {
				int yZero = a[0].y;
				int yOne = a[1].y;

				out.println(base - BONUS);
				
//				if (yZero < yOne) {
//					out.println(base - BONUS + PENALTY);
//				} else {
//					out.println(base - BONUS);
//				}
			} else {
				throw new AssertionError();
			}
			return;
		}

		int[] arr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i].y;
		}

		int[] aux = new int[a.length + 2];
		Arrays.fill(aux, Integer.MAX_VALUE);
		aux[0] = Integer.MIN_VALUE;

		int ans = 0;
		for (int x : arr) {
			int low = 0; // <
			int high = ans + 1; // >=

			while (high - low > 1) {
				int mid = (low + high) >> 1;
				if (aux[mid] < x) {
					low = mid;
				} else {
					high = mid;
				}
			}
			
			aux[high] = x;
			if (high == ans + 1) {
				ans++;
			}
		}
		
//		System.err.println(ans);
		
		out.println(base - BONUS * ans);
	}

	static final double BONUS = 20 - 5 * Math.PI;
	static final double PENALTY = 10 * Math.PI - 20;

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
