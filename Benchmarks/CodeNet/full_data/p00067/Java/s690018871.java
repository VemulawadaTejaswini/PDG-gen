
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[][] map;
	int MAX = 12;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			map = new boolean[MAX+2][MAX+2];
			
			for(int i=1;i<=MAX;i++) {
				String str = sc.next();
				for(int j=1;j<=MAX;j++) map[i][j] = str.charAt(j-1) == '1';
			}
			
			int ans = 0;
			
			for(int i=1;i<=MAX;i++) for(int j=1;j<=MAX;j++) {
				if(map[i][j]) {
					ans++;
					dfs(j, i);
				}
			}
			System.out.println(ans);
		}
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	void dfs(int x, int y) {
		if(!map[y][x]) return;
		map[y][x] = false;
		for(int i=0;i<4;i++) dfs(x+dx[i], y+dy[i]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}