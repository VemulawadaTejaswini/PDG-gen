import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String W = input().toLowerCase();
		StringBuilder T = new StringBuilder();
		int count = 0;

		while (true) {

			String inputT = input();

			if (inputT.equals("END_OF_TEXT")) {

				break;

			} else {

				T.append(inputT.toLowerCase());

			}
		}



		while (T.indexOf(W) != -1) {

			count++;
			T.delete(T.indexOf(W), T.indexOf(W) + W.length());

		}

		System.out.println(count);

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