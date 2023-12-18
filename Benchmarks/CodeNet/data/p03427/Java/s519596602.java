import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			String str = Long.toString(n);
			int result = 9 * (str.length() - 1);
			int val = Integer.valueOf(String.valueOf(str.charAt(0)));
			result += val;
			String subStr = str.substring(1);
			if (!subStr.matches("^9*$")) {
				result--;
			}
			System.out.println(result);
		}
	}
}
