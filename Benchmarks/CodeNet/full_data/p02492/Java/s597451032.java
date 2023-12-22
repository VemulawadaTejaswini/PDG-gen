import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for (;;) {
			long a = in.nextLong();
			String op = in.next();
			long b = in.nextLong();

			long cal;
			if ("+".equals(op)) {
				cal = a + b;
			} else if ("-".equals(op)) {
				cal = a - b;
			} else if ("*".equals(op)) {
				cal = a * b;
			} else if ("/".equals(op)) {
				cal = a / b;
			} else {
				break;
			}
			System.out.println(cal);
		}
	}
}