import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tLife = scanner.nextInt();
		int tAttack = scanner.nextInt();
		int aLife = scanner.nextInt();
		int aAttack = scanner.nextInt();

		while (true) {
			aLife -= tAttack;

			if (aLife <= 0) {
				System.out.println("Yes");
				break;
			}

			tLife -= aAttack;
			if (tLife <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}