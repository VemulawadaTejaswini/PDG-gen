import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g1 = sc.nextInt();
			int g2 = sc.nextInt();
			if(n==0 && m==0 && s==0 && g1==0 && g2==0) break;
			
			int[] a = new int[m];
			int[] b = new int[m];
			int[] c = new int[m];
			for(int i=0;i<m;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			int[][] cost = new int[n+1][n+1];
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			
			ArrayDeque<Integer> q = new ArrayDeque<Integer>();
			int p;
			
			for(int i=1;i<=n;i++){
				q.offer(i);
				cost[i][i] = 0;
				while(q.size()!=0){
					p = q.poll();
					for(int j=0;j<m;j++){
						if(a[j]==p && cost[i][a[j]]+c[j]<cost[i][b[j]]){
							cost[i][b[j]] = cost[i][a[j]] + c[j];
							q.offer(b[j]);
						}
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			for(int i=1;i<=n;i++){
				if(cost[i][g1]!=Integer.MAX_VALUE && cost[i][g2]!=Integer.MAX_VALUE){
					min = Math.min(min, cost[s][i] + cost[i][g1] + cost[i][g2]);
				}
			}
			System.out.println(min);
		}	
	}	
}