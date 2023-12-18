import java.math.BigInteger;
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
		
		output = res + "";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, K;
	int[] nums;
	
	void input() {
		
		N = ni();
		K = ni();
		nums = new int[N];
		
		for (int i = 0; i < nums.length; i ++) {
			nums[i] = ni();
		}
	}
	
	
	int res;
	void solve() {
		
		Arrays.sort(nums);
		
		res = 0;
		
		int l = 0, r = N - 1;
		
		while (l <= r) {
			
			int mid = (l + r) / 2;
			
			
			if (judge(mid)) {
				r = mid - 1;
			} else {
				l = mid + 1;
				res = Math.max(res, mid);
			}
		}
		
		res+=1;		
		
	}
	
	boolean judge(int index) {
		
		if (nums[index] >= K) {
			return true;
		}
		
		BigInteger sum = BigInteger.ONE;
		
		for (int i = 0; i < N; i ++) {
			
			if (i == index) {
				continue;
			}
			
			sum = sum.or(sum.shiftLeft(nums[i]));
		}
		
		
		for (int i = K-1; i >= K - nums[index]; i --) {
			
			if (sum.testBit(i)) {
				return true;
			}
		}
		
		return false;
	}
	
}
