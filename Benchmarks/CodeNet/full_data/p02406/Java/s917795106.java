import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner stdin = new Scanner(System.in)) {
			int n = Integer.parseInt(stdin.next());
			if (n < 3 || n > 10000) {
				throw new RuntimeException("Input Range:between 3 and 10000");
			}
			System.out.println(checkNum(n));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String checkNum(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				sb.append(' ').append(String.valueOf(i));
			} else if (String.valueOf(i).contains("3")) {
				sb.append(' ').append(String.valueOf(i));
			}
		}
		return sb.toString();
	}
}