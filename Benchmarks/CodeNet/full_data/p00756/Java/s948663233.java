
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	byte[] mem;
	Coin[] coins;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			coins = new Coin[n];
			for(int i=0;i<n;i++) {
				coins[i] = new Coin(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			mem = new byte[(1<<n)];
			fill(mem, (byte)-1);
			System.out.println(solve((1<<n)-1));
		}
	}
	
	byte solve( int S ) {
		if( mem[S]>=0 ) return mem[S];
		byte cnt = 0;
		boolean[] rap = new boolean[n];
		
		for(int i=0;i<n;i++) {
			if( ((S>>i) & 1) == 0 ) {
				rap[i] = true;
				continue;
			}
			for(int j=i+1;j<n;j++) {
				if( ((S>>j) & 1) == 0 ) continue;
				rap[j] = coins[i].israpped(coins[j]); 
			}
		}
		
		for(int i=0;i<n;i++) {
			if(rap[i]) continue;
			for(int j=i+1;j<n;j++) {
				if(rap[j])continue;
				if( coins[i].c == coins[j].c ) {
					cnt = (byte) max(cnt, solve( S - ((1<<i) + (1<<j)) ) + 2);
				}
			}
		}
		
		return mem[S] = cnt;
	}
	
	
	
	class Coin {
		int x, y, r, c;
		Coin (int x, int y, int r, int c) {
			this.x = x;
			this.y = y;
			this.r = r;
			this.c = c;
		}
		
		boolean israpped(Coin c) {
			return (c.x-x) * (c.x-x) + (c.y-y) * (c.y-y) < (r+c.r) * (r+c.r);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}