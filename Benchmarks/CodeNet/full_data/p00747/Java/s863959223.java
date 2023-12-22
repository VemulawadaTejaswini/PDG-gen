
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean map[][][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0) break;
			map = new boolean[h][w][4];
			for(int i=0;i<h*2-1;i++) for(int j=0;j<(i%2==0? w-1:w);j++){
				int v = sc.nextInt();
				if(i%2==0) {
					map[i/2][j][2] = v == 0;
				}
				else {
					map[i/2][j][3] = v == 0;
				}
			}
			for(int i=0;i<h;i++) for(int j=1;j<w;j++) {
				map[i][j][0] = map[i][j-1][2];
			}
			for(int i=1;i<h;i++) for(int j=0;j<w;j++) {
				map[i][j][1] = map[i-1][j][3];
			}
//			for(boolean[][] a: map) debug(a);
			System.out.println(dfs());
		}
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int dfs() {
		LinkedList<P> que = new LinkedList<P>();
		que.add(new P(0, 0, 1));
		boolean visited[][] = new boolean[h][w];
		visited[0][0] = true;
		for(;!que.isEmpty();) {
			P now = que.removeFirst();
			if( now.x == w-1 && now.y == h-1 ) return now.c;
			for(int i=0;i<4;i++) if(map[now.y][now.x][i]) {
				if(!visited[now.y+dy[i]][now.x+dx[i]]) {
					visited[now.y+dy[i]][now.x+dx[i]] = true;
					que.add(new P(now.x+dx[i], now.y+dy[i], now.c+1));
				}
			}
		}
		
		return 0;
	}
	
	class P {
		int x, y, c;
		P(int x, int y, int c) {
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