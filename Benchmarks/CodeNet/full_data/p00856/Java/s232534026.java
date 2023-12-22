import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), t=sc.nextInt(), l=sc.nextInt(), b=sc.nextInt();
			if(n == 0) break;

			int[] map = new int[n+1];
			double[][] dp = new double[n+1][t+1];

			for(double[] i : dp) Arrays.fill(i,-1);
			while(l-- > 0) map[sc.nextInt()] = 'l';
			while(b-- > 0) map[sc.nextInt()] = 'b';

			System.out.printf("%5f\n",solve(map,0,t,dp));
		}
	}

	public static double solve(int[] map,int n,int t,double[][] dp){
		if(n == map.length - 1 && t >= 0) return 1;
		if(t <= 0) return 0;
		if(dp[n][t] != -1) return dp[n][t];

		double sum = 0;
		for(int i=1;i<=6;i++){
			int next = n+i;
			if(next >= map.length){
				next = map.length - next % map.length - 2;
			}
			switch(map[next]){
			case 'l':
				sum += solve(map,next,t-2,dp);
				break;
			case 'b':
				sum += solve(map,0,t-1,dp);
				break;
			default:
				sum += solve(map,next,t-1,dp);
				break;
			}
		}
		return (dp[n][t]=sum/6);
	}
}