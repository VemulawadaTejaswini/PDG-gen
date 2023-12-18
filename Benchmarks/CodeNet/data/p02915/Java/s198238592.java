import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		log(N * N *N);
	}

	private static void log(int str) {
		System.out.println(str);
	}
}

