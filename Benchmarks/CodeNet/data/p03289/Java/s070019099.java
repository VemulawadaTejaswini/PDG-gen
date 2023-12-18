import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean startsFromA = (S.charAt(0) == 'A');
		String seekC = S.substring(2, S.length() - 1);
		int indexOfC = seekC.indexOf('C');
		boolean containsSingleC = (indexOfC != -1 && seekC.indexOf('C', indexOfC + 1) == -1);
		boolean lowersOtherThanAC = isLowersOtherThanAC(S, indexOfC + 2);
		System.out.println((startsFromA && containsSingleC && lowersOtherThanAC) ? "AC" : "WA");
	}

	private static boolean isLowersOtherThanAC(String S, int indexOfC) {
		char[] array = S.toCharArray();
		int length = array.length;
		for (int i = 1; i < length; i++) {
			if (i != indexOfC && Character.isUpperCase(array[i])) {
				return false;
			}
		}
		return true;
	}
}