import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ0081().doIt();
	}

	class AOJ0081{
		//p0-p1の直線があるときに直線p2から直線らしたときp0-p1上の垂直な点を求める。
		private Point2D projection(Line2D l,Point2D p2){
			double kyori = l.getP1().distance(l.getP2());
			double angle = angle(l.getP1(),l.getP2(), p2);
			double t = l.getP1().distance(p2) * Math.cos(angle);
			Point2D result = new Point2D.Double(l.getP1().getX()+(l.getP2().getX()-l.getP1().getX())*t/kyori,
					l.getP1().getY()+(l.getP2().getY()-l.getP1().getY())*t/kyori);
			return result;
		}
		private double angle(Point2D p0, Point2D p1, Point2D p2){
			return Math.atan2(p2.getY()-p0.getY(),p2.getX()-p0.getX())-
					Math.atan2(p1.getY()-p0.getY(),p1.getX()-p0.getX());
		}
		
		
		void doIt(){
			String input[] = in.next().split(",");
			double a[] = new double[input.length];
			for(int i=0;i<a.length;i++)a[i] = Double.parseDouble(input[i]);
			Line2D l = new Line2D.Double(a[0], a[1], a[2], a[3]);
			Point2D p = new Point2D.Double(a[4],a[5]);
			Point2D result = projection(l, p);
			 double dx = result.getX()-p.getX();
             double dy = result.getY()-p.getY();
             double tx = dx+result.getX();
             double ty = dy+result.getY();
             System.out.printf("%.9f %.9f\n",tx,ty);
		}
	}

}