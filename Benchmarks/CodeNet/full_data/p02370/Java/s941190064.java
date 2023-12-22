import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class GraphTopological2 {
	private int totalVertex;
	private int totalEdge;
	private int [] indegree;
	private Set<Integer> s = new HashSet<Integer>();
	private LinkedList<LinkedList<Integer>> adjList;
	public GraphTopological2() {
		totalVertex = 0; 
	}
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdge = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		indegree = new int[totalVertex];
		for(int i=0; i<totalVertex; i++){
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
			s.add(i);
		}
		for(int i = 0; i < totalEdge; i++) {
			int v = in.nextInt();
			int neighbor = in.nextInt();
			adjList.get(v).add(neighbor); // add its neighbor to its list
			indegree[neighbor]++; // increase its indegree by 1	
		}
		in.close();
	}
	
	public void Topological(){
		while(!s.isEmpty()){
			Iterator<Integer> itr = s.iterator();
			while (itr.hasNext()) {
				int k = itr.next();
				if(indegree[k]==0){
					System.out.println(k);
					Iterator<Integer> it = adjList.get(k).iterator();
					while (it.hasNext()) {
				    	int neib = it.next();// get all neighbors of the current node that has no incoming edges
				    	indegree[neib]--;					    	
				   }
		    	   s.remove(k);
		    	   break;
				}
			}
		}
	}

}

public class Main {
	public static void main(String argv[]) {
		GraphTopological2 g = new GraphTopological2();
		g.loadAdjList();
		g.Topological();
	}
}
