import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			int s = sc.nextInt();
			int g = sc.nextInt();
			
			int[][] d = new int[n+1][n+1];
			int[][] c = new int[n+1][n+1];
			for(int i=0;i<m;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				d[x][y] = d[y][x] =  sc.nextInt();
				c[x][y] = c[y][x] =  sc.nextInt();
			}
			
			double[][] dp = new double[31][n+1];
			for(int i=0;i<31;i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
			
			ArrayDeque<Integer> p = new ArrayDeque<Integer>();
			ArrayDeque<Integer> v = new ArrayDeque<Integer>();
			p.offer(s);
			v.offer(0);
			dp[0][s] = 0;
			while(p.size()!=0){
				int q = p.poll();
				int u = v.poll();
				for(int i=1;i<=n;i++){
					if(d[q][i]>0){
						for(int j=-1;j<=1;j++){
							if(0<u+j && u+j<=c[q][i] && dp[u+j][i] > dp[u][q] + (double)d[q][i]/(u+j)){
								dp[u+j][i] = dp[u][q] + (double)d[q][i]/(u+j);
								p.offer(i);
								v.offer(u+j);
							}
						}
					}
				}	
			}
			if(dp[1][g]==Integer.MAX_VALUE) System.out.println("unreachable");
			else System.out.println(dp[1][g]);
		}	
	}	
}