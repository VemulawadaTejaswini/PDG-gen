import java.util.*;
import java.awt.geom.*;

public class Main{
	double EPS = 1.0e-08;
	class C implements Comparable<C>{
		double distance;
		int pos;
		public C(double distance, int pos) {
			this.distance = distance;
			this.pos = pos;
		}
		@Override
		public int compareTo(C o) {
			if(this.distance < o.distance) return -1;
			if(this.distance > o.distance) return 1;
			return 0;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			int xa = sc.nextInt();
			int ya = sc.nextInt();
			int xb = sc.nextInt();
			int yb = sc.nextInt();
			Line2D newline = new Line2D.Double(new Point2D.Double(xa, ya), new Point2D.Double(xb, yb));
			int n = sc.nextInt();
			Line2D [] llist = new Line2D[n];
			int [] posdata = new int[n];
			for(int i = 0; i < n; i++){
				int xs = sc.nextInt();
				int ys = sc.nextInt();
				int xt = sc.nextInt();
				int yt = sc.nextInt();
				llist[i] = new Line2D.Double(new Point2D.Double(xs, ys), new Point2D.Double(xt, yt));
				int o = sc.nextInt();
				int pos = sc.nextInt();
				posdata[i] = (o == 0 ? pos ^ 1 : pos);
			}
			ArrayList<C> intersect = new ArrayList<Main.C>();
			for(int i = 0; i < n; i++){
				if(newline.intersectsLine(llist[i])){
					Point2D intersectP = intersectPtSS(newline, llist[i]);
					double dis = intersectP.distance(newline.getP1());
					intersect.add(new C(dis, posdata[i]));
				}
			}
			if(intersect.size() == 0){
				System.out.println(0);
				continue;
			}
			Collections.sort(intersect);
			int prev = intersect.get(0).pos;
			int count = 0;
			for(int i = 1; i < intersect.size(); i++){
				if(prev != intersect.get(i).pos){
					count++;
					prev = intersect.get(i).pos;
				}
			}
			System.out.println(count);
		}
	}
	
	private Point2D intersectPtSS(Line2D l, Line2D m){
		Point2D lVec = sub(l.getP2(), l.getP1());
		Point2D mVec = sub(m.getP2(), m.getP1());
		Point2D m1l1Vec = sub(m.getP1(), l.getP1());
		double a = cross(m1l1Vec, lVec);
		double b = cross(lVec, mVec);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			return null;
		}
		double t = a / b;
		double resx = m.getX1() + t * mVec.getX();
		double resy = m.getY1() + t * mVec.getY();
		return new Point2D.Double(resx, resy);
	}

	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}

	private Point2D sub(Point2D p2, Point2D p1) {
		return new Point2D.Double(p2.getX() - p1.getX(), p2.getY() - p1.getY());
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}