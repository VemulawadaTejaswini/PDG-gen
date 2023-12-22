import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1;; i++) {

			String line = sc.nextLine();
			int x = Integer.parseInt(line);

			System.out.println("Case " + i + ": " + x);

			if (x == 0) {

				break;
			}

		}

	}

}