import java.util.*;

public class Main {
	
	
	private int[][] matrix;
	private int numEdge;
	public int[] Mark;
	public int size;
	public boolean[] visited;
	
	public Main() {};
	public Main(int n) {
		Init(n);
	}
	
	public void Init(int n) {
		Mark = new int[n];
		visited = new boolean[n];
		matrix = new int[n][n];
		size = n;
	}
	
	public int n() {return Mark.length;}
	public int e() {return numEdge;}
	
	
	
	public boolean isEdge(int i, int j) {
		return matrix[i][j] != 0;
	}
	
	
	
	public void setRelation(int i, int j) {
		matrix[i][j] = 1;
	}
	
	public int[] getNeighbors(int v) {
		return matrix[v];
	}
	
	public void setVisited(int v) {
		visited[v] = true;
	}
	
	public boolean connected(int start, int end) {
		// basic case, if there exists an edge between start and end
		if(isEdge(start,end)) {
			return true;
		} 
		
		setVisited(start);
		int[] neighbors = getNeighbors(start);
		
		for(int i = 0; i < neighbors.length; i++) {
			int v = neighbors[i];
			if(visited[v] == false) connected(v, end);
			
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//numbers of users
		int size = in.nextInt();
		ConnectedGraph graph = new ConnectedGraph(size);
		
		int relations_total = in.nextInt();
		while(relations_total > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			graph.setRelation(x, y);
			relations_total--;
		}
		
		
		int queries = in.nextInt();
		
		for(int i = 0; i<= queries; i++) {
			int a = in.nextInt();
			System.out.println(a);
			int b = in.nextInt();
			System.out.println(b);
			if(graph.connected(a,b)) {
				System.out.println("yes");
			} else
				System.out.println("no");
			
			
			
		}
		
		in.close();
		
		
	}

}

