import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		int start = 0;
		while(k<nums.length) {
			int res = 0;
			for(int i=start; i<k; i++) {
				res = nums[k-1] - nums[0];
			}
			start++;
			k++;
			min = Math.min(min, res);
		}
		System.out.println(min);
	}
}
