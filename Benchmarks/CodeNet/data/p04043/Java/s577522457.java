import java.util.*;


public class Main {
	
	static boolean[] validDigit = new boolean[10];
	static int n, k;
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		/*input*/
		n = cin.nextInt();
		k = cin.nextInt();
		
		Arrays.fill(validDigit, true);
		for (int i = 0; i < k; i ++) {
			validDigit[cin.nextInt()] = false;
		}
		
		/*start*/
		String num = String.valueOf(n);
		
		int[] nums = new int[num.length() + 1];
		nums[0] = 0;
		for (int i = 1; i < nums.length; i ++) {
			nums[i] = num.charAt(i-1) - '0';
		}
		
		int index = 1;
		for (; index < nums.length; ) {
			
			int a = nums[index];
			if (validDigit[a]) {
				index ++;
				continue;
			}
			
			//else not valid
			int b = increment(a);
			
			if (b > a) {
				nums[index] = b;
				index ++;
				break;
			}
			
			// else b < a
			if (index == 1) {
				nums[0] = increment(0);
				break;
			} 
			
			while (index > 0) {
				index --;
				int c = nums[index];
				int d = increment(c);
				if (d > c) {
					nums[index] = d;
					index ++;
					break;
				}
			}
			break;
			
		}
		
		int e = increment(-1);
		while(index < nums.length) {
			nums[index] = e;
			index ++;
		}
		
		/*finish*/
		for (int i = 0; i < nums.length; i ++) {
			if (i == 0 && nums[0] == 0) {
				continue;
			}
			
			System.out.print(nums[i]);
		}
		
		
	}
	
	public static int increment(int j) {
		
		int i = j + 1;
		
		for (; i < 20; i ++) {
			if (validDigit[i % 10]) {
				break;
			}				
		}
		
		return i % 10;
	}

}

