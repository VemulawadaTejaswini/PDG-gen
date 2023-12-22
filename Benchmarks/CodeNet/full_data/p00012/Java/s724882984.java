import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			
			Point p1 = new Point(x1, y1);
			Point p2 = new Point(x2, y2);
			Point p3 = new Point(x3, y3);
			Point pp = new Point(xp, yp);
					
			Triangle t = new Triangle(p1, p2, p3);
			
			if(t.isInThisTriangle(pp)) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
	
}

class Line{
	
	double p;
	double q;
	double r;
	
	/**
	 * ??´???px+qy=r??????????????????
	 * 
	 * @param p
	 * @param q
	 * @param r
	 */
	Line(double p, double q, double r){
		this.p = p;
		this.q = q;
		this.r = r;
	}
	
	public Line(Point p1, Point p2){
	
		if(p1.getX() != p2.getY()) {
			this.p = -(p1.getY()-p2.getY())/(p1.getX()-p2.getX());
			this.q = 1;
			this.r = p1.getX()* this.p +p1.getY();
		}else {
			if(p1.getY() != p2.getY()) {
				this.p = 1;
				this.q = 0;
				this.r = 0;
			}else {
				this.p = 1;
				this.q = 1;
				this.r = 1;
			}
		}
	}
	
	/**
	 * ????????´???????????????2????????????????????´????????????????????????????????????
	 * 
	 * @param x
	 * @param y
	 * @return 2???x, y???????????´???????????°true
	 */
	boolean isTheSameSide(Point x, Point y){
		double result = this.calcPX_QY(x.getX(), x.getY())
				* this.calcPX_QY(y.getX(), y.getY());
		return (result > 0) ? true: false;
	}
	
	/**
	 * ???????????????x, y????????????px+qy????¨?????????????
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	double calcPX_QY(double x, double y){
		return x * p + y * q;
	}
}

class Triangle{
	
	Point p1;
	Point p2;
	Point p3;
	
	Triangle(Point p1, Point p2, Point p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	Point getCenter(){
		return new Point((p1.getX() + p2.getX() + p3.getX()) / 3, (p1.getY()
				+ p2.getY() + p3.getY()) / 3);
	}
	
	boolean isInThisTriangle(Point p) {
		Line l12 = new Line(p1, p2);
		Line l23 = new Line(p2, p3);
		Line l31 = new Line(p3, p1);
		Point center = this.getCenter();
		
		return l12.isTheSameSide(p, center) && l23.isTheSameSide(p, center) && l31.isTheSameSide(p, center);
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