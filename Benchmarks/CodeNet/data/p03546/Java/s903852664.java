import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int[][] c=new int[10][10];
		int[][] b=new int[h][w];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				c[j][i]=sc.nextInt();
			}
		}
		
		int[] dist=new int[10];
		Arrays.fill(dist, 99999);
		dist[1]=0;
		boolean[] visit=new boolean[10];
		visit[1]=true;
		bfs(c,dist,visit,1);
		
		int score=0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				b[i][j]=sc.nextInt();
				if(b[i][j]==-1)b[i][j]=1;
				score+=dist[b[i][j]];
			}
		}

		System.out.println(score);
	}
	
	static void bfs(int[][] c,int[] dist, boolean[] visit, int v){
		int min=99999;
		int min_i=-1;
		for(int i=0;i<10;i++){
			if(visit[i])continue;
			dist[i]=Math.min(dist[i], dist[v]+c[v][i]);
			if(c[v][i]<min){
				min=c[v][i];
				min_i=i;
			}
			visit[min_i]=true;
		}
		if(min_i!=-1) bfs(c,dist,visit,min_i);
	}
}
