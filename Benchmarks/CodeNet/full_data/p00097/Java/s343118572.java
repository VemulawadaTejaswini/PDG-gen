package AOJ0097;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true){
			int n=in.nextInt(),S=in.nextInt();
			if(n==0)break;
			int dp[][][]=new int[2][S+1][S+1];
			for(int i=0;i<2;i++){
				for(int j=0;j<=S;j++){
					for(int k=0;k<=S;k++)dp[i][j][k]=-1;
				}
			}

			dp[0][0][0]=0; dp[1][0][0]=1;
			for(int i=0;i<S;i++){
				for(int j=0;j<=S;j++){
					if(j+(i+1)>S)break;
					else if(dp[0][i][j]>=0){
						dp[0][i+1][j]=Math.max(dp[0][i+1][j],dp[0][i][j]);
						dp[1][i+1][j]=Math.max(dp[1][i+1][j],dp[1][i][j]);

						dp[0][i+1][j+(i+1)]=Math.max(dp[0][i+1][j+(i+1)],dp[0][i][j]+1);
						dp[1][i+1][j+(i+1)]=Math.max(dp[1][i+1][j+(i+1)],dp[1][i][j]+1);
					}
				}
			}

			int cnt=0;
			for(int j=0;j<=S;j++){
				if(dp[0][j][S]==n)cnt++;
				if(dp[1][j][S]==n)cnt++;
			}


			System.out.println(cnt);
		}
	}

}

