
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 8;
	int OFS = 3;
	boolean map[][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int c = 1;c<=n;c++) {
			map = new boolean[MAX+2*OFS][MAX+2*OFS];
			for(int i=0;i<MAX;i++) {
				String str = sc.next();
				for(int j=0;j<MAX;j++) map[i+OFS][j+OFS] = str.charAt(j) == '1';
			}
			int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
			dfs(x+OFS, y+OFS);
			System.out.println( "Data " + c + ":");
			for(int i=0+OFS;i<MAX+OFS;i++) for(int j=0+OFS;j<MAX+OFS;j++) {
				System.out.print( (map[i][j]? "1": "0") + (j == MAX+OFS-1? "\n": "") );
			}
		}
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	void dfs(int x, int y) {
		if( !map[y][x] ) return;
		map[y][x] = false;
		for(int i=0;i<4;i++) for(int j=0;j<4;j++) {
			dfs( x + j*dx[i], y + j*dy[i] );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}