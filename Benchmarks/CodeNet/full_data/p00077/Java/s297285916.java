
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();

			StringBuilder builder = new StringBuilder(line);
			while (true) {
				int num = builder.indexOf("@");
				if (num == -1) {
					break;
				}
				builder.replace(num, num + 2, getStr(num, builder));
			}
			System.out.println(builder);

		}
	}

	private static String getStr(int num, StringBuilder builder) {
		int a = builder.charAt(num + 1) - '0';
		StringBuilder b = new StringBuilder();
		String s = builder.substring(num + 2, num + 3);
		for (int i = 0; i < a; i++) {
			b.append(s);
		}
		return b.toString();
	}
}