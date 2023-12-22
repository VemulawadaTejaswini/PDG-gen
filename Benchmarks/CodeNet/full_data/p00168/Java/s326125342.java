
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[31];
		for (int i = 1; i < 31; i++) {
			if (i == 1) {
				num[i] = 1;
			} else if (i == 2) {
				num[i] = 2;
			} else if (i == 3) {
				num[i] = 4;
			} else {
				num[i] = num[i - 3] + num[i - 2] + num[i - 1];
			}
		}
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;

			int a = Math.max(num[n] / 10, 1) % 365;
			int ans = num[n] / 3650;
			if (a != 0) {
				ans++;
			}
			System.out.println(ans);
		}
	}
}