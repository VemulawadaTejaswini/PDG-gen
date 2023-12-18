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
			if (nums[i] < before) {
				result = false;
				break;
			}
			if (nums[i] != before) {
				nums[i]--;
			}
		}

		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}