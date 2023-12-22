
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	int MAX = 10;
	boolean[][][] map;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int x = sc.nextInt(), y = sc.nextInt();
			if( (x|y) == 0 ) break;
			
			int n = sc.nextInt();
			map = new boolean[2][MAX][MAX];
			int s = 0;
			map[s][y][x] = true;
			for(int i=0;i<n;i++) {
				for(boolean[] a: map[1-s]) fill(a, false);
				for(int j=0;j<MAX;j++) for(int k=0;k<MAX;k++) if(map[s][j][k]) {
					jump(map[1-s], k, j);
				}
				spr(map[1-s], sc.nextInt(), sc.nextInt());
				for(boolean[] a: map[1-s]) debug(a);
				debug();
				s = 1-s;
			}
			
			boolean f = false;
			for(int i=0;i<MAX;i++) for(int j=0;j<MAX;j++)
				 f |= map[s][i][j];
			
			System.out.println((f? "OK": "NA"));
		}
	}
	
	int dx[] = {-1,0,1,2,2,2,1,0,-1,-2,-2,-2};
	int dy[] = {-2,-2,-2,-1,0,1,2,2,2,1,0,-1};
	
	void jump(boolean[][] map, int x, int y) {
		for(int i=0;i<dx.length;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if( nx < 0 || ny < 0 || nx >= 10 || ny >= 10 ) continue;
			map[ny][nx] = true;
		}
	}
	
	void spr(boolean[][] map, int x, int y) {
		boolean[][] tmp = new boolean[MAX][MAX];
		for(int i=-1;i<=1;i++) for(int j=-1;j<=1;j++) {
			int nx = x + i, ny = y + j;
			if( nx < 0 || ny < 0 || nx >= 10 || ny >= 10 ) continue;
			tmp[ny][nx] = true;
		}
		
		for(int i=0;i<MAX;i++) for(int j=0;j<MAX;j++) 
			map[i][j] = map[i][j] & tmp[i][j];
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}