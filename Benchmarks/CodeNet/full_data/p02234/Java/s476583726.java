import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int[][] M;
	int[][] DP;
	
	int min = Integer.MAX_VALUE;
	
	public void input() {
		n = sc.nextInt();
		M = new int[n][2];
		DP = new int[n][n];
		for(int i=0; i<n; i++) {
			M[i][0] = sc.nextInt(); //r（行数）
			M[i][1] = sc.nextInt(); //c（列数）
		}
	}
	
	public int matrix(int i, int j) {
		if(i == j) return 0;
		if(DP[i][j] == 0) {
			for(int k=i; k<j; k++) {
				int q = matrix(i,k)+matrix(k+1,j)+(M[i][0]*M[k][1]*M[j][1]);
				min = Math.min(min, q);
			}
			DP[i][j] = min;
		}
		return DP[i][j];
	}
	
	public void output() {
		System.out.println( matrix(0,n-1) );
		
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

