import java.util.LinkedList;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		AdjListGraph g = new AdjListGraph(size, true);
		for (int i = 0; i < size; i++){
			int v = sc.nextInt()-1;
			int d = sc.nextInt();
			for(int j=0; j<d; j++){
				g.addEdge(v, sc.nextInt()-1);
			}
		}
		g.BFS(0);
	}

}


class Pair{
	int key;int value;
	Pair(int K, int V){key = K; value = V;}
	int getKey(){return key;}
	int getValue(){return value;}
}	

class AdjListGraph { // http://theoryofprogramming.com/adjacency-list-in-java/
	private boolean digraph;
	private final LinkedList<Pair>[] adjList;
	@SuppressWarnings("unchecked")
	AdjListGraph(int numV, boolean flag){
		adjList = (LinkedList<Pair>[]) new LinkedList[numV];
		for (int i = 0; i < adjList.length; i++) {
			adjList[i] = new LinkedList<>();
		}
		digraph = flag;
	}
	boolean directed(){return digraph;} //return the graph is directed or not
	int getNumOfVertices(){return adjList.length;} //return the num of vertices
	public void addEdge(int startV, int endV, int weight) {
		adjList[startV].add(new Pair(endV, weight));
		if(!digraph){adjList[endV].add(new Pair(startV, weight));}
	} //add an edge to the graph. 
	public void addEdge(int startV, int endV) {
		addEdge(startV, endV, 1); 
	} //weight is set to 1 as a default
	public LinkedList<Integer> getEdgesFromVertexNoWeight(int startV) {
		LinkedList< Integer > edgeList= (LinkedList< Integer >) new LinkedList<Integer>();
		for(Pair pair : adjList[startV]){
			edgeList.add(pair.getKey());
		}
		return edgeList;
	} // get the list of the edges leaving startV. This is for no weight graph. 
	public void print() {
		int i = 0;
		for (LinkedList<Pair> list : adjList) {
			System.out.print("adjList[" + i + "] -> ");
			for (Pair edge : list) {System.out.print(edge.getKey() + "(" + edge.getValue() + ")");}
			i++;
			System.out.println();
		}
	}
	void BFS(int src){
		boolean visited[] = new boolean[getNumOfVertices()];		
		int dist[] = new int[getNumOfVertices()];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[src]=true;	
		queue.add(src);	
		while (queue.size() != 0){
			int tmp = queue.poll();
			LinkedList<Integer> neighbors =  getEdgesFromVertexNoWeight(tmp);
			for(Integer i : neighbors){
				if(!visited[i]){
					visited[i] = true;
					dist[i] = dist[tmp]+1;
					queue.add(i);
				}
			}
		}
		for(int i=0; i< dist.length ; i++){
			if(i!=src && dist[i]==0){
				dist[i]=-1;
			}
		}
		for(int i=0; i< dist.length ; i++){
			System.out.println(Integer.toString(i+1) + " " +  dist[i]);
		}
//		System.out.println(Arrays.toString(dist));
	}
}


