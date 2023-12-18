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
		
		dfs(0, A, B, 0);
		
		/*
		 * finish
		 */
		
		output = res +"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, Q, A, B;
	int[] x;
	long res;
	Set<String> visited;
	
	void input() {
		res = Long.MAX_VALUE;
		
		N = ni();
		Q = ni();
		A = ni();
		B = ni();		
		x = new int[Q];
		
		for (int i = 0; i < Q; i ++) {
			x[i] =  ni();
		}
		
		
		visited = new HashSet<>();	
		
	}
	
	void dfs(int i, int A, int B, long path) {
		
		String key1 = i +" " + A +" " + B + " " + path;
		String key2 = i +" " + A +" " + B + " " + path;
		
		if (visited.contains(key1) || visited.contains(key2)) {
			return;
		} else {
			visited.add(key1);
			visited.add(key2);			
		}
		
		
		if (i == Q) {
			res = Math.min(path, res);
			return;
		}
		
		dfs(i + 1, x[i], B, (long)Math.abs(x[i] - A) + path);
		dfs(i + 1, A, x[i], (long)Math.abs(x[i] - B) + path);		
	}
	
}
