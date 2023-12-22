
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int c : coin)
			sum += c * scanner.nextInt();
		System.out.println(sum >= 1000 ? 1 : 0);
	}

	int[] coin = { 1, 5, 10, 50, 100, 500 };
}