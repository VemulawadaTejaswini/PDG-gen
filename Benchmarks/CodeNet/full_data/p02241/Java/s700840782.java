import java.util.*;

 class Graphs {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graphs() { totalVertex = 0; }
	public int getTotalVertex() { return totalVertex; }
	//load graph from standard input
	public void loadAdjMatrix() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjMatrix = new int[totalVertex][totalVertex];
		adjWeight = new int[totalVertex][totalVertex];
		ifSettled = new Boolean[totalVertex];
		int i, j;
		for(i = 0; i < totalVertex; i ++) {
			ifSettled[i] = false;
			for(j = 0; j < totalVertex; j ++) {
				adjMatrix[i][j] = adjWeight[i][j] = 0;
			}//for
		}//for
		for(i = 0; i < totalVertex; i ++) {
			for(j = 0; j < totalVertex; j ++) {
				int u = in.nextInt();
				if(u==-1) {
				adjMatrix[i][j] = 0;
				}
				else {
					adjMatrix[i][j] = 1;
				adjWeight[i][j] = u;
				}
			}	
		}
		in.close();
	}
	//return weight of the edge from u to v if there is one
	public int getWeight(int u, int v) {
		return adjWeight[u][v];
	}
	//return neighbors of u as a LinkedList
	public LinkedList<Integer> getNeighbors(int u) {
		LinkedList<Integer> tmp = new LinkedList<Integer>();
		for(int v = 0; v < totalVertex; v ++) {
			if(adjMatrix[u][v] == 1) tmp.add(v);
		}
		return tmp;
	}
	//return unsettled neighbors of u as a LinkedList
	public LinkedList<Integer> getUnsettledNeighbors(int u) {
		LinkedList<Integer> tmp = new LinkedList<Integer>();
		for(int v = 0; v < totalVertex; v ++) {
			if((adjMatrix[u][v] == 1) && (ifSettled[v] == false)) tmp.add(v);
		}
		return tmp;
	}
	//return the unsettled node that has the smallest dist
	public int getUnsettledNearest(int[] dist) {
		int md = Integer.MAX_VALUE;
		int mv = -1;
		int v;
		for(v = 0; v < totalVertex; v ++) {
			if((ifSettled[v] == false) && (dist[v] < md)) {
				md = dist[v];
				mv = v;
			}
		}
		return mv;
	}
	//implement the following	
	public int[] Dijkstra(int s) {
		int[] distance = new int[totalVertex];
		distance[0] = 0;
		
		for(int i = 1; i < totalVertex; i++) {
			distance[i] = Integer.MAX_VALUE;
		}//for
		int currentNode = getUnsettledNearest(distance);
		
		while(currentNode!= -1) {
			LinkedList<Integer> neighborsOfCurrentNode = getUnsettledNeighbors(currentNode);
			ifSettled[currentNode]= true;
			
			for(Integer neighbor : neighborsOfCurrentNode) {
				distance[neighbor] = Math.min(distance[neighbor],  + getWeight(currentNode, neighbor));
			} 
			
			
		
			currentNode = getUnsettledNearest(distance);
		}//while
	
		
		
		
			
			
	
		return distance;
	
	}//dijkstra
}

public class Main {
	public static void main(String[] argv) {
		Graphs g = new Graphs();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		int sum = 0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			sum += dist[i];
		}	
		
		System.out.println(sum);
		}
	}


 
	
