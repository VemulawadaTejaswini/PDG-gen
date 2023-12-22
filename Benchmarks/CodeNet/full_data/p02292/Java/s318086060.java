import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

import javax.sound.sampled.Line;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJCGL_1C().doIt();
	}

	class AOJCGL_1C{
		boolean Online(Point2D from,Point2D to,Point2D target){
//			System.out.println(from);
//			System.out.println(to);
//			System.out.println(target);
			if(from.getX()<=target.getX()&&from.getY()<=target.getY()
					&&target.getX()<=to.getX()&&target.getY()<=to.getY())return true;
			else if(from.getX()>=target.getX()&&from.getY()>=target.getY()
					&&target.getX()>=to.getX()&&target.getY()>=to.getY())return true;
			return false;
		}


		void doIt(){
			Point2D p0 = new Point2D.Double(in.nextDouble(),in.nextDouble());
			Point2D p1 = new Point2D.Double(in.nextDouble(),in.nextDouble());
			int q = in.nextInt();
			for(int i=0;i<q;i++){
				Point2D p2 = new Point2D.Double(in.nextDouble(), in.nextDouble());
				if(i==89)System.out.println(p2);
				int d = right_left(p0, p1, p2);
				if(d>0)System.out.println("CLOCKWISE");	
				else if(d<0)System.out.println("COUNTER_CLOCKWISE");
				else if(Online(p0,p1,p2))System.out.println("ON_SEGMENT");
				else if(Online(p2, p1, p0))System.out.println("ONLINE_BACK");
				else if(Online(p0, p2, p1))System.out.println("ONLINE_FRONT");
			}
		}
	}

	int right_left(Point2D a,Point2D b,Point2D target){ //a-bの直線はtargetの右か左か
		Point2D q = new Point2D.Double(b.getX()-a.getX(),b.getY()-a.getY());
		Point2D r = new Point2D.Double(target.getX()-a.getX(),target.getY()-a.getY());
		if(cross(q, r)>0)return -1;//左側
		else if(cross(q,r)<0)return 1;//右側
		else return 0;//重なっている
	}
	double cross(Point2D p1,Point2D p2){
		return p1.getX()*p2.getY()-p1.getY()*p2.getX();
	}
}