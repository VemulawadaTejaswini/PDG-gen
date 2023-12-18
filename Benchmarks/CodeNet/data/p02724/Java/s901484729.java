import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int coin;
		Scanner scan = new Scanner(System.in);

		coin = scan.nextInt();

		int amari = 0;
		int fh = 0;
		int f = 0;

		if(coin >= 500) {
			fh = coin / 500;
			amari = coin % 500;
			if(amari >= 5) {
				f = amari / 5;
			}
			System.out.println(fh*1000 + f*5);
		} else {
			f = coin / 5;
			System.out.println(f*5);
		}
	}
}
