import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		line = line.toLowerCase();
		String text = "";
		char[] c = new char[line.length()];

		for (int i = 0; i < line.length(); i++) {
			c[i] = line.charAt(i);
			if (c[i] != ' ') {
				text += c[i];
			}
		}

		char[] newc = new char[text.length()];
		if (text.length() > 1200) {
			System.exit(0);
		}
		for (int j = 'a'; j < 'z'; j++) {
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				newc[i] = text.charAt(i);
				if (newc[i] == (char) j) {
					count++;
				}

			}

			System.out.println((char) j + "；" + count);

			sc.close();
		}

	}

}
