import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		Point[] a = new Point[h * w + 1];
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++) {
				int tem = Integer.parseInt(sc.next());
				a[tem] = new Point(i, j);
			}
		int q = Integer.parseInt(sc.next());
		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			int ans = 0;
			int xd = a[l].x;
			int yd = a[l].y;
			while(true) {
				if (l == r) {
					out.println(ans);
					break;
				}
				int x = xd;
				int y = yd;
				l += d;
				xd = a[l].x;
				yd = a[l].y;
				ans += Math.abs(xd - x) + Math.abs(yd - y);
			}
		}
		out.flush();
	}
}