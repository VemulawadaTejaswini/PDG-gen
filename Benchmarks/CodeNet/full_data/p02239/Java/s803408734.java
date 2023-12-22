import java.util.*;

public class Main{
	int totalVertex;
	ArrayList<LinkedList<Integer>> adjList;
	
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new ArrayList<>();
		
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> neighbors = new LinkedList<>();
			in.nextInt(); // Discard node. we don't use 1 2 3 4
			int numNeighbors = in.nextInt();
			for (int j = 0; j < numNeighbors; j++) {
				neighbors.add(in.nextInt() - 1); //-1 to set index so we can start at 0 instead of -1
			}
			
			adjList.add(neighbors);
		}
		in.close();
	}
	
	public void shortestPath() {
		int[] distance = new int[totalVertex];
		boolean[] visited = new boolean[totalVertex];
		for(int i = 1; i < distance.length; i++) {
			distance[i] = Integer.MAX_VALUE; //set to a max value if it hasn't been vistied
		}
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			visited[cur] = true;
			LinkedList<Integer> neighbors = adjList.get(cur);
			for(Integer n : neighbors) {
				if(!visited[n]) {
					queue.add(n);
					distance[n] = Math.min(distance[n], distance[cur] + 1); 
				}
			}
		}
		for(int i = 0; i < distance.length; i++) {
			if(distance[i] == Integer.MAX_VALUE) {
				distance[i] = -1;
			}
			System.out.println((i + 1) + " " + distance[i]);
		}
	}
	
	public static void main(String[] args) {
		Main Graph = new Main();
		Graph.loadAdjList();
		Graph.shortestPath();
		
		
	}
}

