import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int[][] inputArray(int size){
		int arr[][] = new int[size][3];
		for(int i=0;i<size;i++){
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
			arr[i][2]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args){
		int[][] arr = inputArray(sc.nextInt());
		int dp[][] = new int[arr.length][3];
		for(int i=0;i<3;i++){
			dp[0][i]=arr[0][i];
		}
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<3;j++){
				if(j==0){
					dp[i][j]=Math.max(dp[i-1][j+1]+arr[i][j],dp[i-1][j+2]+arr[i][j]);
				}else if(j==2){
					dp[i][j]=Math.max(dp[i-1][j-1]+arr[i][j],dp[i-1][j-2]+arr[i][j]);
				}else{
					dp[i][j]=Math.max(dp[i-1][j-1]+arr[i][j],dp[i-1][j+1]+arr[i][j]);
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<3;i++)max=Math.max(max,dp[arr.length-1][i]);
		System.out.println(max);
	}
}