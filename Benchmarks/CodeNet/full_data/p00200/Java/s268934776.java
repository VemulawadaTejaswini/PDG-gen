import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int cost[];
	static int time[];
	static int edge_c[][];
	static int edge_t[][];
	static int m;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,a,b,k;
		while(true){
			n=sc.nextInt();
			m=sc.nextInt();
			if(n+m==0) break;
			cost=new int[m+1];
			time=new int[m+1];
			edge_c=new int[m+1][m+1];
			edge_t=new int[m+1][m+1];
			
			for(i=0;i<=m;i++){
				Arrays.fill(edge_c[i], 1<<20);
				Arrays.fill(edge_t[i], 1<<20);
			}
			for(i=0;i<n;i++){
				a=sc.nextInt();
				b=sc.nextInt();
				edge_c[a][b]=edge_c[b][a]=sc.nextInt();
				edge_t[a][b]=edge_t[b][a]=sc.nextInt();
			}
			k=sc.nextInt();
			int p,q,r;
			for(i=0;i<k;i++){
				p=sc.nextInt();
				q=sc.nextInt();
				r=sc.nextInt();
				Arrays.fill(cost, 1<<20);
				Arrays.fill(time, 1<<20);
				dijkstra(p);
				if(r==0){
					System.out.println(cost[q]);
				}
				else{
					System.out.println(time[q]);
				}
			}
		}
	}
	static void dijkstra(int start){
		int i,j;
		cost[start]=0;
		time[start]=0;
		for(i=start;i<=2*m;i++){
			for(j=1;j<=m;j++){
				if(edge_c[i%(m+1)][j]!=1<<20){
					cost[i%(m+1)]=Math.min(cost[i%(m+1)],edge_c[i%(m+1)][j]+cost[j]);
					time[i%(m+1)]=Math.min(time[i%(m+1)],edge_t[i%(m+1)][j]+time[j]);
				}
			}
		}
	}
}