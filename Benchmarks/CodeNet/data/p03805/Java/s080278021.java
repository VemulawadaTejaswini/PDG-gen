import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[][] path;
	static boolean[] visited;
	static int count;
	static int ans;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		path=new int[N+1][N+1];
		visited=new boolean[N+1];
		Arrays.fill(visited,false);
		for(int i=0;i<M;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			path[a][b]=1;
			path[b][a]=1;
		}
		dfs(1);
		System.out.println(ans);
	}
	public static void dfs(int s){
		visited[s]=true;
		count++;
		for(int i=1;i<N+1;i++){
			if(path[s][i]==1 && !visited[i]){
				dfs(i);
			}
		}
		if(count==N)ans++;
		visited[s]=false;
		count--;
	}

}
