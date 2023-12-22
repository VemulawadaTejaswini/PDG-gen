
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int p = scanner.nextInt();
			if ((n | m | p) == 0)
				break;
			m--;
			int[] x = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				x[i] = scanner.nextInt();
				sum += x[i];
			}
			System.out.println(x[m] == 0 ? 0 : (100 - p) * sum / x[m]);
		}
	}
}