import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String[] s = scanner.nextLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int digitsOfA = 0;
			int digitsOfB = 0;
			if (a >= 0) {
				digitsOfA = Integer.valueOf(a).toString().length();
			}
			if (b >= 0) {
				digitsOfB = Integer.valueOf(b).toString().length();
			}
			int sumOfDigits = digitsOfA + digitsOfB;
			System.out.println(sumOfDigits);
		}
	}
}