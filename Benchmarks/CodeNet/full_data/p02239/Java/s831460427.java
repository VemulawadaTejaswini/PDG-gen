import java.util.*;


class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	private int[] discover; //discover time stamp, -1 for undiscovered
	private int[] finish; //finish tim
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public int DFS(int v, int t0) {
		discover[v] = t0;
		LinkedList<Integer> nb = adjList.get(v);
		Iterator<Integer> it = nb.iterator();
		int t = t0;
		while(it.hasNext()) {
			int w = it.next();
			if(discover[w] == -1) {
				t ++; //one forward step
				t = DFS(w, t);
			}
		}
		finish[v] = t + 1; //+1 for backtrack step
		return t + 1;
	}
	
	public void BFS(int v) {
		Queue<Integer> toVisit = new LinkedList<Integer>();
		ArrayList<Integer> Visited = new ArrayList<Integer>();
		toVisit.add(v);
		int[] distance = new int[totalVertex];
		distance[0] = 0;
		for(int i = 1; i < totalVertex; i++) {
			distance[i] = -1;
		}
		while (! toVisit.isEmpty()) {
			// get first one
			int node = toVisit.poll();
			//set visited
			Visited.add(node);
			//get neighbors
			LinkedList<Integer> nb = adjList.get(node);
			for(Integer v1 : nb) {
	            if((Visited.contains(v1) == false) && (toVisit.contains(v1) == false)) {
	            	toVisit.add(v1);
	            	distance[v1] = distance[node] + 1;
	            }
	            }
		}
		for(int i = 0; i < totalVertex; i++) {
			System.out.println((i+1) + " "+distance[i]);
			}
		}
}
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS(0);
	}
	
}

