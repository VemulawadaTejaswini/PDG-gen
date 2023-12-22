public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int e = scan.nextInt();
		Map<Integer, List<Integer>> adj_list = new HashMap<Integer, List<Integer>>();

		while ( v-- > 0 ){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if ( !adj_list.containsKey(x) ) adj_list.put(x, new ArrayList<Integer>());
			List<Integer> cur_neigh = adj_list.get(x);
			cur_neigh.add(y);
		}
		//at this point the adjascency list is built
		boolean iscycle = graph_iscycle(adj_list);
	}

	public boolean graph_iscycle(Map<Integer, List<Integer>> adj_list){

		boolean visited[] = new boolean[adj_list.size()];
		boolean in_visit[] = new boolean[adj_list.size()];

		for ( int v : adj_list.keys()){
			if ( !visited[v] ){
				boolean res = check_cycle_util(v, visited, in_visit, adj_list);
				if ( res ) return true;
			}
		}
		return false;
	}

	//returns true if the graph contains a cycle
	private boolean check_cycle_util(int v, boolean visited[], boolean in_visit[], Map<Integer, List<Integer>> adj_list){
		visited[v] = true;
		in_visit[v] = true;

		for ( int neigh : adj_list.get(v) ){
			if ( !visited[neigh] ){
				boolean res = check_cycle_util(neigh, visited, in_visit, adj_list);
				if ( res ) return true;
			}
			else if ( in_visit[v] ) return true;
		}

		in_visit[v] = false;
		return false;
	}
}