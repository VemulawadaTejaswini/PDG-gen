
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
			int asum = 0;
			int bsum = 0;
			while (n-- > 0) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if (a > b)
					asum += a + b;
				else if (a < b)
					bsum += a + b;
				else {
					asum += a;
					bsum += b;
				}
			}
			System.out.println(asum + " " + bsum);
		}

	}
}