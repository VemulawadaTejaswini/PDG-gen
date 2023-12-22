import java.io.*;
import java.util.*;
class Main {
	
	private static int nums[] = new int[3];
	
	public static void sort(int[] nums) {
		
		int swap;
		
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					swap = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = swap;
				}
			}
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = 
    		new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	
    	for (int i = 0; i < nums.length; i++) {
    		nums[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	sort(nums);
    	
    	for (int i = 0; i < nums.length; i++) {
    		System.out.print(nums[i]);
    		if (i != nums.length - 1)
    			System.out.print(" ");
    	}
   }
}