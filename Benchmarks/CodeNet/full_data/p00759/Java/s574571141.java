
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean[][][] map;
	int[][][] dp;
	boolean visited[][];
	LinkedList<P> que;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			if( (h|w) == 0) break;
			map = new boolean[h][w][4];
			dp = new int[h][w][4];
			visited = new boolean[h][w];
			que = new LinkedList<P>();
			for(int i=0;i<2*h-1;i++) for(int j=0;j<((i%2==0)? w-1:w); j++) {
				if(i%2==0) map[i/2][j][2] = map[i/2][j+1][0] = ( sc.nextInt() == 0 )? true: false;
				else map[(i-1)/2][j][3] = map[(i-1)/2+1][j][1] = ( sc.nextInt() == 0 )? true: false;
			}
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) for(int k=0;k<4;k++) {
				if( !map[i][j][k] ) continue;
				map[i][j][k] = false;
				dp[i][j][k] = bfs(j, i);
				map[i][j][k] = true;
			}
			System.out.println(dijkstra());
		}
	}
	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
	
	int bfs(int x, int y) {
		for(boolean[] a: visited)fill(a, false);
		que.clear();
		P now = new P(x, y, 0);
		que.add(now);
		for(;!que.isEmpty();) {
			now = que.removeFirst();
			if( now.x == w-1 && now.y == h-1) return now.c;
			for(int i=0;i<4;i++) {
				if(!map[now.y][now.x][i]) continue;
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if( !visited[ny][nx]) {
					visited[ny][nx] = true;
					que.addLast(new P(nx, ny, now.c+1));
				}
			}
		}
		return INF;
	}
	
	int dijkstra() {
		PriorityQueue<P> que = new PriorityQueue<P>(1, new MyComp());
		int[][] c = new int[h][w];
		for(int[] a: c) fill(a, INF);
		P now = new P( w-1, h-1, 0 );
		c[h-1][w-1] = 0;
		que.add(now);
		
		for(;!que.isEmpty();) {
			now = que.remove();
			if(now.x == 0 && now.y == 0) return now.c;
			if(now.c != c[now.y][now.x]) continue;
			for(int i=0;i<4;i++) {
				if( !map[now.y][now.x][i] ) continue;
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				int nc = now.c + 1;
				nc = max(nc, dp[ny][nx][(i+2)%4]);
				if( c[ny][nx] <= nc ) continue;
				c[ny][nx] = nc;
				que.add(new P(nx, ny, nc));
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
	
	class MyComp implements Comparator<P> {

		@Override
		public int compare(P p1, P p2) {
			// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
			return p1.c-p2.c;
		}
		
	}
	
	class P implements Comparable<P>{
		int x, y, c;
		P(int x, int y, int c) {
			this.x = x;
			this.y = y;
			this.c = c;
		}
		@Override
		public int compareTo(P p) {
			// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
			return c - p.c;
		}
	}
}