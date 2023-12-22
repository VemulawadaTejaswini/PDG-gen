
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int[] num = new int[n + 1];
		for (int i = 0; i < s; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			num[a] += b;
			int max = Integer.MIN_VALUE;
			int x = 0;
			for (int j = 1; j <= n; j++) {
				if (max < num[j]) {
					x = j;
					max = num[j];
				}
			}
			System.out.println(x + " " + num[x]);
		}
	}
}