import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Point2D[] circle = new Point2D[n];
			int[] circle_r = new int[n];
			
			for(int i = 0; i < n; i++){
				circle[i] = new Point2D(sc.nextInt(), sc.nextInt());
				circle_r[i] = sc.nextInt();
			}
			
			Point2D[] points = new Point2D[n * 2];
			
			points[0] = new Point2D(circle[0].x, circle[0].y);
			
			for(int num = 0; num < n - 1; num++){
				Point2D[] result = Point2D.cross_ss(circle[num], circle_r[num], circle[num+1], circle_r[num+1]);
				points[2 * num + 1] = result[0];
				points[2 * num + 2] = result[1];
			}
			
			points[2*n-1] = new Point2D(circle[n-1].x, circle[n-1].y);
			
			double[][] adj = new double[n * 2][n * 2];
			for(int i = 0; i < n * 2; i++){
				Arrays.fill(adj[i], Double.MAX_VALUE);
			}
			
			for(int from = 0; from < 2 * n; from++){
				for(int to = from + 1; to < 2 * n; to++){
					final int start = Math.min(n - 2, (from - 1) / 2);
					final int end = Math.min(n - 2, (to - 1) / 2);
					
					//System.out.println(from + " " + start + " " + to + " " + end + " : " + n);
					
					boolean flag = true;
					for(int line = start; line <= end; line++){
						final int s_line = line * 2 + 1;
						final int e_line = line * 2 + 2;
						
						//System.out.println(s_line + " " + e_line);
						
						if(!Point2D.intersect_s(points[from], points[to], points[s_line], points[e_line])){
							flag = false;
							break;
						}
					}
					
					if(flag){
						adj[from][to] = adj[to][from] = points[from].dist(points[to]);
						//System.out.println(from + " " + to + " =>" + adj[from][to]);
					}
				}
			}
			
			double[] dist = new double[n * 2];
			boolean[] used = new boolean[n * 2];
			Arrays.fill(dist, Double.MAX_VALUE);
			dist[0] = 0;
			
			for(int tt = 0; tt < 2 * n; tt++){
				int min_pos = -1;
				double min = Double.MAX_VALUE;
				
				//System.out.println(tt + Arrays.toString(dist));
				
				for(int pos = 0; pos < 2 * n; pos++){
					if(!used[pos] && dist[pos] < min){
						min = dist[pos];
						min_pos = pos;
					}
				}
				
				used[min_pos] = true;
				if(min_pos == 2 * n - 1){
					break;
				}
				
				for(int to = 0; to < 2 * n; to++){
					if(used[to] || adj[min_pos][to] == Double.MAX_VALUE){
						continue;
					}
					
					dist[to] = Math.min(dist[to], dist[min_pos] + adj[min_pos][to]);
				}
			}
			
			System.out.printf("%.6f\n", dist[2 * n - 1]);
		}
	}
	
	public static class Point2D{
		public double x;
		public double y;

		public static final double EPS = 1e-9;

		public Point2D(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		//オマケ
		public Point2D(Point2D point) {
			this.x = point.x;
			this.y = point.y;
		}

		//オマケ
		public String toString() {
			return x + "," + y;
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof Point2D) {
				Point2D another = (Point2D) o;
				
				if(Point2D.eq(this.x, another.x) && Point2D.eq(this.y, another.y)){
					return true;
				}
				
				return false;
			}
			return false;
		}
		
		public Point2D add(Point2D another) {
			Point2D ret = new Point2D(this);
			ret.x += another.x;
			ret.y += another.y;
			return ret;
		}
		
		public Point2D minus(){
			Point2D ret = new Point2D(this);
			ret.x = -ret.x;
			ret.y = -ret.y;
			return ret;
		}
		
		public Point2D sub(Point2D another) {
			return this.add(another.minus());
		}

		public Point2D mul(double d) {
			Point2D ret = new Point2D(this);
			ret.x *= d;
			ret.y *= d;
			return ret;
		}

		public Point2D div(double d) {
			Point2D ret = new Point2D(this);
			ret.x /= d;
			ret.y /= d;
			return ret;
		}
		
		public double dot(Point2D another) {
			return this.x * another.x + this.y * another.y;
		}

		public double cross(double x, double y) {
			return this.x * y - this.y * x;
		}

		public double cross(Point2D another) {
			return this.x * another.y - this.y * another.x;
		}
		
		public double dist(Point2D another){
			return Math.sqrt((this.x - another.x) * (this.x - another.x) +
					 		 (this.y - another.y) * (this.y - another.y));
		}

		public double dist_o() {
			final Point2D ZERO = new Point2D(0, 0);
			return this.dist(ZERO);
		}

		public Point2D unit() {
			return this.div(this.dist_o());
		}

		public boolean pol(Point2D start, Point2D end) {
			return end.sub(start).cross(this.sub(start)) < EPS;
		}

		public boolean pos(Point2D start, Point2D end) {
			return (start.dist(this) + this.dist(end) < start.dist(end) + EPS);
		}

		public double pld(Point2D start, Point2D end) {
			return Math.abs((end.sub(start).cross(this.sub(start)))
					/ end.sub(start).dist_o());
		}

		public double psd(Point2D start, Point2D end) {
			if (end.sub(start).dot(this.sub(start)) < EPS) {
				return this.dist(start);
			} else if (start.sub(end).dot(this.sub(end)) < EPS) {
				return this.dist(end);
			} else {
				return Math.abs(end.sub(start).cross(this.sub(start)) / end.dist(start));
			}
		}
		
		public static int signum(double x){
			return Math.abs(x) < EPS ? 0 : x > 0 ? 1 : -1;
		}
		
		public static boolean eq(double x, double y){
			return signum(x - y) == 0;
		}
		
		public static int ccw(Point2D p, Point2D r, Point2D s){
			Point2D a = r.sub(p);
			Point2D b = s.sub(p);
			
			final int sgn = Point2D.signum(a.cross(b));
			if(sgn != 0){
				return sgn;
			}else if(a.x * b.x < -EPS && a.y * b.y < -EPS){
				return -1;
			}else if(a.dist_o() < b.dist_o() - EPS){
				return 1;
			}else{
				return 0;
			}
		}
		
		public static boolean intersect_s(Point2D a1, Point2D a2, Point2D b1,
				Point2D b2) {
			return (Point2D.ccw(a1, a2, b1) * Point2D.ccw(a1, a2, b2) <= 0)
					&& (Point2D.ccw(b1, b2, a1) * Point2D.ccw(b1, b2, a2) <= 0);
		}

		public static boolean insersect_l(Point2D a1, Point2D a2, Point2D b1,
				Point2D b2) {
			return a1.sub(a2).cross(b1.sub(b2)) < EPS;
		}

		public static Point2D interpoint_s(Point2D a1, Point2D a2, Point2D b1,
				Point2D b2) {
			Point2D b = b2.sub(b1);
			double d1 = Math.abs(b.cross(a1.sub(b1)));
			double d2 = Math.abs(b.cross(a2.sub(b1)));
			double t = d1 / (d1 + d2);
			Point2D a = a2.sub(a1), v = a.mul(t);
			return a1.add(v);
		}

		public static Point2D interpoint_l(Point2D a1, Point2D a2, Point2D b1,
				Point2D b2) {
			Point2D a = a2.sub(a1);
			Point2D b = b2.sub(b1);
			double t = b.cross(b1.sub(a1)) / b.cross(a);
			Point2D v = a.mul(t);
			return a1.add(v);
		}

		public static Point2D[] cross_ss(Point2D p1, double r1, Point2D p2,
				double r2) {
			double dis = p1.dist(p2);

			if (r1 + EPS > r2 && r1 - EPS < r2 && dis < EPS) {
				return new Point2D[0]; // same
			}

			if (dis - EPS < r1 + r2 && dis + EPS > r1 + r2) {
				Point2D tmp = p2.sub(p1);
				tmp = tmp.mul(r1 / tmp.dist_o());
				Point2D ret[] = new Point2D[1];
				ret[0] = p1.add(tmp);
				return ret;
			} else if (dis + EPS > r1 + r2) {
				return new Point2D[0]; // out
			}

			double dis_m = Math.abs(r1 - r2);

			if (dis_m + EPS > dis && dis_m - EPS < dis) {
				Point2D tmp = null;
				if (r1 > r2) {
					tmp = p2.sub(p1);
				} else {
					tmp = p1.sub(p2);
				}

				double min = Math.min(r1, r2);

				tmp = tmp.mul((min + tmp.dist_o()) / tmp.dist_o());

				Point2D ret[] = new Point2D[1];
				ret[0] = p1.add(tmp);
				return ret;
			} else if (dis_m + EPS > dis) {
				return new Point2D[0]; // inner
			} else {
				Point2D ret[] = new Point2D[2];

				double theta = Math.acos((dis * dis + r1 * r1 - r2 * r2)
						/ (2 * dis * r1));
				double a = Math.atan2(p2.y - p1.y, p2.x - p1.x);

				ret[0] = new Point2D(r1 * Math.cos(a + theta) + p1.x, r1
						* Math.sin(a + theta) + p1.y);
				ret[1] = new Point2D(r1 * Math.cos(a - theta) + p1.x, r1
						* Math.sin(a - theta) + p1.y);
				return ret;
			}
		}
		
		public static double ss_dist(Point2D start1, Point2D end1, Point2D start2, Point2D end2){
			if(Point2D.intersect_s(start1, end1, start2, end2)){
				return 0;
			}else{
				return Math.min(Math.min(Math.min(start1.psd(start2, end2), end1.psd(start2, end2)), start2.psd(start1, end1)), end2.psd(start1, end1));
			}
		}
		
		public void interpoint_lc(Point2D start, Point2D end, Point2D c, double r,
				Point2D ans[]) {
			if (c.pld(start, end) > r + EPS)
				return;
			Point2D v = end.sub(start).unit();
			double delta = v.dot(start.sub(c)) * v.dot(start.sub(c))
					- start.dist(c) * start.dist(c) + r * r;
			double t = -v.dot(start.sub(c));
			double s = Math.sqrt(delta);
			ans[0] = start.add(v.mul(t + s));
			ans[1] = start.add(v.mul(t + s));
		}

		public Point2D normal_vector(Point2D p, Point2D a, Point2D b) {
			Point2D v = b.sub(a).unit();
			v = v.cross(p.sub(a)) > 0 ? new Point2D(v.y, (-1) * v.x) : new Point2D(
					(-1) * v.y, v.x);
			return v.mul(p.pld(a, b));
		}

		public double area(Point2D a, Point2D b, Point2D c) {
			return Math.abs((c.sub(a).cross(b.sub(a))) * 0.5);
		}
	}

}