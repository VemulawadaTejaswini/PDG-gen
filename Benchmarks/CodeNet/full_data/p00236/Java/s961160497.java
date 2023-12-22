
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int dx[] = {-1,0,1,0}, dy[] = {0,-1,0,1};
	boolean[][] map;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt(), h = sc.nextInt();
			if((w|h) == 0)break;
			
			map = new boolean[h+2][w+2];
			
			int cnt = 0, sx = -1, sy = -1;
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				map[i][j] = sc.nextInt() == 0;
				if(map[i][j])cnt++;
				sx = map[i][j]? j:sx;
				sy = map[i][j]? i:sy;
			}
			
			boolean flg = true;
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) if(map[i][j]){
				int c = 0;
				for(int k=0;k<4;k++) if(map[i+dy[k]][j+dx[k]])c++;
				flg &= c>=2;
			}
			
			if(sx>0) {
				dfs(sx, sy);
				for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) flg &= !map[i][j];
				if(flg && cnt % 2 == 0) System.out.println("Yes");
				else System.out.println("No");
			}
			else System.out.println("No");
//			debug(map, cnt, sx, sy);
		}
	}
	
	void dfs(int x, int y) {
		map[y][x] = false;
		for(int i=0;i<4;i++) if(map[y+dy[i]][x+dx[i]])dfs(x+dx[i], y+dy[i]);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}