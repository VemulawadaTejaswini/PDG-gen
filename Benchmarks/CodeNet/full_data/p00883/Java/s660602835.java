
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n;
	int[] dx = {-1,-1,-1,0,1,1,1,0};
	int[] dy = {1,0,-1,-1,-1,0,1,1};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			
			int S = 0;
			for(int i=0;i<n;i++) {
				String str = sc.next();
				for(int j=0;j<n;j++) {
					switch (str.charAt(j)) {
					case '.': break;
					case '#': S |= 1<<(i*n+j+6); break;
					case '@': S |= j<<3; S |= i; break;
					}
				}
			}
			
			HashSet<Integer> used = new HashSet<Integer>();
			used.add(S);
			LinkedList<P> que = new LinkedList<P>(); que.add(new P(S, 0));
			boolean ok = false;
			for(;!que.isEmpty();) {
				P cur = que.remove();
				if( (cur.s >> 6) == 0 ) {
					ok = true;
					System.out.println(cur.d);
					break;
				}
				short x = (short)((cur.s>>3)&7), y = (short)(cur.s&7);
				boolean map[][] = new boolean[n][n];
				for(int i=0;i<n*n;i++) map[i/n][i%n] = ((cur.s>>(i+6))&1) == 1;
				
//				debug(x, y);
//				for(boolean[] a: map) debug(a);

				for(int i=0;i<8;i++) {
					int px = x + dx[i], py = y + dy[i];
					if(!out(px, py) && !map[py][px]){
//					debug(px, py);
						map[py][px] = true;
						int NS = (px<<3)|py;
						for(int j=0;j<n;j++) for(int k=0;k<n;k++) {
							if( px == k && py == j ) continue;
							int cnt = 0;
							for(int l=0;l<8;l++) {
								int nx = k+dx[l], ny = j+dy[l];
								if(!out(nx, ny) && map[ny][nx])cnt++;
							}
							if(map[j][k] && ( cnt == 2 || cnt == 3)) NS |= 1<<(j*n+k+6);
							else if(!map[j][k] && cnt == 3) NS |= 1<<(j*n+k+6);
						}
						
						if(!used.contains(NS)){
							used.add(NS);
							que.add(new P(NS, cur.d+1));
						}
						map[py][px] = false;
					}
				}
			}
			
			if(!ok) System.out.println(-1);
		}
	}
	
	boolean out(int x, int y) {
		return x < 0 || y < 0 || x >= n || y >= n;
	}
	
	class P {
		int s; int d;
		P(int s, int d) {
			this.s = s; this.d = d;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}