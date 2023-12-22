
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	final int offset = 10000;
	HashSet<Integer> ps;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			ps = new HashSet<Integer>();
			int n = sc.nextInt();
			if( n==0 ) break;
			for(int i=0;i<n;i++) {
				ps.add(p2Int(sc.nextInt(), sc.nextInt()));
			}
//			debug(ps);
			int max = 0;
			for(int ind1: ps) {
				for(int ind2: ps) {
					if( ind1 == ind2 ) continue;
					P p1 = int2P(ind1);
					P p2 = int2P(ind2);
					P dp = p1.sub(p2);
//					debug(p1.x, p1.y, p2.x, p2.y);
					if( ps.contains(p2Int(p1.x-dp.y, p1.y+dp.x)) && ps.contains(p2Int(p2.x-dp.y, p2.y+dp.x)) )
						max = max(max, dp.d());
					else if 
					  ( ps.contains(p2Int(p1.x+dp.y, p1.y-dp.x)) && ps.contains(p2Int(p2.x+dp.y, p2.y-dp.x)) )
						max = max(max, dp.d());
				}
			}
			System.out.println(max);
		}
	}
	
	int p2Int(int x, int y) {
		return x * offset + y;
	}
	
	P int2P(int val) {
		int x = val / offset;
		int y = val-x*offset;
		return new P(x, y);
	}
	
	class P {
		int x, y;
		P (int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		P sub(P p) {
			int x = this.x-p.x;
			int y = this.y-p.y;
			return new P(x, y);
		}
		
		int d() {
			return x*x + y*y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}