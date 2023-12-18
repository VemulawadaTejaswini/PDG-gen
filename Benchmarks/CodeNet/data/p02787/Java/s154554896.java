import java.util.Scanner;
 

public class Main {
 
	
	public static int get(int a[],int index,int sum,int b[],int dp[][]) {
		
		if(index==a.length) {
			return Integer.MAX_VALUE/4;
		}
		if(sum<=0) {
			return 0;
		}
		if(dp[index][sum]!=-1) {
			return dp[index][sum];
		}
		dp[index][sum] = Math.min(get(a,index+1,sum,b,dp),get(a,index,sum-a[index],b,dp)+b[index]);
		return dp[index][sum];
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int n = s.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
			b[i] = s.nextInt();
		}
		
		int dp[][] = new int[n][h+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=h;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(get(a,0,h,b,dp));
		
	}
}