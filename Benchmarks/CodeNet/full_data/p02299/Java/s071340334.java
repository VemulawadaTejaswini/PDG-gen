import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new CGL_3C().doIt();
	}

	class CGL_3C{
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
		double dot(Point2D p1,Point2D p2){
			return p1.getX()*p2.getX()+p1.getY()*p2.getY();
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
		int contains(Point2D[] plist,Point2D p) {
			boolean in = false;
			int n = plist.length;
			for(int i=0; i<n; i++){
				Point2D a = sub(plist[i], p);
				Point2D b = sub(plist[(i+1) % n], p);
				if(a.getY() > b.getY()){
					Point2D temp = (Point2D) a.clone();
					a = b;
					b = temp;
				}
				if(a.getY() <= 0 && 0 < b.getY()){
					if(cross(a,b) < 0) in = ! in;
				}
				if(cross(a,b) == 0 && dot(a, b) <= 0) return 0;
			}
			return in ? 1 : -1;
		}

		void doIt(){
			int n = in.nextInt();
			Point2D[] ps = new Point2D[n];
			for(int i=0;i<n;i++)ps[i] = new Point2D.Double(in.nextDouble(),in.nextDouble());
			int m = in.nextInt();
			for(int i=0;i<m;i++){
				Point2D p = new Point2D.Double(in.nextDouble(), in.nextDouble());
				int result = contains(ps, p);
				if(result>0)System.out.println("2");
				else if(result==0)System.out.println("1");
				else if(result<0)System.out.println("0");
			}
		}
	}

}