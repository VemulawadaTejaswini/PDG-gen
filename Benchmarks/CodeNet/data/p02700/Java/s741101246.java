import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tAttack = scanner.nextInt();
		int tLife = scanner.nextInt();
		int aAttack = scanner.nextInt();
		int aLife = scanner.nextInt();

		while(true){
			aLife -= tAttack;

			if (aLife <= 0) {
				System.out.println("Yes");
				break;
			}
			if (tLife <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}
