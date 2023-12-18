import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {

			int i = 0;
			while (sc.hasNextLine()) {
				System.out.print(sc.nextLine().charAt(i++));
			}

		}

	}

}
