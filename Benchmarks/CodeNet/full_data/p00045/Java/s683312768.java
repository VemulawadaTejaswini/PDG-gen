import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int sumMoney =0;
		int sumStock=0;

		for(int i = 0; i < 3; i++) {
			int money = stdin.nextInt();
			int stock = stdin.nextInt();

			sumMoney += money * stock;
			sumStock += stock;
		}

		System.out.println(sumMoney);
		System.out.println((int)(sumStock / 3 + 0.5));

	}

}