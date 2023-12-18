import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int hi[]=new int[n];
		for(int i=0;i<n;i++) {
			hi[i]=in.nextInt();
		}
		dp=new long[n+1];
		Arrays.fill(dp, -1);
		int w[]=new int[n];
		for(int i=0;i<n;i++) {
			w[i]=in.nextInt();
		}
		
		long ans=0;
    	for(int i=1;i<=n;i++) {
    		ans=Math.max(ans,call(i,hi,w));
    	}
		System.out.println(ans);
		
	}

	static long dp[];
	static long call(int i,int arr[],int w[]) {
		if(i<1)return 0;
		if(i==1)return w[i-1];
		if(dp[i]!=-1)return dp[i];
		long ans=0;
		
		for(int j=i-1;j>0;j--) {
			if(arr[j-1]<arr[i-1]) {
				ans=Math.max(ans,call(j,arr,w));
				
			}
			
		}
		
		return dp[i]=ans+w[i-1];
		
		
		
		
		
	}

		
	
}