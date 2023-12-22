import java.util.Scanner;

public class Main {

	public static int max, target;
	public static int[] nums = {0,1,2,3,4,5,6,7,8,9};

	public static int solve (int sum, int i, int cnt) {
		if (cnt == max) return sum == target ? 1 : 0;
		if (sum > target || i >= nums.length) return 0;
		return solve(sum + nums[i], i + 1, cnt + 1) +
			   solve(sum, i + 1, cnt);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			max = sc.nextInt();
			target = sc.nextInt();
			if (max == 0 && target == 0) break;
			System.out.println(solve(0,0,0));
		}

	}

}