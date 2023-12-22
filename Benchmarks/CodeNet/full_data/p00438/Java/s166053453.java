
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int W=in.nextInt(),H=in.nextInt();
			if(W==0)break;
			
			
			int dp[][]=new int[H][W];
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++)dp[i][j]=1;
			}
			
			int ow=in.nextInt();
			for(int i=0;i<ow;i++) {
				int w=in.nextInt()-1,h=in.nextInt()-1;
				dp[h][w]=-1;
			}
			
			for(int i=1;i<H;i++) {
				for(int j=1;j<W;j++) {
					if(dp[i][j]!=-1 && dp[i-1][j]!=-1 && dp[i][j-1]!=-1) {
						dp[i][j]=dp[i-1][j]+dp[i][j-1];
					}
				}
			}
			
			System.out.println(dp[H-1][W-1]);
		}
		
	}

}

