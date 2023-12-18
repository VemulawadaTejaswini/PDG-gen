import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String s2 = s.replace(',', ' ');

		System.out.println(s2);
	}

}
