
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 25;
	int n, m;
	int[][] map;
	int[] min;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m=0;
			if( n == 0) break;
			map = new int [10][10];
			min = new int[10];
			int ans = INF;
			int p = 0;
			for(int i=0;i<10;i++) fill(map[i], INF);
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if( m<max(a,b)+1 ) m = max(a,b)+1;
				map[a][b] = map[b][a] = min(c, map[a][b]);
			}
			for(int i=0;i<10;i++) map[i][i] = 0;
			wf();
			for(int i=0;i<m;i++) {
				min[i] = 0;
				for(int j=0;j<m;j++) {
					min[i] += map[i][j];
//					System.out.print(map[i][j] + " ");
				}
//				System.out.println();
				if(ans > min[i]) {
					ans = min[i];
					p = i;
				}
			}
			System.out.println(p + " " + ans);
		}
	}
	
	void wf() {
		for(int i=0;i<m;i++) for(int j=0;j<m;j++) for(int k=0;k<m;k++) {
			map[i][k] = min(map[i][k], map[i][j] + map[j][k]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}