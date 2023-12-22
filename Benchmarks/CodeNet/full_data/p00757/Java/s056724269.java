
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int h, w, s;
	int[][] table;
	int[][][][] dp;
	int[][][][] dem;
	int max_dem;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			s = sc.nextInt();
			if( (h|w|s) == 0 ) break;
			table = new int[h+1][w+1];
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				table[i][j] = sc.nextInt() + table[i-1][j] + table[i][j-1] - table[i-1][j-1];
			}
			dp = new int[w][h][w][h];
			dem = new int[w][h][w][h];
			for(int[][][] a: dp) for(int[][] b: a) for(int[] c: b) fill(c, -1);
			max_dem = 0;
//			debug(table);
			System.out.println( dfs(0,0,w-1,h-1) + " " + dem[0][0][w-1][h-1] );
			
//			for(int i=0;i<w;i++) for(int j=0;j<h;j++) debug(dem[i][j]);
		}
	}
	
	int demand(int x, int y, int w, int h) {
		return table[y][x] - table[y][w+1] - table[h+1][x] + table[h+1][w+1];
	}

	int dfs(int x, int y, int w, int h) {
		if( dp[x][y][w][h] >= 0 ) return dp[x][y][w][h];
//		debug(x, y, w, h);
//		debug(table[this.h][this.w] - demand(x, y, w, h), demand(x,y,w,h));
		if( table[this.h][this.w] - demand(x, y, w, h) > s ) {
			dem[x][y][w][h] = INF;
			return dp[x][y][w][h] = 0;
		}
		
		int gr = 1;
		int demand = -1;
		for(int i=x;i<w;i++) {
			int f = dfs(x,y,i,h), s = dfs(i+1,y,w,h);
			if( f*s == 0 ) continue;
			if( gr < (f+s) ) {
				gr = f + s;
				demand = min( dem[x][y][i][h], dem[i+1][y][w][h] );
			}
			else if( gr == (f+s)) {
				demand = max( demand, min( dem[x][y][i][h], dem[i+1][y][w][h] ));
			}
//			debug(x,y,w,h,demand,demand(x,y,i,h),demand(i+1,y,w,h));
		}
		for(int i=y;i<h;i++) {
			int f = dfs(x,y,w,i), s = dfs(x,i+1,w,h);
			if( f*s == 0 ) continue;
			if( gr < (f+s) ) {
				gr = f + s;
				demand = min( dem[x][y][w][i], dem[x][i+1][w][h] );
			}
			else if( gr == (f+s)) {
				demand = max( demand, min( dem[x][y][w][i], dem[x][i+1][w][h] ));
			}
//			debug(x,y,w,h,demand,demand(x,y,w,i),demand(x,i+1,w,h));
		}
		dem[x][y][w][h] = (demand > -1)? demand: s - ( table[this.h][this.w] - demand(x, y, w, h) );
//		debug(demand(x,y,w,h),dem[x][y][w][h]);
		return dp[x][y][w][h] = gr;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}