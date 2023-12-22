
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int k = scanner.nextInt();
			if (k == 0)
				break;
			int size = k * (k - 1) / 2;
			int ans = 0;
			for (int i = 0; i < size; i++)
				ans += scanner.nextInt();
			System.out.println(ans / (k - 1));
		}
	}
}