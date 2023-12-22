import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		long[] heightArray = new long[n];

		for (int i = 0; i < n; i++) {

			heightArray[i] = scan.nextLong();
		}

		long count = 0;

		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {

				if (Math.abs(i - j) == heightArray[i] + heightArray[j]) {

					count++;
				}
			}
		}

		println(count);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
