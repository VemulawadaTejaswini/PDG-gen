import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int sum = m + f;
			if (m == -1 && f == -1 && r == -1)
				break;

			if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (sum >= 80) {
				System.out.println("A");
			} else if (sum >= 65) {
				System.out.println("B");
			} else if (sum >= 50 || r >= 50) {
				System.out.println("C");
			} else if (sum >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}

	}

}

