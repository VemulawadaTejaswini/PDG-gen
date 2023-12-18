
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		dPA();

	}

	private static void dPA() {
		Scanner scanner = null;
		int numFlog = 0;

		try {
			scanner = new Scanner(System.in);
			numFlog = scanner.nextInt();
			int[] heightArray = new int[numFlog];

			for (int i = 0; i < numFlog; i++) {
				heightArray[i] = scanner.nextInt();
			}

			int[] koufukuArray = new int[numFlog];
			for (int i = 0; i < heightArray.length; i++) {
				if (i != 0 && i != 1) {
					int val1 = Math.abs(heightArray[i] - heightArray[i - 1]);
					int val2 = Math.abs(heightArray[i] - heightArray[i - 2]);
					koufukuArray[i] = val1 < val2 ? koufukuArray[i - 1] + val1 : koufukuArray[i - 2] + val2;
				} else if (i == 0) {
					koufukuArray[i] = 0;
				} else if (i == 1) {
					koufukuArray[i] = koufukuArray[i - 1] + Math.abs(heightArray[i] - heightArray[i - 1]);
				}

			}
			System.out.println(koufukuArray[koufukuArray.length - 1]);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}