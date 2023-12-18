
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double total = 0.0;
		
		for (int i = 0; i < n; i++) {
			double price = scanner.nextDouble();
			String currency = scanner.next();
			
			if (currency.equals("JPY")) {
				total += price;
			} else if (currency.equals("BTC")) {
				total += price*38000.0;
			}
		}
		System.out.println(total);
		scanner.close();

	}

}
