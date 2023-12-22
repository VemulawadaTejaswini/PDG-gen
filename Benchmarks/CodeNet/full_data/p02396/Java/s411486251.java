import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = 1;

		while (true) {

			System.out.println("Case " + number + ": " + input());
			number++;

		}


		//close();

	}

	public static int input() {

		return scanner.nextInt();

	}

	/*
	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}*/
}