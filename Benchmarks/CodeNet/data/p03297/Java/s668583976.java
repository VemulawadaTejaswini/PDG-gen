import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			int t = Integer.parseInt(sc.next());
			long a;
			long b;
			long c;
			long d;
			int counter = 0;
			boolean s = false;

			for (int i = 0; i < t; i++) {

				a = Long.parseLong(sc.next());
				b = Long.parseLong(sc.next());
				c = Long.parseLong(sc.next());
				d = Long.parseLong(sc.next());
				if (a > c + d) {
					s = true;
				}

				while (true) {
					a -= b;
					if (a < 0) {
						System.out.println("No");
						break;
					}
					if (a <= c) {
						a += d;
					}

					if (s == true && counter > 600000) {
						System.out.println("No");
						break;
					}
					if (counter > 6000000) {
						System.out.println("Yes");
						break;
					}
					counter++;
				}
				counter = 0;
				s = false;
			}

		}

	}
}
