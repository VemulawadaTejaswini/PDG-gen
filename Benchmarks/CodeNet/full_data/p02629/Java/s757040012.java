import java.util.Scanner;

public class Main {

	private static long n;
	private static String[] numeralSystem;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		fillNumeralSystem();
//		translateNumber();
		System.out.println(translateNumber());
	}

	private static void fillNumeralSystem() {
		numeralSystem = new String[27];
		numeralSystem[0] = "z";
		int delta = (int) 'a';
		for (int i = 1; i < numeralSystem.length; i++) {
			numeralSystem[i] = Character.toString(i - 1 + delta);
		}
	}

	public static String translateNumber() {

		String res = "";

		while (n > 26) {
			res = numeralSystem[(int) (n % 26)].concat(res);
			n--;
			n /= 26;
		}

		res = numeralSystem[(int) n].concat(res);

		return res;
	}
}