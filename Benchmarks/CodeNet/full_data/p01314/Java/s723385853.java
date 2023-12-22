import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		while (scanner.hasNext()) {

			counter = scanner.nextInt();
			if (counter == 0) {
				break;
			}

			int point = 0;

			for (int c = 2; c < counter; c++) {

				int b = 0;
				for (int x = 1; x <= c; x++) {
					b = b + x;
				}
				if (b > counter) {
					break;
				}

				if ((counter - b) % c == 0) {
					point = point + 1;
				}
			}

			System.out.println(point);
		}

		scanner.close();
	}
}

