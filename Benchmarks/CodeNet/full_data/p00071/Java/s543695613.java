import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][];
		int n;

		a = new int[8][8];
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 8; j++) {
				String str = sc.next();
				for (int k = 0; k < 8; k++) {
					a[j][k] = str.charAt(k) - '0';
				}
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			bomb(a, y - 1, x - 1);
			System.out.println("Data " + (i + 1) + ":");
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < 8; k++) {
					System.out.print(a[j][k]);
				}
				System.out.println();
			}
		}
	}

	public static void bomb(int a[][], int i, int j) {
		if (0 <= i && i < 8 && 0 <= j && j < 8 && a[i][j] == 1) {
			a[i][j] = 0;
			bomb(a, i - 3, j);
			bomb(a, i - 2, j);
			bomb(a, i - 1, j);
			bomb(a, i + 1, j);
			bomb(a, i + 2, j);
			bomb(a, i + 3, j);
			bomb(a, i, j - 3);
			bomb(a, i, j - 2);
			bomb(a, i, j - 1);
			bomb(a, i, j + 1);
			bomb(a, i, j + 2);
			bomb(a, i, j + 3);
		}
	}
}