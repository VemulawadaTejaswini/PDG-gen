
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 10;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int t=0;t<n;t++) {
			boolean[][] map = new boolean[MAX][MAX];
			for(int i=0;i<MAX;i++) for(int j=0;j<MAX;j++) {
				map[i][j] = sc.nextInt() == 0;
			}
			int ans = -1;
			boolean[][] fld = new boolean[MAX][MAX];
			for(int i=0;i<1<<MAX;i++) {
				boolean[][] tmp = new boolean[MAX][MAX];
				for(int j=0;j<MAX;j++) fill(fld[j], false);
				for(int j=0;j<MAX;j++) for(int k=0;k<MAX;k++) tmp[j][k] = map[j][k];
				for(int j=0;j<MAX;j++) if( ((i>>>j)&1) == 1 ) {
					rev(j, 0, tmp);
					fld[0][j] = true;
				}
				for(int j=1;j<MAX;j++) for(int k=0;k<MAX;k++) {
					if(!tmp[j-1][k]) {
						rev(k, j, tmp);
						fld[j][k] = true;
					}
				}
				boolean flg = true;
				for(int k=0;k<MAX;k++) {
					flg &= tmp[MAX-1][k];
				}
				if(flg) {
					ans = i; break;
				}
			}
			for(int j=0;j<MAX;j++) for(int k=0;k<MAX;k++) {
				System.out.print( (fld[j][k]? 1: 0) + ( k==MAX-1? "\n": " " ) );
			}
		}
	}
	int dx[] = {-1,0,1,0,0};
	int dy[] = {0,-1,0,1,0};
	void rev(int x, int y, boolean[][] map) {
		for(int i=0;i<5;i++) if( !( x+dx[i] < 0 || y+dy[i] < 0 || x+dx[i] >= MAX || y+dy[i] >= MAX ) ){
			map[y+dy[i]][x+dx[i]] = !map[y+dy[i]][x+dx[i]];
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}