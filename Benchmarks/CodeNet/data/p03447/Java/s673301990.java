package Abc087;

import java.util.Scanner;

/**
 * @author miyaa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = Integer.parseInt(sc.nextLine());
		int cakePrice = Integer.parseInt(sc.nextLine());
		int donutPrice = Integer.parseInt(sc.nextLine());

		int result = getBuyingSweetsResult(money, cakePrice, donutPrice);
		System.out.println(result);
	}

	/**
	 * @return
	 */
	public static void TestBuyingSweets() {
		System.out.println(getBuyingSweetsResult(1234, 150, 100)); // 84
		System.out.println(getBuyingSweetsResult(1000, 108, 108)); // 28
		System.out.println(getBuyingSweetsResult(579, 123, 456)); // 0
	}

	/**
	 * @param money
	 * @param cakePrice
	 * @param donutPrice
	 * @return
	 */
	public static int getBuyingSweetsResult(int money, int cakePrice, int donutPrice) {
		money -= cakePrice;
		while (money - donutPrice >= 0)
			money -= donutPrice;
		return money;
	}
}
