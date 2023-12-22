import java.util.*;
public class Main{

	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		IX:while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			boolean[][] a = new boolean[n][n];
			for(int i = 0; i < n; i++) {
				a[i][i] = true;
			}
			int[][] b = new int[n][];
			for(int i = 0; i < n; i++) {
				int l = sc.nextInt();
				b[i] = new int[l];
				for(int j = 0; j < l ; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 1; i <= 30; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 0; k < b[j].length; k++) {
						if(b[j][k] == i) {
							for(int l = 0; l < n; l++) {
								for(int m = 0; m < b[l].length; m++) {
									if(b[l][m] == i) {
										for(int N = 0; N < n; N++) {
											if(a[j][N]) {
												a[l][N] = true;
											}
											if(a[l][N]) {
												a[j][N] = true;
											}
										}
									}
								}
							}
						}
					}
					
				}
				
				IN:for(int j = 0; j < n; j++) {
					for(int k = 0; k < n; k++) {
						if(!a[j][k])continue IN;
					}
					System.out.println(i);
					continue IX;
				}
			}
			System.out.println(-1);
		}
	}
}