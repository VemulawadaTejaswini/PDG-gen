import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			Poly[] poly = new Poly[n+1];
			for(int i=0;i<=n;i++) {
				int m = sc.nextInt();
				poly[i] = new Poly();
				for(int j=0;j<m;j++) poly[i].add(new P(sc.nextInt(), sc.nextInt()));
			}
			for(int i=1;i<=n;i++) if(poly[0].equal(poly[i])) System.out.println(i);
			System.out.println("+++++");
		}
	}
	
	class Poly {
		int size;
		ArrayList<P> list;
		Poly() {
			list = new ArrayList<P>();
			size = 0;
		}
		
		void add(P p) {
			list.add(p);
			size++;
		}
		int[][][] tr = { {{1, 0}, {0, 1}}, {{0, 1}, {-1, 0}}, {{0, -1}, {1, 0}}, {{-1, 0}, {0, -1}} };
		boolean equal(Poly poly) {
			if(size != poly.size) return false;
			int sx = poly.list.get(0).x, sy = poly.list.get(0).y;
			int dx = list.get(0).x, dy = list.get(0).y;
			for(int i=0;i<4;i++) {
				boolean f = true;
				for(int j=0;j<size;j++) {
					int px = (poly.list.get(j).x - sx) * tr[i][0][0] + (poly.list.get(j).y - sy) * tr[i][0][1] + dx;
					int py = (poly.list.get(j).x - sx) * tr[i][1][0] + (poly.list.get(j).y - sy) * tr[i][1][1] + dy;
					debug(j, px, list.get(j).x, py, list.get(j).y);
					if(px != list.get(j).x || py != list.get(j).y) f = false;
				}
				if( f ) return true;
			}
			sx = poly.list.get(size-1).x; sy = poly.list.get(size-1).y;
			for(int i=0;i<4;i++) {
				boolean f = true;
				for(int j=0;j<size;j++) {
					int px = (poly.list.get(size-j-1).x - sx) * tr[i][0][0] + (poly.list.get(size-j-1).y - sy) * tr[i][0][1] + dx;
					int py = (poly.list.get(size-j-1).x - sx) * tr[i][1][0] + (poly.list.get(size-j-1).y - sy) * tr[i][1][1] + dy;
					debug(j, px, list.get(j).x, py, list.get(j).y);
					if(px != list.get(j).x || py != list.get(j).y) f = false;
				}
				if( f ) return true;
			}
			return false;
		}
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}