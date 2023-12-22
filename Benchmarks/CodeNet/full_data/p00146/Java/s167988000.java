
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	final int W = 20;
	int[] id, d, num;
	int[][] path;
	int[] ans;
	double[][] dp;
	int n;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		id = new int[n];
		d = new int[n];
		num = new int[n];
		for(int i=0;i<n;i++) {
			id[i] = sc.nextInt();
			d[i] = sc.nextInt();
			num[i] = sc.nextInt();
		}
		
		dp = new double[n][(1<<n)];
		path = new int[n][1<<n];
		for(double[] a: dp) fill(a, -1);
		 solve(0, 0);
		printPath();
		
	}
	
	void printPath() {
		for(int v=0,S=0;n!=0;n--) {
			int x = path[v][S];
			System.out.print(id[x] + (n!=1? " ": "\n"));
			S += 1<<x;
			v = x;
		}
	}
	
	double solve(int v, int S) {
		if( dp[v][S] >= 0 ) return dp[v][S];
		if( S+1 == 1<<n ) return dp[v][S] = 0;
		
		int w = 0;
		for(int i=0;i<n;i++) if( ((S>>i)&1) == 1 ){
			w += num[i];
		}
		w *= W;
		
		double t = INF;
		for(int i=0;i<n;i++) if( ((S>>i)&1) == 0 ){
			double dis = abs(d[v]-d[i]);
			double tmp = solve(i, S+(1<<i)) + dis / 2000 * (double)(70 + w);
			if(tmp < t){
				t = tmp;
				path[v][S] = i;
			}
		}
		
//		debug(v, S, t);
		return dp[v][S] = t;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}