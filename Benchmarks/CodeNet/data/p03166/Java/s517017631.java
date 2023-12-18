/*package whatever //do not write package name here */

import java.util.*;

public class Main {
    static LinkedList<Integer>[] adj;
    static int[] dist;
    static boolean[] marked;
    static int[] indeg;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		adj = new LinkedList[n];
		dist = new int[n];
		indeg = new int[n];
		marked = new boolean[n];
		for(int i=0;i<n;i++){
		    adj[i] = new LinkedList<>();
		}
		for(int i=0;i<m;i++){
		    int u = sc.nextInt()-1, v = sc.nextInt()-1;
		    adj[u].add(v);
		    indeg[v]++;
		}
		for(int i=0;i<n;i++){
		    if(!marked[i] && indeg[i]==0){
		        dfs(i);
		    }
		}
		int max = 0;
		for(int i=0;i<n;i++){
		    max = Math.max(max, dist[i]);
		}
		System.out.println(max);
	}
	static void dfs(int u){
	    marked[u] = true;
	    for(int i : adj[u]){
	        dist[i] = Math.max(dist[i], dist[u]+1);
	        indeg[i]--;
	        if(indeg[i]==0) dfs(i);
	    }
	}
}