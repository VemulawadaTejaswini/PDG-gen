
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] d = new int[c + 1][c + 1];
		int[][] grid = new int[3][c + 1];
		for(int i = 1; i < c + 1; i++) {
			for(int j = 1; j < c + 1; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < c + 1; j++) {
				grid[i][j] = 0;
			}
		}
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				int tmp = sc.nextInt();
				grid[(i + j) % 3][tmp]++;
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1; i < c + 1; i++) {
			for(int j = 1; j < c + 1; j++) {
				if(i != j) {
					for(int k = 1; k < c + 1; k++) {
						if(i != k && j != k) {
							int dif = 0;
							for(int l = 1; l < c + 1; l++) {
								dif += d[l][i] * grid[0][l];
								dif += d[l][j] * grid[1][l];
								dif += d[l][k] * grid[2][l];
							}
							ans = Math.min(ans, dif);
						}
					}
				}
			}
		}
		System.out.println(ans);

	}

}
