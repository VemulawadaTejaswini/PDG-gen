import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][3];
		for(int i=0;i<n;i++){
			arr[i]=new int[3];
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int dp[]=new int[3];
		dp=arr[0];
		for(int i=1;i<n;i++){
			int m[]=new int[3];
			m[0]=Math.max(arr[i][0]+dp[1], arr[i][0]+dp[2]);
			m[1]=Math.max(arr[i][1]+dp[0],arr[i][1]+dp[2]);
			m[2]=Math.max(arr[i][2]+dp[0], arr[i][2]+dp[1]);
			dp=m;
		}
		System.out.println(Math.max(dp[0], Math.max(dp[1],dp[2])));
	}
}