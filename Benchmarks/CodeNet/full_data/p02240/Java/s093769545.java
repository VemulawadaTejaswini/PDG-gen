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

		/*for(int i = 0; i < connections; i++) {
			System.out.print(nodeList[i] + ": ");
			for(int j = 0; j < nodeList[i].length; j++) {
				System.out.print(nodeList[i][j]);
			}
			System.out.println();
		}*/
		int tests = input.nextInt();
		int[][] testing = new int[tests][tests];
		for(int i = 0; i < tests; i++) {
			for(int j = 0; j < 2; j++) {
				testing[i][j] = input.nextInt();
			}
		}
		input.close();
		for(int i = 0; i < tests; i++) {
			ArrayList<Integer> newls = new ArrayList<Integer>();
			ArrayList<Integer> eval = bfs(testing[i][0], newls, hash);
			if(eval.contains(testing[i][1]))
				System.out.println("yes");
			else
				System.out.println("no");
			//if((ArrayList<Integer> eval = bfs(testing[i][0], newls, hash)).contains(testing[i][1])){
		}
	}
	public static ArrayList<Integer> bfs(int s, ArrayList<Integer> visited, Hashtable<Integer, ArrayList<Integer>> hash) {
		ArrayList<Integer> toVisit = new ArrayList<Integer>();
		toVisit.add(s);
		while(toVisit.size() > 0) {
			int v = toVisit.remove(0);
			visited.add(v);
			ArrayList<Integer> neighbors = getNeighbors(v, hash);
			for(int i = 0; i < neighbors.size(); i++) {
				int v1 = neighbors.get(i);
				if(visited.contains(v1) == false && toVisit.contains(v1) == false){
					toVisit.add(v1);
				}
			}
		}
		return visited;
	}
	public static ArrayList<Integer> getNeighbors(int v, Hashtable<Integer, ArrayList<Integer>> hash){
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		neighbors = hash.get(v);
		if(neighbors != null)
			return neighbors;
		return new ArrayList<Integer>();
	}
}
