import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D2(sc);
	}
	

	public static void D2(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<Integer,Integer>[] edge = new HashMap[N]; // edge[a].get(b) はノードaからノードbへの距離   
		boolean[] visit = new boolean[N];
		long[] value = new long[N];
		for(int i=0;i<N;i++) edge[i] = new HashMap<Integer,Integer>();
		for(int i=0;i<M;i++) {
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			int d = sc.nextInt();
			if(!putedge(edge,l,r,d)) {
				out.println("No");
				return;
			}
		}
		for(int i=0;i<N;i++) {
			if(!bfs(edge,i,value,visit)) {
				out.println("No");
				return;
			};
		}
		out.println("Yes");
	}
	
	public static boolean putedge(HashMap<Integer,Integer>[] edge, int l, int r, int d) {
		if(edge[l].containsKey(r) && edge[l].get(r)!=d) return false;
		edge[l].put(r,d);
		edge[r].put(l,-d);
		return true;
	}
	// BFSでvalueを計算して行く。　valueが矛盾すればfalse
	public static boolean bfs(HashMap<Integer,Integer>[] edge, int n, long[] value, boolean[] visit) {
		if(visit[n]) return true;
		LinkedList<Integer> que = new LinkedList<Integer>();
		visit[n] = true;
		value[n] = 0;
		que.add(n);
		while(!que.isEmpty()) {
			int node = que.removeFirst();
			for(int neigh : edge[node].keySet()) {
				if(visit[neigh] && value[neigh]!=(value[node]+edge[node].get(neigh))) {
					return false;
				}
				else if(!visit[neigh]){
					visit[neigh] = true;
					value[neigh] = value[node]+edge[node].get(neigh);
					que.add(neigh);
 				}
			}
		}
		return true;
	}
	
}