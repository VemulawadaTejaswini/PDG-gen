import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	long nl() {
		return cin.nextLong();
	}
	
	String line() {
		return cin.nextLine();
	}
	
	void println(String str) {	
		System.out.println(str);
	}
	
	void print(String str) {
		System.out.print(str);
	}
	
	/*
	 * default variable
	 */
	
	static final int MOD = 1000000007;
	
	Scanner cin = new Scanner(System.in);	
	String  output;
	
	public static void main(String[] args) {			
		new Main().run();						
	}
	
	/* default above */		
	public void run() {
			
		input();
		/* 
		 * start
		 */	
		
		solve();
		
		/*
		 * finish
		 */
		
		
			
	}
	/* 
	 * define variable
	 */
	
	int N, D;
	int Q;
	int[] d;
	int[] q;
	
	void input() {
		
		N = ni();
		D = ni();
		
		d = new int[N];
		for (int i = 0; i < N; i ++) {
			d[i] = ni();
		}
		
		Q = ni();
		q = new int[Q];
		for (int i = 0; i < Q; i ++) {
			q[i] = ni();
		}
		
	}
	
	void solve() {
		
		long[] pre = new long[N + 1];
		long[] suf = new long[N + 1];
		
		pre[0] = D;
		
		for (int i = 0; i < N; i ++) {
			pre[i+1] = Math.min(pre[i], Math.abs(pre[i]-d[i]));
		}
		
		suf[N] = 1;
		
		for (int i = N-1; i >= 0; i --) {
			
			if (suf[i+1] <= d[i]/2) {
				suf[i] = suf[i+1];
			} else {
				suf[i] = suf[i+1] + d[i]; 
			}
		}
		
		
		for (int i = 0; i < Q; i ++) {
			int x = q[i];
			
			if (pre[x-1] == 0 || suf[x] > pre[x-1]) {
				println("NO");
			} else {
				println("YES");
			}
		}
	}
	
}
