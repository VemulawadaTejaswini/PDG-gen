import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n+5];
		for(int i=1;i<=n;i++)
			a[i]=in.nextInt();
		in.close();
		int[] dp=new int[n+5];
		Arrays.fill(dp,1);
		for(int i=2;i<=n;i++)
			for(int j=1;j<i;j++)
				if(a[j]<a[i])
					dp[i]=Math.max(dp[i],dp[j]+1);
		int ans=0;
		for(int i=1;i<=n;i++)
			ans=Math.max(dp[i],ans);
		System.out.println(ans);
	}

}