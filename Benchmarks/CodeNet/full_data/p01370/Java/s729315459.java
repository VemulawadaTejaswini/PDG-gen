
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int OFS = 75;
	int MAX = 150;
	boolean map[][] = new boolean[MAX][MAX];
	
	int t, n;
	int sx, sy;
	
	void init() {
		for(boolean[] a: map) fill(a, false);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			t = sc.nextInt();
			n = sc.nextInt();
			if( (n|t) == 0 ) break;
			init();
			for(int i=0;i<n;i++) {
				map[sc.nextInt()+OFS][sc.nextInt()+OFS] = true;
			}
			sx = sc.nextInt();
			sy = sc.nextInt();
			System.out.println(bfs());
		}
	}
	int dx[] = {0,1,1,0,-1,-1};
	int dy[] = {1,1,0,-1,-1,0};
	
	int bfs() {
		int cnt = 0;
		LinkedList<P> que = new LinkedList<P>();
		que.add(new P(sx+OFS, sy+OFS, t));
		map[sx+OFS][sy+OFS] = true;
		for(;!que.isEmpty();) {
			P now = que.removeFirst();
//			debug(now.x, now.y);
			cnt++;
			if(now.c == 0) continue;
			for(int i=0;i<6;i++) if(!map[now.x+dx[i]][now.y+dy[i]]) {
				map[now.x+dx[i]][now.y+dy[i]] = true;
				que.add(new P( now.x+dx[i], now.y+dy[i], now.c-1));
			}
		}
		return cnt;
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