import java.util.Scanner;

/**
 * @author miyaa
 *
 */
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int cakePrice = sc.nextInt();
		int donutPrice = sc.nextInt();

		int result = getBuyingSweetsResult(money, cakePrice, donutPrice);
		System.out.println(result);
	}

	public static int getBuyingSweetsResult(int money, int cakePrice, int donutPrice) {
		money -= cakePrice;
		while (money - donutPrice >= 0)
			money -= donutPrice;
		return money;
	}
}
