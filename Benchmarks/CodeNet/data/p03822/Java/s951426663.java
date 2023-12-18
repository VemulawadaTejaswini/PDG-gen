import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer>[] tree = new ArrayList[n];
		visited = new int[n];
		for(int i=0;i<n;i++) tree[i] = new ArrayList<>();
		for(int i=1;i<n;i++){
			int u = in.nextInt()-1;
			tree[u].add(i);
			tree[i].add(u);
		}
		dfs(tree, 0, 0);
		System.out.println(max + count);
	}
	static int[] visited;
	static HashSet<Integer> set = new HashSet<>();
	static int max = Integer.MIN_VALUE, count = 0;
	public static void dfs(ArrayList<Integer>[] tree, int node, int depth){
		visited[node] = 1;
		boolean done = true;
		for(int i:tree[node]){
			if(visited[i] != 1){
				done = false;
				dfs(tree, i, depth+1);
			}
		}
		if(done){
			max = Math.max(max, depth);
			if(set.contains(depth)) count++;
			else set.add(depth);
		}
	}
}
