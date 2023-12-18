import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[][] path;
	static boolean[] visited;
	static int edge1;
	static int edge2;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		path=new int[N+1][N+1];
		for(int i=0;i<M;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			path[a][b]=1;
			path[b][a]=1;
		}
		visited=new boolean[N+1];
		
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				if(path[i][j]==1){
					visited[i]=visited[j]=true;
					edge1=i;
					edge2=j;
					
					solve(edge1);
					if(check(edge1)){
						System.out.println(pointNum());
						getRoute(edge1);
						return;
					}
					solve(edge2);
					if(check(edge2)){
						System.out.println(pointNum());
						getRoute(edge2);
						return;
					}
				}
				Arrays.fill(visited, false);
				
			}
		}
	}
	//辿った頂点の数を返す
	static int pointNum(){
		int pn=0;
		for(int i=1;i<=N;i++){
			if(visited[i])pn++;
		}
		return pn;
	}
	//経路を書き出す
	static void getRoute(int e){
		for(int i=1;i<=N;i++){
			if(path[e][i]==1 && visited[i]){
				System.out.print(i+" ");
				visited[i]=false;
				getRoute(i);
			}
		}
	}
	//辺を広げる
	static void solve(int edgex){
		for(int i=1;i<=N;i++){
			if(path[edgex][i]==1 && !visited[i]){
				int Edge=i;
				visited[i]=true;
				if(check(Edge))return;
				solve(Edge);
			}
		}
	}
	//条件を満たすか調べる
	static boolean check(int edge){
		int countPath=0;
		int countVisited=0;
		for(int i=1;i<=N;i++){
			if(path[edge][i]==1)countPath++;
		}
		for(int i=1;i<=N;i++){
			if(visited[i])countVisited++;
		}
		if(countPath==countVisited-1)return true;
		else return false;
	}
}