import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int[] nums = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			nums[i] = sc.nextInt();
		}

		int falseCnt = 0;

		for (int i = 0; i < cnt; i++) {
			if (nums[i] != i + 1) {
				falseCnt++;
			}
		}

		if (falseCnt == 0 || falseCnt == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
