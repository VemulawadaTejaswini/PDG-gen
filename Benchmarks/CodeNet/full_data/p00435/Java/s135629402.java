import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		while (scan.hasNext()) {
			String s = scan.next();
			decode(s);
		}

		scan.close();
		System.exit(0);
	}

	private static void decode(String s) {
		StringBuilder d = new StringBuilder("");
		for (int i = 0; i < s.length(); i++)
			d.append(decodeChar(s.charAt(i)));
		System.out.println(d.toString());
	}

	private static char decodeChar(char c) {
		int a = c - 'A';
		a -= 3;
		if (a < 0)
			a += 26;
		return (char) (a + 'A');
	}
}