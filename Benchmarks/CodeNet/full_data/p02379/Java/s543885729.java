import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] coordinates = input().split(" ");
		double x1 = Double.parseDouble(coordinates[0]);
		double y1 = Double.parseDouble(coordinates[1]);
		double x2 = Double.parseDouble(coordinates[2]);
		double y2 = Double.parseDouble(coordinates[3]);

		System.out.println(Math.sqrt(Math.abs(Math.pow((x2 - x1), 2)) + Math.abs(Math.pow((y2 - y1), 2))));

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