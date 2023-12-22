import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true){
			new Main();	
		}
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0035().doIt();
		}
	}
	class aoj0035 {
		//?????????????????????EPS,Point2D????????????
		final double EPS = 1.0e-08;
		//????????¨?????????Arrays.sort(data, com);
		Comparator< Point2D > com = new Comparator< Point2D >() {
			public int compare(Point2D o1, Point2D o2) {
				if(o1.getX() < o2.getX()) return -1;
				else if(o1.getX() > o2.getX()) return 1;
				else if(o1.getY() < o2.getY()) return -1;
				else if(o1.getY() > o2.getY()) return 1;
				else return 0;
			} 
		};
		
		Point2D[] convexHull(Point2D [] plist){
			int n = plist.length;
			Arrays.sort(plist, com);
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
			return res;
		}
		
		void doIt() {
			String str[] = sc.nextLine().split(",");
			Point2D.Double a[] = new Point2D.Double [4];
			for(int i = 0;i < 4;i++){
				a[i] = new Point2D.Double(Double.parseDouble(str[i*2]),Double.parseDouble(str[i*2+1]));
			}
			Point2D[] b = convexHull(a);
			if(a.length == b.length)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}