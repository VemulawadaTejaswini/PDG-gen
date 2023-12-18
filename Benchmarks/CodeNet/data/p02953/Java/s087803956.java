import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		boolean result = true;

		for (int i = 0; i < n; i++) {
			int before = 0;
			if (i != 0) {
				before = nums[i - 1];
			}
			if (nums[i] < before - 1) {
				result = false;
				System.out.println(nums[i]);
				System.out.println(before);
				break;
			}
			if (nums[i] != before) {
				nums[i]--;
			}
		}

		if (result) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
