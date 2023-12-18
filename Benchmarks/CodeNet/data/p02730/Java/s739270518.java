
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int N = S.length();

		if (S.substring(0, (N - 1) / 2).equals(S.substring((N + 1) / 2, N))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scan.close();
	}
}
