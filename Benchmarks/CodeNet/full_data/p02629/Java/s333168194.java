import java.util.Scanner;

public class Main {

	private static int decimalNumber;
	private static String[] numeralSystem;

//	public Dalmatians(int decimalNumber) {
//		super();
//		this.decimalNumber = decimalNumber;
//		fillNumeralSystem();
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		decimalNumber = scanner.nextInt();
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

		while (decimalNumber > 26) {
			if (decimalNumber % 26 == 0) {
				while (decimalNumber > 26) {
					res = numeralSystem[0].concat(res);
					decimalNumber /= 26;
				}
				return res;
			}
			res = numeralSystem[(int) (decimalNumber % 26)].concat(res);
			decimalNumber /= 26;
		}

		res = numeralSystem[(int) decimalNumber].concat(res);

		return res;

	}
}