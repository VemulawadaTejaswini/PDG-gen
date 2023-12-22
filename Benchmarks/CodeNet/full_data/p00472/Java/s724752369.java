
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),m=in.nextInt();
		int dist[]=new int[n];
		
		for(int i=1;i<n;i++) {
			dist[i]=in.nextInt();
		}
		
		int dp[][][]=new int[2][n+1][n];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n;j++) {
				if(i+j<=n)dp[0][i][j]=dp[0][i][j-1]+dist[i+j-1];
			}
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=1;j<n;j++) {
				if(i-j>0)dp[1][i][j]=dp[1][i][j-1]+dist[i-j];
			}
		}
		
		int p[]=new int[m+1],L=0;
		p[0]=1;
		
		for(int i=1;i<=m;i++) {
			int acl=in.nextInt();
			if(acl<0)L+=dp[1][p[i-1]][Math.abs(acl)];
			else L+=dp[0][p[i-1]][acl];
			p[i]=p[i-1]+acl;
		}
		
		System.out.println(L%100000);
		
	}

}


