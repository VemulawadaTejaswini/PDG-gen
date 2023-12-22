import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String T = scanner.next();
			T.replace("?", "D");

			char[] cs = T.toCharArray();
			int count = 0;
			for (int i = 0, len = cs.length; i < len; i++) {
				char c = cs[i];
				if (c == 'P' && cs[i + 1] == 'D') {
					count++;
				} else if (c == 'D') {
					count++;
				}
			}

			System.out.print(count);
		}
	}
}