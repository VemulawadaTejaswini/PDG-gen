
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if( (h|w) == 0 ) break;
			
			int[][] map = new int[h+1][w+1];
			
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) {
					if(str.charAt(j-1) == '*')
						map[i][j] = 0;
					else 
						map[i][j] = map[i][j-1]+1;
				}
			}
//			for(int[] a: map) debug(a);
			int max = 0;
			for(int j=1;j<=w;j++) for(int i=1;i<=h;i++){
				if(map[i][j] > 0) {
					int ww = INF;
					for(int k=i;k<=h;k++) {
						ww = min(ww, map[k][j]);
						max = max(max, ww * (k-i+1));
					}
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}