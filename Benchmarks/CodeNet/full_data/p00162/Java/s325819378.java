
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			int[] num = new int[1000001];
			int count = 0;
			for (int i = 1; i <= 1000000; i++) {
				if (slove(i)) {
					count++;

				}
				num[i] = count;
			}
			System.out.println(num[m] - num[n - 1]);
		}
	}

	private static boolean slove(int i) {
		while (true) {
			if (i % 2 == 0) {
				i /= 2;
			} else if (i % 3 == 0) {
				i /= 3;
			} else if (i % 5 == 0) {
				i /= 5;
			} else {
				break;
			}
		}

		return i == 1;
	}
}