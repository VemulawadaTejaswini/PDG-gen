import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String correct = scanner.next();
		String target = scanner.next();

		char[] targ = target.toCharArray();
		for (int i = 0; i < correct.length(); i++) {
			char[] converted = new char[correct.length()];
			for (int j = 0; j < correct.length(); j++) {
				int a = i + j;
				if (a >= correct.length()) {
					a = a - correct.length();
				}
				converted[j] = targ[a];
			}
			if (correct.equals(String.valueOf(converted))) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
