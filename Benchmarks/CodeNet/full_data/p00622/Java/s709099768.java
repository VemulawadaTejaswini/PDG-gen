
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			char[] red = scanner.next().toCharArray();
			if (red[0] == '-')
				break;
			char[] green = scanner.next().toCharArray();
			char[] x = scanner.next().toCharArray();
			int p = 0, pr = 0, pg = 1;
			char c = green[0];
			while (p < x.length) {
				if (c == x[p]) {
					c = red[pr++];
					p++;
				} else {
					System.out.print(c);
					c = green[pg++];
				}
			}
			System.out.println(c + String.valueOf(green).substring(pg));
		}
	}
}