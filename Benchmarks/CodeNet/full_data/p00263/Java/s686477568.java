
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			long s = Long.parseLong(scanner.next(), 16);
			int x = (int) (s & (1 << 31) - 1) >> 7;
			double y = (double) ((s & 0x7f) * 0.0078125);
			String a = String.valueOf(y).substring(2);
			if (s >> 31 > 0)
				System.out.print("-");
			System.out.printf("%d.%s\n", x, a);
		}
	}
}