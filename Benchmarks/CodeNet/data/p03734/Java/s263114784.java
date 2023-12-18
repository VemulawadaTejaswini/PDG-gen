import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	String nl() {
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
		
		int res = dfs(N-1, W);
		/*
		 * finish
		 */
		
		output = res+"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, W;
	int[] weight;
	int[] value;
	
	Integer[][] memo;
	
	void input() {
		
		N = ni();
		W = ni();
		
		weight = new int[N];
		value  = new int[N];
		
		for (int i = 0; i < N; i ++) {
			weight[i] = ni();
			value[i]  = ni();
		}
		
		memo = new Integer[N + 1][W + 1];
		
		
	}
	
	int dfs(int n, int w) {
		
		if (n == -1 || w == 0) {
			return 0;
		}
		
		if (memo[n][w] != null) {
			return memo[n][W];
		}
		
		
		int res = 0;
		
		if (weight[n] > w) {
			return dfs(n-1, w);
		}
		else {
			int t1 = dfs(n-1, w);
			int t2 = dfs(n-1, w - weight[n]) + value[n];
			res = Math.max(t1, t2);
		}
		
		memo[n][w] = res;
		return res;
	}	
}
