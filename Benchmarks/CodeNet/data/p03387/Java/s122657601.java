import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);

		// input
		int[] nums = new int[3];
		for(int i = 0; i < 3; i++){
			nums[i] = scan.nextInt();
		}
		
		// check
		int count = 0;
		while(true){
			Arrays.sort(nums);
			
			if(nums[0] == nums[1] && nums[1] == nums[2]){
				break;
			}
			
			if(nums[2] - nums[0] >= 2){
				nums[0] += 2;
			} else if(nums[0] == nums[1]){
				nums[0] += 1;
				nums[1] += 1;
			} else if(nums[1] == nums[2]){
				nums[1] += 1;
				nums[2] += 1;
			} else {
				nums[0] += 1;
				nums[1] += 1;
			}
			count++;

		}
		
		System.out.println(count);
		
	}
}