
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
			String str = scanner.next();

			for (int i = 0; i < n; i++) {
				StringBuilder builder = new StringBuilder();
				int count = 1;
				str = str + " ";
				for (int j = 1; j < str.length(); j++) {
					if (str.charAt(j) == str.charAt(j - 1))
						count++;
					else {
						builder.append(count);
						builder.append(str.charAt(j - 1));
						count = 1;
					}
				}
				str = builder.toString();
			}
			System.out.println(str);
		}
	}
}