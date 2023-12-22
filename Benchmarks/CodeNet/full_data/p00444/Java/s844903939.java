import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int count;

		n = scanner.nextInt();
		while (n != 0) {
			count = 0;
			int change = 1000 - n;
			while (500 <= change) {
				change -= 500;
				count++;
			}
			while (100 <= change) {
				change -=100;
				count++;
			}
			while (50 <= change) {
				change -=50;
				count++;
			}
			while (10 <= change) {
				change -=10;
				count++;
			}
			while (5 <= change) {
				change -=5;
				count++;
			}
			while (1 <= change) {
				change -=1;
				count++;
			}
			System.out.println(count);
			n = scanner.nextInt();
		}
	}
}