
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Point project(Segment s, Point p) {
		Vector base = s.p2.diff(s.p1);
		double r = p.diff(s.p1).dotProduct(base) / base.norm();
		return s.p1.sum(base.mult(r));
	}
	static Point[] getCrossPoints(Circle c, Line l) {
		Point pr = project(l, c.c);
		Vector e = l.p2.diff(l.p1).div(l.p2.diff(l.p1).abs()); 
		double base = Math.sqrt(c.r*c.r-pr.diff(c.c).norm());
		return new Point[]{pr.sum(e.mult(base)), pr.diff(e.mult(base))};
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c = new Circle(new Point(scan.nextInt(),scan.nextInt()),scan.nextInt());
		int q = scan.nextInt();
		for (int i=0;i<q;i++) {
			Line l = new Line(new Point(scan.nextInt(),scan.nextInt()),new Point(scan.nextInt(),scan.nextInt()));
			Point[] res = getCrossPoints(c,l);
			System.out.println(res[1].x+" "+res[1].y+" "+res[0].x+" "+res[0].y);
		}
	}
}
class Point {
	static double EPS = 0.0000000001;
	double x; double y;
	public Point(double ax, double ay){x=ax;y=ay;}
	public Vector sum(Point p) { return new Vector(x+p.x,y+p.y); }
	public Vector diff(Point p) { return new Vector(x-p.x,y-p.y); }
	public Vector mult(double k) { return new Vector(x*k,y*k); }
	public Vector div(double k) { return new Vector(x*(1.0/k),y*(1.0/k)); }
	public boolean equals(Point p){return Math.abs(x-p.x)<EPS && Math.abs(y-p.y)<EPS;}
	public String toString(){return "("+x+","+y+")";}
}
class Vector extends Point {
	public Vector(double ax, double ay) {super(ax,ay);}
	public Vector(Point p1, Point p2) {super(p1.x-p2.x,p2.x-p2.y);}
	public double norm() {return x*x+y*y;}
	public double abs() {return Math.sqrt(norm());}
	// TODO:
	public boolean isSmallerThan(Vector v) {return x!=v.x?x<v.x:y<v.y;}
	public double dotProduct(Vector v) {return x*v.x+y*v.y;}
	public double crossProduct(Vector v) {return x*v.y - y*v.x;}
}

class Segment {
	Point p1; Point p2;
	public Segment(Point ap1, Point ap2){p1=ap1;p2=ap2;}
	public double dotProduct(Segment s) {return (p1.x-p2.x)*(s.p1.x-s.p2.x)+(p1.y-p2.y)*(s.p1.y-s.p2.y);}
	public double crossProduct(Segment s) {return (p1.x-p2.x)*(s.p1.y-s.p2.y) - (p1.y-p2.y)*(s.p1.x-s.p2.x);}
	public String toString(){return p1.toString()+"->"+p2.toString();}
	public Line toLine() {return new Line(p1,p2);}
}
class Line extends Segment{public Line(Point ap1, Point ap2){super(ap1,ap2);}}

class Circle {Point c;double r;Circle(Point ac, double ar){c=ac;ar=r;}}
class Polygon extends ArrayList<Point>{}