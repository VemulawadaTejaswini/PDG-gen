import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	int n;
	int ps[];
	int js[];
	int dp[][];

	void run() {
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			js = new int[n - 1];
			dp = new int[n][n + 1];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += sc.nextInt();
			}
			for (int i = 0; i < n - 1; i++) {
				sum += js[i] = sc.nextInt();
			}
			Arrays.sort(js);

			int max = sum;
			for (int i = 0; i < n - 1; i++) {
				sum -= js[i];
				max = Math.max(max, (i + 2) * sum);
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}