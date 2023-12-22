import java.util.Arrays;

public class Main {
	Scanner sc = new Scanner();

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}

	void run() {
		for (;;) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			Circle[] info = new Circle[N];
			for (int i = 0; i < N; i++) {
				info[i] = new Circle(sc.nextDouble(), sc.nextDouble(),
						sc.nextDouble());
			}
			double min = Double.MAX_VALUE;
			double dist = 0;
			Arrays.sort(info);
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (j > i + 50) {
						break;
					}
					dist = Math.hypot(info[i].x - info[j].x, info[i].y
							- info[j].y);
					min = Math.min(min, dist - info[i].r - info[j].r);
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class Circle implements Comparable<Circle> {
		double r;
		double x;
		double y;

		Circle(double r, double x, double y) {
			this.r = r;
			this.x = x;
			this.y = y;
		}

		public int compareTo(Circle c) {
			return (int) (this.x - c.x);
		}
	}
}