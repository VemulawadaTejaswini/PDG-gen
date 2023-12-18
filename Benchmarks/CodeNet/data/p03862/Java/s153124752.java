import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/* input */
		int n = cin.nextInt();
		int x = cin.nextInt();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i ++) {
			nums[i] = cin.nextInt();
		}
				
		/* start 
		 * greedy */
		long res = 0;
		
		for (int i = 0; i < n; ) {
			
			if (i == 0) {
				if (nums[i] <= x) {
					
					if (i + 1 < n && nums[i] + nums[i+1] > x) {
						res += nums[i + 1] + nums[i] - x;
						nums[i+1] = x - nums[i];
					}
					i ++;
				} else {
					res += nums[i] - x;
					
					if (i + 1 < n) {
						res += nums[i+1];
						nums[i+1] = 0;
					}
					
					nums[i] = x;	
					i ++;
				}
			}
			else {
				
				if (i + 1 < n) {
					
					if (nums[i] + nums[i + 1] <= x) {
						i ++;
					} else {
						res += nums[i + 1] + nums[i] - x;
						nums[i + 1] = x - nums[i];
					}
				} else {// last element
					i ++;
				}
			}
			
		}
		
		
		
		/*finish*/
		System.out.println(res);
	}
}

