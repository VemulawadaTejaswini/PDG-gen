import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0&&h==0)break;
			int n = sc.nextInt();
			int x[] = new int[n];
			int y[] = new int[n];
			for(int i=0;i<n;i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
			}
			//今いる場所を記録
			int dp[][]=new int[w+1][h+1];
			for(int i=2;i<=w;i++)dp[i][1]=1;
			for(int i=2;i<=h;i++)dp[1][i]=1;
			dp[1][1]=0;
			for(int i=2;i<=w;i++){
				for(int j=2;j<=h;j++){
					dp[i][j]=dp[i][j-1]+dp[i-1][j];
					//System.out.println(dp[i][j]+" "+dp[i][j-1]+" "+dp[i-1][j]);
					for(int k=0;k<n;k++)
						if(i==x[k]&&j==y[k])
							dp[i][j]=0;
				}
			}
			System.out.println(dp[w][h]);
		}
	}
}