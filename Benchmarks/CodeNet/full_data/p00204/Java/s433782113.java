import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//UFO Shooting Down Operation
public class Main{

	static final double EPS = 1.0e-8;
	static double norm(Point p) {
		return Math.hypot(p.x, p.y);
	}
	static double inp(Point p1, Point p2) {
		return p1.x*p2.x + p1.y*p2.y;
	}
	static double extp(Point p1, Point p2) {
		return p1.x*p2.y - p2.x*p1.y;
	}
	static Point proj(Line l, Point p) {
		double t = inp(sub(p, l.s), sub(l.s, l.t)) / Math.pow(norm(sub(l.s, l.t)),2);
		Point tp = sub(l.s, l.t);
		return new Point(l.s.x + t*tp.x, l.s.y + t*tp.y);
	}
	static Point sub(Point p1, Point p2) {
		return new Point(p1.x-p2.x, p1.y-p2.y);
	}
	static int ccw(Point a, Point b, Point c) {
		Point p = sub(b, a);
		Point q = sub(c, a);
		if(extp(p, q) > EPS) return 1;		// counter clockwise
		if(extp(p, q) < -EPS)return -1;		// clockwise
		if(inp(p, q) < -EPS) return 2;		// c--a--b on line
		if(Math.abs(norm(p) - norm(q)) < EPS) return -2;	// a--b--c on line
		return 0;				// a--c--b(or a--c=b) on line 
	}
	static boolean intersectSP(Line s, Point p) {
		return ccw(s.s, s.t, p) == 0;
		//return abs(s[0]-p)+abs(s[1]-p)-abs(s[1]-s[0]) < EPS; // triangle inequality
	}
	static double distanceSP(Line s, Point p) {
		Point r = proj(s, p);
		if (intersectSP(s, r)) return norm(sub(r, p));
		return Math.min(norm(sub(s.s, p)), norm(sub(s.t, p)));
	}
//	static boolean isParallel(Line l, Line m){
//		Point a = new Point(l.t.x - l.s.x, l.t.y - l.s.y);
//		Point b = new Point(m.t.x - m.s.x, m.t.y - m.s.y);
//		if(Math.abs(Math.abs((a.x*b.x + a.y*b.y)/(Math.hypot(a.x, a.y)*Math.hypot(b.x, b.y)) - 1)) < EPS){
//			return true;
//		}
//		return false;
//	}
	static class Point {
		public double x;
		public double y;
		public Point(double x_, double y_) {
			x = x_; y=y_;
		}
		public String toString() {return "(" +x+", "+ y +")";}
	}
	static class Line {
		public Point s,t;
		public Line(Point s_, Point t_) {
			s = s_; t = t_;
		}
		public String toString() {return s.toString() + " -> " + t.toString();}
	}
	static class U implements Comparable<U>{
		Point p;
		double r, v, d;
		public U(Point p, double r, double v) {
			this.p = p;
			this.r = r;
			this.v = v;
			this.d = Math.hypot(p.x, p.y);
		}
		public int compareTo(U o) {
			return d-o.d<0?-1:d-o.d>0?1:0;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int r = sc.nextInt();
			int n = sc.nextInt();
			if((r|n)==0)break;
			List<U> ufo = new ArrayList<U>();
			for(int i=0;i<n;i++)ufo.add(new U(new Point(sc.nextDouble(), sc.nextDouble()), sc.nextDouble(), sc.nextDouble()));
			int c = 0;
			while(!ufo.isEmpty()){
				List<U> next = new ArrayList<U>();
				Collections.sort(ufo);
				int k = -1;
				for(int i=0;i<ufo.size();i++){
					if(r<ufo.get(i).d){
						k = i;
						break;
					}
					else c++;
				}
				if(k==-1)break;
				double nx = ufo.get(k).p.x*1000;
				double ny = ufo.get(k).p.y*1000;
				Line l = new Line(new Point(0,0), new Point(nx, ny));
				for(int i=k;i<ufo.size();i++){
					U u = ufo.get(i);
					double dist = distanceSP(l, u.p);
					if(dist>u.r)next.add(u);
				}
				ufo = next;
				for(U u:ufo)u.d-=u.v;
			}
			System.out.println(c);
		}
	}
}