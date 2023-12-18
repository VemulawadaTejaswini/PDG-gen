import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			int n = Integer.parseInt(sc.next());

			int stock = 0;

			int counter = 0;

			for (int i = 0; i < n; i++) {
				int ad = Integer.parseInt(sc.next());
				if (stock == ad) {
					counter++;
					stock = 0;
					continue;
				}
				stock = ad;

			}

			System.out.println(counter);
		}
	}
}
