import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String line = sc.nextLine();
			int x = Integer.parseInt(line);

			System.out.println("Case 1: " + x);

			if (x == 0) {

				break;
			}

		}

	}

}