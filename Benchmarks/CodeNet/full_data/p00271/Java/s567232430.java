
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.println(scanner.nextInt() - scanner.nextInt());
		}
	}
}