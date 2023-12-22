import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	int n;
	int js[];

	void run() {
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			js = new int[n - 1];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += sc.nextInt();
			}
			for (int i = 0; i < n - 1; i++) {
				sum += js[i] = sc.nextInt();
			}
			Arrays.sort(js);

			long max = sum;
			long jsum = 0;
			for (int i = 0; i < n - 1; i++) {
				jsum += js[i];
				max = Math.max(max, (i + 2) * (sum - jsum));
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}