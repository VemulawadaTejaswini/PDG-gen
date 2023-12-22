import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int N = sc.nextInt(), M = sc.nextInt();
			if(N == 0 && M == 0) break;

			int[] c = new int[M];
			int[][] dp = new int[N+1][256];

			for(int i=0;i<M;i++) c[i] = sc.nextInt();
			for(int[] tmp : dp) Arrays.fill(tmp,Integer.MAX_VALUE);

			dp[0][128] = 0;

			for(int n=1;n<=N;n++){
				int x = sc.nextInt();
				for(int y=0;y<256;y++){
					for(int k=0;k<M;k++){
						int ny = y + c[k];
						if(255 < ny) ny = 255;
						else if(ny < 0) ny = 0;
						int cost = (ny - x) * (ny - x);
						int sum = dp[n-1][y] == Integer.MAX_VALUE ? Integer.MAX_VALUE : dp[n-1][y] + cost;
						dp[n][ny] = Math.min(dp[n][ny], sum);
					}
				}
			}

			int ans = Integer.MAX_VALUE;
			for(int tmp : dp[N]) ans = Math.min(ans,tmp);

			System.out.println(ans);
		}
	}
}