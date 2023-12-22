
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	short INF = 2047;
	short[][] map;
	P s, g;
	int w, h, node;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			@SuppressWarnings("unchecked")
			LinkedList<P>[] d = new LinkedList[5];
			for(int i=0;i<5;i++) d[i] = new LinkedList<P>();
			
			node = 0;
			for(int i=0;i<h;i++) {
				String str = sc.next();
				for(int j=0;j<str.length();j++) {
					switch(str.charAt(j)) {
					case 'S': s = new P(j, i, node); break;
					case 'G': g = new P(j, i, node); break;
					case '.': continue;
					default : d[str.charAt(j)-'1'].add(new P(j, i, node));
					}
					node++;
				}
			}
			map = new short[node][node];
			for(short[] a: map) fill(a, INF);
			
			for(int i=0;i<5;i++) {
				for(P p1: d[i]) for(P p2: d[(i+1)%5]) {
					map[p1.ind][p2.ind] = (short)(abs(p1.x-p2.x) + abs(p1.y-p2.y));
				}
			}
			int ans = INF;
			int id = -1;
			for(int i=0;i<5;i++) {
				for(int j=0;j<node;j++) {
					map[s.ind][j] = map[j][g.ind] = INF;
				}
				for(P p: d[(i+1)%5]) {
					map[s.ind][p.ind] = (short)(abs(s.x-p.x) + abs(s.y-p.y));
				}
				for(P p: d[(i+4)%5]) {
					map[p.ind][g.ind] = (short)(abs(p.x-g.x) + abs(p.y-g.y));
				}
				int min = dijkstra();
				if( min < ans ) {
					id = i;
					ans = min;
				}
//				debug(i, ans);
			}
			System.out.println( ( id==-1? "NA": ( (id+1) + " " + ans ) ) );
			
		}
	}
	int dijkstra() {
		int[] d = new int[node];
		boolean visited[] = new boolean[node];
		fill(visited, false);
		fill(d, INF);
		d[s.ind] = 0;
		for(;;) {
			int v = -1;
			int min = INF;
			for(int i=0;i<node;i++) {
				if( min > d[i] && !visited[i] ) {
					v = i;
					min = d[i];
				}
			}
			if(v < 0) break;
			if(v == g.ind) break;
			visited[v] = true;
			for(int u=0;u<node;u++) {
				if(d[u] > d[v] + map[v][u]) {
					d[u] = d[v] + map[v][u];
				}
			}
		}
		return d[g.ind];
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	void debug(Object... o) {
		System.err.println(deepToString(o));
	}
	
	class P {
		short x, y, ind;
		P(int x, int y, int ind) {
			this.x = (short)x;
			this.y = (short)y;
			this.ind = (short)ind;
		}
	}
}