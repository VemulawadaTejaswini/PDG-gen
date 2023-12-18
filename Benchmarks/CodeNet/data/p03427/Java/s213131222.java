import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		long num = stdin.nextLong() + 1;
		String numStr = String.valueOf(num);
		int len9 = numStr.length() - 1;
		int top = Integer.parseInt(numStr.substring(0, 1)) - 1;

		int max = top + 9 * len9;
		System.out.println(max);
	}

}
