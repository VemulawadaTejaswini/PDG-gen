import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				int M=sc.nextInt();
				if(N+M==0) break;
				int[] p=new int[N+1];
				for(int i=0; i<N; i++) {
					p[i]=sc.nextInt();
				}
				
				Arrays.sort(p);
//				for(int i=N; i>0; i--) {
//				System.out.println(p[i]);
//				}
				int ans=0;
				int[] dp=new int[5];
				dp[1]=p[N];
				for(int i=2; i<=4; i++) {
					for(int j=N; j>0; j--) {
						if(dp[i-1]+p[j]<=M && dp[i-1]<dp[i-1]+p[j]) {
							dp[i]=Math.max(dp[i-1]+p[j], dp[i]);
						}
						else {
							dp[i]=dp[i-1];
						}
					}
				}
				System.out.println(dp[4]);
			}


		}
		
	}
}

