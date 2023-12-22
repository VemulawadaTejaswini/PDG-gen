
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = scanner.nextInt();
			if (x == 0)
				break;
			boolean sign = x > 0;
			StringBuilder builder = new StringBuilder();
			x = Math.abs(x);
			while (x > 0) {
				int t = (x % 10);
				if (!sign && t != 0) {
					t = 10 - t;
					x += 10;
				}
				builder.insert(0, t);
				sign = !sign;
				x /= 10;

			}
			System.out.println(builder);
		}

	}
}