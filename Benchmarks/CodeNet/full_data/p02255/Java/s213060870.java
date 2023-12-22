import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String len = in.nextLine();
        String n = in.nextLine();
        String[] numbers = n.split(" ");
        int[] nums = new int[Integer.parseInt(len)];
        
        for (int s = 0; s < numbers.length; s++) {
        	nums[s] = Integer.parseInt(numbers[s]);
        }
        
        for (int c = 0; c < nums.length; c++) {
    		System.out.print(nums[c]);
    		if (c < nums.length - 1) {
    			System.out.print(" ");
    		} else {
    			System.out.println();
    		}
    	}
        
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
        	int key = nums[i];
        	j = i - 1;
        	
        	while (j >= 0 && nums[j] > key){
        		nums[j+1] = nums[j];
        		j--;
        	}
        	nums[j+1] = key;
            
        	for (int b = 0; b < nums.length; b++) {
        		System.out.print(nums[b]);
        		if (b < nums.length - 1) {
        			System.out.print(" ");
        		} else {
        			System.out.println();
        		}
        	}
        }
	}
}
