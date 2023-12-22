import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = Integer.parseInt(input());
		int taroScore = 0;
		int hanakoScore = 0;

		for (int i = 0; i < n; i++) {

			String[] tempList = input().split(" ");

			if (0 < tempList[0].compareToIgnoreCase(tempList[1])) {

				taroScore += 3;

			} else if (tempList[0].compareToIgnoreCase(tempList[1]) < 0) {

				hanakoScore += 3;

			} else if (tempList[0].compareToIgnoreCase(tempList[1]) == 0) {

				taroScore += 1;
				hanakoScore += 1;

			}
		}

		System.out.println(taroScore + " " + hanakoScore);

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