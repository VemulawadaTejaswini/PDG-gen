import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),f[]=new int[n],dp[]=new int[n];
		Arrays.setAll(f,i->s.nextInt());
		dp[1]=Math.abs(f[1]-f[0]);
		for(int i=2;i<n;++i)
			dp[i]=Math.min(
					dp[i-1]+Math.abs(f[i]-f[i-1]),
					dp[i-2]+Math.abs(f[i]-f[i-2]));
		System.out.println(dp[n-1]);
	}
}
