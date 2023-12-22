
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	int INF = 1 << 28;
	int n;
	int map[][];
	int w[];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			map =  new int[n][4];
			for(int i=0;i<n;i++) for(int j=0;j<4;j++){
				map[i][j] = sc.nextInt();
			}
			w = new int[n+1];
			fill(w, -1);
			int max = 0;
			for(int i=0;i<n;i++) {
				max = max(max, solve(i) );
			}
			System.out.println(max);
		}
	}
	
	int solve(int i) {
//		debug(i);
		if( w[i] >= 0 ) return w[i];
		int l = map[i][2] != 0? solve(map[i][2]-1): 1;
		int r = map[i][3] != 0? solve(map[i][3]-1): 1;
		int wait = 0;
		wait = lcm(l * map[i][0], r * map[i][1]);
//		debug(l, r, l*map[i][0], r*map[i][1], wait);
		wait = wait / map[i][0] + wait / map[i][1];
		return w[i] = wait;
		
	}
	
	int lcm(int x, int y) {
		int x_ = x;
		int y_ = y;
		int z = x_ % y_;
		while(z != 0) {
			x_ = y_;
			y_ = z;
			z = x_ % y_;
		}
		return x / y_ * y;
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}