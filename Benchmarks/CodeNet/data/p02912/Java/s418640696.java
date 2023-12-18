import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, m;

		String[] nm = scanner.nextLine().split(" ");
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);
		String[] as = scanner.nextLine().split(" ");
		scanner.close();

		LinkedList<Price> prices = new LinkedList<Price>();
		for (int i = 0; i < n; i++) {
			Price price = new Price();
			price.div = 0;
			price.price = Long.parseLong(as[i]);
			prices.add(price);
		}

		prices.sort((a, b) -> (int) (a.price - b.price)); /* ラムダ式 */
		for (int i = 0; i < m; i++) {
//
//			prices.sort((a, b) -> (int) (
//					(
//							(double) a.price / Math.pow(2, (double) a.div)
//					- (double) b.price / Math.pow(2, (double) b.div)
//					) * 10
//					)); /* ラムダ式 */
			// swap
			double target = (double) prices.get(n - 1).price / Math.pow(2, (double) prices.get(n - 1).div);
			for (int j = n - 2; j >= 0; j--) {
				double swap = (double) prices.get(j).price / Math.pow(2, (double) prices.get(j).div);
				if (target > swap) {
					prices.add(j + 1, prices.get(n - 1));
					prices.remove(n);
					break;
				}
			}
			prices.get(n - 1).div = prices.get(n - 1).div + 1;
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += prices.get(i).price / Math.pow(2, prices.get(i).div);
		}
		System.out.println(sum);
	}

	static class Price {
		long price;
		int div;
	}
}