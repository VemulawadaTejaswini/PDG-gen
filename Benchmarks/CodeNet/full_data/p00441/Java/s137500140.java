
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			HashSet<P> ps = new HashSet<P>();
			for(int i=0;i<n;i++) {
				P p = new P(sc.nextInt(), sc.nextInt());
				ps.add(p);
			}
			int max = 0;
//			for(P p: ps) debug(ps);
			for(P p1: ps) for(P p2: ps){
				if(p1.equals(p2)) continue;
				int x = p1.x-p2.x;
				int y = p1.y-p2.y;
				P p3 = new P(p1.x + y, p1.y - x);
				P p4 = new P(p2.x + y, p2.y - x);
				if( ps.contains(p3) && ps.contains(p4) ) {
					max = max(max, x * x + y * y);
				}
				p3 = new P(p1.x - y, p1.y + x);
				p4 = new P(p2.x - y, p2.y + x);
				if( ps.contains(p3) && ps.contains(p4) ) {
					max = max(max, x * x + y * y);
				}
			}
			System.out.println(max);
		}
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public boolean equals(Object o) {
			if(o instanceof P) {
				P p = (P) o;
				return x == p.x && y == p.y;
			}
			return false;
		}
		
		public int hashCode() {
			return x*5010 + y;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}