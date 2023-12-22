
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] icecle;
	int[] mem;
	int n, l;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		mem = new int[n+2];
		icecle = new int[n+2];
		fill(mem, -1);
		fill(icecle, 0);
		for(int i=1;i<=n;i++) icecle[i] = sc.nextInt();
		long max = 0;
		mem[n+1] = 0;
		mem[0] = 0;
		for(int i=1;i<=n;i++) max = max( max, solve(i) );
		System.out.println(max);
	}
	
	int solve(int x) {
		if( mem[x] >= 0 ) return mem[x];
		int t = 0;
		if( icecle[x+1] > icecle[x] ) {
			t = max( solve(x+1), t );
		}
		if( icecle[x-1] > icecle[x] ) {
			t = max( solve(x-1), t );
		}
		
		t += time(x);
		return mem[x] = t;
	}
	
	int time(int x) {
		return  l - icecle[x] ;
	}
	
	

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}