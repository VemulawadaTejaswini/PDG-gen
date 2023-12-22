import java.util.*;
import java.awt.geom.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0 ) break;

			ps = new Point2D[n+1];

			ps[0] = new Point2D.Double(0,0);
			for(int i=1;i<=n;i++){
				ps[i] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
			}

			double ans = 0;
			before = null;
			while(ps != null){
				ans += convexHull();
			}

			System.out.printf("%.1f\n",ans);
		}
	}

	private static Point2D[] ps;
	private static Point2D before;

	private static double convexHull(){
		double res = 0;
		int n = ps.length;

		Arrays.sort(ps,new Comparator<Point2D>(){
			public int compare(Point2D o1,Point2D o2){
				if(o1.getX() < o2.getX()) return -1;
				else if(o1.getX() > o2.getX()) return 1;
				else if(o1.getY() < o2.getY()) return -1;
				else if(o1.getY() > o2.getY()) return 1;
				else return 0;
			}
		});

		if(n <= 2){
			if(before != null) res += before.distance(ps[0]);
			if(n == 2) res = ps[0].distance(ps[1]);
			ps = null;
			return res;
		}

		int k = 0;
		Point2D[] ch = new Point2D[2*n];
		LinkedList<Point2D> ot = new LinkedList<Point2D>(Arrays.asList(ps));

		for(int i=0;i<n;ch[k++] = ps[i++]){
			while(k>=2 && Line2D.relativeCCW(ch[k-2].getX(),ch[k-2].getY(),ch[k-1].getX(),ch[k-1].getY(),ps[i].getX(),ps[i].getY()) <= 0){
				k--;
			}
		}

		for(int i=n-2, t=k+1;i>=0;ch[k++]=ps[i--]){
			while(k>=t && Line2D.relativeCCW(ch[k-2].getX(),ch[k-2].getY(),ch[k-1].getX(),ch[k-1].getY(),ps[i].getX(),ps[i].getY()) <= 0){
				k--;
			}
		}

		if(before != null) res += before.distance(ch[0]);
		ot.remove(ch[0]);
		for(int i=1;i<k-1;i++){
			res += ch[i-1].distance(ch[i]);
			ot.remove(ch[i]);
		}
		before = ch[k-2];

		if(n > k-1)
			ps = (Point2D[])ot.toArray(new Point2D[]{});
		else
			ps = null;

		return res;
	}
}