import java.util.Scanner;

/*
1
0 0 4 0 0 -1 0 -2
 */
public class Main{
	static double EPS = 0.0000000001;
	static double getDistance(Point p1, Point p2) {return p1.diff(p2).abs();}
	static double getDistance(Line l, Point p) {return Math.abs(l.p2.diff(l.p1).crossProduct(p.diff(l.p1))) / l.p2.diff(l.p1).abs();}
	static double getDistance(Segment s, Point p) {
		if (s.p2.diff(s.p1).dotProduct(p.diff(s.p1))<0.0) {return p.diff(s.p1).abs();}
		if (s.p1.diff(s.p2).dotProduct(p.diff(s.p2))<0.0) {return p.diff(s.p2).abs();}
		return getDistance(s.toLine(),p);
	}
	static double getDistance(Segment s1, Segment s2) {
		if (intersect(s1,s2)) {return 0.0;}
		return Math.min(Math.min(getDistance(s1,s2.p1), getDistance(s1,s2.p2)), Math.min(getDistance(s2,s1.p1),getDistance(s2,s1.p2)));
	}
	static int ccw(Point lp0, Point lp1, Point p) {
		Vector lv = lp1.diff(lp0);
		Vector pv = p.diff(lp0);
		double cp=0.0;
		if ((cp=lv.crossProduct(pv))>EPS) {return -1;} // counter-clockwise
		if (cp<-EPS) {return 1;} // clockwise
		if (lv.dotProduct(pv)<-EPS) return 2; // online-back
		if (lv.norm() < pv.norm()) return 3; // online-front
		return 0; // on-segment
	}
	static boolean intersect(Point p0, Point p1, Point p2, Point p3) {
		int ccw0=ccw(p0,p1,p2)*ccw(p0,p1,p3);int ccw1=ccw(p2,p3,p0)*ccw(p2,p3,p1);
		return ccw0<=0&&ccw1<=0||ccw0==0&&ccw1==6||ccw0==6&&ccw1==0;
	}
	static boolean intersect(Segment s1, Segment s2){return intersect(s1.p1,s1.p2,s2.p1,s2.p2);}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for (int i=0;i<q;i++) {
			Segment s1 = new Segment(new Point(s.nextInt(),s.nextInt()), new Point(s.nextInt(),s.nextInt()));
			Segment s2 = new Segment(new Point(s.nextInt(),s.nextInt()), new Point(s.nextInt(),s.nextInt()));
			System.out.println(getDistance(s1,s2));
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