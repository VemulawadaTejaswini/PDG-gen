import java.util.*;
public class Main {
	static long dp[][][]=new long[3002][3002][2];
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		long sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
			sum+=arr[i];
		}
		long ans=helper(0,n-1,0,arr);
		System.out.println(2*ans-sum);
	}
	public static long helper(int i,int j,int turn,long[] arr){
		if(i>j){
			return 0;
		}
		if(dp[i][j][turn]!=0){
			return dp[i][j][turn];
		}
		if(turn==0){
			return dp[i][j][turn]=Math.max(arr[i]+helper(i+1,j,1,arr),arr[j]+helper(i,j-1,1,arr));
		}
		else{
			return dp[i][j][turn]=Math.min(helper(i+1,j,0,arr),helper(i,j-1,0,arr));
		}
	}
}
