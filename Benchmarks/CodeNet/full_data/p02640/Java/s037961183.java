import java.util.Scanner;

// ABC170-B
public class Main {

	public static void main(String[] args) {

		int tsuruLegs = 2;
		int kameLegs = 4;

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		boolean bool = false;

		for (int i = 0; i <= x; i++) {
			int legs = i * tsuruLegs + (x - i) * kameLegs;

			if (legs == y) {
				bool = true;
			}
		}

		if (bool) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}
