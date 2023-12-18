import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		int sum= 0;
		for(int i =0; i<n; i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		long[][][] dp=new long[n+1][n+1][sum+1];
		
		for(int i = 0; i<n+1; i++){
			for(int j = 0; j<n+1; j++){
				for(int k = 0; k<sum+1; k++){
					
					if(i>=1 && k<a[i-1]){
						dp[i][j][k]=dp[i-1][j][k];
					}else if(j>=1 && i>=1 && k>=a[i-1]){
						dp[i][j][k]=dp[i-1][j][k]+dp[i-1][j-1][k-a[i-1]];
					}else{
						dp[i][j][k]=0;
					}
					if(i==0 && j==0 && k==0){
						dp[0][0][0]=1;
					}
				}
			}
		}
		long ans=0;
		for(int i = 1; i<n+1; i++){
			if(i*q<=sum){
				ans+=dp[n][i][i*q];
			}
		}
		System.out.println(ans);
	}
}