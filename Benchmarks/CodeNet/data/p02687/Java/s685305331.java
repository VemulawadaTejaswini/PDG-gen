import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String string = stdIn.next();
		System.out.println(string.equals("ABC") ? "ARC" : "ABC" );

		stdIn.close();
	}
}
