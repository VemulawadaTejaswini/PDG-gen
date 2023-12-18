import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		x--;
		y--;
		int[][] d = new int[n][n];

		int k,i,j;
		for(i = 0; i < n; i++) {
			Arrays.fill(d[i], 10000);
		}

		for(i = 0; i < n; i++) {
			d[i][i] = 0;
		}

		for(i = 0; i < n - 1; i++) {
			for(j = 0; j < n - 1; j++) {
				d[i][i + 1] = 1;
				d[i + 1][i] = 1;
			}
		}
		d[x][y] = 1;
		d[y][x] = 1;

		for(k = 0; k < n; k++) {
			for(i = 0; i < n; i++) {
				for(j = 0; j < n; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
		int[] ans = new int[100];

		for(i = 0; i < n - 1; i++) {
			for(j = i + 1; j < n; j++) {
				ans[d[i][j]]++;
			}
		}
		for(k = 1; k <= n - 1; k++)
			System.out.println(ans[k]);
	}
}