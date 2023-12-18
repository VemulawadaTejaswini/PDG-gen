import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] nums = new int[]{0,0,0};
		for(char c : s.toCharArray()) {
			if(c == 'a') {
				nums[0]++;
			} else if(c == 'b') {
				nums[1]++;
			} else {
				nums[2]++;
			}
		}
		Arrays.sort(nums);
		if(nums[2] - nums[0] < 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
