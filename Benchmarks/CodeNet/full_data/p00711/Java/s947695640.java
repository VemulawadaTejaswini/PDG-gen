import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {
	
	boolean[][] map;
	int W, H;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			W = sc.nextInt(); H = sc.nextInt();
			if( (W|H) == 0 ) break;
			map = new boolean[H+2][W+2];
			int sx=-1, sy=-1;
			
			for(int i=1;i<=H;i++) {
				String l = sc.next();
				for(int j=1;j<=W;j++) {
					 if(l.charAt(j-1) == '@' ) { sx = j; sy = i; }
					 map[i][j] = l.charAt(j-1) == '.';
				}
			}
			System.out.println(dfs(sx, sy));
		}
	}
	int[] dx = {1,0,-1,0};
	int[] dy = {0,-1,0,1};
	int dfs(int x, int y) {
		map[y][x] = false;
		int cnt = 1;
		for(int i=0;i<4;i++) if(map[y+dy[i]][x+dx[i]]) {
			cnt += dfs(x+dx[i], y+dy[i]);
		}
		return cnt;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}