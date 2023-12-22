import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static ADJ[] edge;
	public static boolean visited[];
	public static int go_time[];
	public static int back_time[];
	public static int current_time;

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);

		int V = sc.nextInt();
		edge = new ADJ[V];

		for(int i = 0; i < V; i++){
			edge[i] = new ADJ();
		}

		visited = new boolean[V];
		for(int i = 0; i < V; i++){
			visited[i] = false;
		}

		go_time = new int[V];
		back_time = new int[V];

		int node_id,num,tmp_to;

		for(int loop = 0; loop < V; loop++){
			node_id = sc.nextInt();
			node_id--;

			num = sc.nextInt();

			for(int i = 0; i < num; i++){
				tmp_to = sc.nextInt();
				tmp_to--;
				edge[node_id].to.add(tmp_to);
			}
		}

		current_time = 1;

		for(int i = 0; i < V; i++){
			if(visited[i])continue;
			visited[i] = true;
			dfs(i);
		}

		StringBuilder ans = new StringBuilder();

		for(int i = 0; i < V; i++){
			ans.append(Integer.toString(i+1)).append(" ").append(Integer.toString(go_time[i])).
				append(" ").append(Integer.toString(back_time[i])).append("\n");
		}

		System.out.print(ans.toString());
	}

	public static void dfs(int node_id){

		go_time[node_id] = current_time++;
		int next_node;

		for(int i = 0; i < edge[node_id].to.size(); i++){

			next_node = edge[node_id].to.get(i);
			if(visited[next_node])continue;

			visited[next_node] = true;
			dfs(next_node);
		}
		back_time[node_id] = current_time++;
	}

}

class ADJ{
	ArrayList<Integer> to;

	ADJ(){
		to = new ArrayList<Integer>();
	}
}
