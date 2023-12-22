import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();

		if (T.matches(S + "[a-z]")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
