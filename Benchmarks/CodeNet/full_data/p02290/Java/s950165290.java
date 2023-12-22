import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJCGL_1().doIt();
	}

	class AOJCGL_1{
		void doIt(){
			Point2D p0 = new Point2D.Double(in.nextDouble(), in.nextDouble());
			Point2D p1 = new Point2D.Double(in.nextDouble(), in.nextDouble());
			int q = in.nextInt();
			for(int i=0;i<q;i++){
				Point2D result = getVerticalPoint(p0, p1, new Point2D.Double(in.nextDouble(),in.nextDouble()));
				System.out.printf("%.9f %.9f",result.getX(),result.getY());
			}
		}
		
		//p0-p1の直線があるときに直線p2から直線らしたときp0-p1上の垂直な点を求める。
		private Point2D getVerticalPoint(Point2D p0,Point2D p1,Point2D p2){
			double kyori = p0.distance(p1);
			double angle = angle(p0, p1, p2);
			double t = p0.distance(p2) * Math.cos(angle);
			Point2D result = new Point2D.Double(p0.getX()+(p1.getX()-p0.getX())*t/kyori,
					p0.getY()+(p1.getY()-p0.getY())*t/kyori);
			return result;
		}

		private double angle(Point2D p0, Point2D p1, Point2D p2){
			return Math.atan2(p2.getY()-p0.getY(),p2.getX()-p0.getX())-
					Math.atan2(p1.getY()-p0.getY(),p1.getX()-p0.getX());
		}

	}
}