
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if( (n|m|a) == 0 ) break;
			a--;
				
			int[][] map = new int[1000][n];
			for(int i=0;i<m;i++) {
				int hh = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				if( (hh|p|q) == 0 ) break;
				hh--; p--; q--;
				map[hh][p] = q-p; map[hh][q] = p-q;
			}
			for( int i = 999;i>=0;i-- ) {
				a += map[i][a];
			}
			System.out.println((a+1));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}