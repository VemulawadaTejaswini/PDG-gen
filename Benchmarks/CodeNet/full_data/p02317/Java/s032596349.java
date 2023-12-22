public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[] dp= new long[100010];
		int[] a=new int[100010];
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		dp[0]=1;
		for(int i=0; i<=100000; i++) {
			if(a[i]>=a[i+1]) {
				dp[i+1]=dp[i];
			}
			else	dp[i+1]=dp[i]+1;
		}
		System.out.println(dp[n-1]);
	}
}
