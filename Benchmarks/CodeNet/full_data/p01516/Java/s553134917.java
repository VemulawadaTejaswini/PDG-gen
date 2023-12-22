
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-10;
	int n, s, g;
	double[][] map;
	
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			s = sc.nextInt(); g = sc.nextInt();
			if( (n|s|g) == 0 ) break;
			s--; g--;
			
			Pent[] pents = new Pent[n];
			for(int i=0;i<n;i++) {
				pents[i] = new Pent(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			}
			
			map = new double[n][n];
			for(int i=0;i<n;i++) for(int j=i+1;j<n;j++) {
				map[i][j] = map[j][i] = pents[i].d(pents[j]);
			}
			
			for(int k=0;k<n;k++) for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
				map[i][j] = min(map[i][j], map[i][k] + map[j][k]);
			}
			
			System.out.println(map[s][g]);
			
		}
	}
	
	class Pent {
		P[] ps;
		Pent (double x, double y, double a, double r) {
			ps = new P[5];
			for(int i=0;i<5;i++) {
				ps[i] = new P( -sin( (a + 72 * i) * PI / 180 ) * r + x, cos( (a + 72 * i) * PI / 180 ) * r + y );
			}
		}
		
		double d(Pent p) {
			double d = Double.MAX_VALUE;
			for(int i=0;i<5;i++) for(int j=0;j<5;j++){
				if( cross(ps[i], ps[(i+2)%5], p.ps[j], p.ps[(j+2)%5] ) ) return 0;
				d = min( disSP(ps[i], ps[(i+2)%5], p.ps[j]), d );
				d = min( disSP(p.ps[i], p.ps[(i+2)%5], ps[j]), d );
			}
			return d;
		}
	}
	
	double disSP(P p1, P p2, P q) {
		if( p2.sub(p1).dot(q.sub(p1)) < EPS ) return q.sub(p1).len();
		if( p1.sub(p2).dot(q.sub(p2)) < EPS ) return q.sub(p2).len();
		return disLP(p1, p2, q);
	}
	
	double disLP(P p1, P p2, P q) {
		return abs ( p1.sub(p2).det(q.sub(p2)) ) / p1.sub(p2).len();
	}
	
	boolean cross(P p1, P p2, P q1, P q2) {
		if( max(p1.x, p2.x) + EPS < min(q1.x, q2.x) ) return false;
		if( max(p1.y, p2.x) + EPS < min(q1.y, q2.y) ) return false;
		if( max(q1.x, q2.x) + EPS < min(p1.x, p2.x) ) return false;
		if( max(q1.y, q2.x) + EPS < min(p1.y, p2.y) ) return false;
		return abs( p1.sub(p2).det(q1) * p1.sub(p2).det(q2) ) < EPS &&
			   abs( q1.sub(q2).det(p1) * q1.sub(q2).det(p2) ) < EPS;
	}
	
	class P {
		double x, y;
		P( double x, double y ) {
			this.x = x;
			this.y = y;
		}
		
		P add(P p) {
			return new P(add(x,p.x), add(y,p.y));
		}
		
		P sub(P p) {
			return new P(x-p.x, y-p.y);
		}
		
		double dot(P p) {
			return add( x*p.x, y*p.y );
		}
		
		double det(P p) {
			return add( x*p.y, -y*p.x );
		}
		
		double len() {
			double abs = sqrt ( add(x*x, y*y) );
			if( abs(abs) < EPS ) return 0;
			return abs;
		}
		
		double add(double a, double b) {
			if( abs(a+b) < EPS * ( abs(a) + abs(b) ) ) return 0;
			return a+b;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}