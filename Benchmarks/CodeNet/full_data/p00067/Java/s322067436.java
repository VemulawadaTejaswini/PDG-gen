
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int MAX = 12;
	boolean[][] map = new boolean[MAX+2][MAX+2];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			for(boolean[] a: map) fill(a, false);
			for(int i=1;i<=MAX;i++) {
				String str = sc.next();
				for(int j=1;j<=MAX;j++) map[i][j] = str.charAt(j-1) == '1';
			}
			int cnt = 0;
			for(int i=1;i<=MAX;i++) for(int j=1;j<=MAX;j++) if(map[i][j]) {
				cnt++; dfs(j, i);
			}
			System.out.println(cnt);
		}
	}
	int[] dx = {-1,0,1,0}, dy = {0,-1,0,1};
	void dfs(int x, int y) {
		map[y][x] = false;
		for(int i=0;i<4;i++) if(map[y+dy[i]][x+dx[i]]) dfs(x+dx[i], y+dy[i]);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}