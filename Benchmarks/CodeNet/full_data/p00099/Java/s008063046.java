
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int[] num = new int[n + 1];
		int max = Integer.MIN_VALUE;
		int top = 0;
		for (int i = 0; i < s; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			num[a] += b;
			if (top == a && b < 0) {
				max = Integer.MIN_VALUE;
				for (int j = 1; j <= n; j++) {
					if (max < num[j]) {
						top = j;
						max = num[j];
					}
				}
			} else if (top != a && b > 0) {
				if (num[top] < num[a]) {
					top = a;
					max = num[a];
				} else if (num[top] == num[a]) {
					if (top > a) {
						top = a;
					}
				}
			}

			System.out.println(top + " " + num[top]);
		}
	}
}