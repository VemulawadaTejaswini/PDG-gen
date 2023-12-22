
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	int[][] map;
	int[][][] min;
	int[] c;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			
			map = new int[h][w];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) 
				map[i][j] = sc.nextInt();
			
			c = new int[4];
			for(int i=0;i<4;i++) c[i] = sc.nextInt();
			
			min = new int[h][w][4];
			for(int[][] a: min) for(int[] b: a) fill(b, INF);
			
			System.out.println(solve());
		}
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int solve() {
		PriorityQueue<Element> que = new PriorityQueue<Element>();
		que.add(new Element(0,0,2,0));
		min[0][0][2] = 0;
		for(;;) {
			Element e = que.remove();
			if( e.x == w-1 && e.y == h-1) return e.c;
			if(min[e.y][e.x][e.d] != e.c) continue;
			
			for(int i=0;i<4;i++) {
				int nx = e.x + dx[(i+e.d)%4];
				int ny = e.y + dy[(i+e.d)%4];
				if(nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
				if(i == map[e.y][e.x]) {
					if(min[ny][nx][(i+e.d)%4] <= e.c )continue;
					que.add(new Element(nx, ny, (i+e.d)%4, e.c));
					min[ny][nx][(i+e.d)%4] = e.c;
				}
				else {
					if(min[ny][nx][(i+e.d)%4] <= e.c+c[i])continue;
					que.add(new Element(nx, ny, (i+e.d)%4, e.c+c[i]));
					min[ny][nx][(i+e.d)%4] = e.c+c[i];
				}
			}
		}
	}
	
	class Element implements Comparable<Element>{
		int x, y, d, c;
		Element(int x, int y, int d, int c) {
			this.x = x;
			this.y = y;
			this.d = d;
			this.c = c;
		}
		@Override
		public int compareTo(Element o) {
			// TODO 自動生成されたメソッド・スタブ
			return c-o.c;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}