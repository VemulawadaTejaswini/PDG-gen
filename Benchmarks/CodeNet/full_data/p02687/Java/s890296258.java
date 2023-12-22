import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String abc = "ABC";
		final String arc = "ARC";

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		String answer = s.equals(abc)
				? arc
				: abc;

		println(answer);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
