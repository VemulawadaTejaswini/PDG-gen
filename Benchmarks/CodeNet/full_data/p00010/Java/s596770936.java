import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		for(int i = 0; i < dataset; i++){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			Point p = new Point(x1, y1);
			Point q = new Point(x2, y2);
			Point r = new Point(x3, y3);
			Circle result = circumscribedCircle(p, q, r);
			Point c = result.getCenter();
			double rad = result.getR();
			System.out.printf("%.3f %.3f %.3f\n", c.getX(), c.getY(), rad);
		}
		sc.close();
	}
	
	static Point solve(Point p, Point q, Point a){
		double det = p.getX() * q.getY() - p.getY() * q.getX();
		return new Point((q.getY() * a.getX() - p.getY() * a.getY()) / det,
				(-q.getX() * a.getX() + p.getX() * a.getY()) / det);
	}
	
	static double distance(Point a, Point b){
		double x_dist = a.getX() - b.getX();
		double y_dist = a.getY() - b.getY();
		return Math.sqrt(x_dist * x_dist + y_dist * y_dist);
	}
	
	static Circle circumscribedCircle(Point p1, Point p2, Point p3){
		double a1 = 2 * p2.getX() - 2 * p1.getX();
		double a2 = 2 * p2.getY() - 2 * p1.getY();
		double a3 = sq(p2.getX()) - sq(p1.getX()) + sq(p2.getY())
				- sq(p1.getY());
		double b1 = 2 * p3.getX() - 2 * p1.getX();
		double b2 = 2 * p3.getY() - 2 * p1.getY();
		double b3 = sq(p3.getX()) - sq(p1.getX()) + sq(p3.getY())
				- sq(p1.getY());
		Point c = solve(new Point(a1, a2), new Point(b1, b2), new Point(a3, b3));
		System.out.println(a1 + " " + a2 + " " + a3);
		System.out.println(b1 + " " + b2 + " " + b3);
		double r = distance(p1, c);
		return new Circle(c, r);
	}
	
	static double sq(double d){
		return d * d;
	}
}

class Circle{
	
	private Point center;
	private double r;
	
	public Point getCenter(){
		return this.center;
	}
	
	public double getR(){
		return this.r;
	}
	
	public Circle(Point center, double r){
		this.center = center;
		this.r = r;
	}
}

class Point{
	
	private double x;
	private double y;
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public Point(double d, double e){
		this.x = d;
		this.y = e;
	}
}