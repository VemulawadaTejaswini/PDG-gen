import java.awt.geom.Point2D;
import java.util.*;
public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}

	public Main(){		
		new AOJ0012();
	}

	class AOJ0012{
		void run(){
			Point2D point[] = new Point2D[3];
			for(int i=0;i<3;i++)point[i] = new Point2D.Double(in.nextDouble(),in.nextDouble());
			Point2D target = new Point2D.Double(in.nextDouble(),in.nextDouble());
			int memo = right_left(point[0],point[1], target);
			boolean sw = true;
			for(int i=0;i<3;i++)if(memo!=right_left(point[i],point[(i+1)%3], target))sw=false;
			if(sw)System.out.println("YES");
			else System.out.println("NO");
		}
		public AOJ0012() {
			while(in.hasNext())run();
		}

		int right_left(Point2D a,Point2D b,Point2D target){ //a-bの直線はtargetの右か左か
			Point2D q = new Point2D.Double(b.getX()-a.getX(),b.getY()-a.getY());
			Point2D r = new Point2D.Double(target.getX()-a.getX(),target.getY()-a.getY());
//			System.out.println("q= "+q);
//			System.out.println("r= "+r);
//			System.out.println(cross(q, r));
			if(cross(q, r)>0)return -1;//左側
			else if(cross(q,r)<0)return 1;//右側
			else return 0;//重なっている
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
	}


}