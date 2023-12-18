import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int t = scanner.nextInt();
		int result = 0;

		if (X > t) {
			result = X - t;
		}
		System.out.println(result);
	}

}