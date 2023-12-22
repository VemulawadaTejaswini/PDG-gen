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
		int zmax = 0, zmin = Integer.MAX_VALUE, wmax = Integer.MIN_VALUE, wmin = Integer.MAX_VALUE;
		for(int i = 0; i < n; ++i){
			Point tmp = p[i];
			int tmpz = tmp.zero;
			int tmpw = tmp.minus;
			zmax = Math.max(zmax, tmpz);
			zmin = Math.min(zmin, tmpz);
			wmax = Math.max(wmax, tmpw);
			wmin = Math.min(wmin, tmpw);
		}
		int ans = Math.max((zmax - zmin), (wmax - wmin));
		System.out.println(ans);
	}
}
