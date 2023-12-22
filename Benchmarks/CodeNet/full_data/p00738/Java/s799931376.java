import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int gx = sc.nextInt();
			int gy = sc.nextInt();
			Line2D route = new Line2D.Double(sx, sy, gx, gy);
			Point2D [][] rect = new Point2D[n][4];
			int [] hlist = new int[n];
			for(int i = 0; i < n; i++){
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				hlist[i] = sc.nextInt();
				rect[i][0] = new Point2D.Double(x1, y1);
				rect[i][1] = new Point2D.Double(x2, y1);
				rect[i][2] = new Point2D.Double(x2, y2);
				rect[i][3] = new Point2D.Double(x1, y2);
			}
			
			double ans = INF;
			for(int i = 0; i < n; i++){
				
				boolean isIntersect = false;
				for(int j = 0; j < 4; j++){
					Line2D nowline = new Line2D.Double(rect[i][j], rect[i][(j + 1) % 4]);
					if(route.intersectsLine(nowline)){
						isIntersect = true;
						break;
					}
				}
				if(isIntersect || isN(route, rect[i])){
					ans = 0.0;
					break;
				}
				
				double mindis = INF;
				
				for(int j = 0; j < 4; j++){
					Line2D nowline = new Line2D.Double(rect[i][j], rect[i][(j + 1) % 4]);
					double nowdis = distanceSS(route, nowline);
					mindis = Math.min(mindis, nowdis);
				}
				if(hlist[i] >= mindis){
					ans = Math.min(ans, mindis);
				}
				else{
					double r = (double)(hlist[i] * hlist[i] + mindis * mindis) / (2 * hlist[i]);
					ans = Math.min(ans, r);
				}
			}
			System.out.println(ans);
		}
		
	}
	private boolean isN(Line2D route, Point2D[] rect) {
		if(rect[0].getX() <= route.getX1() && rect[0].getY() <= route.getY1() &&
				rect[2].getX() >= route.getX1() && rect[2].getY() >= route.getY1()){
			return true;
		}
		return false;
	}
	private double distanceSS(Line2D l, Line2D m){
		double ans = 0.0;
		if(! l.intersectsLine(m)){
			double res1 = l.ptSegDist(m.getP1());
			double res2 = l.ptSegDist(m.getP2());
			double res3 = m.ptSegDist(l.getP1());
			double res4 = m.ptSegDist(l.getP2());
			ans = Math.min(Math.min(res1, res2), Math.min(res3, res4));
		}
		return ans;
	}
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}