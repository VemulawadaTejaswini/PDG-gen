
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int p = scanner.nextInt();
		int[] num = new int[m + 1];
		num[0] = p;
		for (int i = 1; i <= m; i++) {
			num[i] = scanner.nextInt();
			if (num[i] < p)
				num[i] += n;
		}
		Arrays.sort(num);
		int ans = 0;
		int size = m + 1;
		for (int i = 1; i < size; i++) {
			ans += Math.min(num[i] - num[i - 1], n + num[i - 1] - num[i]);
		}
		System.out.println(ans * 100);
	}
}