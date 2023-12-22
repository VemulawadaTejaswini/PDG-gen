import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nodes = input.nextInt();
		int connections = input.nextInt();
		Hashtable<Integer, ArrayList<Integer>> hash = new Hashtable<Integer, ArrayList<Integer>>();
		for(int i = 0; i < connections; i++) {
			int vertex = input.nextInt();
			int toVertex = input.nextInt();
			if(hash.containsKey(vertex)) {
				ArrayList<Integer> value = hash.get(vertex);
				value.add(toVertex);
				hash.put(vertex, value);
			}
			else {
				ArrayList<Integer> value = new ArrayList<Integer>();
				value.add(toVertex);
				hash.put(vertex, value);
			}
		}

		int tests = input.nextInt();
		int[][] testing = new int[tests][tests];
		for(int i = 0; i < tests; i++) {
			for(int j = 0; j < 2; j++) {
				testing[i][j] = input.nextInt();
			}
		}
		input.close();

		for(int i = 0; i < tests; i++) {
			int base = testing[i][0];
			ArrayList<Integer> result = getNeighbors(base, 0, hash, new ArrayList<Integer>(), connections);
			ArrayList<Integer> result2 = getNeighbors(testing[i][1], 0, hash, new ArrayList<Integer>(), connections);
			if(result.contains(testing[i][1]) || result2.contains(base))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
	/*public static ArrayList<Integer> bfs(int s, ArrayList<Integer> visited, Hashtable<Integer, ArrayList<Integer>> hash) {
		ArrayList<Integer> toVisit = new ArrayList<Integer>();
		toVisit.add(s);
		while(toVisit.size() > 0) {
			int v = toVisit.remove(0);
			visited.add(v);
			ArrayList<Integer> neighbors = getNeighbors(v, hash, new ArrayList<Integer>());
			for(int i = 0; i < neighbors.size(); i++) {
				int v1 = neighbors.get(i);
				if(visited.contains(v1) == false && toVisit.contains(v1) == false){
					toVisit.add(v1);
				}
			}
		}
		return visited;
	}*/
	public static ArrayList<Integer> getNeighbors(int v, int runs, Hashtable<Integer, ArrayList<Integer>> hash, ArrayList<Integer> lots, int connections){
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		neighbors = hash.get(v);
		if(neighbors == null) {
			//System.out.println(lots);
			return lots;
		}
			
		else {
			for(int i = 0; i < neighbors.size(); i++) {
				if(!lots.contains(neighbors.get(i))) {
					lots.add(neighbors.get(i));
					//System.out.println(lots);
					lots.addAll(getNeighbors(neighbors.get(i), 0, hash, lots, connections));
					runs += 1;
				}
			}
		}
		return lots;
	}
}
