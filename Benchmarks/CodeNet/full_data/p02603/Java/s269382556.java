import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int money = 1000;
	static int bill = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> pricelist = new ArrayList<Integer>();

		int n = sc.nextInt();
		sc.nextLine();

		pricelist.add(201);

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			pricelist.add(a);
		}

		pricelist.add(0);

		for (int j = 1; j < n + 1; j++) {

			if ((pricelist.get(j) - pricelist.get(j - 1)) * (pricelist.get(j + 1) - pricelist.get(j)) <= 0) {
				if (pricelist.get(j) > pricelist.get(j + 1)) {// jが最高値
					sell(bill, pricelist.get(j));
				} else {// jが最安値
					buy(money / pricelist.get(j), pricelist.get(j));
				}
			}

		}

		if (money > 1000) {
			System.out.println(money);
		} else {
			System.out.println(1000);
		}

	}

	static void sell(int cnt, int price) {
		money = money + cnt * price;
		bill -= cnt;
	}

	static void buy(int cnt, int price) {
		money = money - cnt * price;
		bill += cnt;
	}

}