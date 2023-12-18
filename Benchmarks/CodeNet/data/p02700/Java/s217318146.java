import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tAttack = scanner.nextInt();
		int tLife = scanner.nextInt();
		int aAttack = scanner.nextInt();
		int aLife = scanner.nextInt();
		boolean flg= false;

		while(true){
			flg = false;
			aLife -= tAttack;

			if (aLife <= 0) {
				flg = true;
				break;
			}

			tLife -= aAttack;
			if (tLife <= 0) {
				break;
			}
		}
		if(!flg) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
