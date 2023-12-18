/*package whatever //do not write package name here */

import java.util.*;

public class Main {
    static LinkedList<Integer>[] adj;
    static int[] ans;
    static boolean[] marked;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		adj = new LinkedList[n];
		ans = new int[n];
		marked = new boolean[n];
		for(int i=0;i<n;i++){
		    adj[i] = new LinkedList<>();
		}
		for(int i=0;i<m;i++){
		    adj[sc.nextInt()-1].add(sc.nextInt()-1);
		}
		postorder = new ArrayList<>();
		for(int i=0;i<n;i++){
		    if(!marked[i]){
		        dfs(i);
		    }
		}
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MIN_VALUE);
		//System.out.println(postorder);
		dist[postorder.get(postorder.size()-1)] = 0;
		for(int i=postorder.size()-1;i>=0;i--){
		    if(dist[postorder.get(i)]==Integer.MIN_VALUE) continue;
		    for(int j : adj[postorder.get(i)]){
		        dist[j] = Math.max(dist[j], dist[postorder.get(i)]+1);
		    }
		}
		int max = 0;
		for(int i=0;i<n;i++){
		    if(dist[i]==Integer.MIN_VALUE) continue;
		    max = Math.max(max, dist[i]);
		}
		System.out.println(max);
	}
	static ArrayList<Integer> postorder;
	static void dfs(int u){
	    marked[u] = true;
	    for(int i : adj[u]){
	        if(!marked[i]) dfs(i);
	    }
	    postorder.add(u);
	}
}