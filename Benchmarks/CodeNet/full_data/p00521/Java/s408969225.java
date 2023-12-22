import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] map = new char[m][];
		for(int i = 0; i < m; i++ ) {
			map[i] = sc.next().toCharArray();
		}
		int[][] Map = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == 'O') {
					Map[i][j] = 1;
				}
				else if(map[i][j] == 'I') {
					Map[i][j] = 2;
				}
			}
		}
		String A = sc.next();
		String B = sc.next();
		char AA1 = A.charAt(0);
		char AA2 = A.charAt(1);
		char BB1 = B.charAt(0);
		char BB2 = B.charAt(1);
		int A1 = 0;
		int A2 = 0;
		int B1 = 0;
		int B2 = 0;
		if(AA1 == 'O') {
			A1 = 1;
		}
		else if(AA1 == 'I') {
			A1 = 2;
		}
		if(AA2 == 'O') {
			A2 = 1;
		}
		else if(AA2 == 'I') {
			A2 = 2;
		}
		if(BB1 == 'O') {
			B1 = 1;
		}
		else if(BB1 == 'I') {
			B1 = 2;
		}
		if(BB2 == 'O') {
			B2 = 1;
		}
		else if(BB2 == 'I') {
			B2 = 2;
		}
		
		int ck = 0;
		int[][][] count = new int[m][n][3];
		for(int i = 0; i < m-1; i++) {
			for(int j = 0; j < n-1; j++) {
				int a1 = Map[i][j];
				int a2 = Map[i][j+1];
				int b1 = Map[i+1][j];
				int b2 = Map[i+1][j+1];
				int cunt = 0;
				if(a1 == A1) cunt++;
				if(a2 == A2) cunt++;
				if(b1 == B1) cunt++;
				if(b2 == B2) cunt++;
				if(cunt == 4) {
					for(int k = 0; k < 3; k++) {
						count[i][j][k]--;
						count[i][j+1][k]--;
						count[i+1][j][k]--;
						count[i+1][j+1][k]--;
					}
					count[i][j][a1]++;
					count[i][j+1][a2]++;
					count[i+1][j][b1]++;
					count[i+1][j+1][b2]++;
					ck++;
				}
				else if(cunt == 3) {
					if(a1 != A1) {
						count[i][j][A1]++;
					}
					else if(a2 != A2) {
						count[i][j+1][A2]++;
					}
					else if(b1 != B1) {
						count[i+1][j][B1]++;
					}
					else {
						count[i+1][j+1][B2]++;
					}
				}
			}
		}
		int max = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < 3; k++) {
				max = Math.max(count[i][j][k], max);
				}
			}
		}
		System.out.println(ck + max);
		
		
	}
}