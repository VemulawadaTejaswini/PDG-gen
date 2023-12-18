import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[3];

		int iMax = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[iMax] < nums[i]) {
				iMax = i;
			}
		}

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i == iMax ? nums[iMax] * 10 : nums[i];
		}

		System.out.println(sum);

		sc.close();

	}
}

