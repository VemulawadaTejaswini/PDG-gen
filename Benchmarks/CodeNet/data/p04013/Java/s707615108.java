import java.util.*;

public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		
		int n = cin.nextInt();
		int A = cin.nextInt();
		
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i ++) {
			nums[i] = cin.nextInt();			
		}
		/*start*/
		
		
		long res = 0;
		
		long limit = (long)1 << n;
		
		
		for (long i = 1; i < limit; i ++) {
			
			if (getSubSum(nums, i, A)) {
				res += 1;
			}
		}
		
		/*finish*/
		System.out.println(res);
	}
	
	public boolean getSubSum(int[] nums, long index, long A) {
		
		long sum = 0;
		
		int i = 0;
		long count = Long.bitCount(index);
		
		while (index > 0) {
			
			if ((index & 1) == 1) {
				sum += nums[i];
			}
			
			index = index >>> 1;
			i ++;
			
		}
				
		
		if (count * A == sum) {
			return true;
		} else {
			return false;
		}
	}
}

