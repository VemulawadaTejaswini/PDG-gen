
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int year = scanner.nextInt();
			int ans = 0;
			double max = 0;
			for (int i = 0; i < n; i++) {
				int id = scanner.nextInt();
				int r = scanner.nextInt();
				int t = scanner.nextInt();
				double a = 0;
				if (t == 1)
					a = 1 + year * r / 100.0;
				else
					a = Math.pow(1 + r / 100.0, year);
				if (a > max) {
					max = a;
					ans = id;
				}
			}
			System.out.println(ans);
		}
	}
}