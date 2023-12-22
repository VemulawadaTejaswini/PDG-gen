
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int h, w, c;
	int max;
	int count;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if( (h|w|c) == 0 ) break;
			max = 0;
			byte[][] map = new byte[h+2][w+2];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				map[i][j] = sc.nextByte();
			}
			dfs(0, map);
			System.out.println(max);
		}
	}
	
	void dfs(int cnt, byte[][] map) {

		if(cnt == 5) {
//			for(byte[] a: map)
//			debug(a);
			if( map[1][1] != c ) return;
			byte[][] tmp = new byte[h+2][w+2];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++)
				tmp[i][j] = map[i][j];
			count = 0;
			exchange(tmp, 1, 1, tmp[1][1], (byte)0);
			max = max(max, count);
		}
		else {
			for(byte c=1;c<=6;c++) {
				if(c == map[1][1]) continue;
				byte[][] tmp = new byte[h+2][w+2];
				for(int i=1;i<=h;i++) for(int j=1;j<=w;j++)
					tmp[i][j] = map[i][j];
				count = 0;
				exchange(tmp, 1, 1, tmp[1][1], c);
				dfs(cnt+1, tmp);
			}
		}
		
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	void exchange(byte[][] map, int x, int y, byte c, byte ex) {
		count++;
		map[y][x] = ex;
		for(int i=0;i<4;i++) {
			if(map[y+dy[i]][x+dx[i]] == c) exchange(map, x+dx[i], y+dy[i], c, ex);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}