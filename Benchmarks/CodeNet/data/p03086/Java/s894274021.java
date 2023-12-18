import java.util.Scanner;

public class Main {

	public static Character[] acgt = { 'A', 'C', 'G', 'T' };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] strArray = scanner.nextLine().toCharArray();

		int max = 0;
		int count = 0;

		for (char s : strArray) {
			if (isAcgt(s)) {
				count++;
			} else {
				if (max < count) {
					max = count;
				}
				count = 0;
			}
		}
		System.out.println(max);
		scanner.close();
	}

	private static boolean isAcgt(char param) {

		for (char c : acgt) {
			if (param == c) {
				return true;
			}
		}
		return false;
	}
}
