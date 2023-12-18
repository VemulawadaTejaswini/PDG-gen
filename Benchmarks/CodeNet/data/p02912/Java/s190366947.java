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

			// swap
			int L = 0;
			int R = n - 1; //Rの初期値は要素数
			double target = (double) prices.get(n - 1).getPrice();
			
			while (L < R) {
				int M = (L+R)/2;
				if (prices.get(M).getPrice() <= target && prices.get(M+1).getPrice() >= target) {
					prices.add(M + 1, prices.get(n - 1));
					prices.remove(n);
					break;
				}
				else if (prices.get(M).getPrice() > target) {R = M;}
				else if (prices.get(M).getPrice() < target) {L = M+1;}
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
		
		public double getPrice() {
			return (double) price / Math.pow(2, (double) div);
		}
	}
}