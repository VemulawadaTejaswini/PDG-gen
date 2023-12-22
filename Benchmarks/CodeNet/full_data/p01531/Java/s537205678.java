
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();

		String[] vowel = {"w", "", "k", "s", "t", "n", "h", "m", "y", "r" };

		for (int i = 0; i < str.length(); i += 2) {
			char m = str.charAt(i);
			char c = str.charAt(i + 1);
			if (m == '0' && c == 'U') {
				System.out.print("nn");
			} else {
				System.out.print(vowel[m - '0']);
				switch (c) {
				case 'T':
					System.out.print('a');
					break;
				case 'L':
					System.out.print('i');
					break;
				case 'U':
					System.out.print('u');
					break;
				case 'R':
					System.out.print('e');
					break;
				case 'D':
					System.out.print('o');
					break;
				}
			}
		}
		System.out.println();
	}
}