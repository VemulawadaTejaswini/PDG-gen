
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int h, w, n;
	boolean[][] map;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt(); w = sc.nextInt(); n = sc.nextInt();
			if((h|w|n) == 0) break;
			
			map = new boolean[h+2][w+2];
			int[] sx = new int[n+1], sy = new int[n+1];
			for(int i=1;i<=h;i++) {
				String l = sc.next();
				for(int j=1;j<=w;j++) {
					switch (l.charAt(j-1)) {
					case 'X':
						map[i][j] = false;
						break;
					case '.':
						map[i][j] = true;
						break;
					case 'S':
						sx[0] = j; sy[0] = i;
						map[i][j] = true;
						break;
					default:
						sx[l.charAt(j-1)-'0'] = j;
						sy[l.charAt(j-1)-'0'] = i;
						map[i][j] = true;
						break;
					}
				}
			}
			
			int d = 0;
			for(int i=0;i<n;i++) {
				d += bfs(sx[i], sy[i], sx[i+1], sy[i+1]);
			}
			System.out.println(d);
		}
	}
	
	int[] dx = {-1,0,1,0}, dy = {0,-1,0,1};
	int bfs(int sx, int sy, int gx, int gy) {
		boolean[][] vis = new boolean[h+2][w+2];
		
		LinkedList<Integer> qx = new LinkedList<Integer>(), qy = new LinkedList<Integer>(), qt = new LinkedList<Integer>();
		qx.addLast(sx); qy.addLast(sy); qt.addLast(0);
		vis[sy][sx] = true;
		for(;;) {
			int nx = qx.removeFirst(), ny = qy.removeFirst(), nc = qt.removeFirst();
			if(nx == gx && ny == gy) return nc;
			
			for(int i=0;i<4;i++) if(map[ny+dy[i]][nx+dx[i]]&&!vis[ny+dy[i]][nx+dx[i]]) {
				vis[ny+dy[i]][nx+dx[i]] = true;
				qx.addLast(nx+dx[i]); qy.addLast(ny+dy[i]); qt.addLast(nc+1);
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}