import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

			while (scanner.hasNext()) {

				String[] arrays = input().split(" ");
				Double a = Double.parseDouble(arrays[0]);
				Double b = Double.parseDouble(arrays[1]);
				Double c = Double.parseDouble(arrays[2]);
				Double d = Double.parseDouble(arrays[3]);
				Double e = Double.parseDouble(arrays[4]);
				Double f = Double.parseDouble(arrays[5]);

				double x = (c * e - b * f) / (a * e - b * d);
				double y = (c * d - a * f) / (b * d - a * e);

				if (x == -0.0) {

					x = 0.0;

				}

				if (y == -0.0) {

					y = 0.0;

				}

				System.out.print(String.format("%.3f", x));
				System.out.print(" ");
				System.out.println(String.format("%.3f", y));

			}

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}