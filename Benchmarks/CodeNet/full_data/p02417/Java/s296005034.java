import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] count = new int[27];

		while (scan.hasNext()) {
			String str = scan.next();
			char[] schar = str.toCharArray();
			for (char c : schar) {
				if (Character.isUpperCase(c))
					c = Character.toLowerCase(c);
				for (int i = 0; i < alphabet.length; i++)
					if (c == alphabet[i]) count[i] += 1;
			}
		}
		for (int i = 0; i < count.length - 1; i++)
			System.out.printf("%c : %d\n", alphabet[i], count[i]);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}