import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] cost = new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				cost[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=0;i<n;i++){
			int r = sc.nextInt();
			int u = sc.nextInt();
			for(int j=0;j<u;j++) cost[r][sc.nextInt()] = 1;
		}
		for(int i=0;i<n;i++) cost[i][i] = 0;
			
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++){
					if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
						cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
					}
				}
			}
		}
			
		int p = sc.nextInt();
		for(int i=0;i<p;i++){
			int s = sc.nextInt();
			int d = sc.nextInt();
			int v = sc.nextInt();
			if(cost[s][d]>=v) System.out.println("NA");
			else System.out.println(cost[s][d]+1);
		}	
	}	
}