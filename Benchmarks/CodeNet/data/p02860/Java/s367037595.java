
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		char[] cArray = sc.nextLine().toCharArray();

		if ((n % 2) != 0) {
			System.out.println("No");
		} else {

			int base = n / 2;
			if (trueOrFalse(cArray, base)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

	private static boolean trueOrFalse(char[] cArray, int base) {

		for (int i = 0; i < base; i++) {
			if (cArray[i] != cArray[i + base]) {
				return false;
			}
		}
		return true;
	}

}
