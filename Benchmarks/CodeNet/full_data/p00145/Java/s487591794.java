// だるま落とし類題

import java.util.Scanner;

public class Main{
    
    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		dp[i][j] = Integer.MAX_VALUE;
        	}
        }
        for(int i=0;i<n;i++) {
        	dp[i][i] = 0;
        }
        
        for(int l=1;l<n;l++) {
        	for(int i=0;i+l<n;i++) {
        		int j=i+l;
        		for(int k=i;k<j;k++) {
        			dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + a[i] * b[k] * a[k+1] * b[j]);
        		}
        	}
        }
        
        System.out.println(dp[0][n-1]);
    }

    public static void main(String[] args) {
        new Main().main();
    }



}
