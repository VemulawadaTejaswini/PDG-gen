import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] H=new int[N];
		for(int i=0; i<N; i++) {
			H[i]=sc.nextInt();
		}
		int[] dp=new int[N];
		Arrays.fill(dp, 0);
		if(N==1) {
			p(0);
			System.exit(0);
		}
		else{
			for(int i=N-1; i>=1; i--) {
				if(H[i-1]>=H[i]) {
					dp[i-1]=dp[i]+1;
				}
				else {
					dp[i-1]=0;
				}
			}
			int max=0;
			for(int i=0; i<N; i++) {
				max=Math.max(max, dp[i]);
			}
			p(max);
		}

	}
	public static void p(Object o) {
		System.out.println(o);
	}
}