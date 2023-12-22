import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;


public class Main {
	
	double EPS = 1e-6;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			P[] ps = new P[n];
			
			for(int i=0;i<n;i++) {
				String[] str = sc.next().split(",");
				ps[i] = new P(Double.parseDouble(str[0]), Double.parseDouble(str[1]));
			}
			
			int max = 1;
			for(int i=0;i<n;i++) for(int j=i+1;j<n;j++) {
				ArrayList<P> cs = cross(ps[i], ps[j]);
				if(cs.isEmpty()) continue;
				
				int cnt = 0;
				for(P c: cs) for(int k=0;k<n;k++) {
					if( 1.0 + EPS > c.abs(ps[k])  ) cnt++;
				}
				
				max = max(cnt, max);
			}
			
			System.out.println(max);
		}
		
	}
	
	ArrayList<P> cross(P p1, P p2) {
		ArrayList<P> ret = new ArrayList<P>();
		
		if( abs ( 4.0 - abs( p1.abs(p2) ) ) < EPS ) {
			P c = p1.add(p2).mult(0.5);
			ret.add(c);
		}
		else if( 4.0 + EPS > abs(p1.abs(p2)) ) {
			P p3 = p1.add(p2.mult(-1.0));
			P c = p2.add(p3.mult(0.5));
			P un1 = new P(p3.y, -p3.x).mult(sqrt(p3.abs()));
			P un2 = new P(-p3.y, p3.x).mult(sqrt(p3.abs()));
			double dist = sqrt( 1 - p3.abs() );
			
			P c1 = c.add(un1.mult(dist));
			P c2 = c.add(un2.mult(dist));
			
			ret.add(c1); ret.add(c2);
		}
		
		return ret;
	}
	
	class P {
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		P add(P p) {
			return new P(x+p.x, y+p.y);
		}
		
		P mult(double k) {
			return new P(x * k, y * k);
		}
		
		double dot(P p) {	//内積
			return x*p.x + y*p.y;
	}
	
		double det(P p) {	//外積
			return x*p.y - y*p.x;
		}
		
		double abs(P p) {
			return (x-p.x) * (x-p.x) + (y-p.y) * (y-p.y);
		}
		
		double abs() {
			return x * x + y * y;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}