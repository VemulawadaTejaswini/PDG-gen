import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int amountOfMoney = scan.nextInt();

		scan.close();

		for(int i = 0; i <= num; i++) {
			for(int j = 0; j <= num - i; j++) {
				for(int k = 0 ; k <= num - i - j; k++) {
					if(10000 * i + 5000 * j + 1000 * k == amountOfMoney
						&& i + k + j == num) {
						System.out.println(i + " " + j + " " + k);
						return;
					}
				}
			}
		}
		System.out.println(-1 + " " + -1 + " " + -1);

	}

}