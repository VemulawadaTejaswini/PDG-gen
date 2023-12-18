import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Long> repeated = new ArrayList<Long>();
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		long[] nums = new long[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				repeated.add(nums[i] * nums[j]);
			}
		}
		Collections.sort(repeated);
		System.out.println(repeated.get(k-1));
	}
	
}