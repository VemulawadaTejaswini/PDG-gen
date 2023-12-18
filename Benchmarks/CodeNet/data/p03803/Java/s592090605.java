import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == b) {
				System.out.println("Draw");
			} else if (a == 1 || (b != 1 && a > b)) {
				System.out.println("Alice");
			} else {
				System.out.println("Bob");
			}

		} finally {
			sc.close();
		}
	}
}