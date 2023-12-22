import java.util.Scanner;

//Roll-A-Big-Ball
public class Main{

	double EPS = 1.0e-8;
	double norm(Point p) {
		return Math.hypot(p.x, p.y);
	}
	double inp(Point p1, Point p2) {
		return p1.x*p2.x + p1.y*p2.y;
	}
	double extp(Point p1, Point p2) {
		return p1.x*p2.y - p2.x*p1.y;
	}
	Point sub(Point p1, Point p2) {
		return new Point(p1.x-p2.x, p1.y-p2.y);
	}
	Point proj(Line l, Point p) {
		double t = inp(sub(p, l.s), sub(l.s, l.t)) / Math.pow(norm(sub(l.s, l.t)),2);
		Point tp = sub(l.s, l.t);
		return new Point(l.s.x + t*tp.x, l.s.y + t*tp.y);
	}
	int ccw(Point a, Point b, Point c) {
		Point p = sub(b, a);
		Point q = sub(c, a);
		if(extp(p, q) > EPS) return 1;		// counter clockwise
		if(extp(p, q) < -EPS)return -1;		// clockwise
		if(inp(p, q) < -EPS) return 2;		// c--a--b on line
		if(Math.abs(norm(p) - norm(q)) < EPS) return -2;	// a--b--c on line
		return 0;				// a--c--b(or a--c=b) on line 
	}
	boolean intersectSS(Line s, Line t) {
		return ccw(s.s,s.t,t.s)*ccw(s.s,s.t,t.t) <= 0 &&
		       ccw(t.s,t.t,s.s)*ccw(t.s,t.t,s.t) <= 0;
	}
	boolean intersectSP(Line s, Point p) {
		return ccw(s.s, s.t, p) == 0;
	}
	double distanceSP(Line s, Point p) {
		Point r = proj(s, p);
		if (intersectSP(s, r)) return norm(sub(r, p));
		return Math.min(norm(sub(s.s, p)), norm(sub(s.t, p)));
	}
	double distanceSS(Line s, Line t) {
		if (intersectSS(s, t)) return 0;
		return Math.min(Math.min(distanceSP(s, t.s), distanceSP(s, t.t)),
	            Math.min(distanceSP(t, s.s), distanceSP(t, s.t)));
	}
	class Point {
		public double x;
		public double y;
		public Point(double x_, double y_) {
			x = x_; y=y_;
		}
	}
	class Line {
		public Point s,t;
		public Line(Point s_, Point t_) {
			s = s_; t = t_;
		}
	}
	boolean in(Point p, Point[] v){
		for(int i=0;i<4;i++){
			Point v1 = sub(v[(i+1)%4], v[i]);
			Point v2 = sub(p, v[i]);
			if(extp(v1, v2)<0)return false;
		}
		return true;
	}
	double dist(Point s, Point t, Point[] v){
		double res = Double.MAX_VALUE;
		Line line = new Line(s, t);
		Line rev = new Line(t, s);
		for(int i=0;i<4;i++){
			Line l = new Line(v[i], v[(i+1)%4]);
			Line rl = new Line(v[(i+1)%4], v[i]);
			double d = Math.max(distanceSS(line, l), Math.max(distanceSS(rev, l), Math.max(distanceSS(line, rl), distanceSS(rev, rl))));
			d = Math.max(d, Math.max(distanceSS(l, line), Math.max(distanceSS(l, rev), Math.max(distanceSS(rl, line), distanceSS(rl, rev)))));
//			System.out.println("I:"+i+" Dist:"+d);
			res = Math.min(res, d);
		}
		return res;
	}
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			Point start = new Point(sc.nextDouble(), sc.nextDouble());
			Point end = new Point(sc.nextDouble(), sc.nextDouble());
			Point[][] p = new Point[n][4];
			double R = 1000;
			for(int i=0;i<n;i++){
				int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
				double h = sc.nextDouble();
				p[i][0] = new Point(x1, y1);
				p[i][1] = new Point(x2, y1);
				p[i][2] = new Point(x2, y2);
				p[i][3] = new Point(x1, y2);
				if(in(start, p[i])||in(end, p[i])){
					R = 0;
				}
				else{
					double d = dist(start, end, p[i]);
//					System.out.println("D:" + d + " Val:" + (h<=d?((d*d+h*h)/2/h):d));
					if(h<d)R = Math.min(R, (d*d+h*h)/2/h);
					else R = Math.min(R, d);
				}
			}
			System.out.printf("%.7f\n", R);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}