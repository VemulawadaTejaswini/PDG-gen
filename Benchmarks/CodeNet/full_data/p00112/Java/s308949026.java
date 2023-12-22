
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
			}
			Arrays.sort(num);
			int[] memo = new int[n];
			int sum = 0;
			for (int i = 1; i < n; i++) {
				memo[i] = memo[i - 1] + num[i - 1];
				sum += memo[i];
			}
			System.out.println(sum);
		}
	}
}