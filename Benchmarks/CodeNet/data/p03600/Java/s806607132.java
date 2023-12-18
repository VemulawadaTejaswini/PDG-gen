import java.util.Scanner;

/**
 * https://abc074.contest.atcoder.jp/tasks/arc083_b
 */
public class Main {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] g = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				g[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();
		
		long[][][] costs = getAllPairsMinimumCost(g, Integer.MAX_VALUE/2);

		long ans = 0;
		for(int y=0; y<N; y++){
			for(int x=0; x<N; x++){
				if(g[y][x]!=costs[0][y][x]){
					ans = -1;
					break;
				}else{
					if(costs[1][y][x]==0){
						ans += g[y][x];
					}
				}
			}
			if(ans==-1) break;
		}
		if(ans>=0) ans = ans/2;
		System.out.println(ans);
		
	}

	static long[][][] getAllPairsMinimumCost(int[][] g, long inf){
		final long[][][] costs = new long[2][g.length][g.length];
		for(int y=0; y<g.length; y++){
			for(int x=0; x<g.length; x++){
				costs[0][y][x] = g[y][x];
			}
		}
		for(int k=0; k<g.length; k++){
			for(int i=0; i<g.length; i++){
				if(costs[0][i][k]==inf) continue;
				for(int j=0; j<g.length; j++){
					if(costs[0][k][j]==inf) continue;
					if(costs[0][i][j]>=costs[0][i][k]+costs[0][k][j]){
						if(i!=k && k!=j) costs[1][i][j]=1; 
					}
					costs[0][i][j] = Math.min(costs[0][i][j], costs[0][i][k]+costs[0][k][j]);
				}
			}
		}
		return costs;
	}
	
}