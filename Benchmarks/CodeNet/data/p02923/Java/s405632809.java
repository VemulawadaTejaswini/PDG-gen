import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		
		int dp[] = new int[n];
		
		dp[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			if(a[i]>=a[i+1]) {
				dp[i]+=dp[i+1]+1;
			}
		}
		int max = 0;
		for(int i=0;i<n;i++) {
			max = Math.max(dp[i],max);
		}
		System.out.println(max-1);
		
		
	}
}
