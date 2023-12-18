import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		String[][] grid = new String[40][100];
		for (int i = 0; i < 20; i++)
			Arrays.fill(grid[i], "#");
		for (int i = 20; i < 40; i++)
			Arrays.fill(grid[i], ".");

		for (int i = 0; i < A - 1; i++) {
			grid[i / 50 * 2][i % 50 * 2] = ".";
		}
		for (int i = 0; i < B - 1; i++) {
			grid[i / 50 * 2 + 21][i % 50 * 2] = "#";
		}

		System.out.println(40 + " " + 100);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++)
				System.out.print(grid[i][j]);
			System.out.println();
		}
	}
}