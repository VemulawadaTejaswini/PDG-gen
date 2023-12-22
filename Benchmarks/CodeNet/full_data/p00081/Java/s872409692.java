import java.util.Scanner;

//A Symmetric Point
public class Main{

	public static double inp(Point p1, Point p2) {
		return p1.x*p2.x + p1.y*p2.y;
	}
	
	public static Point proj(Line l, Point p) {
		double t = inp(sub(p, l.s), sub(l.s, l.t)) / Math.pow(norm(sub(l.s, l.t)),2);
		Point tp = sub(l.s, l.t);
		return new Point(l.s.x + t*tp.x, l.s.y + t*tp.y);
	}
	
	public static Point sub(Point p1, Point p2) {
		return new Point(p1.x-p2.x, p1.y-p2.y);
	}
	
	public static double norm(Point p) {
		return Math.hypot(p.x, p.y);
	}
	
	public static class Point {
		public double x;
		public double y;
		public Point(double x_, double y_) {
			x = x_; y=y_;
		}
		public String toString() {return "(" +x+", "+ y +")";}
	}
	
	//ツ陳シツ静シorツ静シツ閉ェツづ個クツδ可ス
	public static class Line {
		public Point s,t;
		public Line(Point s_, Point t_) {
			s = s_; t = t_;
		}
		public String toString() {return s.toString() + " -> " + t.toString();}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = sc.next().split(",");
			double x1 = Double.parseDouble(s[0]);
			double y1 = Double.parseDouble(s[1]);
			double x2 = Double.parseDouble(s[2]);
			double y2 = Double.parseDouble(s[3]);
			double x3 = Double.parseDouble(s[4]);
			double y3 = Double.parseDouble(s[5]);
			Point p1 = new Point(x1, y1);
			Point p2 = new Point(x2, y2);
			Point q = new Point(x3, y3);
			Point r = proj(new Line(p1, p2), q);
			double dx = r.x-q.x;
			double dy = r.y-q.y;
			System.out.println((r.x+dx)+" "+(r.y+dy));
		}
	}
}