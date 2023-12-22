import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][][] vs = new int[4][3][10];
		int n = scanner.nextInt();
		for (int i = 0; i < n; ++i) {
			int b = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();
			vs[b - 1][f - 1][r - 1] += v;
		}
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 3; ++j) {
				for (int k = 0; k < 10; ++k) {
					System.out.printf(" %d", vs[i][j][k]);
				}
				System.out.println();
			}
			if (i != 3) System.out.print("####################\n");
		}
	}
}

