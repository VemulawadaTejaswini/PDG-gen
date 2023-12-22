
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
			StringBuilder b = new StringBuilder(scanner.next());

			for (int i = 0; i < n; i++) {
				StringBuilder builder = new StringBuilder();
				b.append(" ");
				int count = 1;
				for (int j = 1; j < b.length(); j++) {
					if (b.charAt(j) == b.charAt(j - 1))
						count++;
					else {
						builder.append(count);
						builder.append(b.charAt(j - 1));
						count = 1;
					}
				}
				b = builder;
			}
			System.out.println(b);
		}
	}
}