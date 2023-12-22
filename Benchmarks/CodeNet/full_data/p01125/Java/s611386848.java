
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[][] map;
	int MAX = 21;
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n==0 ) break;
			
			map = new boolean[MAX][MAX];
			for(int i=0;i<n;i++) map[sc.nextInt()][sc.nextInt()] = true;
			
			int m = sc.nextInt();
			int x = 10, y = 10;
			int cnt = 0;
			for(int i=0;i<m;i++) {
				char c = sc.next().charAt(0);
				int l = sc.nextInt();
				int d;
				if( c == 'W' ) d = 0;
				else if( c == 'N' ) d = 3;
				else if( c == 'E' ) d = 2;
				else d = 1;
				for(int j=0;j<l;j++) {
					x += dx[d];
					y += dy[d];
					if( map[x][y] ) cnt++;
				}
			}
			System.out.println( (cnt == n? "Yes": "No") );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}