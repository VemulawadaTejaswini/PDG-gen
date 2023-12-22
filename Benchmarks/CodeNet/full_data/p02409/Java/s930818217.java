import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][][] r = new int[4][3][10];
		int n = s.nextInt();
		for (int i = 0; i < n; ++i) {
			r[s.nextInt() - 1][s.nextInt() - 1][s.nextInt() - 1] += s.nextInt();
		}
		for (int i = 0; i < 4; ++i) {
			if (i != 0) {
				System.out.println("####################");
			}
			for (int j = 0; j < 3; ++j) {
				for (int k = 0; k < 10; ++k) {
					System.out.print(" " + r[i][j][k]);
				}
				System.out.println();
			}
		}
	}
}