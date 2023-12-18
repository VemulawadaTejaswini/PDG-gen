import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String code = sc.next();

		System.out.println(isCorrectPostalCode(code, A, B));

	}

	public static String isCorrectPostalCode(String code, int A, int B) {

		char[] codes = code.toCharArray();
		if (codes[A] != '-') {
			return "No";
		}

		String[] postalCodeList = code.split("-", 0);
		if (postalCodeList.length != 2) {
			return "No";
		}
		if (postalCodeList[0].length() != A || postalCodeList[1].length() != B) {
			return "No";
		}

		return "Yes";
	}
}
