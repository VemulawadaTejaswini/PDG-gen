import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] cost = new int[n+1];
			for(int i=0;i<n+1;i++) cost[i] = Integer.MAX_VALUE;
			
			int[] a = new int[m+1];
			int[] b = new int[m+1];
			int[] c = new int[m+1];
			int[] d = new int[m+1];	
			
			ArrayDeque<Integer> que = new ArrayDeque<Integer>();

			for(int i=0;i<m+1;i++){
				String[] s = sc.next().split(",");
				a[i] = Integer.valueOf(s[0]);
				b[i] = Integer.valueOf(s[1]);
				c[i] = Integer.valueOf(s[2]);
				d[i] = Integer.valueOf(s[3]);
			}
			int ans = c[m] - d[m];
			int z, p;
			int q = a[m];
			int r = b[m];
			
			for(int k=0;k<2;k++){
				if(k==1){
					q = b[m];
					r = a[m];
				}
				
				que.offer(q);
				cost[q] = 0;
				while(true){
					z = que.size();
					if(z==0) break;
					for(int i=0;i<z;i++){
						p = que.poll();
						for(int j=0;j<m;j++){
							if(a[j]==p && cost[p]+c[j]<cost[b[j]]){
								que.offer(b[j]);
								cost[b[j]] = cost[p]+c[j];
							}
							else if(b[j]==p && cost[p]+d[j]<cost[a[j]]){
								que.offer(a[j]);
								cost[a[j]] = cost[p]+d[j];
							}
						}
					}
				}
				ans -= cost[r];
				
				if(k==0){
					for(int i=0;i<n+1;i++) cost[i] = Integer.MAX_VALUE;
				}else{
					System.out.println(ans);
				}
			}
		}
	}	
}