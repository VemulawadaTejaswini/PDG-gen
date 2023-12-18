
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		
		int [][] a = new int [n][2];
		
		for(int i = 0 ; i  < n ;i++) {
			a[i][0] = Integer.parseInt(sc.next());
			a[i][1] = Integer.parseInt(sc.next());
		}
		
		
		int [][]dp1 = new int [n+1][t];
		int [][]dp2 = new int [n+1][t];
		
		for(int i = 0 ; i < n ;i++) {
			int k = n - 1 - i;
			for(int j = t-1 ; j >= 0 ; j--) {
			dp1[i+1][j] = dp1[i][j];
			if(j + a[i][0] < t) {
				dp1[i+1][j+a[i][0]] = Math.max(dp1[i+1][j+a[i][0]], dp1[i][j] + a[i][1]);
			}
			dp2[k][j] = dp2[k+1][j];
			if(j + a[k][0] < t) {
				dp2[k][j+a[k][0]] = Math.max(dp2[k+1][j+a[k][0]], dp2[k+1][j] + a[k][1]);
			}
		}		
	}
		
		int ans = 0;
		
		for(int i = 0 ;i < n ;i++) {
			for(int j = t-1 ; j >= 0 ; j--) {
				int temp = dp1[i][j] + dp2[i+1][t-1-j] + a[i][1];
				ans = Math.max(temp, ans);
				}
			}
		
		System.out.println(ans);
		
	}
	

}
