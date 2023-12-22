
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[][] kasi = new int[n][5];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 4; j++) {
					kasi[i][j] = scanner.nextInt();
				}
				kasi[i][4] = kasi[i][1] * 4 + kasi[i][2] * 9 + kasi[i][3] * 4;
			}
			int[] PQR = new int[5];
			for (int i = 1; i <= 4; i++) {
				PQR[i] = scanner.nextInt();
			}
			boolean flag = true;
			loop: for (int i = 0; i < n; i++) {
				for (int j = 1; j <= 4; j++) {
					if (kasi[i][j] > PQR[j]) {
						continue loop;
					}

				}
				System.out.println(kasi[i][0]);
				flag = false;
			}
			if (flag)
				System.out.println("NA");
		}
	}
}