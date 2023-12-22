
import java.util.Scanner;
class Point{
	public double x_;
	public double y_;
	
	Point(double x,double y){
		x_ = x;
		y_ = y;
	}
	
	double long_(Point a,Point b) {
		return Math.sqrt((b.x_-a.x_)*(b.x_-a.x_)+(b.y_-a.y_)*(b.y_-a.y_));
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		Point p1 = new Point(x,y);
		 x = sc.nextDouble();
		 y = sc.nextDouble();
		Point p2 = new Point(x,y);
		
		System.out.println(p1.long_(p1,p2));
		
	}
}

