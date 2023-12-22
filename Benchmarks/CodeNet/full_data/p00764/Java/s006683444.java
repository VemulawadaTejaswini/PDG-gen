
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int n;
	P[][] cps;
	C[] cs;
	double[][] es;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			
			cs = new C[n];
			for(int i=0;i<n;i++) cs[i] = new C(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			
			cps = new P[n-1][];
			for(int i=0;i<n-1;i++) cps[i] = circleIntersection(cs[i].p, cs[i+1].p, cs[i].r, cs[i+1].r);
//			for(int i=0;i<n-1;i++) debug(cps[i][0].x, cps[i][0].y, cps[i][1].x, cps[i][1].y);
			
			es = new double[2*n][2*n];
			for(double[] a: es) fill(a, INF);
			
			for(int i=0;i<n-1;i++) {
				if(isCross(cs[0].p, cps[i][0], 0, i)) es[0][2*(i+1)-1] = cs[0].p.abs(cps[i][0]);
				if(isCross(cs[0].p, cps[i][1], 0, i)) es[0][2*(i+1)] = cs[0].p.abs(cps[i][1]);
				if(isCross(cs[n-1].p, cps[i][0], i+1, n-1)) es[2*(i+1)-1][2*n-1] = cs[n-1].p.abs(cps[i][0]);
				if(isCross(cs[n-1].p, cps[i][1], i+1, n-1)) es[2*(i+1)][2*n-1] = cs[n-1].p.abs(cps[i][1]);
			}
			
			for(int i=0;i<n-1;i++) for(int j=i+1;j<n-1;j++) {
				if(isCross(cps[i][0], cps[j][0], i+1, j)) es[2*(i+1)-1][2*(j+1)-1] = cps[i][0].abs(cps[j][0]);
				if(isCross(cps[i][0], cps[j][1], i+1, j)) es[2*(i+1)-1][2*(j+1)] = cps[i][0].abs(cps[j][1]);
				if(isCross(cps[i][1], cps[j][0], i+1, j)) es[2*(i+1)][2*(j+1)-1] = cps[i][1].abs(cps[j][0]);
				if(isCross(cps[i][1], cps[j][1], i+1, j)) es[2*(i+1)][2*(j+1)] = cps[i][1].abs(cps[j][1]);
			}
			
			if(isCross(cs[0].p, cs[n-1].p, 0, n-1)) es[0][2*n-1] = cs[0].p.abs(cs[n-1].p);
			
//			for(double[] a: es) debug(a);
			System.out.println(dijkstra());
		}
	}
	
	double dijkstra() {
		double[] d = new double[2*n];
		boolean[] used = new boolean[2*n];
		int[] path = new int[2*n];
		fill(d, INF);d[0] = 0;
		for(;;) {
			int v = -1;
			for(int u=0;u<2*n;u++) if(!used[u] && (v == -1 || d[v] > d[u])) v = u;
			if(v == -1) {
//				debug(path);
				return d[2*n-1];
			}
			
			used[v] = true;
			for(int u=0;u<2*n;u++) {
				path[u] = d[u] > d[v] + es[v][u]? v: path[u];
				d[u] = min(d[u], d[v] + es[v][u]);
				
			}
		}
	}
	
	boolean isCross(P s, P e, int p, int q) {
//		debug(s.x, s.y, e.x, e.y);
		for(int i=p;i<q;i++) {
			if(!cross(s, e, cps[i][0], cps[i][1])) return false;
		}
		return true;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	

	P[] circleIntersection(P a, P b, double r1, double r2) {
		P AB = b.sub(a);

		double ab = AB.abs();
		double ai = ( r1*r1 - r2*r2 + ab*ab ) / ( 2 * ab );
		P AI = AB.mlt(ai/ab);

		double ip = sqrt( r1*r1 - ai * ai);
		P IP = new P(AB.y * ip/ab, -AB.x* ip/ab);

		P P1 = a.add(AI).add(IP);

		IP = IP.mlt(-1.0);
		P P2 = a.add(AI).add(IP);
		
//		debug(ab, ai, ip);
//		debug("P1:", P1.x, P1.y);
//		debug("P2:", P2.x, P2.y);
		
		
		return new P[] {P1, P2};
	}
	
	//線分交差判定
	boolean cross(P p1, P p2, P q1, P q2) {
		return ccw(p1, p2, q1) * ccw(p1, p2, q2) <= 0 &&
			ccw(q1, q2, p1) * ccw(q1, q2, p2) <= 0;
	}

	//時計回りなのか．反時計回りなのか，直線状なのか，とにかく位置関係をみる
	int ccw (P a, P b, P c) {
		P s = b.sub(a);
		P t = c.sub(a);
		if( s.det(t) > EPS ) return 1;
		if( s.det(t) < -EPS ) return -1;
		if( s.dot(t) < -EPS ) return 2;
		if( s.dot(s) + EPS < t.dot(t) ) return -2;
		return 0;
	}
	
	class C {
		P p;
		double r;
		C(double x, double y, double r) {
			p = new P(x, y);
			this.r = r;
		}
	}
	
	class P {
		double EPS = 1e-10;
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}

		double add(double a, double b) {
			//誤差を考慮
			if( Math.abs(a+b) < EPS * ( Math.abs(a) + Math.abs(b) ) ) return 0;
			return a + b;
		}

		P add(P p) {	//和
			return new P(x+p.x, y+p.y);
		}

		P sub(P p) {	//差
			return new P(x-p.x, y-p.y);
		}

		P mlt(double k) {
			return new P(x*k, y*k);
		}

		double dot(P p) {	//内積
				return add(x*p.x, y*p.y);
		}

		double det(P p) {	//外積
			return add(x*p.y, -y*p.x);
		}

		double abs() {
			double ret = sqrt( add(x*x, y*y) );
			if ( Math.abs(ret) < EPS ) return 0;
			return ret;
		}

		double abs(P p) {
			double dx = add( x, -p.x );
			double dy = add( y, -p.y );
			double ret = sqrt( add(dx*dx, dy*dy) );
			if( Math.abs(ret) < EPS ) return 0;
			return ret;
		}
	}
}