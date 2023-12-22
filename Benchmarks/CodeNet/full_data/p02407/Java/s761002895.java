import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer nums[] = new Integer[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}

		// 昇順か降順か判断
		if(nums[0] < nums[nums.length-1]) {
			Arrays.sort(nums, Comparator.reverseOrder());
		} else {
			Arrays.sort(nums, Comparator.naturalOrder());
		}

		for(Integer num: nums) {
			System.out.print(num + " ");
		}
		sc.close();
	}

}

