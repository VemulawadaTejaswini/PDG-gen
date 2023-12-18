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
		
		output = res +"";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N;
	int[] nums;
	
	long res;
	
	
	void input() {
		
		res = Long.MIN_VALUE;		
		
		N = ni();
		nums = new int[N * 3];
		
		for (int i = 0; i < nums.length; i ++) {
			nums[i] = ni();
		}		
	}
	
	void solve() {
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		
		
		long[] maxLeft  = new long[N + 1];
		long[] minRight = new long[N + 1];
		
		// init
		for (int i = 0; i < N; i ++) {
			maxLeft[0] += nums[i];
			pq1.offer(nums[i]);
			
			minRight[0] += nums[3 * N - 1 - i];
			pq2.offer(nums[3 * N - 1 - i]);
		}
		
		
		// get mid
		for (int i = 1; i <= N; i ++) {
			
			pq1.offer(nums[N + i - 1]);		
			maxLeft[i] = maxLeft[i-1] + nums[N + i - 1] - pq1.peek();				
			pq1.poll();
			
			pq2.offer(nums[2 * N - i]);			
			minRight[i] = minRight[i-1] + nums[2 * N - i] - pq2.peek();
			pq2.poll();			
		}
		
		// get ans
		for (int i = 0; i <= N; i ++) {
			res = Math.max(res, maxLeft[i] - minRight[N - i]);
		}
		
	}
	
}
