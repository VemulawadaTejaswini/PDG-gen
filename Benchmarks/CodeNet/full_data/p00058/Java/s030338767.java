import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0082().doIt();
    	}
    }
    class aoj0082{
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
    		Point2D p[] = new Point2D [4]; 
    		for(int i = 0;i < 4;i++)p[i] = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
            double re = dot(sub(p[0],p[1]),sub(p[2],p[3]));
            if(Math.abs(re) < EPS)System.out.println("YES");
            else System.out.println("NO");
    	}
    }
}