
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int m, n;
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if( (n|m) == 0 ) break;
			LinkedList<Integer>[] cups = new LinkedList[3+2];
			cups[0] = new LinkedList<Integer>();
			cups[4] = new LinkedList<Integer>();
			cups[0].add(30);
			cups[4].add(30);
			
			for(int i=1;i<=3;i++) {
				cups[i] = new LinkedList<Integer>();
				cups[i].add(0);
				int k = sc.nextInt();
				for(int j=0;j<k;j++) cups[i].add(sc.nextInt());
			}
			if( cups[1].size() == n+1 || cups[3].size() == n+1 ) System.out.println(0);
			int c = cups[2].getLast();
			int left = cups[1].getLast();
			int right = cups[3].getLast();
			int cnt = 0;
			if( c > max(left, right) ) {
				LinkedList<Integer>[] tmp = new LinkedList[5];
				for(int i=0;i<5;i++) tmp[i] = new LinkedList<Integer>(cups[i]);
				tmp[1].add(tmp[2].removeLast());
				cnt = solve(tmp, c, 2, 1);
				cups[3].add(cups[2].removeLast());
				cnt = min(cnt, solve(cups, c, 2, 1));
			}
			else {
				cnt = solve(cups, -1, -1, 0);
			}
			if( cnt <= m ) System.out.println(cnt);
			else System.out.println(-1);
		}
	}
	
	int solve(LinkedList<Integer>[] cups, int pastp, int pasti, int cp) {
		int cnt;
		int p, i;
		
		for(cnt=cp;cnt<=m;cnt++) {
			i = 0;
			p = 20;
			if( cups[1].size() == n+1 || cups[3].size() == n+1 ) {
				break;
			}
			int from = 0;
			
			for(int j=1;j<=3;j++) {
				int left = cups[j-1].getLast();
				int right = cups[j+1].getLast();
				int c = cups[j].getLast();
//				debug(left, right, c);
				if( p < c || c == 0 || ( c == 1 && ( j == 1 || j == 3 ) ) ) continue;
				if( c != pastp && c > left ) {
					p = c;
					i = j-1;
					from = j;
				}
				else if( c != pastp && c > right ) {
					p = c;
					i = j+1;
					from = j;
				}
				else if( c == pastp && c > left && pasti != j-1 ) {
					p = c;
					i = j-1;
					from = j;
				}
				else if( c == pastp && c > right && pasti != j+1 ) {
					p = c;
					i = j+1;
					from = j;
				}
				else continue;
//				debug("    ", p, i, from);
//				debug("    ", pasti, from);
			}
			cups[i].addLast( cups[from].removeLast() );
			pastp = p;
			pasti = from;
//			for(LinkedList<Integer> a: cups) debug(a);
		}
		return cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}