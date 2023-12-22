import java.awt.geom.*;
import java.util.*;
public class Main{
	double EPS = 1.0e-08;
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			Point2D a = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			Point2D b = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			Point2D c = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			Point2D d = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			Point2D ab = sub(a, b);
			Point2D cd = sub(c,d);
			double res = dot(ab, cd);
			if(Math.abs(res) < EPS){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	
	private double dot(Point2D p1, Point2D p2){
		return p1.getX() * p2.getX() + p1.getY() * p2.getY();
	}

	private Point2D sub(Point2D a, Point2D b) {
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		return new Point2D.Double(x,y);
	}

	public static void main(String [] args){
		new Main().doit();
	}
}