import java.util.Scanner;

public class Main {
	
	public static int count(int[] nums) {
		
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			
			int temp = nums[i];
			
			if (temp == 2 | temp == 3) {
				total++;
			}
			
			for (int j = 2; j < Math.sqrt(temp); j++) {
				
				if (temp%j == 0) {
					break;
				}
				else if(j == Math.floor(Math.sqrt(temp))) {
					total++;
				}
				
			}
		}
		
		return total;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int elements = in.nextInt();
		int[] nums = new int[elements];
		
		for (int i = 0; i < elements; i++) {
			nums[i] = in.nextInt();
		}
		
		int result = count(nums);
		System.out.println(result);
		
		in.close();

	}

}

