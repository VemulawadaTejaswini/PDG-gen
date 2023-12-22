import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Ninja Climbing
public class Main{

	static int[] dist;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] b = new int[2*n];
			for(int i=0;i<2*n;i++)b[i]=sc.nextInt();
			dist = new int[2*n];
			Arrays.fill(dist, Integer.MAX_VALUE);
			dist[0] = dist[n] = 0;
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(2*n, new Comparator<Integer>(){
				public int compare(Integer o1, Integer o2) {
					return dist[o1]-dist[02];
				}
			});
			q.add(0);
			q.add(n);
			boolean goal = false;
			while(!q.isEmpty()){
				int u = q.poll();
				if(u==n-1&&b[u]!=2 || u==2*n-1&&b[u]!=2){
					goal = true;
					break;
				}
				if(b[u]==0){
					if(u<n){
						for(int k=0;k<=2;k++){
							int v = u+n+k;
							if(v>=2*n)break;
							if(dist[u]+1<dist[v]){
								dist[v] = dist[u]+1;
								q.remove(v);
								q.add(v);
							}
						}
					}
					else{
						for(int k=0;k<=2;k++){
							int v = u-n+k;
							if(v>=n)break;
							if(dist[u]+1<dist[v]){
								dist[v] = dist[u]+1;
								q.remove(v);
								q.add(v);
							}
						}
					}
				}
				else if(b[u]==1){
					if(b[u+1]==1){
						if(dist[u]<dist[u+1]){
							dist[u+1] = dist[u];
							q.remove(u+1);
							q.add(u+1);
						}
					}
					else{
						if(u<n){
							for(int k=0;k<=2;k++){
								int v = n+u+k;
								if(v>=2*n)break;
								if(dist[u]+1<dist[v]){
									dist[v] = dist[u]+1;
									q.remove(v);
									q.add(v);
								}
							}
						}
						else{
							for(int k=0;k<=2;k++){
								int v = u-n+k;
								if(v>=n)break;
								if(dist[u]+1<dist[v]){
									dist[v] = dist[u]+1;
									q.remove(v);
									q.add(v);
								}
							}
						}
					}
				}
				else{
					if(dist[u]<dist[u-1]){
						dist[u-1]=dist[u];
						q.remove(u-1);
						q.add(u-1);
					}
				}
			}
			int ans = Math.min(dist[n-1], dist[2*n-1]);
			System.out.println(!goal?"NA":ans);
		}
	}
}