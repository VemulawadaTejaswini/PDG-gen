import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int time = A + B;

		if (time >= 24) {
			time = time - 24;
		}
		System.out.println(time);
	}

}