import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		if (S.contentEquals("ABC")) {
			System.out.println("ARC");
		} else {
			System.out.println("ABC");
		}

	}

}