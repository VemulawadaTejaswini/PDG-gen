
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();

		String t = T.substring(0,S.length());

		if(S.compareTo(t) == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		scanner.close();


	}

}
