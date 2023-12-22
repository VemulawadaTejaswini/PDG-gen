public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long k=sc.nextLong();
		long d=sc.nextLong();
		long[] dp=new long[k];
		dp[0]=Math.min(Math.abs(x-d),Math.abs(x+d));
		for(long i=1;i<k;i++){
		    dp[i]=Math.min(Math.abs(dp[i-1]-d),Math.abs(dp[i-1]+d));
		}
		System.out.println(dp[k-1]);
	}
}