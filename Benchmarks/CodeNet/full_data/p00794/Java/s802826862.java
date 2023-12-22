
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	short w, h;
	short[][] map;
	short sx, sy;
	short gx, gy;
	P[] nodes;
	LinkedList<E>[] edge;
	int size;
	
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextShort();
			h = sc.nextShort();
			if( (w|h) == 0 ) break;
			
			map = new short[h+2][w+2];
			LinkedList<P> foods = new LinkedList<P>();
			for(short i=1;i<=h;i++) for(short j=1;j<=w;j++) {
				map[i][j] = sc.nextShort();
				if(map[i][j] == 2) {
					map[i][j] = 1;
					sx = j; sy = i;
				}
				if(map[i][j] == 3) {
					map[i][j] = 1;
					gx = j; gy = i;
				}
				if(map[i][j] == 4) {
					map[i][j] = 1;
					foods.add(new P(j, i));
				}
			}
			
			size = foods.size() + 2;
			nodes = new P[size];
			
			nodes[0] = new P(sx, sy);
			for(int i=1;i<size-1;i++) nodes[i] = foods.remove();
			nodes[size-1] = new P(gx, gy);
			
			edge = new LinkedList[size];
			for(int i=0;i<size;i++) edge[i] = new LinkedList<E>();
			for(int i=0;i<size;i++) for(int j=i+1;j<size;j++) {
				int d = bfs(nodes[i], nodes[j]);
				if( d<0 ) continue;
				edge[i].add(new E(j, d));
				edge[j].add(new E(i, d));
			}
			
			System.out.println(dijkstra());
		}
	}
	
	int dijkstra() {
		boolean visited[] = new boolean[size];
		PriorityQueue<E> que = new PriorityQueue<E>();
		que.add(new E(0, 0));
		for(;!que.isEmpty();) {
			E now = que.remove();
			if( visited[now.t] ) continue;
			if( now.t == size-1 ) return now.c;
			visited[now.t] = true;
			for(E next: edge[now.t]) {
				que.add(new E(next.t, now.c+next.c));
			}
		}
		return -1;
	}
	
	short dx[] = {-1,0,1,0};
	short dy[] = {0,-1,0,1};
	
	int bfs(P f, P t) {
		boolean[][] visited = new boolean[h+2][w+2];
		
		LinkedList<P> que = new LinkedList<P>();
		que.add(f);
		visited[f.y][f.x]= true; 
		
		for(;!que.isEmpty();) {
			P now = que.remove();
			if(now.c == 0) continue;
			if( now.x == t.x && now.y == t.y ) return 6-now.c;
			for(int i=0;i<4;i++) if( map[now.y+dy[i]][now.x+dx[i]] == 1  && !visited[now.y+dy[i]][now.x+dx[i]] ) {
				visited[now.y+dy[i]][now.x+dx[i]] = true;
				que.addLast(new P((short)(now.x+dx[i]), (short)(now.y+dy[i]), (short)(now.c-1)));
			}
		}
		
		return -1;
	}
	
	class E implements Comparable<E>{
		int t, c;
		E (int t, int c) {
			this.t = t;
			this.c = c;
		}
		@Override
		public int compareTo(E o) {
			// TODO 自動生成されたメソッド・スタブ
			return c-o.c;
		}
	}
	
	class P {
		short x, y, c;
		P(short x, short y) {
			this.x = x;
			this.y = y;
			c = 6;
		}
		P(short x, short y, short c) {
			this.x = x;
			this.y = y;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}