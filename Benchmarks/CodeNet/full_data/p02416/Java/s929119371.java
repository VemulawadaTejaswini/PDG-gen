import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		while (true) {

			String text = input();

			if (text.equals("0")) {

				break;

			} else {

				list.add(text);

			}
		}

		for (int i = 0; i < list.size(); i++) {

			String[] arrays = list.get(i).split("");

			int sum = 0;

			for (int j = 0; j < arrays.length; j++) {

				sum += Integer.parseInt(arrays[j]);

			}

			System.out.println(sum);
			sum = 0;

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