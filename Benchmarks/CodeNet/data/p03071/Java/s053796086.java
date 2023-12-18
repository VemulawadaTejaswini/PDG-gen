import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int result = 0;
		for (int i = 0; i < 2; i++ ) {
			if (A > B) {
				result += A;
				A--;
			} else {
				result += B;
				B--;
			}
		}

		System.out.println(result);
	}

}
