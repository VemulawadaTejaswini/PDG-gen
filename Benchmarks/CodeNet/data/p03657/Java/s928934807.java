import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		String result = "Impossible";
		if (A >= 3 || B >= 3 || (A+B) >= 3) {
			result = "Possible";
		}
		System.out.println(result);

	}

}