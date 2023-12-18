import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		Integer[] nums = new Integer[arr.size()];
		arr.toArray(nums);
		Arrays.sort(nums, null);

		if(n%2==1) {
			if(nums[0]==0) {
			} else {
				System.out.println(0);
				return;
			}
		}
		for(int i = n-1; i > 0; i-=2) {
			if(nums[i]!=nums[i-1]) {
				System.out.println(0);
				return;
			}
		}
		long ans = 1L;
		int time = n/2;
		for(int i = 0; i < time; i++) {
			ans = (ans * 2L) % 1000000007;
		}
		System.out.println(ans%1000000007);
	}
}