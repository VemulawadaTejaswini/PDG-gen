import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	ArrayList<Integer>[]path;
	int n,m;
	int[]a;
	int[]b;
	void solve() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		path=new ArrayList[n];
		for(int i=0;i<n;i++) {
			path[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			path[a[i]].add(b[i]);
			path[b[i]].add(a[i]);
		}
		visited=new boolean[n];
		for(int t=0;t<2;t++) {
			for(int i=0;i<n;i++) {
				Arrays.fill(visited, false);
				visited[i]=true;
				dfs(i,i,0);
			}
		}
		System.out.println(max);
	}
	
	int max=0;
	boolean[] visited;
	
	void dfs(int start,int x,int depth) {
		visited[x]=true;
		if(depth==3) {
			int judge=0;
			for(int j=0;j<path[start].size();j++) {
				if(path[start].get(j)==x)judge++;
			}
			if(judge==0) {
				max++;
				path[start].add(x);
				path[x].add(start);
			}
			visited[x]=false;
			return;
		}
		for(int j=0;j<path[x].size();j++) {
			if(!visited[path[x].get(j)])dfs(start, path[x].get(j), depth+1);
		}
		visited[x]=false;
		return;
	}
}