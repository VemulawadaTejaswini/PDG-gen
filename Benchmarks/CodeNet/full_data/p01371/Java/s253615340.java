import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				double[][] dist=new double[N+2][N+2];
				double[] dp=new double[1<<N];
				double inf=1e100;

				for(int i=0; i<N; i++){
					for(int j=0; j<=N; j++){
						dist[i][j]=sc.nextInt();
					}
				}
				Arrays.fill(dp, inf);
				dp[0]=0;

				for(int i=0; i<(1<<N); i++){
					for(int j=0; j<=N; j++){
						if((1&i>>j)==1) {
							continue;
						}
						int nexti=i|(1<<j);
						double nextd=dp[i]+dist[j][0];
						dp[nexti]=Math.min(dp[nexti], nextd);
						for(int k=0; k<N; k++) {
							if((1&i>>k)==0) {
								continue;
							}
							dp[nexti]=Math.min(dp[nexti], dp[i]+dist[j][k+1]);
						}
					}
				}
				int all=(1<<N)-1;
				System.out.println(dp[all]);
			}


		}
	}
}
