
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			P[] ps = new P[n];
			for(int i=0;i<n;i++) {
				String[] sp = sc.next().split(",");
				ps[i] = new P(Double.parseDouble(sp[0]), Double.parseDouble(sp[1]));
			}
			
			P[] poly = poly(ps);
			System.out.println( n - poly.length );
		}
	}
	
	P[] poly(P[] ps) {
		int n = ps.length, k=0;
		if(n <= 1) return ps;
		sort(ps, new Comp());
		P[] qs = new P[n*2];
		
		for(int i=0;i<n;qs[k++] = ps[i++]) {
			while(k > 1 && qs[k-1].sub(qs[k-2]).det(ps[i].sub(qs[k-1])) < EPS) k--;
		}
		for(int i=n-2,t=k;i>=0;qs[k++] = ps[i--]) {
			while(k > t && qs[k-1].sub(qs[k-2]).det(ps[i].sub(qs[k-1])) < EPS) k--;
		}
		P[] res = new P[k-1];
		System.arraycopy(qs, 0, res, 0, k-1);
		return res;
	}
	
	boolean contains(P[] ps, P p) {
		int n = ps.length;
		int res = -1;
		for(int j=0;j<n;j++) {
			P a = ps[j].sub(p);
			P b = ps[(j+1)%n].sub(p);
			if(a.y > b.y) {
				P t = new P(a.x, a.y); a = b; b = t; 
			}
			if(a.y < EPS &&  b.y > EPS && a.det(b) > EPS) {
				res = -res;
			}
			if(abs(a.det(b)) < EPS && a.dot(b) < EPS) {
				return true;
			}
		}
		return res == -1? false: true;
	}
	class Comp implements Comparator<P> {

		public int compare(P o1, P o2) {
			// TODO 自動生成されたメソッド・スタブ
			if(o1.x != o2.x) return (int)(o1.x - o2.x);
			return (int)(o1.y - o2.y);
		}
		
	}
	class P {
		double EPS = 1e-10;
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}

		double add(double a, double b) {	//誤差を考慮
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

		//距離系
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

		//点と線分の距離
		double disSP(P p1, P p2, P q) {
			if( p2.sub(p1).dot(q.sub(p1)) < EPS ) return q.sub(p1).abs();
			if( p1.sub(p2).dot(q.sub(p2)) < EPS ) return q.sub(p2).abs();
			return disLP(p1, p2, q);
		}

		//点と直線の距離
		double disLP(P p1, P p2, P q) {
			return Math.abs(p2.sub(p1).det(q.sub(p1))) / p2.sub(p1).abs();
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
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}