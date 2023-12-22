
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[][] f;
	int w, h;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			int n = sc.nextInt();
			
			HashSet<Integer> setx = new HashSet<Integer>();
			HashSet<Integer> sety = new HashSet<Integer>();
			int[] x = new int[2*n];
			int[] y = new int[2*n];
			for(int i=0;i<2*n;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				setx.add(x[i]);
				sety.add(y[i]);
			}
			setx.add(0);
			setx.add(w);
			sety.add(0);
			sety.add(h);
				
			h = sety.size();
			w = setx.size();
			
			int[] ax = new int[w];
			int[] ay = new int[h];
			int c=0;
			for(int val: setx) ax[c++] = val;
			c = 0;
			for(int val: sety) ay[c++] = val;
			sort(ax);
			sort(ay);
			
//			debug(ax);
//			debug(ay);
//			debug(w,h);
			for(int i=0;i<2*n;i++) for(int j=0;j<w;j++ ) {
				if( x[i] == ax[j] ) {
					x[i] = j;
					break;
				}
			}
			for(int i=0;i<2*n;i++) for(int j=0;j<h;j++ ) {
				if( y[i] == ay[j] ) {
					y[i] = j;
					break;
				}
			}
			f = new boolean[h-1][w-1];
	//		debug(h, w);
			debug(x);
			debug(y);
			for(int i=0;i<n;i++) {
				for(int xx=x[2*i];xx<x[2*i+1];xx++) for(int yy=y[2*i];yy<y[2*i+1];yy++)
					f[yy][xx] = true;
			}
//			for(boolean[] a: f) debug(a);
			int cnt = 0;
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) {
	//			debug(f[i][j]);
				if(dfs(j, i)) cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	boolean dfs(int x, int y) {
//		debug(x,w,y,h);
		if( x<0 || x>=w-1 || y<0 || y>=h-1 ) return false;
//		debug("a");
		if(f[y][x]) return false;
		f[y][x] = true;
		
		for(int i=0;i<4;i++) {
			dfs(x+dx[i], y+dy[i]);
		}
		
		return true;
	}
	
	

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}