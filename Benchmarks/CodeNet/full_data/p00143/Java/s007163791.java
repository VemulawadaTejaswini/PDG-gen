import java.awt.geom.Point2D;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		int n = in.nextInt();
		for(int i=0;i<n;i++)new AOJ0143().doIt();
		
	}
	class AOJ0143{
		void doIt(){
			Point2D ps[] = new Point2D[3];
			for(int i=0;i<3;i++)ps[i] = new Point2D.Double(in.nextInt(),in.nextInt());;
			Point2D a = new Point2D.Double(in.nextInt(),in.nextInt());
			Point2D b = new Point2D.Double(in.nextInt(),in.nextInt());
			int c = contains(ps, a);
			int d = contains(ps, b);
//			System.out.println(c+" "+d);
			if(c==d)System.out.println("NG");
			else System.out.println("OK");
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
		double dot(Point2D p1,Point2D p2){
			return p1.getX()*p2.getX()+p1.getY()*p2.getY();
		}
		private int contains(Point2D[] plist,Point2D p) {
			boolean isin = false;
			int n = plist.length;
			for(int i=0;i<n;i++){
				Point2D a = sub(plist[i], p);
				Point2D b = sub(plist[(i+1) % n], p);
				if(a.getY() > b.getY()){
					Point2D temp = (Point2D) a.clone();
					a = b;
					b = temp;
				}
				if(a.getY() <= 0 && 0 < b.getY()){
					if(cross(a,b) < 0) isin = ! isin;
				}
				if(cross(a,b) == 0 && dot(a, b) <= 0) return 0;
			}
			return isin ? 1 : -1;
		}
	}
}