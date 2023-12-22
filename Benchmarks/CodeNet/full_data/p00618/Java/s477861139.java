
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	int U;
	int[] c, m;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = Integer.parseInt(sc.next());
			U = Integer.parseInt(sc.next());
			if( (n|U) == 0 ) break;
			c = new int[n];
			m = new int[n];
			
			for(int i=0;i<n;i++) {
				c[i] = Integer.parseInt(sc.next());
				int k = Integer.parseInt(sc.next());
				int mask = 0;
				for(int j=0;j<k;j++) {
					int r = Integer.parseInt(sc.next());
					mask += (1<<r);
				}
				
				m[i] = mask;
				
			}
			
//			for(Sub s: subs) debug(s.c, s.mask);
			
/*			int min = INF;
			for(int i=0;i<(1<<n);i++) {
				int u = 0;
				for(int j=0;j<n;j++)if((subs[j].mask&i) == subs[j].mask) {
					u += subs[j].c * ( (i>>j) & 1 );
				}
//				debug(" ", i, u);
				if( u >= U ) min = min(min, Integer.bitCount(i));
			}
			
			System.out.println(min);*/
			dp = new int[1<<n];
			fill(dp, -1);
			System.out.println(solve(U, 0));
		}
	}
	
	int[] dp;
	int solve(int u, int S) {
		if( dp[S] >= 0 ) return dp[S];
		if( u <= 0 ) return dp[S] = 0;
		if( S+1 == (1<<n) ) return dp[S] = 0;
		int min = INF;
		for(int i=0;i<n;i++) if(((S>>i)&1) == 0 && (m[i]&S) == m[i]) {
			min = min(min, solve(u-c[i], S|(1<<i))+1);
		}
		
		return dp[S] = min;
	}
	
	class Sub {
		int c, mask;
		Sub(int c, int mask) {
			this.c = c;
			this.mask = mask;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}