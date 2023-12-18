import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int n_int() {
		return cin.nextInt();
	}
	
	long n_long() {
		return cin.nextLong();
	}
	
	String n_line() {
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
		
		dfs(0);
		
		/*
		 * finish
		 */
		
		output = res+"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N;
	long[] x;
	long[] y;
	long res;
	
	long[] red;
	long[] blue;
	
	void input() {
		
		res = Long.MAX_VALUE;
		
		N = n_int();
		x = new long[N];
		y = new long[N];
		
		
		red  = new long[N];
		blue = new long[N];
		
		for (int i = 0; i < N; i ++) {
			x[i] = n_long();
			y[i] = n_long();
		}
	}
	
	void dfs(int index) {
		
		if (index == N) {
			long R_MAX = Long.MIN_VALUE;
			long R_MIN = Long.MAX_VALUE;
			
			long B_MAX = Long.MIN_VALUE;
			long B_MIN = Long.MAX_VALUE;
			
			for (int i = 0; i < N; i ++) {
				R_MAX = Math.max(R_MAX, red[i]);
				R_MIN = Math.min(R_MIN, red[i]);	
				
				B_MAX = Math.max(B_MAX, blue[i]);
				B_MIN = Math.min(B_MIN, blue[i]);	
			}
			
			res = Math.min(res, (R_MAX - R_MIN)*(B_MAX - B_MIN));	
			return ;
		}
		
		
		red[index] = x[index];
		blue[index]= y[index];
		dfs(index + 1);
		
		red[index] = y[index];
		blue[index]= x[index];
		dfs(index + 1);										
	}
	
}
