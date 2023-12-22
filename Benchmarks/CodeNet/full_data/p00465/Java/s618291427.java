
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 400000000;
	int r;
	Scanner sc;

	void run() {
		sc = new Scanner(System.in);
		for(;;) {
			r = sc.nextInt();
			if( r == 0) break;
			Pair[] a = scan();
			Pair[] b = scan();
//			for(Pair p: a) debug(p.f, p.s);
//			for(Pair p: b) debug(p.f, p.s);

			int min = INF;
			int i=0,j=b.length-1;
			for(;;) {
				if(i == a.length || j == -1) break;
				if(a[i].s+b[j].s >= r) {
					min = min(a[i].f + b[j].f, min);
					j--;
				}
				else {
					i++;
				}
			}

			System.out.println(min);
		}
	}

	int w, h;
	int[][] map;
	boolean[][] visited;
	int sx, sy;

	Pair[] scan() {
		w = sc.nextInt();
		h = sc.nextInt();
		map = new int[h+2][w+2];
		visited = new boolean[h+2][w+2];

		for(int[] a: map) fill(a, INF);

		sx = sc.nextInt();
		sy = sc.nextInt();

		for(int i=1;i<=h;i++) for(int j=1;j<=w;j++)
			map[i][j] = Integer.parseInt(sc.next());
//		for(int[] a: map) debug(a);
		PriorityQueue<P> que = new PriorityQueue<P>(1, new Comp());
		que.add(new P(sx, sy));
		LinkedList<Pair> pairs = new LinkedList<Pair>();
		visited[sy][sx] = true;
		for(;;) {
			P p = que.remove();
//			debug(p.x, p.y, map[p.y][p.x]);
			if( map[p.y][p.x]== INF ) break;

			for(int i=0;i<4;i++) if( !visited[p.y+dy[i]][p.x+dx[i]] ) {
				que.add(new P(p.x+dx[i], p.y+dy[i]));
				visited[p.y+dy[i]][p.x+dx[i]] = true;
			}

			pairs.add( new Pair( map[p.y][p.x], bfs(que, map[p.y][p.x]) ) );


		}

		Pair[] pp = new Pair[pairs.size()+1];
		pp[0] = new Pair(0, 0);
		int size = pairs.size();
		for(int i=1;i<=size;i++) {
			Pair pair = pairs.remove();
			pp[i] = new Pair( pair.f, pair.s + pp[i-1].s );
		}

		return pp;
	}

	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};

	int bfs(PriorityQueue<P> que, int lev) {
		int cnt = 1;
		if(que.isEmpty()) return cnt;
		for(;;) {
			P p = que.remove();
			if( map[p.y][p.x] > lev  ) {
				que.add(p);
				break;
			}
			cnt++;
			for(int i=0;i<4;i++) if( !visited[p.y+dy[i]][p.x+dx[i]] ) {
				que.add(new P(p.x+dx[i], p.y+dy[i]));
				visited[p.y+dy[i]][p.x+dx[i]] = true;
			}
		}

		return cnt;
	}

	class Pair {
		int f,s;
		Pair(int f, int s ) {
			this.f = f;
			this.s = s;
		}
	}

	class Comp implements Comparator<P> {

		@Override
		public int compare(P o1, P o2) {
			// TODO 自動生成されたメソッド・スタブ
			return map[o1.y][o1.x] - map[o2.y][o2.x];
		}

	}

	class P {
		int x, y;
		P (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}