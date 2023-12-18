import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int result = 0;

			int n = scanner.nextInt();

			int[] a = new int[n + 2];
			a[0] = 0;

			for (int i = 1; i <= n; i++) {
				a[i] = scanner.nextInt();
				result += Math.abs(a[i] - a[i - 1]);
			}
			a[n + 1] = 0;
			result += Math.abs(a[n + 1] - a[n]);

			for (int i = 1; i <= n; i++) {
				int temp = result;
				temp -= Math.abs(a[i] - a[i - 1]) + Math.abs(a[i] - a[i + 1]);
				temp += Math.abs(a[i - 1] - a[i + 1]);
				System.out.println(temp);
			}
		}
	}
}
