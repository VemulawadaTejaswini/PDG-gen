import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] cost = new int[m+1];
			int[] a = new int[n];
			int[] b = new int[n];
			int[][] c = new int[n][2];	
			
			ArrayDeque<Integer> que = new ArrayDeque<Integer>();

			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i][0] = sc.nextInt();
				c[i][1] = sc.nextInt();
			}

			int k = sc.nextInt();
			for(int v=0;v<k;v++){
				int s = sc.nextInt();
				int g = sc.nextInt();
				int t = sc.nextInt();
				int z, p;
				
				for(int i=0;i<m+1;i++) cost[i] = Integer.MAX_VALUE;
				que.offer(s);
				cost[s] = 0;
				while(true){
					z = que.size();
					if(z==0) break;
					for(int i=0;i<z;i++){
						p = que.poll();
						for(int j=0;j<n;j++){
							if(a[j]==p && cost[p]+c[j][t]<cost[b[j]]){
								que.offer(b[j]);
								cost[b[j]] = cost[p]+c[j][t];
							}
							else if(b[j]==p && cost[p]+c[j][t]<cost[a[j]]){
								que.offer(a[j]);
								cost[a[j]] = cost[p]+c[j][t];
							}
						}
					}
				}
				System.out.println(cost[g]);
			}
		}
	}	
}