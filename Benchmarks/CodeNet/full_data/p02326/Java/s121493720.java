
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[][] G=new int[n][m];
		int[][] dp=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				G[i][j]=scanner.nextInt();
		}
		int width=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				dp[i][j]=(G[i][j]+1)%2;
				width|=dp[i][j];
			}
		}
		
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				if(G[i][j]==1)
					dp[i][j]=0;
				else{
					dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]))+1;
					width=Math.max(width, dp[i][j]);
				}
				
			}
		}
		System.out.println(width*width);
		
	}

}

