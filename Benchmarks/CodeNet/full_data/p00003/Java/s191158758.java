import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = Integer.parseInt(input());

		for (int i = 0; i < N; i++) {

			String[] numList = input().split(" ");

			Arrays.sort(numList);

			if (isRight(Double.parseDouble(numList[2]), Double.parseDouble(numList[1]), Double.parseDouble(numList[0]))) {

				System.out.println("YES");

			} else {

				System.out.println("NO");

			}
		}

		close();

	}

	public static boolean isRight(double longSide, double shortSideA, double shortSideB) {

		return Math.pow(longSide, 2) == Math.pow(shortSideA, 2) + Math.pow(shortSideB, 2);

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