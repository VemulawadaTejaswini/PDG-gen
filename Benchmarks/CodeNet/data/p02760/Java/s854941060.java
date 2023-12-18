package abc157;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] A = new int[3][3];
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				A[i][j] = sc.nextInt();
		
		boolean[][] bingo = new boolean[3][3];
		int N = sc.nextInt();
		for(int k=0; k<N; k++) {
			int b = sc.nextInt();
			for(int i=0; i<3; i++)
				for(int j=0; j<3; j++)
					if(A[i][j]==b)
						bingo[i][j] = true;
		}
		
		boolean ok = false;
		for(int i=0; i<3; i++) {
			boolean line = true;
			for(int j=0; j<3; j++) {
				line &= bingo[i][j];
			}
			ok |= line;
		}
		for(int i=0; i<3; i++) {
			boolean line = true;
			for(int j=0; j<3; j++) {
				line &= bingo[j][i];
			}
			ok |= line;
		}
		{
			boolean line = true;
			for(int i=0; i<3; i++) {
				line &= bingo[i][i];
			}
			ok |= line;
		}
		{
			boolean line = true;
			for(int i=0; i<3; i++) {
				line &= bingo[i][2-i];
			}
			ok |= line;
		}
		System.out.println(ok ? "Yes" : "No");

		sc.close();
	}
}
