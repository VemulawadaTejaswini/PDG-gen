
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	int INF = 1 << 28;
	int WALL = 10000;
	int GOAL = 100;
	int w, h;
	int map[][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			map = new int[h+2][w+2];
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) { 
					switch (str.charAt(j-1)) {
					case '#': map[i][j] = WALL; break;
					case '&': map[i][j] = GOAL; break;
					}
				}
			}

			int c=1;
			for(;; c++) {
//				for(int[] a: map) debug(a);
				if( bfs(c) ) break;
			}
			System.out.println(c-1);
		}
	}
	
	int dx[] ={-1,0,1,0};
	int dy[] ={0,-1,0,1};
	
	boolean bfs(int c) {
		LinkedList<P> que = new LinkedList<P>();
		que.add(new P(0,0));
		map[0][0] = c;
		
		for(;!que.isEmpty();) {
			P now = que.removeFirst();
//			debug(now.x, now.y);
			for(int i=0;i<4;i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if( nx < 0 || nx >= w+2 || ny < 0 || ny >= h+2 ) continue;
				
				if( map[ny][nx] < c ) {
					que.add(new P(nx,ny));
					map[ny][nx] = c;
				}
				else if(map[ny][nx] == WALL) map[ny][nx] = c;
				else if(map[ny][nx] == GOAL) return true;
			}
		}
		return false;
	}
	
	class P {
		int x, y;
		P(int x, int y) {
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