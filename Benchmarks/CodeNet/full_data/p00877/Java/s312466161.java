import java.util.*;
import java.awt.geom.*;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			
			Point2D [] p1 = new Point2D[n];
			for(int i = 0 ; i < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				p1[i] = new Point2D.Double(x, y);
			}
			Point2D [] p2 = new Point2D[m];
			for(int i = 0 ; i < m; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				p2[i] = new Point2D.Double(x, y);
			}
			
			if(n == 1 && m == 1){
				System.out.println("YES");
				continue;
			}
			if(n == 1){
				p2 = convexHull(p2);
				if(iscontains(p2, p1)){
					System.out.println("NO");
				}
				else{
					System.out.println("YES");
				}
				continue;
			}
			if(m == 1){
				p1 = convexHull(p1);
				if(iscontains(p1, p2)){
					System.out.println("NO");
				}
				else{
					System.out.println("YES");
				}
				continue;
			}
			
			p1 = convexHull(p1);
			p2 = convexHull(p2);
//			
//			//debug
//			System.out.println(Arrays.toString(p1));
//			System.out.println(Arrays.toString(p2));
			
			if(isintersect(p1, p2)){
				System.out.println("NO");
				continue;
			}
			
			if(iscontains(p1, p2) || iscontains(p2, p1)){
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
		}
	}

	private boolean iscontains(Point2D[] p1, Point2D[] p2) {
		Point2D p = p2[0];
		int prev = 1 << 24;;
		for(int i = 0 ; i < p1.length; i++) {
			Line2D l = new Line2D.Double(p1[i], p1[(i+1) % p1.length]);
			
			int now = l.relativeCCW(p);
			if(prev != 1 << 24){
				if(now * prev  <= 0){
					return false;
				}
			}
			else{
				if(now == 0){
					return true;
				}
				
			}
			prev = now;
		}
		return true;
	}

	private boolean isintersect(Point2D[] p1, Point2D[] p2) {
		int n = p1.length;
		int m = p2.length;
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m; j++){
				Line2D l = new Line2D.Double(p1[i], p1[(i + 1) % n]);
				Line2D l2 = new Line2D.Double(p2[j], p2[(j + 1) % m]);
				if(l.intersectsLine(l2)){
					return true;
				}
			}
		}
		return false;
	}

	private Point2D[] convexHull(Point2D[] p) {
		int n = p.length;
		Comparator<Point2D> com = new Comparator<Point2D>() {
			
			@Override
			public int compare(Point2D a, Point2D b) {
				if(a.getX() < b.getX()) return -1;
				if(a.getX() > b.getX()) return 1;
				if(a.getY() < b.getY()) return -1;
				if(a.getY() > b.getY()) return 1;
				return 0;
			}
		};
		Arrays.sort(p, com );
		int k = 0;
		Point2D [] qs = new Point2D[n * 2];
		for(int i = 0 ; i  < n; i++){
			while(k > 1 && new Line2D.Double(qs[k-2], qs[k-1]).relativeCCW(p[i]) > 0){
				k--;
			}
			qs[k++] = p[i];
		}
		
		for(int i = n - 2, t = k; i >= 0; i--){
			while(k > t && new Line2D.Double(qs[k-2], qs[k-1]).relativeCCW(p[i]) > 0){
				k--;
			}
			qs[k++] = p[i];
		}
		Point2D [] res = Arrays.copyOf(qs, k-1);
		return res;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}