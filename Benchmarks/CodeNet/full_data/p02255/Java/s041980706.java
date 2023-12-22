import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String len = in.nextLine();
        int[] nums = new int[Integer.parseInt(len)];
        
        int a = 0;
        while (in.hasNextInt()) {
        	nums[a] = in.nextInt();
        	a++;
        }
        
        int j = 0;
        for (int i = 1; i < nums.length - 1; i++) {
        	int key = nums[i];
        	j = i - 1;
        	
        	while (j >= 0 && nums[j] > key){
        		nums[j+1] = nums[j];
        		j--;
        	}
        	nums[j+1] = key;
            
            System.out.println(nums);
        }
	}
}
