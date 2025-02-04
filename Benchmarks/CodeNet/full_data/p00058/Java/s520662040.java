import java.awt.geom.*;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0058().doIt();
    }
    class aoj0058{
    	double dot(Point2D p1, Point2D p2){
            return p1.getX() * p2.getX() + p1.getY() * p2.getY();
        }
    	Point2D sub(Point2D p2, Point2D p1) {
            double x = p2.getX() - p1.getX();
            double y = p2.getY() - p1.getY();
            return new Point2D.Double(x, y);
    	}
    	void doIt(){
    		double EPS = 1.0e-08;
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
    }
}