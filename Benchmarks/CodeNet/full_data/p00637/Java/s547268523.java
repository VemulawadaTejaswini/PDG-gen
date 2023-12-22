
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
			if (n == 0)
				break;
			int[] num = new int[n];
			for (int i = 0; i < n; i++)
				num[i] = scanner.nextInt();
			int cnt = 0;
			for (int i = 1; i < n; i++) {
				if (num[i] - num[i - 1] == 1)
					cnt++;
				else {
					if (cnt == 0)
						System.out.print(num[i - 1] + " ");
					else {
						System.out.print(num[i - cnt - 1] + "-" + num[i - 1]
								+ " ");
						cnt = 0;
					}
				}
			}
			if (cnt == 0)
				System.out.println(num[n - 1]);
			else
				System.out.println(num[n - 1 - cnt] + "-" + num[n - 1]);
		}
	}
}