import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		long num = stdin.nextLong();
		int len9 = String.valueOf(num).length() - 1;
		int top = (int)(num / Math.pow(10, len9)) - 1;

		int max = top + 9 * len9;
		System.out.println(max);
	}

}
