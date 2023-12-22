
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		char[] chs = scanner.next().toCharArray();
		for (char c : chs) {
			c -= 3;
			if (c < 'A')
				c += 26;
			System.out.print(c);
		}
		System.out.println();
	}
}