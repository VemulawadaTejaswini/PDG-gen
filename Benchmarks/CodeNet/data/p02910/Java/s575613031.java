import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		boolean isEasy = true;

		int length = str.length();

		for (int i = 0; i < length; i++) {
			String chr = str.substring(i, i + 1);
			if (i % 2 != 0) {
				if (chr.equals("R")) {
					isEasy = false;
					break;
				}
			} else {
				if (chr.equals("L")) {
					isEasy = false;
					break;
				}
			}
		}

		System.out.println(isEasy ? "Yes" : "No");

	}

}

