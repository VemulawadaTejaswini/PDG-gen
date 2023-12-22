import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	public static double EPS = 1e-6;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			Line[] line = new Line[n];
			int res = 1;
			TreeSet<Point> set = new TreeSet<Point>();
			for(int i=0; i<n; i++){
				line[i] = new Line(
						in.nextInt()
						, in.nextInt()
						, in.nextInt()
						, in.nextInt());
				res++;
				set.clear();
				for(int j=i-1; j>=0; j--){
					Point p = line[i].crossPoint(line[j]);
					if(p == null || line[i].link(line[j])) continue;
					if(set.contains(p)) continue;
					set.add(p);
					res++;
				}
			}
			System.out.println(res);
		}
	}
	
	
}

class Point implements Comparable<Point>{
	static final double EPS = 1e-10;
	double x, y;
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double dist2(Point p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
	}
	
	@Override
	public int compareTo(Point o) {
		if(Math.abs(x-o.x) >= EPS) return Double.compare(x, o.x);
		if(Math.abs(y-o.y) >= EPS) return Double.compare(y, o.y);
		return 0;
	}
}

class Line{
	Point p1, p2;
	Point vec;
	public Line(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
		vec = new Point(p2.x-p1.x, p2.y-p1.y);
	}
	
	public Line(double x1, double y1, double x2, double y2){
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		vec = new Point(x2-x1, y2-y1);
	}
	
	Point crossPoint(Line l){
		if(!cross(p1, p2, l.p1, l.p2)) return null;
		double d1 = Math.abs(cross(l.vec.x, l.vec.y, p1.x-l.p1.x, p1.y-l.p1.y));
		double d2 = Math.abs(cross(l.vec.x, l.vec.y, p2.x-l.p1.x, p2.y-l.p1.y));
		double t = d1/(d1+d2);
		return new Point(p1.x+(p2.x-p1.x)*t, p1.y+(p2.y-p1.y)*t);
	}
	
	boolean link(Line l){
		return p1.compareTo(l.p1) == 0
				|| p1.compareTo(l.p2) == 0
				|| p2.compareTo(l.p1) == 0
				|| p2.compareTo(l.p2) == 0;
	}
	
	static boolean cross(Point p1, Point p2, Point p3, Point p4){
		return ccw(p1, p2, p3) * ccw(p1, p2, p4) <= 0 && ccw(p3, p4, p1) * ccw(p3, p4, p2) <= 0;
	}
	
	static double cross(Point a, Point b){
		return a.x*b.y - b.x*a.y;
	}
	
	public static double cross(double x1, double y1, double x2, double y2){
		return x1*y2 - x2*y1;
	}
	
	// ?????£??§?¨???§???????¨????????????£
	// ?????£???????????¶????????????
	static double ccw(Point a, Point b, Point c){
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - a.x;
		double dy2 = c.y - a.y;
		return dx1*dy2 - dx2*dy1;
	}
}