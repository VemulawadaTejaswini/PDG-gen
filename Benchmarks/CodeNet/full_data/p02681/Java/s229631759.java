import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String S = scn.next();
			String T = scn.next();

			if(S.equals(T.substring(0, S.length()))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}
}