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

		LinkedList<Long> prices = new LinkedList<Long>();
		for (int i = 0; i < n; i++) {
			prices.add(Long.parseLong(as[i]));
		}

		prices.sort((a, b) -> (int) (a - b));
		for (int i = 0; i < m; i++) {

			// swap
			int L = 0;
			int R = n - 2; //Rの初期値は要素数
			long target = prices.get(n - 1);
			
			while (L < R) {
				int M = (L+R)/2;
				if (prices.get(M) <= target && prices.get(M+1) >= target) {
					prices.add(M + 1, prices.get(n - 1));
					prices.remove(n);
					break;
				}
				else if (prices.get(M) > target) {R = M;}
				else if (prices.get(M) < target) {L = M+1;}
			}
			prices.set(n - 1, prices.get(n - 1) / 2);
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += prices.get(i);
		}
		System.out.println(sum);
	}
}
