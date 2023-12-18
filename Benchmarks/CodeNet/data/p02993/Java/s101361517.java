import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] nums = new char[4];
		nums = S.toCharArray();

		String ans = "Good";
		for (int i = 0; i < 3; i++) {
			if (nums[i] == nums[i + 1]) {
				ans = "Bad";
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
