
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// a graph structure based on adjacent graph
	public static class graph{
		public int v_num; // the number of vertices
		public List<List<Integer>> adj_table;
		
		public graph(int _v_num) {
			v_num = _v_num;
			adj_table = new ArrayList<List<Integer>>();
			for(int i = 0; i < v_num; i++) {
				adj_table.add(new ArrayList<Integer>());
			}
		}
		
		
		//src and dst is always 1-kara
		public void insert_edge(int src, int dst) {
			adj_table.get(src-1).add(dst);
		}
		
		// 1-kara
		public List<Integer> get_adj_nodes(int i){
			return adj_table.get(i-1); 
		}
	}
	
	public static int clock = 0;
	
	
	public static void _dfs(graph g, int current, int[] b, int []f) {
		clock++;
		b[current] = clock;
		List<Integer> adj_list = g.get_adj_nodes(current);
		for(int i = 0; i < adj_list.size(); i++) {
			if(b[adj_list.get(i)] == 0)
				_dfs(g, adj_list.get(i), b, f);
		}
		clock++;
		f[current] = clock;
	
	}
	
	public static void dfs(graph g) {
		int [] b = new int[g.v_num+1];
		int [] f = new int[g.v_num+1];
		
		_dfs(g, 1, b, f);
		for(int i = 1; i <= g.v_num; i++) {
			System.out.println(i + " "+ b[i]+" "+f[i]);
		}
	}
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		graph g = new graph(n);
		
		int src_id,  list_len; 
		for(int i = 0; i< n; i++) {
			src_id = cin.nextInt();
			list_len = cin.nextInt();
			while(list_len > 0) {
				g.insert_edge(src_id, cin.nextInt());
				list_len--;
			}
		}
		
		dfs(g);
		
		
		cin.close();
		
		
	}
}