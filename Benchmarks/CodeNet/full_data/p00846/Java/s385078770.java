import java.util.*;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new Q2006B();
	}
	
	Point2D intersectionPoint(Line2D l1,Line2D l2){
		return intersectionPoint(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2());
	}
	Point2D intersectionPoint(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
		Point2D a=diff(a2,a1),
				b=diff(b2,b1);
		return sum(a1, mul(cross(b, diff(b1,a1))/cross(b,a), a));
	}
	Point2D diff(Point2D p1,Point2D p2){
		return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
	}
	double cross(Point2D p1,Point2D p2){
		return p1.getX()*p2.getY() - p2.getX()*p1.getY();
	}
	Point2D mul(double n,Point2D p1){
		return new Point2D.Double(p1.getX()*n, p1.getY()*n);
	}
	Point2D sum(Point2D p1,Point2D p2){
		return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
	}
	private ArrayList<Point2D> polygonCut(ArrayList<Point2D> plist, Line2D cut) {
		int n = plist.size();
		ArrayList<Point2D> ans = new ArrayList<Point2D>();
		for(int i =0; i<n; i++){
			Point2D from = plist.get(i), to = plist.get((i+1)%n);
			if(cut.relativeCCW(from) <= 0){
				ans.add(from);
			}
			int temp1 = cut.relativeCCW(from);
			int temp2 = cut.relativeCCW(to);
			if(temp1 * temp2 < 0){
				Point2D IntersectP = intersectionPoint(cut, new Line2D.Double(from,to));
				ans.add(IntersectP);
			}
		}
		return ans;
	}
	
	class Q2006B{
		int N;
		Q2006B(){
			while(true){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			Point2D[] ps = new Point2D[N];
			for(int i=0; i<N; ++i)	ps[i]=new Point2D.Double(sc.nextInt(), sc.nextInt());
			ArrayList<Point2D> ps2 = new ArrayList<Point2D>(4);
			ps2.add(new Point2D.Double(0,0));
			ps2.add(new Point2D.Double(10000,0));
			ps2.add(new Point2D.Double(10000,10000));
			ps2.add(new Point2D.Double(0,10000));
			for(int i=0; i<N; ++i){
				ps2 = polygonCut(ps2, new Line2D.Double(ps[i], ps[(i+1)%N]));
			}
			System.out.println(ps2.isEmpty()? "0": "1");
		}
	}
}