
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt();
			System.out.println(ticket[a] * b);
		}
	}

	int[] ticket = { 6000, 4000, 3000, 2000, };
}