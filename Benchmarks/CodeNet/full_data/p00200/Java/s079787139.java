import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int cost[];
	static int time[];
	static int edge_c[][];
	static int edge_t[][];
	static boolean use[][];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,a,b,k,m;
		while(true){
			n=sc.nextInt();
			m=sc.nextInt();
			if(n+m==0) break;
			cost=new int[m+1];
			time=new int[m+1];
			edge_c=new int[m+1][m+1];
			edge_t=new int[m+1][m+1];
			use=new boolean[2][m+1];

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
				Arrays.fill(use[0], false);//cost_use
				Arrays.fill(use[1], false);
				dijkstra(p,m,r);
				if(r==0){
					System.out.println(cost[q]);
				}
				else{
					System.out.println(time[q]);
				}
			}
		}
	}
	static void dijkstra(int start,int m,int r){
		int min;
		cost[start]=0;
		time[start]=0;
		if(r==0){
			while(true){
				min=-1;
				for(int i=1;i<=m;i++){
					if(!use[0][i]){
						if(min==-1 || cost[i]<cost[min]) min=i;
					}
				}
				if(min==-1) break;
				use[0][min]=true;
				for(int i=1;i<=m;i++){
					cost[i]=Math.min(cost[i], cost[min]+edge_c[min][i]);
				}

			}
		}
		else{
			while(true){
				min=-1;
				for(int i=1;i<=m;i++){
					if(!use[1][i]){
						if(min==-1 || time[i]<time[min]) min=i;
					}
				}
				if(min==-1) break;
				use[1][min]=true;
				for(int i=1;i<=m;i++){
					time[i]=Math.min(time[i], time[min]+edge_t[min][i]);
				}
			}
		}
	}
}