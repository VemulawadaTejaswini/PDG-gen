import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] nums = new long[n];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		long min = nums[0];
		boolean flag = false;
		for(int i=1; i<nums.length; i++) {
			if(nums[i]%min==0) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(min);
		}else {
			System.out.println(1);
		}
	}
}
