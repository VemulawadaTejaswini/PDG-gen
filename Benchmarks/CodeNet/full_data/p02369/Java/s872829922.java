import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int e = scan.nextInt();

		//space taken by an adjascency list is O(E + V)
		Map<Integer, List<Integer>> adj_list = new HashMap<Integer, List<Integer>>();

		while ( e-- > 0 ){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if ( !adj_list.containsKey(x) ) adj_list.put(x, new ArrayList<Integer>());
			List<Integer> cur_neigh = adj_list.get(x);
			cur_neigh.add(y);
		}
		//at this point the adjascency list is built
		boolean iscycle = graph_iscycle(adj_list, v);
		if ( iscycle ) System.out.println("1");
		else System.out.println("0");
	}

	public static boolean graph_iscycle(Map<Integer, List<Integer>> adj_list, int v_size){
		//for all nodes not yet visited the color is 0, for in-visiting status color is 1, for complete the color is 2
		int color[] = new int[v_size];		

		for ( int v : adj_list.keySet()){
			if ( color[v] == 0 ){
				boolean res = check_cycle_util(v, color, adj_list);
				if ( res ) return true;
			}
		}
		return false;
	}

	//returns true if the graph contains a cycle
	//this function is called once per node (at that time it is marked visited and hence never called again for that node)
	private static boolean check_cycle_util(int v, int color[], Map<Integer, List<Integer>> adj_list){
		color[v] = 1;

		if ( adj_list.containsKey(v) ){
			//at each call it iterates over a loop of size=out-degree
			for ( int neigh : adj_list.get(v) ){
				//if node is not visited, explore it
				if ( color[neigh] == 0 ){
					boolean res = check_cycle_util(neigh, color, adj_list);
					if ( res ) return true;
				}
				//if visited, check if it forms a back edge, that is .. it is part of the current call stack history
				else if ( color[neigh] == 1 ) return true;
			}			
		}

		//undo a node visit to prevent it being considered for back edges bcoz its off the call stack now
		color[v] = 2;
		return false;
	}
}