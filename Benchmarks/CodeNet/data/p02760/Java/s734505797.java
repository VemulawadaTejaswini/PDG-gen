import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		for (int k = 0; k < n; k++) {
			int b = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == b) {
						a[i][j] = 0;
					}
				}
			}
		}
		sc.close();

		if (a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0
				|| a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0
				|| a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0
				|| a[0][0] == 0 && a[1][0] == 0 && a[2][0] == 0
				|| a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0
				|| a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0
				|| a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0
				|| a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0
				) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
