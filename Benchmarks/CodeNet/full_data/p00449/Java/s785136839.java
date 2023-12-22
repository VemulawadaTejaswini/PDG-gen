import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[][] cost = new int[n+1][n+1];
			for(int i=1;i<=n;i++){
				Arrays.fill(cost[i], Integer.MAX_VALUE);
				cost[i][i] = 0;
			}
			
			int p, a, b ,c;
			for(int z=0;z<m;z++){
				p = sc.nextInt();
				if(p==0){
					a = sc.nextInt();
					b = sc.nextInt();
					if(cost[a][b]==Integer.MAX_VALUE) System.out.println(-1);
					else System.out.println(cost[a][b]);
				}else{
					a = sc.nextInt();
					b = sc.nextInt();
					c = sc.nextInt();
					cost[a][b] = c;
					cost[b][a] = c;
					for(int i=1;i<=n;i++){
						for(int j=1;j<=n;j++){
							for(int k=1;k<=n;k++){
								if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
									cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
								}
							}
						}
					}
				}
			}
		}	
	}	
}