import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();

			for (int i = 0; i < 26; i++) {
				String dec = shift(str, i);
				if (dec.contains("the") || dec.contains("this") || dec.contains("the")) {
					System.out.println(dec);
					break;
				}
			}
		}
		scan.close();
	}

	private static String shift(String in, int n) {
		StringBuilder sb = new StringBuilder("");

		for (char c : in.toCharArray()) {
			if ('a' <= c && c <= 'z') {
				c += n;
				if (c > 'z') {
					c -= (char) 26;
				}
			}
			sb.append(c);
		}
		return sb.toString();
	}
}