
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
			int ans = 0;
			for (int i = 0; i < n / 4; i++)
				ans += scanner.nextInt();
			System.out.println(ans);
		}
	}
}