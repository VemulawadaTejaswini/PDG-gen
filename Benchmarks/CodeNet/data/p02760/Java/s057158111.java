import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int[][] grid = new int[3][3];
		boolean[][] vis = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = input.nextInt();
			}
		}
		int N = input.nextInt();
		boolean Bingo = false;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			for (int r = 0; r < 3; r++) {
				for (int c = 0; c < 3; c++) {
					if (grid[r][c]==x) {
						vis[r][c]=true;
						if (Row(vis,r)||Col(vis,c)||Diag(vis)||Diag2(vis)) {
							Bingo=true;
							break;
						}
					}
				}
				if (Bingo) break;
			}
			if (Bingo) break;
		}
		System.out.println(Bingo?"Yes":"No");
	}
	public static boolean Row(boolean[][] vis, int r) {
		for (int c = 0; c < 3; c++) {
			if (!vis[r][c]) return false;
		}
		return true;
	}
	public static boolean Col(boolean[][] vis, int c) {
		for (int r = 0; r < 3; r++) {
			if (!vis[r][c]) return false;
		}
		return true;
	}
	public static boolean Diag(boolean[][] vis) {
		for (int i = 0; i < 3; i++) {
			if (!vis[i][i]) return false;
		}
		return true;
	}
	public static boolean Diag2(boolean[][] vis) {
		for (int i = 0; i < 3; i++) {
			if (!vis[i][2-i]) return false;
		}
		return true;
	}
}