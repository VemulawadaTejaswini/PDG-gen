import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] vectorA = new int[n][m];
		int[][] vectorB = new int[m][l];
		long[][] vectorC = new long[n][l];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				int elm =scan.nextInt();
				vectorA[i][j] = elm;
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				int elm = scan.nextInt();
				vectorB[i][j] = elm;
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				long ans = 0;
				for(int k = 0; k < m; k++){
					ans += (long) vectorA[i][k] * (long) vectorB[k][j];
					
				}
				vectorC[i][j] = ans;
				System.out.printf(j != l - 1? "%d " : "%d\n", vectorC[i][j]);
			}
		}
	}
}