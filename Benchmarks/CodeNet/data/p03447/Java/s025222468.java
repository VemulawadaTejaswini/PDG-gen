package Abc087;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author miyaa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			int money = Integer.parseInt(in.readLine());
			int cakePrice = Integer.parseInt(in.readLine());
			int donutPrice = Integer.parseInt(in.readLine());

			int result = getBuyingSweetsResult(money, cakePrice, donutPrice);

			System.out.println(result);

		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
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
