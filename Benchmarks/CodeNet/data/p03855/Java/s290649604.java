import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int L;
	static int[][] road;
	static int[][] rail;
	static boolean[] visited;
	static boolean[] ar;
	static boolean[] br;

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		L=sc.nextInt();
		road=new int[N+1][N+1];
		rail=new int[N+1][N+1];
		visited=new boolean[N+1];
		ar=new boolean[N+1];
		br=new boolean[N+1];
		for(int i=0;i<K;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			road[a][b]=1;
			road[b][a]=1;
		}
		for(int i=0;i<L;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			rail[a][b]=1;
			rail[b][a]=1;
		}
		for(int i=1;i<=N;i++){
			int count=0;
			dfs(i,road,ar);
			Arrays.fill(visited, false);
			dfs(i,rail,br);
			Arrays.fill(visited, false);
			
			for(int j=1;j<=N;j++){
				if(ar[j] && br[j])count++;
			}
			System.out.println(count);
			Arrays.fill(ar, false);
			Arrays.fill(br,false);
		}
	}
	static void dfs(int x,int[][] path,boolean[] cr){
		visited[x]=true;
		cr[x]=true;
		
		for(int i=1;i<=N;i++){
			if(path[x][i]==1 && !visited[i]){
				cr[i]=cr[x];
				dfs(i,path,cr);
			}
		}
		return;
	}
}
