
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main<E> {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int v = Integer.parseInt(line[0]);
		int e = Integer.parseInt(line[1]);
		LongestPath<Integer> graph = new LongestPath<>(v+10, true);


		for(int i = 0; i < v; i++) {
			graph.insertVertex(i+1);
		}

		for(int i = 0; i < e; i++) {
			line = s.nextLine().split(" ");
			graph.link(Integer.parseInt(line[0]), Integer.parseInt(line[1]), 1);
		}

		graph.FloydWarshallReversedForLongestPaths();

		int max = Integer.MIN_VALUE;
		for(int i = 0; i < graph.allPairsminimumDistances.length; i++) {
			for(int j = 0; j < graph.allPairsminimumDistances[i].length; j++) {
				int current = graph.allPairsminimumDistances[i][j];
				if(current != Integer.MAX_VALUE) {
					max = Math.max(max, current);
				}
			}
		}
		System.out.println(max);
	}





	/**It is a matrix of integers that represents all the graph edges. 
	 */
	private int[][] edges;
	/**It indicates if the graph is directed or not.
	 */
	private boolean isDirected;
	/**It represents a hash map from E objects to integers.
	 */
	private HashMap<E, Integer> keyToIndex;
	/**It is a matrix of vertices that represents the all the graph vertices.
	 */
	private Vertex<E>[] vertices;
	/**It represents the source vertex that is in the final position of the path.
	 */
	private Vertex<E> lastSrc;
	/**It represents a free row where a new vertex can be allocated.
	 */
	private int freeRow;
	/**It represents how many time DFS process lasts.
	 */
	private int DFStime;
	/**It is a matrix of integers that represents the minimum distance of all pairs of vertices. 
	 */
	private int[][] allPairsminimumDistances;
	/**It is a matrix of vertices that indicates the shortest path of all pairs of vertices. 
	 */
	private Vertex<E>[][] allPairsShortestPath;

	/**It creates a matrix as a array of edges of a graph either directed or undirected with a size that arrives as parameter.
	 * @param size is an Integer that represents the size of the Adjacency Matrix. 
	 * @param isDIrected is a boolean that indicates if the Adjacency Matrix is going to represent a directed graph or not.
	 */
	public LongestPath(int size, boolean isDIrected) {
		edges = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				edges[i][j] = Integer.MAX_VALUE;
			}
			edges[i][i] = 0;
		}
		this.isDirected = isDIrected;
		keyToIndex = new HashMap<>();
		vertices = (Vertex<E>[])new Vertex[size];
		freeRow = 0;
	}

	/**This inserts a vertex, defined with an element of type E that arrives as parameter, in a free row and verifies if the insertion process 
	 * was done rightly. 
	 * @return A boolean that indicates if the insertion process was done rightly.
	 * @param e is a vertex that is going to be inserted inside the matrix. 
	 */
	public boolean insertVertex(E e) {
		if(!keyToIndex.containsKey(e)) {
			keyToIndex.put(e, freeRow);
			vertices[freeRow] = new Vertex<>(e);
			freeRow++;
			if(freeRow >= edges.length) {
				int[][] newedges = new int[edges.length+10][edges.length+10];
				Vertex<E>[] newvertices = (Vertex<E>[])new Vertex[edges.length+10];
				for(int i = 0; i < newedges.length; i++) {
					if(i < vertices.length) {
						newvertices[i] = vertices[i];
					}
					for (int j = 0; j < newedges.length; j++) {
						newedges[i][j] = i==j?0:Integer.MAX_VALUE;
						if(i < edges.length && j < edges.length) {
							newedges[i][j] = edges[i][j];
						}
					}
				}
				edges = newedges;
				vertices = newvertices;
			}
			return true;
		}
		return false;
	}

	/**This deletes a vertex, defined with a E object that arrives as parameter, looking for the respective key inside the matrix and verifies if 
	 * the deletion process was done rightly.
	 * @return A boolean that indicates if the deletion process was done rightly.
	 * @param sk is a vertex that is going to be erased from the matrix.
	 */
	public boolean deleteVertex(E e) {
		if(keyToIndex.containsKey(e)) {
			int indexToDelete = keyToIndex.get(e);
			vertices[indexToDelete] = vertices[keyToIndex.size()-1];
			vertices[keyToIndex.size()-1] = null;
			for(int i = 0; i < keyToIndex.size(); i++) { 
				edges[indexToDelete][i] = edges[keyToIndex.size()-1][i];
				edges[keyToIndex.size()-1][i] = Integer.MAX_VALUE;
				edges[i][indexToDelete] = edges[i][keyToIndex.size()-1];
				edges[i][keyToIndex.size()-1] = Integer.MAX_VALUE;
			}

			freeRow--;
			if(freeRow > 0 && indexToDelete < keyToIndex.size()-1) {
				keyToIndex.put(vertices[indexToDelete].getElement(), indexToDelete);
			}
			keyToIndex.remove(e);
			return true;
		}
		return false;
	}

	/**This method links a source vertex with another vertex denoted as dst assigning it a weight to their respective connection where a edge is 
	 * added if the graph is undirected. 
	 * @param src is an E object that represents the source vertex from the dst vertex is going to be linked. 
	 * @param dst is an E object that represents the vertex which src is going to be linked with.
	 * @param weight is an integer that represents the cost of arriving from src to dst.
	 */
	public void link(E src, E dst, int weight) {
		insertVertex(src); //Inserts src if not currently in the graph
		insertVertex(dst); //Inserts dst if not currently in the graph

		int s = keyToIndex.get(src);
		int d = keyToIndex.get(dst);
		edges[s][d] = weight;
		if(!isDirected) { 
			edges[d][s] = weight;
		}
	}
	
	/**This performs FloydWarshall which find the shortest distances and paths between every pair of vertices. 
	 */
	public void FloydWarshallReversedForLongestPaths() {
		int[][] d1 = new int[keyToIndex.size()][keyToIndex.size()];
		Vertex<E>[][] p1 = (Vertex<E>[][])new Vertex[d1.length][d1.length];
		for(int i = 0; i < d1.length; i++) {
			for (int j = 0; j < d1[i].length; j++) {
				d1[i][j] = edges[i][j];
				p1[i][j] = (edges[i][j] != 0 && edges[i][j] != Integer.MAX_VALUE) ? vertices[i]: null;
			}
		}

		for(int k = 0; k < keyToIndex.size(); k++) {
			allPairsminimumDistances = d1.clone();
			allPairsShortestPath = p1.clone();
			for(int i = 0; i < keyToIndex.size(); i++) {
				for(int j = 0; j < keyToIndex.size(); j++) {
					long ik = (long)d1[i][k];
					long kj = (long)d1[k][j];
					if(ik != 0 && kj != 0 && ik != Integer.MAX_VALUE && kj != Integer.MAX_VALUE && ((long)d1[i][j] < ik + kj || d1[i][j] == Integer.MAX_VALUE)) {
						allPairsminimumDistances[i][j] = d1[i][k] + d1[k][j];
						allPairsShortestPath[i][j] = p1[k][j];
					}
				}
			}
		}
	}

	/**It returns the last source vertex inside the graph. 
	 * @return An E object that represents the last source vertex inside the graph. 
	 */
	public E getLastSrc() {
		return lastSrc.getElement();
	}

	/**It returns the free row value as an integer.
	 * @return An Integer that represents the free row value.
	 */
	public int getFreeRow() {
		return freeRow;
	}

	/**It allows to obtain the distance of a single vertex specified as parameter. Returns infinite if dst does not exist in the matrix. 
	 * @return An Integer the distance of the entire single path of dst. 
	 * @param dst is a vertex from where distance is going to be calculated. 
	 */
	public int getSingleSourceDistance(E dst) {
		if(keyToIndex.containsKey(dst)) {
			return vertices[keyToIndex.get(dst)].getDistance();
		}
		return Integer.MAX_VALUE;
	}

	/**It allows to obtain the time that DFS performs discovering a vertex that arrives as parameter.
	 * @return An Integer that indicates how many time took to discover the inside the matrix. 
	 * @param key is a vertex that is going to be discovered inside the matrix. 
	 */
	public int getDFSDiscoveredTime(E key) {
		if(keyToIndex.containsKey(key)) {
			return vertices[keyToIndex.get(key)].getDiscovered();
		}
		return 0;
	}

	/**It allows to obtain the time that DFS performs finishing a vertex that arrives as parameter.
	 * @return An Integer that indicates how many time took to finish the inside the matrix. 
	 * @param key is a vertex that is going to be finished inside the matrix.
	 */
	public int getDFSFinishedTime(E key) {
		if(keyToIndex.containsKey(key)) {
			return vertices[keyToIndex.get(key)].getFinished();
		}
		return 0;
	}

	/**It allows to obtain the key state as a Vertex.Color. 
	 * @return A State that indicates the vertex Vertex.Color. 
	 * @param key is a vertex which its Vertex.Color is going to be extracted. 
	 */
	public Vertex.Color getVertexColor(E key) {
		if(keyToIndex.containsKey(key)) {
			return vertices[keyToIndex.get(key)].getColor();
		}
		return null;
	}

	/**It allows to obtain a single predecessor of a determinate vertex that arrives as parameter.
	 * @return A E object that represents the single predecessor. 
	 * @param key is a ordinary vertex of the matrix.  
	 */
	public E getSingleSourcePredecessor(E key) {
		if(keyToIndex.containsKey(key) && vertices[keyToIndex.get(key)].getPredecessor() != null) {
			return vertices[keyToIndex.get(key)].getPredecessor().getElement();
		}
		return null;
	}

	/**It allows to obtain the path between two pair of vertices through an ArrayList of vertices.
	 * @return An ArrayList<E> that represents the path between src and dst. 
	 * @param src is a vertex from which we can access to dst. 
	 * @param dst is the vertex which dst can access.
	 * @throws NullPointerException if either src or dst are not elements of the graph
	 */
	public ArrayList<E> getPath(E src, E dst) {
		Vertex<E> d = vertices[keyToIndex.get(dst)];
		Vertex<E> s = vertices[keyToIndex.get(src)];
		ArrayList<E> path = new ArrayList<E>();
		if(allPairsShortestPath != null && d != null && s != null) {
			if(allPairsShortestPath[keyToIndex.get(src)][keyToIndex.get(dst)] != null) {
				pathFill(s, d, path);
			} else if(d == s && d != null) {
				path.add(d.getElement());
			}
		}
		return path;
	}

	/**It allows to determinate the path between two pairs of vertices saving it in an ArrayList of vertices.
	 * @param src A Vertex<E> that represents the source where dst is associated.
	 * @param dst A Vertex<E> that represents the vertex which src is connected with.
	 * @param path An ArrayList of vertices that represents the path between two pairs of vertices.
	 */
	private void pathFill(Vertex<E> src, Vertex<E> dst, ArrayList<E> path) {
		if(src == dst) {
			path.add(src.getElement());
		} else {
			pathFill(src, allPairsShortestPath[keyToIndex.get(src.getElement())][keyToIndex.get(dst.getElement())], path);
			path.add(dst.getElement());
		}
	}

	/**It allows to get the distance between two pairs of vertices.
	 * @return An Integer that represents the distance between two pairs of vertices.
	 * @param src is a vertex from which we can access to dst.
	 * @param dst is the vertex which dst can access.
	 */

	public int getDistance(E src, E dst) {
		if(allPairsminimumDistances != null && keyToIndex.containsKey(src) && keyToIndex.containsKey(dst)) {
			return allPairsminimumDistances[keyToIndex.get(src)][keyToIndex.get(dst)];
		}
		return 0;
	}

	/**It allows to determinate if two pairs of vertices have and edge in common.
	 * @return A boolean that indicates if the list contains this edge.
	 * @param src is a vertex from which we can access to dst.
	 * @param dst is the vertex which dst can access.
	 */

	public boolean containsEdge(E src, E dst) {
		if(keyToIndex.containsKey(src) && keyToIndex.containsKey(dst)) {
			int i = keyToIndex.get(src);
			int j = keyToIndex.get(dst);
			return edges[i][j] != 0 && edges[i][j] != Integer.MAX_VALUE;
		}
		return false;
	}

	/**It allows to obtain all the adjacent vertices of a determinate source that arrives as parameter.
	 * @return An ArrayList<E> that represents all the adjacent vertices of a determinate source that arrives as parameter.
	 * @param key is a vertex which its adjacent vertices are going to be found.
	 */

	public ArrayList<E> getAdjacent(E key) {
		ArrayList<E> adj = new ArrayList<>();
		if(keyToIndex.containsKey(key)) {
			for(int i = 0; i < keyToIndex.size(); i++) {
				if(edges[keyToIndex.get(key)][i] != 0 && edges[keyToIndex.get(key)][i] != Integer.MAX_VALUE) {
					adj.add(vertices[i].getElement());
				}
			}
		}
		return adj;
	}

	/**This performs Prim which finds the minimum spanning tree edges of a graph when this is connected and there is a source vertex. 
	 * @return An ArrayList<Edge<E>> which has all the edges of the minimum spanning tree.
	 * @param src is a reference vertex to start Prim process.
	 */

	public ArrayList<Edge<E>> primMinimumSpanningTree(E src) {
		ArrayList<Edge<E>> prim = new ArrayList<Edge<E>>();
		if(keyToIndex.containsKey(src)) {
			lastSrc = vertices[keyToIndex.get(src)];
			PriorityQueue<Vertex<E>> pq = new PriorityQueue<Vertex<E>>();
			for(int i = 0; i < keyToIndex.size(); i++) { //Fix the vertices configuration to make Prim
				vertices[i].setDistance(Integer.MAX_VALUE);
				vertices[i].setColor(Vertex.Color.WHITE);
				vertices[i].setPredecessor(null);
				pq.offer(vertices[i]);
			}
			pq.remove(lastSrc);
			lastSrc.setDistance(0);
			pq.offer(lastSrc);

			while(!pq.isEmpty()) {
				Vertex<E> u = pq.poll();
				int uIndex = keyToIndex.get(u.getElement());
				for(int i = 0; i < keyToIndex.size(); i++) {
					Vertex<E> v = vertices[i];
					if(uIndex != i && edges[uIndex][i] != 0 && edges[uIndex][i] != Integer.MAX_VALUE && v.getColor() == Vertex.Color.WHITE && vertices[i].getDistance() > edges[uIndex][i]) { //edge exists && the current shortest path can be improved
						Edge<E> edge = new Edge<>(u.getElement(), vertices[i].getElement(), edges[uIndex][i]);
						pq.remove(v);
						Vertex<E> pred = v.getPredecessor();
						if (pred != null) { //remove the edge that has v as dst vertex
							Edge<E> edgeToRemove = new Edge<>(pred.getElement(), edge.getDst(),1);
							prim.remove(edgeToRemove);
						}
						v.setDistance(edge.getWeight());
						v.setPredecessor(u);
						pq.offer(v);
						prim.add(edge);
					}
				}
				u.setColor(Vertex.Color.BLACK);
			}
		}
		return prim;
	}

	public static class Vertex<E> implements Comparable<Vertex<E>> {
		public static enum Color {WHITE, GRAY, BLACK}
		/**It represents the object that is contained in the vertex nowadays.
		 */
		private E element;
		/**It represents the vertex color in the search algorithms. 
		 */
		private Color color;
		/**It represents the associated predecessor vertex of the actual vertex. 
		 */
		private Vertex<E> predecessor;
		/**It represents the distance between two vertices.
		 */
		//BFS and Dijkstra Attributes
		private int distance;
		/**It represents the state of a discovered vertex when DFS is applied. 
		 */
		//DFS Attributes
		private int discovered;
		/**It represents the state of a finished vertex when DFS is applied.
		 */
		private int finished;

		/**This creates a new vertex as from an object of type E with its state in white and its predecessor in null.
		 * @param element It represents the object that will be associated with the vertex.
		 */
		public Vertex(E element) {
			this.element = element;
			color = Color.WHITE;
			setPredecessor(null);
		}
		/**It allows to get the actual vertex distance.
		 * @return An Integer that represents the actual vertex distance.
		 */
		public int getDistance() {
			return distance;
		}
		/**It allows to set the actual vertex distance.
		 * @param distance is an integer represents the actual vertex distance.
		 */
		public void setDistance(int distance) {
			this.distance = distance;
		}
		/**It allows to get the related E object of the actual vertex.
		 * @return An E object that represents the related E object of the actual vertex.
		 */
		public E getElement(){
			return element;
		}
		/**It allows to set the related E object of the actual vertex.
		 * @param element is an E object that represents the related E object of the actual vertex.
		 */
		public void setElement(E element){
			this.element = element;
		}
		/**It allows to get the state of the actual vertex defined by a color.
		 * @return A State object that represents the state of the actual vertex.
		 */
		public Color getColor() {
			return color;
		}
		/**It allows to set the state of the actual vertex defining a color.
		 * @param color is a State object that represents the state of the actual vertex.
		 */
		public void setColor(Color color) {
			this.color = color;
		}
		/**It allows to get an integer that represents if the actual vertex stage is finished when BFS is applied.
		 * @return An Integer that represents if the actual vertex stage is finished when BFS is applied.
		 */
		public int getFinished() {
			return finished;
		}
		/**It allows to set an integer that represents if the actual vertex stage is finished when BFS is applied.
		 * @param finished is an integer that represents if the actual vertex stage is finished when BFS is applied.
		 */
		public void setFinished(int finished) {
			this.finished = finished;
		}
		/**It allows to get an integer that represents if the actual vertex stage has been discovered when BFS is being applied.
		 * @return An integer that represents if the actual vertex stage has been discovered when BFS is being applied.
		 */
		public int getDiscovered() {
			return discovered;
		}
		/**It allows to set an integer that represents if the actual vertex stage has been discovered when BFS is being applied.
		 * @param discovered is an integer that represents if the actual vertex stage has been discovered when BFS is being applied.
		 */
		public void setDiscovered(int discovered) {
			this.discovered = discovered;
		}
		/**This method compares if another vertex of E type is equals to the actual vertex.
		 * @return A boolean that indicates if the vertex another is equal to the actual one.
		 * @param another is a vertex which is going to be compare with the actual one.
		 * @throws ClassCastException if another is not a Vertex<E>.
		 */
		@Override
		public boolean equals(Object another) {
			Vertex<E> a = (Vertex<E>)another; 
			return a.element.equals(element);
		}
		/**This method compares the actual vertex distance with another one that arrives as parameter.
		 * @return An integer that indicates if the other vertex distance is bigger, less or equal than the actual vertex.
		 * @param other is a vertex which is going to be compare with the actual one. 
		 */
		@Override
		public int compareTo(Vertex<E> other) {
			return this.distance-other.distance;
		}
		/***It allows to get the actual vertex predecessor. 
		 * @return A Vertex<E> that represents the actual vertex predecessor. 
		 */
		public Vertex<E> getPredecessor() {
			return predecessor;
		}
		/**It allows to set the actual vertex predecessor. 
		 * @param predecessor is a Vertex<E> that represents the actual vertex predecessor.
		 */
		public void setPredecessor(Vertex<E> predecessor) {
			this.predecessor = predecessor;
		}
	}
	
	public static class Edge<E> implements Comparable<Edge<E>>{

		/**It represents the source vertex from the dst vertex is going to be linked. 
		 */
		private E src;
		/**It represents the vertex which src is going to be linked with.
		 */
		private E dst;
		/**It represents the cost of arriving from src to dst.
		 */
		private int weight;

		/**This creates a Adjacency List Edge assigning it two vertices and a weight.
		 * @param src A E that represents the source where dst is associated. 
		 * @param dst A E that represents the vertex which src is connected with.
		 * @param weight A Integer that represents the connection weight between src and dst.
		 */
		public Edge(E src, E dst, int weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}
		/**It allows to get the source vertex which dst is connected with.
		 * @return A E that represents the source vertex which dst is connected with.
		 */
		public E getSrc() {
			return src;
		}
		/**It allows to set the source vertex which dst is connected with.
		 * @param src is a E that represents the source vertex which dst is connected with.
		 */
		public void setSrc(E src) {
			this.src = src;
		}
		/**It allows to get the vertex which src is connected with.
		 * @return A E that represents the vertex which src is connected with.
		 */
		public E getDst() {
			return dst;
		}
		/**It allows to set the vertex which src is connected with.
		 * @param dst is a E that represents the vertex which src is connected with.
		 */
		public void setDst(E dst) {
			this.dst = dst;
		}
		/**It allows to get an integer that represents the connection weight between src and dst.
		 * @return An Integer that represents the connection weight between src and dst.
		 */
		public int getWeight() {
			return weight;
		}
		/**It allows to set an integer that represents the connection weight between src and dst.
		 * @param weight is an integer that represents the connection weight between src and dst.
		 */
		public void setWeight(int weight) {
			this.weight = weight;
		}
		/***This method compares if another Adjacency List Edge of E type is equals to the actual Adjacency List Edge.
		 * @return A boolean that indicates if another Adjacency List Edge of E type is equals to the actual Adjacency List Edge.
		 * @param another An AdjacencyListEdge<E> that is going to be compared with the actual one.
		 * @throws ClassCastException if another is not an AdjacencyListEdge<E>.
		 */
		@Override
		public boolean equals(Object another) {
			Edge<E> a = (Edge<E>)another; 
			return a.src.equals(src) && a.dst.equals(dst);
		}
		@Override
		public int compareTo(Edge<E> edge) {
			return weight - edge.weight;
		}
	}
}
