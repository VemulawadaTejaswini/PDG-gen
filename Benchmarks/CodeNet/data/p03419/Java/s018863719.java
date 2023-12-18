import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long ans = 0;
//		int[] x = new int[m];
//		int[] y = new int[n];
		boolean[][] d = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			for(int r = 0; r < m; r++){
				d[i][r] = true;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int r = 0; r < m; r++) {
				boolean yplus = true;
				boolean yminus = true;
				boolean xminus = true;
				boolean xplus = true;
				if(r-1 < 0) xminus = false;
				if(i-1 < 0) yminus = false;
				if(r+1 > m-1) xplus = false;
				if(i+1 > n-1) yplus = false;
				d[i][r] = !d[i][r];
				if(xminus && yminus) {
					d[i-1][r-1]  =!d[i-1][r-1] ;
					d[i][r-1]  =!d[i][r-1];
					d[i-1][r]  =!d[i-1][r];
				}else if(xminus) {
					d[i][r-1]  =!d[i][r-1];
				}else if(yminus) {
					d[i-1][r]  =!d[i-1][r];
				}
				if(xplus && yplus) {
					d[i+1][r+1]  =!d[i+1][r+1] ;
					d[i][r+1]  =!d[i][r+1];
					d[i+1][r]  =!d[i+1][r];
				}else if(xplus) {
					d[i][r+1]  =!d[i][r+1];
				}else if(yplus) {
					d[i+1][r]  =!d[i+1][r];
				}
				if(yplus && xminus) {
					d[i+1][r-1] =!d[i+1][r-1]; 
				}
				if(xplus && yminus) {
					 d[i-1][r+1] =!d[i-1][r+1] ; 
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int r = 0; r < m; r++) {
				if(!(d[i][r])) ans++;
			}
		}
		System.out.println(ans);
		
	}

}
