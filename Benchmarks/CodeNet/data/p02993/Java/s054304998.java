import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int s = sc.nextInt();
			int a[] = new int[4];
			for (int i = 0; i < 4; i++) {
				a[i] = s % 10;
				s /= 10;
			}
			boolean result = false;

			for (int i = 1; i < 4; i++) {
				if (a[i] == a[i - 1]) {
					result = true;
					break;
				}
			}

			if (result) {
				System.out.println("Bad");
			} else {
				System.out.println("Good");
			}
		}

	}

}
