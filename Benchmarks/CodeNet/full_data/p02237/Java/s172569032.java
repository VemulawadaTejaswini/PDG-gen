package ALDS1_11_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int[][] mat = new int[n][n];
			for(int i=0; i<n; i++) {
				int from = scan.nextInt();
				int toNum = scan.nextInt();
				for(int j=0; j<toNum; j++) {
					int to = scan.nextInt();
					mat[from-1][to-1] = 1;
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(mat[i][j]);
					if(j < n-1) System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}

