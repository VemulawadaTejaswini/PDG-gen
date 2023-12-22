import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();

		if (s.equals(s.toUpperCase())) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}

	}
}
