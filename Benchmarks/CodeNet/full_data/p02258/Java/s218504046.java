import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int price = scanner.nextInt();
		int changedPrice = scanner.nextInt();
		int profit = changedPrice - price;

		if (price > changedPrice) {
			price = changedPrice;
		}

		for (int i = 0; i < count - 2; i++) {
			changedPrice = scanner.nextInt();
			if (profit < (changedPrice - price)) {
				profit = changedPrice - price;
			}
			if (changedPrice < price) {
				price = changedPrice;
			}
		}
		System.out.println(profit);
	}
}