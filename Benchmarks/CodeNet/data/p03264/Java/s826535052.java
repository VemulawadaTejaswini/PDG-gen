import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		scanner.close();
		int num = 0;

		for (int n = 1; n <= K; n++) {
			for (int m = 1; m <= K; m++) {
				if (n <= m) {
					continue;
				}
				if (n % 2 == 0) {
					if (m % 2 == 1) {
						num++;
					} else {
						continue;
					}
				} else {
					if (m % 2 == 0) {
						num++;
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(num);
	}
}
