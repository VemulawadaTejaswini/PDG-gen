import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			String str = s.next();
			if (str.equals("#"))
				break;

			int count = 0;
			char[] rl = new char[str.length()];

			for (int i = 0; i < str.length(); i++) {
				rl[i] = WhichHands(str.charAt(i));
			}

			for (int i = 0; i < str.length() - 1; i++) {
				if (rl[i] != rl[i + 1])
					count++;
			}

			System.out.println(count);

		}
		s.close();
	}

	public static char WhichHands(char c) {
		char[] left = { 'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z',
				'x', 'c', 'v', 'b' };
		char[] right = { 'y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'n', 'm' };

		char ans = 'l';

		for (int x = 0; x < right.length; x++) {
			// if (left[x] == c)
			// ans = 'l';
			if (right[x] == c)
				ans = 'r';
		}
		return ans;
	}
}