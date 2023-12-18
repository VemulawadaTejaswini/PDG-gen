import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int[][] grid = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = grid[0][(i + 2) % 3] - grid[0][(i + 1) % 3];
			b[i] = grid[(i + 2) % 3][0] - grid[(i + 1) % 3][0];
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i] != grid[j][(i + 2) % 3] - grid[j][(i + 1) % 3]
				|| b[i] != grid[(i + 2) % 3][j] - grid[(i + 1) % 3][j]) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}