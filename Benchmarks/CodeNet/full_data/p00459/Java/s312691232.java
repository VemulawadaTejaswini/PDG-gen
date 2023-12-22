
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			int p = scanner.nextInt() - 1;
			int q = scanner.nextInt();
			int r = scanner.nextInt();
			Deque<Point> deque = new ArrayDeque<Main.Point>();
			deque.push(new Point(1, n));
			while (m-- > 0) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				Deque<Point> tmp = new ArrayDeque<Point>();
				int ny = n - y;
				while (ny != 0) {
					Point point = deque.peekLast();
					if (point.len <= ny) {
						tmp.push(deque.pollLast());
						ny -= point.len;
					} else {
						tmp.push(new Point(point.len - ny + point.start, ny));
						deque.peekLast().len -= ny;
						break;
					}
				}
				int nx = y - x;
				while (nx != 0) {
					Point point = deque.peekLast();
					if (point.len <= nx) {
						deque.push(deque.pollLast());
						nx -= point.len;
					} else {
						deque.push(new Point(point.len - nx + point.start, nx));
						deque.peekLast().len -= nx;
						break;
					}
				}
				tmp.addAll(deque);
				deque = tmp;

			}
			int ny = n - q;
			while (ny != 0) {
				Point point = deque.peekLast();
				if (point.len <= ny) {
					deque.pollLast();
					ny -= point.len;
				} else {
					deque.peekLast().len -= ny;
					break;
				}
			}
			while (p != 0) {
				Point point = deque.peek();
				if (point.len <= p) {
					deque.poll();
					p -= point.len;
				} else {
					deque.peek().start += p;
					deque.peek().len -= p;
					break;
				}
			}
			int ans = 0;
			while (!deque.isEmpty()) {
				Point point = deque.poll();
				ans += Math.max(0, Math.min(r - point.start + 1, point.len));
			}
			System.out.println(ans);
		}
	}

	class Point {
		int start, len;

		public Point(int start, int len) {
			super();
			this.start = start;
			this.len = len;
		}

		@Override
		public String toString() {
			return "Point [start=" + start + ", len=" + len + "]";
		}

	}
}