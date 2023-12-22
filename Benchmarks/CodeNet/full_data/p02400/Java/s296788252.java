import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double r = input();

		System.out.print(String.format("%.5f", r * r * Math.PI));
		System.out.print(" ");
		System.out.print(String.format("%.5f", 2.0 * r * Math.PI));

		close();

	}

	public static double input() {

		return scanner.nextDouble();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}