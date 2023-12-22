import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int x = Character.getNumericValue(n.charAt(n.length() - 1));

		if (x == 2 || x == 4
				|| x == 5 || x == 7
				|| x == 9) {
			System.out.println("hon");
		} else if (x == 3) {
			System.out.println("bon");
		} else {
			System.out.println("pon");
		}

		sc.close();
	}

}
