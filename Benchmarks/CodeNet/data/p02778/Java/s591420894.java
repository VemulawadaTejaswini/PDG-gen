import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		s = s.replaceAll("[a-z]", "x");
		System.out.println(s);

		scan.close();
	}
}
