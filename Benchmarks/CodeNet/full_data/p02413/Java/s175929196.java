import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("");
		int r, c;
		r = scan.nextInt();
		c = scan.nextInt();
		int[][] ar = new int[r+1][c+1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ar[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ar[i][c] += ar[i][j];
				ar[r][j] += ar[i][j];
			}
		}
		for (int i : ar[r]) {
			ar[r][c] += i;
		}
		ar[r][c] /= 2;
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				if (j != c) {
					System.out.print(ar[i][j] + " ");
				}else {
					System.out.println(ar[i][j]);
				}
			}
		}
	}
}