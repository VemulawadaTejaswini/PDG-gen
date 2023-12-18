
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.next();

			System.out.println(line.replaceAll("2017", "2018"));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int n = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			int[] wk = new int[n];

			for (int i = 0; i < n; i++) {
				wk[i] = scanner.nextInt();
			}

			Arrays.sort(wk);

			int res = 0;
			for (int i = 0; i < wk.length; i++) {
				if (i == 0) {
					res++;
				} else if (wk[i] != wk[i - 1]) {
					res++;
				}

			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int n = 0;
		int y = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			y = scanner.nextInt();

			int n10000 = -1;
			int n5000 = -1;
			int n1000 = -1;

			for (int i = n; i > 0; i--) {
				if (y - i * 10000 < 0 || i > n) {
					break;
				} else if (y - i * 10000 == 0) {
					System.out.println(i + " " + 0 + " " + 0);
					return;
				}
				for (int j = n; j > 0; j--) {
					if (y - i * 10000 - j * 5000 < 0 || i + j > n) {
						break;
					} else if (y - i * 10000 - j * 5000 == 0) {
						System.out.println(i + " " + j + " " + 0);
						return;
					}
					for (int k = 0; k < n; k++) {
						if (y - i * 10000 - j * 5000 - k * 1000 < 0) {
							break;
						}
						if (y - i * 10000 - j * 5000 - k * 1000 == 0 && i + j + k == n) {
							System.out.println(i + " " + j + " " + k);
							return;
						}
					}

				}
			}

			System.out.println(n10000 + " " + n5000 + " " + n1000);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}