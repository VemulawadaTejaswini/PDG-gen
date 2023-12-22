import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int[] nums = new int[101];
			while (nums[0] != 2) {
				int num = in.nextInt();
				nums[num] += 1;
			}
			String s = "NG";
			if (nums[1] % 2 == 1 && nums[2] % 2 == 1) {
				s = "OK";
				for (int i = 3; i <= 100; i++) {
					if (nums[i] % 2 == 1) {
						s = "NG";
						break;
					}
				}
			}
			System.out.println(s);
		}
	}
}