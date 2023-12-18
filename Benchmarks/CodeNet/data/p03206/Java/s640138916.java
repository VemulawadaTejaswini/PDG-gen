import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		String ans = "";

		switch (input) {
		case "22":
			System.out.println("Christmas Eve Eve Eve");
		case "23":
			System.out.println("Christmas Eve Eve");
		case "24":
			System.out.println("Christmas Eve");
		case "25":
			System.out.println("Christmas");

		default:
			break;
		}
	}

}
