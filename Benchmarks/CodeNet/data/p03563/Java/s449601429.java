import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R = scanner.nextInt();
		int G = scanner.nextInt();

		int x = 2 * G - R;
		System.out.println(x);
	}

}