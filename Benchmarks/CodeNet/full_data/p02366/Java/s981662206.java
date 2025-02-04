import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static int[] parent, prenum, lowest;
	static int timer=0;
	static boolean[] visited;
	static int V;
	static boolean[][] G;
	
	static void dfs(int current, int prev) {
		prenum[current]=lowest[current]=timer;
		timer++;
		visited[current]=true;
		int next=0;
		for(int i=0; i<V; i++) {
			if(G[current][i]) {
				next=i;
				if(!visited[next]) {
					parent[next]=current;
					dfs(next, current);
					lowest[current]=Math.min(lowest[current], lowest[next]);
				}
				else if(next != prev) {
					lowest[current]=Math.min(lowest[current], prenum[next]);
				}
			}
		}

	}

	static void art_point() {
		for(int i=0; i<V; i++) {
			visited[i]=false;
		}
		timer=1;
		dfs(0, -1);
//		for(int i=0; i<V; i++) {
//			System.out.println("prenum["+i+"]="+prenum[i]+" lowest["+i+"]="+lowest[i]);
//		}
		
		Set<Integer> set=new HashSet<>();
		int np=0;
		for(int i=1; i<V; i++) {
			int p=parent[i];
			if(p==0) {
				np++;
			}
			else if(prenum[p]<=lowest[i]) {
				set.add(p);
			}
		}
		if(np>1) {
			set.add(0);
		}
		Integer[] ans=set.toArray(new Integer[0]);
		
		for(int i=0; i<set.size(); i++) {
			System.out.println(ans[i]);
		}
		
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			V=sc.nextInt();
			int E=sc.nextInt();
			parent=new int[V];
			prenum=new int[V];
			lowest=new int[V];
			visited=new boolean[V];
			G=new boolean[V][V];
			for(int i=0; i<E; i++) {
				int s=sc.nextInt();
				int t=sc.nextInt();
				G[s][t]=G[t][s]=true;
			}
			art_point();
			
		}
	}
}
