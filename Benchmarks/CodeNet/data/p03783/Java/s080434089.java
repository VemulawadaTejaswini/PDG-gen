import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] l = new int[N+1];
		int[] a = new int[N+1];
		l[0] = 0;
		a[0] = 1000;
		for(int i=0; i<N; i++) {
			l[i+1] = sc.nextInt();
			a[i+1] = sc.nextInt()-l[i+1];
		}

		int[][] dp = new int[N+1][1000];
		for(int i=0; i<N; i++)
			Arrays.fill(dp[i+1], Integer.MAX_VALUE);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<1000; j++) {
				for(int k=0; k<1000; k++) {
					if(k<=j+a[i+1] && j<=k+a[i])
						dp[i+1][j] = Math.min(dp[i+1][j], dp[i][k] + Math.abs(j-l[i+1]));
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0; i<1000; i++)
			min = Math.min(min, dp[N][i]);
		
		System.out.println(min);
		sc.close();
	}
}
