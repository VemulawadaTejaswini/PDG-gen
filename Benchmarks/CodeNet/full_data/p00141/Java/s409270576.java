
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int c=0;c<n;c++) {
			int d = sc.nextInt();
			boolean map[][] = new boolean[d+4][d+4];
			for(boolean[] a: map) fill(a, true);
			for(int i=1;i<d+3;i++) for(int j=1;j<d+3;j++)
				map[i][j] = false;
			
			int sx = 2;
			int sy = d+1;
			int dir = 1;
			int cnt=0;
			for(;;) {
				map[sy][sx] = true;
				if(map[sy+2*dy[dir]][sx+2*dx[dir]]) {
					dir = (dir+1)%4;
					cnt++;
				}
				if(cnt==d) break;
				sx+=dx[dir];
				sy+=dy[dir];
			}
			for(int i=2;i<d+2;i++) {
				for(int j=2;j<d+2;j++) {
					if(map[i][j]) System.out.print("#");
					else System.out.print(" ");
				}
				System.out.println();
			}
			if(c!=n-1)
				System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}