import java.util.Scanner;

public class Main { // https://atcoder.jp/contests/abc088/tasks/abc088_c
	static int[][] grid;
	static int[] left;
	static int[] top;
	
	static int size = 3;
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		grid = new int[size][size];
		left = new int[size];
		top = new int[size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) grid[i][j] = x.nextInt();
		}
		for (int i = 0; i < size; i++) {
			left[i] = grid[i][0];
			top[i] = grid[0][i];
		}
		
		boolean good = true;
		int curdiff, nowdiff;
		for (int i = 1; i < size; i++) {
			if (!good) break;
			curdiff = grid[i][0] - top[0];
			for (int j = 1; j < size; j++) {
				nowdiff = grid[i][j] - top[j];
				if (nowdiff != curdiff) {
					good = false;
					break;
				}
			}
			
		}
		
		for (int i = 1; i < size; i++) {
			if (!good) break;
			curdiff = grid[0][i] - left[0];
			for (int j = 1; j < size; j++) {
				nowdiff = grid[j][i] - left[j];
				if (nowdiff != curdiff) {
					good = false;
					break;
				}
			}
			
		}
		
	//	System.out.println(good);
		if (good) System.out.println("Yes");
		else System.out.println("No");
	}
}
