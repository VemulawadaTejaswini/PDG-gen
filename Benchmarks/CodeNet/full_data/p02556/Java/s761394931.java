import java.util.*;

public class Main {
	static class Point{
		int x, y, zero, minus;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			zero = x + y;
			minus = x - y;
		}
		public int manhattan(Point p) {
			int tmpx = Math.abs(this.x - p.x);
			int tmpy = Math.abs(this.y - p.y);
			return tmpx + tmpy;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point p[] = new Point[n];
		for(int i = 0; i < n; ++i){
			p[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		Arrays.sort(p, new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				int ans = o1.zero - o2.zero;
				return ans;
			}
		});
		Point max = p[n - 1];
		Arrays.sort(p, new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				int ans = o1.minus - o2.minus;
				return ans;
			}
		});
		int ans = max.manhattan(p[0]);
		System.out.println(ans);
	}
}
