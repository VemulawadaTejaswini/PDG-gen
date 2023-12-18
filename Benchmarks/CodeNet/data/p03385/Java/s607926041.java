import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letters = scan.next();
		char l1 = letters.charAt(0);
		char l2 = letters.charAt(1);
		char l3 = letters.charAt(2);

		if (l1 != l2 && l1 != l3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

}

}
