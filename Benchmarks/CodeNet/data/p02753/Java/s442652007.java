import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();

		if (string.equals("AAA") || string.equals("BBB")) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}