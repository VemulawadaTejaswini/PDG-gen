
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	int min;
//	char[][] p;
	
	void run() {
			Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
//			p = new char[h+2][w+2];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				String str = sc.next();
//				p[i][j] = str.charAt(0);
			}
			min = 10 * 10;
//			dfs(p, 0, p[1][1]);
			
			System.out.println(min);
		}
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	char clrs[] = {'R', 'G', 'B'};
	boolean[][] used;
	LinkedList<Character> list;
	
	void dfs(char[][] p, int d, char c) {
		used = new boolean[h+2][w+2];
		list = new LinkedList<Character>();
		dfs(p, 1, 1, p[1][1], c);
		list.clear();
		used = new boolean[h+2][w+2];
		int cnt = dfs(p, 1, 1, p[1][1], p[1][1]);
		debug(c, cnt);
		if( cnt == w*h ) {
			min = min(min, d);
			return;
		}
		HashSet<Character> clrs = new HashSet<Character>(list);
		debug(clrs);
		for(char clr: clrs) {

			char[][] tmp = new char[h+2][w+2];
			for(int k=0;k<h+2;k++) for(int j=0;j<w+2;j++) tmp[k][j] = p[k][j];
			dfs(tmp, d+1, clr);
		}
		
	}
	
	int dfs(char[][] p, int x, int y, char c, char to) {
		if(p[y][x] != c) {
			if(p[y][x] != 0) list.add(p[y][x]);
			return 0;
		}
		used[y][x] = true;
		p[y][x] = to;
		int cnt = 1;
		for(int i=0;i<4;i++) if(!used[y+dy[i]][x+dx[i]]) cnt += dfs(p, x+dx[i], y+dy[i], c, to);
		return cnt;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}