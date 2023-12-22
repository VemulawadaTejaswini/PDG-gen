
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int ans1 = 0;
		for (int i = 0; i < 4; i++)
			ans1 += scanner.nextInt();
		int ans2 = 0;
		for (int i = 0; i < 4; i++)
			ans2 += scanner.nextInt();
		System.out.println(Math.max(ans1, ans2));
	}
}