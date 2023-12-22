
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		long[][] dp=new long[n+1][21];
		int[]a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=cin.nextInt();
		}
		dp[0][a[0]]=1;
		for(int i=1;i<n-1;i++){
			for(int j=0;j<21;j++){
				if(j+a[i]<21&&dp[i-1][j+a[i]]!=-1){
					dp[i][j]+=dp[i-1][j+a[i]];
				}
				if(j-a[i]>=0&&dp[i-1][j-a[i]]!=-1){
					dp[i][j]+=dp[i-1][j-a[i]];
				}
			}
		}
		for(int j=0;j<21;j++){
//			System.out.printf("%5d",j);
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<21;j++){
//				System.out.printf("%5d",dp[i][j]);
			}
//			System.out.println();
		}
		System.out.println(dp[n-2][a[n-1]]);
	}

}