
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int h1 = scanner.nextInt();
			int m1 = scanner.nextInt();
			int s1 = scanner.nextInt();
			int h2 = scanner.nextInt();
			int m2 = scanner.nextInt();
			int s2 = scanner.nextInt();

			int hms1 = h1 * 3600 + m1 * 60 + s1;
			int hms2 = h2 * 3600 + m2 * 60 + s2;
			int ans = hms2 - hms1;
			int h = ans / 3600;
			int m = ans / 60 % 60;
			int s = ans % 60;
			System.out.println(h + " " + m + " " + s);
		}
	}
}