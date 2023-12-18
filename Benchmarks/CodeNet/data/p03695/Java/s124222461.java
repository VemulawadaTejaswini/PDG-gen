import java.util.*;

// ABC 64-C
// https://abc051.contest.atcoder.jp/tasks/abc051_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] nums = new int[9];
		
		for (int i = 0; i < N; i++) {
			int a = in.nextInt();
			if (a >= 3200) {
				nums[8]++;
			} else {
				nums[a / 400]++;
			}
		}
		
		int count = 0;
		for (int i = 0; i < 8; i++) {
			if (nums[i] > 0) {
				count++;
			}
		}
		int min = count;
		int max = count;
		if (min == 0) {
			min = 1;
		}
		if (nums[8] > 0) {
			max = Math.min(8, max + nums[8]);
		}
		System.out.printf("%d %d\n", min, max);
	}
}
