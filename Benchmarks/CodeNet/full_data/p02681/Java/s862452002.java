import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();

		if (S.equals(T.substring(0, S.length()))) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

		sc.close();

	}
}
