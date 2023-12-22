import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		while(sc.hasNext()){
			int n=sc.nextInt();
			int a[]=new int [n];
			long dp[][]=new long[n][21];

			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			for(int i=0; i<n; i++){
				Arrays.fill(dp[i], 0);
			}
			dp[0][a[0]]=1;

			for(int i=1; i<n-1; i++){
				for(int j=0; j<=20; j++){
					if(0 <= j-a[i]  && dp[i-1][j-a[i]] > 0){
						dp[i][j]+=dp[i-1][j-a[i]];
					}
					if(j+a[i] <= 20 && dp[i-1][j+a[i]] > 0){
						dp[i][j]+=dp[i-1][j+a[i]];
					}

				}
			}

			System.out.println(dp[n-2][a[n-1]]);
		}
	}

}