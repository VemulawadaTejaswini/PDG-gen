import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] nCandyArray = new int[n];

		for (int i = 0; i < k; i++) {

			int d = scan.nextInt();

			for (int j = 0; j < d; j++) {

				int a = scan.nextInt();

				nCandyArray[a - 1]++;
			}
		}

		int count = 0;

		for (int candy : nCandyArray) {

			if (candy == 0) {
				count++;
			}
		}

		println(count);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
