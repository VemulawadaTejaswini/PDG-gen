import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		long[]dp=new long[100001];
		Arrays.fill(dp,1,100001,Long.MAX_VALUE);
		for(int q=0;q<n;++q) {
			int w=s.nextInt(),v=s.nextInt();
			for(int i=100000;i>=v;--i)
				if(dp[i-v]!=Long.MAX_VALUE)
					dp[i]=Math.min(dp[i],dp[i-v]+w);
		}
		for(int i=100000;i>=0;--i) {
			if(dp[i]<=m) {
				System.out.println(i);
				return;
			}
		}
	}
}
