import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r  = sc.nextInt();
		int c  = sc.nextInt();
		int[][] table = new int[r+1][c+1];
		for(int i = 0;i<r;i++){
			for(int j=0;j<c;j++){
				table[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<r;i++){
			for(int j=0; j<c;j++){
				table[i][c] += table[i][j];
				table[r][j] += table[i][j];
				table[r][c] += table[i][j];
			}
		}

		for(int i = 0; i<=r; i++){
			System.out.print(table[i][0]);
			for(int j=1;j<=c;j++){
				System.out.print(" "+table[i][j]);
		}
		System.out.println();
	}
}
}
