import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		new AOJ1283().doIt();
	}
	
	class AOJ1283{
		int n;
		ArrayList<Point2D> plist;
		void doIt(){
			while(true){
				n = in.nextInt();
				if(n==0)return;
				plist = new ArrayList<Point2D>();
				for(int i=0;i<n;i++)plist.add(new Point2D.Double(in.nextDouble(),in.nextDouble()));
//				System.out.println(plist);
//				System.out.println(isOK(494.02336412, plist));
				double result = 0.0;
				double left = 0.0;
				double right = 10000.0;
				while(Math.abs(left-right)>0.00001){
					double next = (left+right)/2;
//					System.out.println(next);
					if(isOK(next, plist)){
						left = next;
					}else{
						right = next;
					}
				}
				System.out.println(left);
			}
		}
		
		boolean isOK(double distance, ArrayList<Point2D> plist){
			for(int i=0;i<plist.size();i++){
				Point2D a = plist.get(i);
				Point2D b = plist.get((i+1)%plist.size());
				Line2D c = getcutV(a, b, distance);
				plist = convexCut(plist, c);
//				System.out.println(plist);
				if(plist.size()==0)return false;
				plist = convexHull(plist);
			}
			return plist.size()==0? false:true;
		}
		
		Comparator< Point2D > com = new Comparator< Point2D >() {
			public int compare(Point2D p1,Point2D p2) {
				if(p1.getX() < p2.getX()) return -1;
				else if(p1.getX() > p2.getX()) return 1; 
				else if(p1.getY() < p2.getY()) return -1;
				else if(p1.getY() > p2.getY()) return 1; 
				else return 0;
			}
		};
		
		ArrayList<Point2D> convexHull(ArrayList<Point2D>ps) {
			Point2D[] plist = new Point2D[ps.size()];
			for(int i=0;i<ps.size();i++)plist[i] = ps.get(i);
			int n = plist.length; Arrays.sort(plist, com);
			int k = 0;
			Point2D [] qs = new Point2D[n * 2]; 
			for(int i = 0; i < n; i++){
				while(k > 1 && new Line2D.Double(qs[k-2] , qs[k-1]).relativeCCW(plist[i]) > 0){
					k--;
				}
				qs[k++] = plist[i]; 
			}
			for(int i = n - 2, t = k; i >= 0; i--){
				while(k > t && new Line2D.Double(qs[k-2] , qs[k-1]).relativeCCW(plist[i]) > 0){
					k--;
				}
				qs[k++] = plist[i]; 
			}
			Point2D [] res = Arrays.copyOf(qs, k-1);
			ArrayList<Point2D> list = new ArrayList<Point2D>();
			for(int i=0;i<res.length;i++)list.add(res[i]);
			return list;
		}
		
		private Line2D getcutV(Point2D p1, Point2D p2, double mid) {
			Point2D p2p1 = sub(p2, p1);
			double p1p2Dis = p1.distance(p2);
			Point2D p2p1NV = normalVector1(p2p1);
			Point2D cutV = mul(mid / p1p2Dis, p2p1NV);
			Point2D cutp1 = add(p1, cutV);
			Point2D cutp2 = add(p2, cutV);
			Line2D res = new Line2D.Double(cutp1, cutp2);
			return res;
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
		Point2D add(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
		Point2D normalVector1(Point2D p){
			return new Point2D.Double(-p.getY(), p.getX());
		}
		Point2D intersectionPoint(Line2D l1,Line2D l2){
			return intersectionPoint(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2()); 
		}
		Point2D intersectionPoint(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
			Point2D a=diff(a2,a1),
					b=diff(b2,b1);
			return sum(a1, mul(cross(b, diff(b1,a1))/cross(b,a), a));
		}
		Point2D sum(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(),p1.getY()+p2.getY());
		}
		Point2D diff(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n,p1.getY()*n);
		}
		ArrayList<Point2D> convexCut(ArrayList<Point2D> plist,Line2D cut){
			int n = plist.size();
			ArrayList<Point2D> ans = new ArrayList<Point2D>();
			for(int i=0;i<n;i++){
				Point2D from = plist.get(i), to = plist.get((i+1)%n);
				if(cut.relativeCCW(from)<=0)ans.add(from);
				int temp1 = cut.relativeCCW(from);
				int temp2 = cut.relativeCCW(to);
				if(temp1*temp2 < 0){
					Point2D IntersectP = intersectionPoint(cut, new Line2D.Double(from,to));
					ans.add(IntersectP);
				}
			}
			return ans;
		}
	}
	class Pair{
		int x,y;
		public Pair(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
}