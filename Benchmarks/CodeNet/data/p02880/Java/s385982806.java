import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			if (N % nums[i] == 0 && N / nums[i] <= 9) {
				System.out.println("Yes");
				b = true;
				break;
			}
		}
		if (!b) {
			System.out.println("No");
		}
	}
}
