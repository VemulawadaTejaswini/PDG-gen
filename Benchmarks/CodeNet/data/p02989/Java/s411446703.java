import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] nums = new int[n];
		
	for (int i = 0; i < n; i++) {
		nums[i] = sc.nextInt();
	}
	Arrays.sort(nums);
	int mid = (n/2);
	System.out.println(nums[mid] - nums[mid-1]);
  }
}