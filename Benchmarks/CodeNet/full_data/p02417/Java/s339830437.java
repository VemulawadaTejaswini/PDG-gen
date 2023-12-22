import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sep = System.getProperty("line.separator");
		sc.useDelimiter(sep+sep);
		String s = sc.next();
		char characters[] = s.toCharArray();
		int count[] = new int[26];
		for (int i = 0; i < characters.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (characters[i] == (char) (j + 97) || characters[i] == (char) (j + 65)) {
					count[j]++;
				}
			}

		}

		for (int i = 0; i < 26; i++) {
			char c = (char) (i + 97);

			System.out.println(c + " : " + count[i]);
		}

	}

}