import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yen500 = sc.nextInt();
		int yen100 = sc.nextInt();
		int yen50 = sc.nextInt();
		int value = sc.nextInt();
		
		int max500 = value / 500 < yen500 ? value / 500 : yen500;
		int max100;
		int result = 0;
		int nokori500;
		int nokori100;

		
		for (int i = 0; i <= max500; i++) {
			nokori500  = value - 500 * i;
			max100  = nokori500 / 100 < yen100 ? nokori500 / 100 : yen100;
			for (int j = 0; j <= max100; j++) {
				nokori100 = nokori500 - 100 * j;
				if (nokori100 % 50 == 0) {
					if (nokori100 / 50 <= yen50) {
						result++;						
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
