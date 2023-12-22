
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] map;
	int w, h;
	int sx, sy, gx, gy;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			map = new int[h+2][w+2];
			sx = sc.nextInt();
			sy = sc.nextInt();
			gx = sc.nextInt();
			gy = sc.nextInt();
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int j=x;j<(d==0? x+4:x+2);j++) for(int k=y;k<(d==0? y+2:y+4);k++) 
					map[k][j] = c;
			}
//			for(int[] a: map) debug(a);
			if(bfs()) System.out.println("OK");
			else System.out.println("NG");
		}
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	boolean bfs() {
		LinkedList<P> que = new LinkedList<P>();
		boolean visited[][] = new boolean[h+2][w+2];
		if(map[sy][sx] == 0) return false;
		que.add(new P(sx, sy, 0));
		for(;!que.isEmpty();) {
			P now = que.removeFirst();
//			debug(now.x, now.y, now.c);
			if(now.x == gx && now.y == gy) return true;
			for(int i=0;i<4;i++) if(!visited[now.y+dy[i]][now.x+dx[i]] && map[now.y+dy[i]][now.x+dx[i]]==map[now.y][now.x]){
				visited[now.y+dy[i]][now.x+dx[i]] = true;
				que.add(new P(now.x+dx[i], now.y+dy[i],now.c+1));
			}
		}
		
		return false;
	}
	
	class P {
		int x, y, c;
		P(int x, int y) {
			this.x = x;
			this.y = y;
			c=0;
		}
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