import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String S = input.next();
		String T = input.next();

		input.close();

		if(S.length() + 1 == T.length() & T.startsWith(S)) {

			System.out.println("Yes");

		}else {

			System.out.println("No");

		}
	}
}
