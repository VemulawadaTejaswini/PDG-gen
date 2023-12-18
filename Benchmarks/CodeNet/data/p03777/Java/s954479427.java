import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String result = "H";

		if (!a.equals(b)) {
			result = "D";
		}
		System.out.println(result);
	}

}