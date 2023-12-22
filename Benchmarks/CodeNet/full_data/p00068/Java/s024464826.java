import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	double EPS = 1.0e-08;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D[] p = new Point2D[n];
			for(int i = 0; i < n; i++){
				String [] input = sc.next().split(",");
				double x = Double.parseDouble(input[0]);
				double y = Double.parseDouble(input[1]);
				p[i] = new Point2D.Double(x, y);
			}
			Point2D [] res = convexHull(p);
			System.out.println(n - res.length);
			
		}
	}
	
	Comparator< Point2D > com = new Comparator< Point2D >() {
		public int compare(Point2D o1, Point2D o2) {
			if(o1.getX() < o2.getX()) return -1;
			else if(o1.getX() > o2.getX()) return 1;
			else if(o1.getY() < o2.getY()) return -1;
			else if(o1.getY() > o2.getY()) return 1;
			else return 0;
		}
	};
	
	private Point2D [] convexHull(Point2D [] p) {
		int n = p.length;
		Arrays.sort(p, com);
		ArrayList<Point2D> q = new ArrayList<Point2D>();
		q.add(p[0]);
		q.add(p[1]);
		
		for(int i = 2; i < n; i++){
			boolean correct_turn;
			do{
				Point2D q1 = q.get(q.size() - 2);
				Point2D q2 = q.get(q.size() - 1);
				correct_turn = Line2D.relativeCCW(q1.getX(), q1.getY(), q2.getX(), q2.getY(), p[i].getX(), p[i].getY()) == -1;
				if(! correct_turn)q.remove(q.size() - 1);
			}while(! correct_turn && q.size() >= 2);
			q.add(p[i]);
		}
		int t = q.size();
		for(int i = n - 2; i >= 0; i--){
			boolean correct_turn;
			do{
				Point2D q1 = q.get(q.size() - 2);
				Point2D q2 = q.get(q.size() - 1);
				correct_turn = Line2D.relativeCCW(q1.getX(), q1.getY(), q2.getX(), q2.getY(), p[i].getX(), p[i].getY()) == -1;
				if(! correct_turn)q.remove(q.size() - 1);
			}while(! correct_turn && q.size() >= t);
			q.add(p[i]);
		}
		q.remove(q.size() - 1);
		Point2D [] res = q.toArray(new Point2D[q.size()]);
		return res;
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}