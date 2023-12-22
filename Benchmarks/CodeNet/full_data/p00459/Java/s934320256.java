
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m;
	long[] card = new long[100000];
	long[] tmp = new long[100000];
	int x, y;
	int s, t, u;
	int p, q, r;
	int len;
	int n_len;
	int indx, indy;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			m = sc.nextInt();
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			
			len = 1;
			fill(card, 0);
			fill(tmp, 0);
			card[0] = int2long(1, n);
			for(int h=0;h<m;h++) {
				x = sc.nextInt();
				y = sc.nextInt();
				n_len = 0;
				for(int i=0;i<len;i++) {
//					System.out.println(card[i]-((card[i]>>32)<<32));
					s = (int)(card[i]>>32);
					t = (int)(card[i]-((long)s<<32));
					u = t - s + 1;
//					System.out.println(s + " " + t + " " + u + " " + x + " " + y);
					if(  u <= x ) {
						if(x==u) {
							tmp[n_len++] = int2long(s, t);
							indx = n_len;
							y -= x;
							x=0;
						}
						else {
							tmp[n_len++] = card[i];
							x -= u;
							y -= u;
						}
					}
					else if(u <= y) {
						if(y==u) {
							tmp[n_len++] = int2long(s, t);
							indy = n_len;
							y=0;
						}
						else {
							tmp[n_len++] = card[i];
							y -= u;
						}
					}
					else if( x > 0 && x < u && y < u ) {
//						System.out.println(s + " " + (s+x-1) + " " + (s+y-1));
						tmp[n_len++] = int2long(s, s+x-1);
						indx = n_len;
						tmp[n_len++] = int2long(s+x, s+y-1);
						indy = n_len;
						tmp[n_len++] = int2long(s+y, t);
						
					}
					else if(x > 0 && x < u) {
						tmp[n_len++] = int2long(s, s+x-1);
						indx = n_len;
						tmp[n_len++] = int2long(s+x, t);
						y -= x;
						x = 0;
					}
					else if(y > 0 && y < u) {
						tmp[n_len++] = int2long(s, s+y-1);
						indy = n_len;
						tmp[n_len++] = int2long(s+y, t);
						y = 0;
					}
					else {
						tmp[n_len++] = card[i];
					}
				}
				len = n_len;
				n_len=0;
				for(int i=indy;i<len;i++) card[n_len++] = tmp[i];
				for(int i=indx;i<indy;i++) card[n_len++] = tmp[i];
				for(int i=0;i<indx;i++) card[n_len++] = tmp[i];
			}
			int ans = 0;
			for(int i=0;i<len;i++) {
				s = (int)(card[i]>>32);
				t = (int)(card[i]-((long)s<<32));
				u = t - s + 1;
//				System.out.println(s + " " + t + " " + u + " " + p + " " + q);
				if( u <= p ) {
					if(p == u)
						ans += (t < r)? 1:0;
					p -= u;
					q -= u;
				}
				
				else if( p>0 && u>p && u>q ) {
					ans += max(0, min(q-p, r-(s+p)+1));
					break;
				}
				else if( p>0 && u>p) {
					ans += max(0, min(t-(s+p)+1, r-(s+p)+1));
					p -= u;
					q -= u;
				}
				else if( u <= q ) {
					ans += max(0, min(u, r-s+1));
					if( q == u) break;
					q -= u;
				}
				else if(q>0 && u>q) {
					ans += max(0, min(q, r-q+1));
					break;
				}
			}
			System.out.println(ans);
		}
	}
	
	long int2long(int f, int t) {
		return (((long)f << 32) + t);
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
}