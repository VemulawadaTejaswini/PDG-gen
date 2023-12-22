import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int[][] numbers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int  n= in.nextInt();
		int[] nums = new int[n];
		for(int i =0; i< n; i++)
			nums[i] = in.nextInt();
		
		 int count = 0;
	        for (int i = 0; i < nums.length - 2; i++) {
	            for (int j = i + 1; j < nums.length - 1; j++) {
	                for (int k = j + 1; k < nums.length; k++) {
	                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j]
	                    		&& nums[j] + nums[k] > nums[i]) {
	                    	if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k])
	                    		 count++;
	                    }
	                       
	                }
	            }
	         } 	 
         
         System.out.println(count);     
	}
	
	
}