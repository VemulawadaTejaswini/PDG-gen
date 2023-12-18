import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		String feel = "dangerous";

		if (B - A <= 0) {
			feel = "delicious";
		} else if (B - A <= X) {
			feel = "safe";
		}
		System.out.println(feel);
	}

}