
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	int[][] map;
	int[] pen;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) { 
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			map = new int[h][w];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) {
				map[i][j] = sc.nextInt();
			}
			
			pen = new int[4];
			for(int i=0;i<4;i++) pen[i] = sc.nextInt();
			
			System.out.println(dijkstra());
		}
	}
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
	
	int dijkstra() {
		PriorityQueue<E> que = new PriorityQueue<E>();
		int[][][] c = new int[h][w][4];
		que.add(new E( new P(0,0,2), 0));
		for(int[][] a: c) for(int[] b: a) fill(b, INF);
		c[0][0][2] = 0;
		
		for(;;) {
			E now = que.poll();
			P p = now.p;
			if( isG(p) ) return now.c;
			if( c[p.y][p.x][p.d] != now.c ) continue;
			
			for(int d=0;d<4;d++) {
				int nd = (d + p.d) % 4;
				int nx = p.x + dx[nd];
				int ny = p.y + dy[nd];
				if( nx < 0 || nx >= w || ny < 0 || ny >= h ) continue;
				int nc = now.c + (map[p.y][p.x] == d? 0: pen[d]);
				if( c[ny][nx][nd] > nc ) {
					c[ny][nx][nd] = nc;
					que.add(new E(new P(nx, ny, nd), nc));
				}
			}
		}
		
	}
	
	boolean isG(P p) {
		return p.x == w-1 && p.y == h-1;
	}
	
	class P {
		int x, y, d;
		P(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}
	
	class E implements Comparable<E> {
		P p;
		int c;
		E( P p, int c) {
			this.p = p;
			this.c = c;
		}
		@Override
		public int compareTo(E o) {
			// TODO Auto-generated method stub
			return c - o.c;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}