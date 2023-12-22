import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();s.nextLine();
		int sum = 0;
		if(n>0 && n<=10000) {
			String[] nums = new String[n];
			String seq = s.nextLine();
			nums = seq.split(" ");
			if(nums.length==n) {
			for(int i=0;i<nums.length;i++) {
				if(Integer.parseInt(nums[i])>=-1000000 && Integer.parseInt(nums[i])<=1000000) {
					sum += Integer.parseInt(nums[i]);
				}
				
			}
			}
			Arrays.sort(nums);
			System.out.println(nums[0]+" "+nums[nums.length-1]+" "+sum);
			
		}	
	}

}