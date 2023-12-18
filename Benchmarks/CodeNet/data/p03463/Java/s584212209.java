import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int d = b - a;
			if (d % 2 == 0) {
				System.out.println("Alice");
			} else {
				System.out.println("Borys");
			}
		}
	}

}
