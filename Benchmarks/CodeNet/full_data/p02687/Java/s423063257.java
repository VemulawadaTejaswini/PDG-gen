import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String S = scn.next();

			if(S.charAt(1) == 'B') {
				System.out.println("ARC");
			} else {
				System.out.println("ABC");
			}
		}
	}
}