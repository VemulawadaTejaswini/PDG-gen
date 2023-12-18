import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int w=scn.nextInt();
		long[][]dp=new long[n+1][w+1];
		char[][] ip=new char[n][w];
		
		for(int i=0;i<n;i++) {
			String a=scn.next();
			char[] arr=a.toCharArray();
			for(int j=0;j<w;j++) {
				ip[i][j]=arr[j];
				
			}
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=w;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
					continue;
				}
				if(i==1&&j==1) {
					dp[i][j]=1;
					continue;
				}
				if(ip[i-1][j-1]=='#') {
					dp[i][j]=0;
					continue;
					
				}
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
				
					
			}
			
		}
		long m = 1000000007;
		System.out.println((dp[n][w])%m);
		
	}
	
	

}
