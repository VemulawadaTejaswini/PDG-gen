
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int[] maxmap = new int[1000];
		int[] num = new int[n + 1];
		int max = Integer.MIN_VALUE;
		int top = 0;
		for (int i = 0; i < s; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			maxmap[num[a]] = Math.max(maxmap[num[a]] - 1, 0);
			num[a] += b;
			maxmap[num[a]]++;
			if (top == a && b < 0) {
				if (maxmap[max] == 0) {
					for (int j = 999; j >= 0; j--) {
						if (maxmap[j] != 0) {
							max = j;
							break;
						}
					}
				}
				for (int j = 1; j <= n; j++) {
					if (num[j] == max) {
						top = j;
						break;
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