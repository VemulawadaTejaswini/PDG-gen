import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r, c;
		r = in.nextInt();
		c = in.nextInt();
		int table[][] = new int[r+1][c+1];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				table[i][j] = in.nextInt();
			}
		}
		int[] colSum = new int[c+1];
		for(int i=0;i<r;i++) {
			int rowSum = 0;
			for(int j=0;j<=c;j++) {
				rowSum += table[i][j];
				if(j == c) {
					table[i][j] = rowSum;
				}
				colSum[j] += table[i][j];
			}
		}
		for(int i=0;i<=c;i++) {
			table[r][i] = colSum[i];
		}

		for(int i=0;i<=r;i++) {
			for(int j=0;j<=c;j++) {
				System.out.print(String.format("%d%s", table[i][j], (j == c) ? "": " "));
			}
			System.out.println("");
		}
	}
}