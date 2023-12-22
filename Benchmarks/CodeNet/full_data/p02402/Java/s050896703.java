import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int[] nums = new int[n];
		boolean flag = true;
		if(n>0 && n<=10000) {
			for(int i=0;i<n;i++) {
				nums[i] = s.nextInt();
			}
			for(int i=0;i<n;i++) {
				if(nums[i]>=-1000000 && nums[i]<=1000000) {
					sum += nums[i];
					flag = true;
				}else {
					flag = false;
					break;
				}
			
			}
		}
		if(flag==true) {
			Arrays.sort(nums);
			System.out.println(nums[0]+" "+nums[nums.length-1]+" "+sum);
		}
		
			
			
	}

}