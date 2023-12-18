import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		int result = 0;
		if (2 * c < a && 2 * c < b) {
			if (x < y) {
				result = 2 * c * y;
			} else {
				result = 2 * c * x;
			}
		} else if (2 * c < a) {
			if (x < y) {
				result = 2 * c * x + b * (y - x);
			} else {
				result = 2 * c * x;
			}
		} else if (2 * c < b) {
			if (x < y) {
				result = 2 * c * x;
			} else {
				result = a * (x - y) + 2 * c * y;
			}
		} else {
			boolean cPriority = 4 * c < 2 * (a + b);
			if (cPriority) {
				if (x < y) {
					result = 2 * c * x + b * (y - x);
				} else {
					result = a * (x - y) + 2 * c * y;
				}
			} else {
				result = a * x + b * y;
			}
		}
		System.out.println(result);
	}
}
