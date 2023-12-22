
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	int[][] map;
	int f, m, o;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt(); h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			f = sc.nextInt(); m = sc.nextInt(); o = sc.nextInt()-1;
			map = new int[h][w+2];
			for(int[] a: map) fill(a, -INF);
			
			for(int i=0;i<h;i++) for(int j=1;j<=w;j++) {
				map[i][j] = sc.nextInt();
			}
			
			int c = dijkstra();
			System.out.println((c < 0? "NA": c));
		}
	}
	
	int[] dx = {-1,0,1};
	int[] dy = {0,1,0};
	int dijkstra() {
		int c[][][] = new int[h][w+2][m];
		for(int[][] a:c) for(int[] b: a) fill(b, INF);
		PriorityQueue<E> que = new PriorityQueue<E>();
		
		for(int i=1;i<=w;i++) {
			if(map[0][i] >= 0 && o - 1 + map[0][i] >= 0) {
				c[0][i][min(o-1+map[0][i], m)] = 0;
				que.add(new E(i, 0, 0, min(o-1+map[0][i], m)));
			}
			else if(map[0][i] < 0 && o!=0){
				c[0][i][o-1] = -map[0][i];
				que.add(new E(i, 0, -map[0][i], o-1));
			}
		}
		for(int[] a: map) debug(a);
		for(int[][] a: c)debug(a);
		m--;
		
		for(;!que.isEmpty();) {
			E now = que.poll();
			debug(now.x, now.y, now.c, now.m);
			if( now.c > f ) break;
			if( c[now.y][now.x][now.m] != now.c ) continue;
			if( now.y == h-1 ) return now.c;
			
			for(int i=0;i<3;i++) {
				if( map[now.y+dy[i]][now.x+dx[i]] >= 0 && now.m-1+map[now.y+dy[i]][now.x+dx[i]] >= 0 ) {
					debug(min(now.m-1+map[0][i], m), now.m, m);
					if( c[now.y+dy[i]][now.x+dx[i]][min(now.m-1+map[now.y+dy[i]][now.x+dx[i]], m)] > now.c ) {
						c[now.y+dy[i]][now.x+dx[i]][min(now.m-1+map[now.y+dy[i]][now.x+dx[i]], m)] = now.c ;
						que.add(new E(now.x+dx[i], now.y+dy[i], now.c, min(now.m-1+map[now.y+dy[i]][now.x+dx[i]], m)));
					}
				}
				else if( map[now.y+dy[i]][now.x+dx[i]] < 0 && now.m != 0 ) {
					if( c[now.y+dy[i]][now.x+dx[i]][m-1] > now.c - map[now.y+dy[i]][now.x+dx[i]] ) {
						c[now.y+dy[i]][now.x+dx[i]][now.m-1] = now.c - map[now.y+dy[i]][now.x+dx[i]];
						que.add(new E(now.x+dx[i], now.y+dy[i], now.c-map[now.y+dy[i]][now.x+dx[i]], now.m-1));
					}
				}
			}
		}
		
		return -1;
	}
	
	class E implements Comparable<E> {
		int x, y, c, m;
		
		E(int x, int y, int c, int m) {
			this.x = x; this.y = y;
			this.c = c; this.m = m;
		}
		
		@Override
		public int compareTo(E o) {
			// TODO 自動生成されたメソッド・スタブ
			return c - o.c;
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}