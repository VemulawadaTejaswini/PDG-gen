import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 5
		int k = sc.nextInt();	// 3
		sc.nextLine();
		int sum = 1;
		int before = 0;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum * nums[i];
			if (i == (k - 1)) {
				// 3
				before = sum;
			} else if (i >= k) {
				// 4以上
				if (before < sum) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				before = sum;
				sum = sum / nums[i - k + 1];
			}
		}
	}
}
