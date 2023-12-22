
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int w, h, s;
	int[][] sum;
	int sumAll;
	
	int sum(int x1, int y1, int x2, int y2) {
		return sum[y2][x2] - sum[y2][x1-1] - sum[y1-1][x2] + sum[y1-1][x1-1];
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt(); w = sc.nextInt(); s = sc.nextInt();
			
			if( (h|w|s) == 0 ) break;
			sum = new int[h+1][w+1];
			
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) 
				sum[i][j] = sc.nextInt() + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
			
			sumAll = sum[h][w];
			
			mem = new P[w+1][h+1][w+1][h+1];
			P ans = solve(1, 1, w, h);
//			debug(ans.sub);
			System.out.println(ans.max + " " + ( s - ( sumAll - ans.sub) ) );
		}
	}
	
	P[][][][] mem;
	P solve(int x1, int y1, int x2, int y2) {
		if(mem[x1][y1][x2][y2] != null) return mem[x1][y1][x2][y2];
		if( sum(x1, y1, x2, y2) < sumAll - s ) return mem[x1][y1][x2][y2] = new P(-1, -1);
		
		int max = 1; int sub = sum(x1, y1, x2, y2);
		
		for(int x=x1;x<x2;x++) {
			P l = solve(x1, y1, x, y2), r = solve(x+1, y1, x2, y2);
			if(l.max <= 0 && r.max <= 0) continue;
			
			if(max < l.max + r.max) {
				max = l.max + r.max;
				sub = min(l.sub, r.sub);
			}
			else if ( max == l.max + r.max ) {
				sub = max(sub, min(l.sub, r.sub));
			}
		}
		
		for(int y=y1;y<y2;y++) {
			P u = solve(x1, y1, x2, y), d = solve(x1, y+1, x2, y2);
			if(u.max <= 0 && d.max <= 0) continue;
			
			if(max < u.max + d.max) {
				max = u.max + d.max;
				sub = min(u.sub, d.sub);
			}
			else if ( max == u.max + d.max ) {
				sub = max(sub, min(u.sub, d.sub));
			}
		}
//		debug(x1, y1, x2, y2, max, sub);
		return mem[x1][y1][x2][y2] = new P(max, sub);
	}
	
	class P {
		int max, sub;
		P(int max, int sub) {
			this.max = max;
			this.sub = sub;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}