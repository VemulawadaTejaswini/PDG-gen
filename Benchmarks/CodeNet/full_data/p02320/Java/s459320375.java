import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt(),W=in.nextInt();
		int dp[][]=new int[N+1][W+1];
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=W;j++)dp[i][j]=-1;
		}
		dp[0][0]=0;
		
		for(int i=0;i<N;i++) {
			int V=Integer.parseInt(in.next()),C=Integer.parseInt(in.next()),M=Integer.parseInt(in.next());
			for(int j=0;j<=W;j++) {
				if(dp[i][j]>=0) {
					dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]);
					
					for(int m=1;m<=M;m++) {
						if(j+(C*m)>W)break;
						dp[i+1][j+(C*m)]=Math.max(dp[i+1][j+(C*m)], dp[i][j]+(V*m));
					}
				}
			}
		}
		
		int max=0;
		for(int i=0;i<=W;i++) {
			if(dp[N][i]>max)max=dp[N][i];
		}
		System.out.println(max);
	}

}

