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
		
		dfs(0, 0, 0);
		/*
		 * finish
		 */
		
		output = max_value+"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, W;
	int[] weight;
	int[] value;
	int max_value;
	Set<String> visited ;
	
	void input() {
		
		max_value = -1;
		
		N = ni();
		W = ni();
		
		weight = new int[N];
		value  = new int[N];
		
		for (int i = 0; i < N; i ++) {
			weight[i] = ni();
			value[i]  = ni();
		}
		
		visited = new HashSet<>();
	}
	
	void dfs(int index, int w, int v) {
		
		String keyFormat = index +" " + w +" "+v;
		
		if (visited.contains(keyFormat)) {
			return;
		}
		
		visited.add(keyFormat);
		
		if (w > W) {
			return;
		}
		
		if (index == N) {
			max_value = Math.max(max_value, v);
			return;
		}
		
		
		dfs(index + 1, w, v);
		dfs(index + 1, w + weight[index], v + value[index]);
	}	
}
