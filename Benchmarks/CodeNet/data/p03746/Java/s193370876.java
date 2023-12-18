import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
	
public class Main {
	static int N;
	static int M;
	static int[][] path;
	static boolean[] visited;
	static int count;
	static int count1;
	static int count_ans;
	static boolean judge=false;
	static int start;
	static Stack<Integer>s;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		s=new Stack<>();
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
		count_ans=0;
		for(int i=1;i<=N;i++){
			count=0;
			start=i;
			visited[i]=true;
			for(int j=1;j<=N;j++){
				 if(path[start][j]==1)count++;
			 }
			dfs(start);
			
			Arrays.fill(visited, false);
			if(judge)break;
		}
	}
	static void dfs(int i){
		while(!judge){
			s.push(i);
			 count1=0;
			 for(int j=1;j<=N;j++){
				 if(path[start][j]==1 && visited[j])count1++;
			 }
			 if(count1==count){
				 judge=true;
				 System.out.println(count_ans+1);
				 int[]ans=new int[s.size()];
				 for(int k=0;k<s.size();k++)ans[k]=s.pop();
				 System.out.print(i+" ");
				 for(int k=s.size()-1;k>=0;k--)System.out.print(ans[k]+" ");
			 }
			 for(int j=1;j<=N;j++){
				 if(path[i][j]==1 && !visited[j]){
					 visited[j]=true;
					 count_ans++;
					 dfs(j);
				 }
			 }
		count_ans--;
		visited[i]=false;
		return;
		}
	}
}