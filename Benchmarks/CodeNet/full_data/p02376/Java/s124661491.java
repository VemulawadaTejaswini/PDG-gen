

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	boolean[] used;
	List<Edge>[] edges;
	void start(){
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int e = in.nextInt();
		used = new boolean[v];
		edges = new List[v];
		for(int i = 0; i < v; i++){
			edges[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < e; i++){
			addEdge(in.nextInt(), in.nextInt(), in.nextInt());
		}

		int res = 0;
		while(true){
			Arrays.fill(used, false);
			int ret = dfs(0, v-1, Integer.MAX_VALUE);
			if(ret == 0)break;
			res += ret;
		}
		System.out.println(res);
		in.close();
	}
	void addEdge(int from, int to, int capacity){
		edges[from].add(new Edge(to,capacity, edges[to].size()));
		edges[to].add(new Edge(from, 0, edges[from].size()-1));
	}
	int dfs(int from, int to, int f){
		if(from == to)return f;
		used[from] = true;
		for(int i = 0; i < edges[from].size(); i++){
			Edge edge = edges[from].get(i);
			if(!used[edge.to] && edge.cap > 0){
				int dist = dfs(edge.to, to, Math.min(f, edge.cap));
				if(dist > 0){
					edge.cap -= dist;
					edges[edge.to].get(edge.rev).cap += dist;
					return dist;
				}
			}
		}
		return 0;
	}

	class Edge{
		int to, cap, rev;
		Edge(int to, int cap, int rev){
			this.to= to;
			this.cap = cap;
			this.rev = rev;
		}
	}

}