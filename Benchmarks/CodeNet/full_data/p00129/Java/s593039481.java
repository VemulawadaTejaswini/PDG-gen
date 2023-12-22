import java.util.Scanner;

//Hide-and-Seek Supporting System
public class Main{

	public static class Point {
		public double x;
		public double y;
		public Point(double x_, double y_) {
			x = x_; y=y_;
		}
		public String toString() {return "(" +x+", "+ y +")";}
	}

	public static class Line {
		public Point s,t;
		public Line(Point s_, Point t_) {
			s = s_; t = t_;
		}
		public String toString() {return s.toString() + " -> " + t.toString();}
	}
	public static double distanceSP(Line s, Point p) {
		Point r = proj(s, p);
		if (intersectSP(s, r)) return norm(sub(r, p));
		return Math.min(norm(sub(s.s, p)), norm(sub(s.t, p)));
	}
	public static boolean intersectSP(Line s, Point p) {
		return ccw(s.s, s.t, p) == 0;
		//return abs(s[0]-p)+abs(s[1]-p)-abs(s[1]-s[0]) < EPS; // triangle inequality
	}
	public static int ccw(Point a, Point b, Point c) {
		Point p = sub(b, a);
		Point q = sub(c, a);
		if(extp(p, q) > EPS) return 1;		// counter clockwise
		if(extp(p, q) < -EPS)return -1;		// clockwise
		if(inp(p, q) < -EPS) return 2;		// c--a--b on line
		if(Math.abs(norm(p) - norm(q)) < EPS) return -2;	// a--b--c on line
		return 0;				// a--c--b(or a--c=b) on line
	}
	public static double extp(Point p1, Point p2) {
		return p1.x*p2.y - p2.x*p1.y;
	}
	public static final double EPS = 1.0e-8;
	public static Point proj(Line l, Point p) {
		double t = inp(sub(p, l.s), sub(l.s, l.t)) / Math.pow(norm(sub(l.s, l.t)),2);
		Point tp = sub(l.s, l.t);
		return new Point(l.s.x + t*tp.x, l.s.y + t*tp.y);
	}
	public static Point sub(Point p1, Point p2) {
		return new Point(p1.x-p2.x, p1.y-p2.y);
	}
	public static double inp(Point p1, Point p2) {
		return p1.x*p2.x + p1.y*p2.y;
	}
	public static double norm(Point p) {
		return Math.hypot(p.x, p.y);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] c = new int[n][3];
			for(int i=0;i<n;i++)for(int j=0;j<3;j++)c[i][j]=sc.nextInt();
			int m = sc.nextInt();
			while(m--!=0){
				Point t = new Point(sc.nextDouble(), sc.nextDouble());
				Point o = new Point(sc.nextDouble(), sc.nextDouble());
				Line l = new Line(t, o);
				boolean invisible = false;
				for(int i=0;i<n;i++){
					double td = norm(new Point(t.x-c[i][0], t.y-c[i][1]));
					double od = norm(new Point(o.x-c[i][0], o.y-c[i][1]));
					double dis = distanceSP(l, new Point(c[i][0], c[i][1]));
//					System.out.println("DT:" + td + " DO:" + od + " DIS:" + dis + " R:" + c[i][2]);
					if((td >= c[i][2]+EPS || od >=c[i][2]+EPS )&& dis <= c[i][2]+EPS){
						invisible = true;break;
					}
				}
				System.out.println(invisible?"Safe":"Danger");
			}
		}
	}
}