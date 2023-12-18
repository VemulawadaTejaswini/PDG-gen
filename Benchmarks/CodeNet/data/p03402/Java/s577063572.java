import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		String[][] grid = new String[42][100];
		for (int i = 0; i < 21; i++)
			Arrays.fill(grid[i], "#");
		for (int i = 21; i < 42; i++)
			Arrays.fill(grid[i], ".");

		for (int i = 0; i < A - 1; i++)
			grid[i / 25][i * 4] = ".";
		for (int i = 0; i < B - 1; i++)
			grid[i / 25 + 22][i * 4] = "#";

		System.out.println(100 + " " + 100);
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++) {
				if (j == grid[i].length - 1)
					System.out.println(grid[i][j]);
				else
					System.out.print(grid[i][j]);
			}
	}
}