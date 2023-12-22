
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int h = scanner.nextInt();
			int k = scanner.nextInt();
			if ((n | m | h | k) == 0)
				break;
			int[] ten = new int[n];
			for (int i = 0; i < n; i++)
				ten[i] = scanner.nextInt();
			Point[] p = new Point[m];
			for (int i = 0; i < m; i++) {
				int pos = scanner.nextInt() - 1;
				int y = scanner.nextInt();
				p[i] = new Point(y, pos);
			}
			Arrays.sort(p);
			for (int i = m - 1; i >= 0; i--) {
				int pos = p[i].pos;
				swap(ten, pos, pos + 1);
			}
			int sum = 0;
			for (int i = 0; i < k; i++)
				sum += ten[i];
			int[] c = new int[n];
			for (int i = 0; i < n; i++)
				c[i] = i;
			int ans = sum;
			for (int i = 0; i < m; i++) {
				int pos = p[i].pos;
				int a = c[pos];
				int b = c[pos + 1];
				swap(c, pos, pos + 1);
				if (a > b)
					swap(a, b);
				if (a < k && k <= b)
					ans = Math.min(ans, sum - ten[a] + ten[b]);
			}
			System.out.println(ans);
		}
	}

	private void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;

	}

	private void swap(int[] ten, int pos, int i) {
		int tmp = ten[pos];
		ten[pos] = ten[i];
		ten[i] = tmp;
	}

	class Point implements Comparable<Point> {

		int y, pos;

		@Override
		public String toString() {
			return "Point [y=" + y + ", pos=" + pos + "]";
		}

		public Point(int y, int pos) {
			super();
			this.y = y;
			this.pos = pos;
		}

		@Override
		public int compareTo(Point o) {
			return y - o.y;
		}
	}
}