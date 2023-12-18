import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int inY = stdin.nextInt();

		int result10000 = -1;
		int result5000 = -1;
		int result1000 = -1;

		mainloop:
		for (int num1000 = 0; num1000 <= inN; num1000++) {
			int sum1000 = 1000 * num1000;
			if (sum1000 > inY) {
				break;
			}

			for (int num5000 = 0; (num1000 + num5000) <= inN; num5000++) {
				int sum5000 = sum1000 + 5000 * num5000;
				if (sum5000 > inY) {
					break;
				}

				int sum10000 = inY - sum5000;
				if ((sum10000 % 10000) == 0) {
					int num10000 = sum10000 / 10000;
					if ((num1000 + num5000 + num10000) == inN) {
						result10000 = num10000;
						result5000 = num5000;
						result1000 = num1000;

						break mainloop;
					}
				}
			}
		}

		System.out.println(result10000 + " " + result5000 + " " + result1000);
	}

}
