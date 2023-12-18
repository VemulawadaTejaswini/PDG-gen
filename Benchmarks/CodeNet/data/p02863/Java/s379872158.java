import java.util.*;

class Main{
	public static void main(String[] $) {
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),t=s.nextInt();
		int[]dp=new int[t+1];
		for(int q=0;q<n;++q) {
			int l=s.nextInt(),v=s.nextInt();
			for(int i=t-1;i>=0;--i) {
				int j=Math.min(t,i+l);
				dp[j]=Math.max(dp[j],dp[i]+v);
			}
		}
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}
}
