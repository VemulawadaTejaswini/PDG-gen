
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int n=in.nextInt(),k=in.nextInt(),max=0;
			if(n==0)break;
			
			boolean CA[]=new boolean[n+1];
			int dp[]=new int[n+2];
			for(int i=0;i<k;i++) {
				int p=in.nextInt();
				CA[p]=true;
				if(p!=0)dp[p]=1;
			}
			
			for(int i=1;i<=n;i++) {
				if(dp[i]>0 && dp[i-1]>0) {
					dp[i]+=dp[i-1];
					max=Math.max(max, dp[i]);
				}
			}
			
			if(CA[0]) {
				for(int i=1;i<=n;i++) {
					if(dp[i]==0 && (CA[i-1] || CA[i+1])) {
						int L=dp[i-1],j=i+1,R=0;
						while(true) {
							if(dp[j]==0)break;
							R=dp[j];
							j++;
						}
						dp[i]=L+R+1;
					}
					max=Math.max(max, dp[i]);
				}
			}

			System.out.println(max);
		}
	}

}

