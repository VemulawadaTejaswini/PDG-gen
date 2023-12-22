import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJCGL_1C().doIt();
	}

	class AOJCGL_1C{
		int CCW(Point2D a,Point2D b,Point2D target){ //a-bの直線はtargetの右か左か
			Point2D q = new Point2D.Double(b.getX()-a.getX(),b.getY()-a.getY());
			Point2D r = new Point2D.Double(target.getX()-a.getX(),target.getY()-a.getY());
			if(cross(q, r)>0)return -1;//左側
			else if(cross(q,r)<0)return 1;//右側
			else return 0;//重なっている
		}

		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}

		int OnLine(Point2D p0,Point2D p1,Point2D p2){
			double a1 = p1.getX() - p0.getX();
			double b1 = p1.getY() - p0.getY();
			double a2 = p2.getX() - p0.getX();
			double b2 = p2.getY() - p0.getY();
			if (a1 * a2 <= 0 && b1 * b2 <= 0 && (a1 * a1 + b1 * b1 != 0 && a2 * a2 + b2 * b2 != 0))return -1;
			else if (Math.hypot(a1, b1) < Math.hypot(a2, b2))return 1;
			else return 0;
		}

		void doIt(){
			Point2D p0 = new Point2D.Double(in.nextDouble(),in.nextDouble());
			Point2D p1 = new Point2D.Double(in.nextDouble(),in.nextDouble());
			int q = in.nextInt();
			for(int i=0;i<q;i++){
				Point2D p2 = new Point2D.Double(in.nextDouble(), in.nextDouble());
				int d = CCW(p0, p1, p2);
				if(d>0)System.out.println("CLOCKWISE");
				else if(d<0)System.out.println("COUNTER_CLOCKWISE");
				else{
					int s = OnLine(p0, p1, p2);
					if(s<0)System.out.println("ONLINE_BACK");
					else if(s>0)System.out.println("ONLINE_FRONT");
					else if(s==0)System.out.println("ON_SEGMENT");
				}
			}
		}
	}

}