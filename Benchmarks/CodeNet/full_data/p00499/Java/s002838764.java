
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int ac = a % c == 0 ? a / c : a / c + 1;
		int bd = b % d == 0 ? b / d : b / d + 1;
		System.out.println(l - Math.max(ac, bd));
	}
}