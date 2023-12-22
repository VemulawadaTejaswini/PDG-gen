import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;; i++) {
			int x = sc.nextInt();
			int sum = 0;
			if (x == 0)
				break;
			while (1.0 * x / 10 >= 1) {
				int tmp = x % 10;
				sum += tmp;
				x = (x - tmp) / 10;
			}
			System.out.println(sum);
		}
	}
}