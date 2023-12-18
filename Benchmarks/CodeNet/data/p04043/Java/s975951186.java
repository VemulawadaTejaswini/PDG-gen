import java.util.*;


public class Main {
	
	
	static int n, k ;
	static boolean[] can = new boolean[10];
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		
		n = cin.nextInt();
		k = cin.nextInt();
		
		Arrays.fill(can, true);
		for (int i = 0; i < k; i ++) {
			can[cin.nextInt()] = false;
		}
		
		
		String num = String.valueOf(n);
		
		int[] nums = new int[num.length() + 1];
		nums[0] = 0;
		
		for (int i = 0; i < num.length(); i ++) {
			nums[i + 1] = num.charAt(i) - '0';
		}
		
		for (int i = 1; i < nums.length; ) {
			
			int a = nums[i];
			
			if (can[a]) { 
				i ++;
				continue;
			}
			// else
			int b = increment(a);
			
			if (b > a) {
				nums[i] = b;
				i ++;
				break;
			}
			
			// else b < a
			
			int c = increment(0);
			
			nums[i-1] = c;
			int d = increment(-1);
			
			while (i < nums.length) {
				nums[i] = d;
				i ++;
			}						
		}
		
		/*finish*/
		for (int i = 0; i < nums.length; i ++) {
			if (i == 0 && nums[0] == 0) {
				continue;
			}
			System.out.print(nums[i]);
		}		
		System.out.println();
	}
	
	public static int increment(int j) {
		
		int i = j + 1;
		
		for (; i < 20; i ++) {
			if (can[i % 10]) {
				break;
			}
		}
		
		return i % 10;
	}
	
}

