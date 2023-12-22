import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Point {
		int x, y;
		int t;
		int ig;
		Point(int x, int y, int t, int ig) {
			this.x =x;
			this.y = y;
			this.t = t;
			this.ig = ig;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == null || !(obj instanceof Point)) return false;
			return ((Point)obj).x == this.x && ((Point)obj).y == this.y && ((Point)obj).t == this.t && ((Point)obj).ig == this.ig;
		}
	}
	
	class MyComparator<T> implements Comparator<T> {
		@Override
		public int compare(T o0, T o1) {
			return ((Point)o0).ig-((Point)o1).ig;
		}
	}
	
	void run() {
		int INF = 1000000000;
		int pad = 101;
		int sx = sc.nextInt(), sy = sc.nextInt(), gx = sc.nextInt(), gy = sc.nextInt();
		int n = sc.nextInt();
		boolean[][] map = new boolean[2*pad][2*pad];
		for (int i = 0; i < n; i++) {
			map[sc.nextInt()+pad][sc.nextInt()+pad] = true;
		}
		int lx = sc.nextInt(), ly = sc.nextInt();
		int[][][] cost = new int[2*pad][2*pad][6];
		for (int x = -lx; x <= lx; x++)
			for (int y = -ly; y <= ly; y++)
				for (int t = 0; t < 6; t++)
					cost[x+pad][y+pad][t] = INF;
		cost[sx+pad][sy+pad][0] = 0;
		
		PriorityQueue<Point> queue = new PriorityQueue<Point>(11,new MyComparator<Point>());
		queue.add(new Point(sx, sy, 0, 0));
		
		int[] x0 = {0,1, 1, 0,-1,-1,0};
		int[] y0 = {1,0,-1,-1,-1, 0,0};
		int[] x1 = {0,1,1, 0,-1,-1,0};
		int[] y1 = {1,1,0,-1, 0, 1,0};
		
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			int x = p.x, y = p.y, t = p.t;
			int d = Math.abs(t*x*y)%6;
			if (x % 2 == 0) {
				for (int i = 0; i < 7; i++) {
					int X = x+x0[i], Y = y+y0[i];
					if (X >= -lx && X <= lx && Y >= -ly && Y<= ly && !map[X+pad][Y+pad]) {
						int g = (i == d) ? 0 : 1;
						if (cost[X+pad][Y+pad][(t+1)%6] > p.ig+g) {
							cost[X+pad][Y+pad][(t+1)%6] = p.ig+g;
							queue.add(new Point(X,Y,(t+1)%6,p.ig+g));
						}
					}
				}
			} else {
				for (int i = 0; i < 7; i++) {
					int X = x+x1[i], Y = y+y1[i];
					if (X >= -lx && X <= lx && Y >= -ly && Y<= ly && !map[X+pad][Y+pad]) {
						int g = (i == d) ? 0 : 1;
						if (cost[X+pad][Y+pad][(t+1)%6] > p.ig+g) {
							cost[X+pad][Y+pad][(t+1)%6] = p.ig+g;
							queue.add(new Point(X,Y,(t+1)%6,p.ig+g));
						}
					}
				}
			}
		}
		
		int res = INF;
		for (int i = 0; i < 6; i++) {	
			res = Math.min(res, cost[gx+pad][gy+pad][i]);
		}
		if (res == INF)
			out.println(-1);
		else
			out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}