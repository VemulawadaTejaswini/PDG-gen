import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long min = 2000000, max = -2000000, sum = 0;
		for (int i = 0; i < n; ++i) {
			int a = scanner.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
			sum += a;
		}
		System.out.printf("%d %d %d\n", min, max, sum);
		scanner.close();
	}
}

