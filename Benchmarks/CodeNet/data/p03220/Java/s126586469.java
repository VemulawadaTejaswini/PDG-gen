
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ABC11X_A();
		ABC11X_B();
		// ABC11X_C();
		// ABC11X_D();
	}

	private static void ABC11X_A() {
		Scanner scanner = null;
		int amountX = 0;
		int amountY = 0;

		try {
			scanner = new Scanner(System.in);
			amountX = scanner.nextInt();
			amountY = scanner.nextInt();

			int total = amountX + (amountY / 2);

			System.out.println(total);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_B() {
		Scanner scanner = null;
		int numN = 0;
		double numT = 0;
		double numA = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numT = scanner.nextInt();
			numA = scanner.nextInt();

			int[] wkTemparture = new int[numN];

			double minA = Double.MAX_VALUE;
			int targetN = Integer.MAX_VALUE;
			for (int i = 0; i < wkTemparture.length; i++) {
				wkTemparture[i] = scanner.nextInt();
				double wkTemp = Math.abs(numA - (numT - wkTemparture[i] * 0.006));
				if (minA > wkTemp) {
					minA = wkTemp;
					targetN = i;
				}
			}

			System.out.println(targetN + 1);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_C() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_D() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}