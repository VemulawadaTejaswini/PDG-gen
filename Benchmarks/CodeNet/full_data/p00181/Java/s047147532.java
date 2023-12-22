
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] book = new int[m];
			int sum = 0;
			for (int i = 0; i < m; i++) {
				book[i] = scanner.nextInt();
				sum += book[i];
			}
			int ave = sum / n - 1;
			loop: while (true) {
				int count = 0;
				ave++;;
				int s = ave;
				int i = 0;
				while (count != n) {
					if (i == m) {
						break loop;
					}
					if (s - book[i] >= 0) {
						s -= book[i];
						i++;
					} else {
						count++;
						s = ave;
					}
				}
			}
			System.out.println(ave);
		}
	}
}