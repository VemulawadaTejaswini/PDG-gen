import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new D().doIt();
	}

	class D {
		//??????????????? EDS Point2D????????????
		final double EPS = 1.0e-08;
		//????????¨?????????Arrays.sort(data, com);
		Comparator< Point2D > com = new Comparator<Point2D>(){
			public int compare(Point2D o1,Point2D o2) {
				if(o1.getX() < o2.getX()) return -1;
				else if(o1.getX() > o2.getX()) return 1;
				else if(o1.getY() < o2.getY()) return -1;
				else if(o1.getY() > o2.getY()) return 1;
				else return 0;
			}
		};
		//?§????
		private double angle(Point2D p1, Point2D p2){
			double a = dot(p1, p2);
			double b = abs(p1);
			double c = abs(p2);
			double cosTheta  = Math.acos(a/b/c);
			return Math.toDegrees(cosTheta);
		}
		
		//?????\
		private double dot(Point2D p1, Point2D p2){
			return p1.getX() * p2.getX() + p1.getY() * p2.getY();
		}
		//?????¢????±??????????????¬???????norm???sort?????????????????????
		private double abs(Point2D p){
			return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
		}
		
		//????????¨??????????????¢
		private double distanceSS(Line2D l, Line2D m){
			double ans = 0.0;
			if(! l.intersectsLine(m)){
				double res1 = l.ptSegDist(m.getP1());
				double res2 = l.ptSegDist(m.getP2());
				double res3 = m.ptSegDist(l.getP1());
				double res4 = m.ptSegDist(l.getP2());
				ans = Math.min(Math.min(res1, res2),Math.min(res3, res4));
			}
			return ans;
		}
		
		//????????¨?????????????????????
		private boolean isIntersectSS(Line2D l, Line2D m){
			return l.intersectsLine(m);
		}
		
		//??????????????????
		double cost[][];
		double d[];
		boolean used[];
		int V;
		void dijkstra(int s){
			d[s] = 0;
			while(true){
				int v = -1;
				for(int u = 0;u < V;u++){
					if(!used[u] && (v == -1 || d[u] < d[v]))v = u;
				}
				if(v == -1)break;
				used[v] = true;
				for(int u = 0;u < V;u++){
					d[u] = Math.min(d[u], d[v] + cost[v][u]);
				}
			}
		}
		
		void doIt() {
			while (true) {
				int n = sc.nextInt();
				int start = sc.nextInt();
				int goal = sc.nextInt();
				if(n+start+goal == 0)break;
				V = n;
				cost = new double[V][V];
				d = new double[V];
				for(int i = 0;i < V;i++){
					d[i] = Integer.MAX_VALUE;
					for(int j = 0;j < V;j++){
						cost[i][j] = Integer.MAX_VALUE;
					}
				}
				used = new boolean[V];
				Point2D.Double stard[][] = new Point2D.Double[n][5];
				Line2D.Double starl[][] = new Line2D.Double[n][5];
				for(int i = 0;i < n;i++){
					Point2D.Double sstar = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
					double radi = sc.nextDouble();
					double r = sc.nextDouble();
					for(int j = 0;j < 5;j++){
						stard[i][j] = new Point2D.Double(r*Math.sin(Math.toRadians(360+(72*j)-radi))+sstar.getX(),r*Math.cos(Math.toRadians(360+(72*j)-radi))+sstar.getY());
					}
					for(int j = 0;j < 5;j++){
						starl[i][j] = new Line2D.Double(stard[i][j],stard[i][(j+1)%5]);
					}
				}
				for(int i = 0;i < V;i++){
					for(int m = 0;m < V;m++){
						if(i == m)continue;
						for(int j = 0;j < 5;j++){
							for(int k = 0;k < 5;k++){
								if(isIntersectSS(starl[i][j],starl[m][k])){
									cost[i][m] = 0;
									cost[m][i] = 0;
								}
								else{
									cost[i][m] = Math.min(cost[i][m],distanceSS(starl[i][j],starl[m][k]));
									cost[m][i] = cost[i][m];
								}
							}
						}
					}
				}
				dijkstra(start-1);
//				for(int i = 0;i < V;i++){
//					System.out.println(d[i]);
//				}
				System.out.println(d[goal-1]);
			}
		}
	}
}