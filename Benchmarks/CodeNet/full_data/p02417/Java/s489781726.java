import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] charArr = new int[26];

		String str;
		while (scan.hasNext()) {
			str = scan.nextLine();
			for (char c : str.toCharArray()) {
				if (c > 64 && c < 91) {
					charArr[c - 65]++;
				}
				if (c > 96 && c < 123) {
					charArr[c - 97]++;
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 97) + " : " + charArr[i]);
		}

		scan.close();
	}
}

