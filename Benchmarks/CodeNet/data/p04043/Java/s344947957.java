import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int fiveCount = 0;
			int sevenCount = 0;

			int inputCount = 0;
			while (inputCount < 3) {
				int abc = sc.nextInt();

				if (abc == 5) {
					fiveCount++;
				} else if (abc == 7) {
					sevenCount++;
				}
				inputCount++;
			}

			if (fiveCount == 2 && sevenCount == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} finally {
			sc.close();
		}
	}
}