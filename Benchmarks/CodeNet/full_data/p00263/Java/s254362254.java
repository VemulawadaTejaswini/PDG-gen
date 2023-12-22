
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
			int x = (int) (s & 0x7ffffff) >> 7;
			int y = (int) ((s & 0x7f) * 78125);
			if (s >> 31 > 0)
				System.out.print("-");
			System.out.printf("%d.%d\n",x, y);
		}
	}
}